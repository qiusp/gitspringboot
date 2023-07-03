package gitspringboot.modules.file.service.Impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.RowUtil;
import cn.hutool.poi.excel.StyleSet;
import cn.hutool.poi.excel.cell.CellUtil;
import gitspringboot.config.util.ExcelUtil;
import gitspringboot.modules.file.enums.SelectEnum;
import gitspringboot.modules.file.service.IPptxService;
import gitspringboot.modules.file.vo.PptxVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xslf.usermodel.*;
import org.openxmlformats.schemas.drawingml.x2006.main.CTRegularTextRun;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraph;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlide;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static gitspringboot.modules.file.enums.SelectEnum.*;

@Service
@Slf4j
@AllArgsConstructor
public class PptxServiceImpl implements IPptxService {

    public List<List<String>> importPptxs(MultipartFile file) {
        try {
            List<List<String>> result = new ArrayList<>();
            InputStream fileStream = file.getInputStream();
            XMLSlideShow xmlSlideShow = new XMLSlideShow(fileStream);
            //获得每一张幻灯片
            List<XSLFSlide> slides = xmlSlideShow.getSlides();
            for (XSLFSlide xslfSlide : slides){
                List<String> content = new ArrayList<>();
                CTSlide ctSlide = xslfSlide.getXmlObject();
                CTGroupShape spTree = ctSlide.getCSld().getSpTree();
                List<CTShape> ctShapes = spTree.getSpList();
                for (CTShape shape: ctShapes){
                    List<CTTextParagraph> pList = shape.getTxBody().getPList();
                    for (CTTextParagraph paragraph : pList){
                        List<CTRegularTextRun> textRuns = paragraph.getRList();
                        for (CTRegularTextRun textRun: textRuns){
                            if (null == textRun.getT() || "".equals(textRun.getT())) {
                                content.add(textRun.getT());
                            }
                        }
                    }
                }
                result.add(content);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 用来读取pptx文件
     * @param filePath
     * @return
     */
    @Override
    public List<String> importPptxx(MultipartFile filePath) {
        List<List<String>> result = new ArrayList<>();
        List<PptxVO> pptxVOS = new ArrayList<>();
        List<String> resultDatas = new ArrayList<>();
        try {
            InputStream fileStream = filePath.getInputStream();
            XMLSlideShow xmlSlideShow = new XMLSlideShow(fileStream);
            List<XSLFSlide> slides = xmlSlideShow.getSlides();
            for(XSLFSlide slide:slides){
                List<String> content = new ArrayList<>();
                for(XSLFShape shape:slide.getShapes()){
                    // 判断 当前对象是否为文本对象 XSLFTextShape,每一个XSLFTextShape代表一个文本框对象
                    if (shape instanceof XSLFTextShape){
                        // 向下转型 XSLFTextShape 获得文本
                        String text = ((XSLFTextShape) shape).getText();
                        if (StrUtil.isNotEmpty(text) && StrUtil.isNotBlank(text)){
                            content.add(text);
                        }
                    }
                    // 判断 当前对象是否为表格对象 XSLFTable,每一个XSLFTable代表一个表格对象
                    if (shape instanceof XSLFTable){
                        for (XSLFTableRow row : ((XSLFTable) shape).getRows()){
                            for (XSLFTableCell cell : row.getCells()) {
                                // 获得文本
                                String text = cell.getText();
                                if(StrUtil.isNotEmpty(text) && StrUtil.isNotBlank(text)){
                                    content.add(text);
                                }
                            }
                        }
                    }
                }
                result.add(content);
            }
            if (null != result && result.size() >0){
                for (List<String> contents: result){
                    for (String value: contents){
                        // 按答案分割
                        List<String> splits = stringSplit(value);
                        if (null != splits && splits.size()>0){
                            resultDatas.addAll(stringSplit(value));
                        }
                    }
                }
            }
            if (resultDatas != null && resultDatas.size() > 0){
                pptxVOS = getpptxVo(resultDatas);
            }
            return resultDatas;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultDatas;
    }


    /**
     * 用来读取pptx文件
     * @param filePath
     * @return
     */
    @Override
    public List<PptxVO> importPptx(MultipartFile filePath) {
        List<List<String>> result = new ArrayList<>();
        List<PptxVO> pptxVOS = new ArrayList<>();
        try {
            InputStream fileStream = filePath.getInputStream();
            XMLSlideShow xmlSlideShow = new XMLSlideShow(fileStream);
            List<XSLFSlide> slides = xmlSlideShow.getSlides();
            for(XSLFSlide slide:slides){
                List<String> content = new ArrayList<>();
                for(XSLFShape shape:slide.getShapes()){
                    // 判断 当前对象是否为文本对象 XSLFTextShape,每一个XSLFTextShape代表一个文本框对象
                    if (shape instanceof XSLFTextShape){
                        // 向下转型 XSLFTextShape 获得文本
                        String text = ((XSLFTextShape) shape).getText();
                        if (StrUtil.isNotEmpty(text) && StrUtil.isNotBlank(text)){
                            content.add(text);
                        }
                    }
                    // 判断 当前对象是否为表格对象 XSLFTable,每一个XSLFTable代表一个表格对象
                    if (shape instanceof XSLFTable){
                        for (XSLFTableRow row : ((XSLFTable) shape).getRows()){
                            for (XSLFTableCell cell : row.getCells()) {
                                // 获得文本
                                String text = cell.getText();
                                if(StrUtil.isNotEmpty(text) && StrUtil.isNotBlank(text)){
                                    content.add(text);
                                }
                            }
                        }
                    }
                }
                result.add(content);
            }
            int count = 1;
            PptxVO pptxVO = new PptxVO();
            List<String> resultDatas = new ArrayList<>();
            if (null != result && result.size() >0){
                for (List<String> contents: result){
                    for (String value: contents){
                        // 按答案分割
                        List<String> splits = stringSplit(value);
                        if (null != splits && splits.size()>0){
                            resultDatas.addAll(stringSplit(value));
                        }
                    }
                }
            }
            if (resultDatas != null && resultDatas.size() > 0){
                pptxVOS = getpptxVo(resultDatas);
            }
            // return result;
            return pptxVOS;

        } catch (Exception e) {
            e.printStackTrace();
        }
        // return result;
        return pptxVOS;
    }

    public static void main(String[] args){
        List<String> resultDatas = new ArrayList<>();
        String value = "C、综合运用清收、核销、重组、证券化、债转股等多种处置手段，大力化解不良资产风险\\nD、银行业金融机构优先、快速对在中国人民银行征信报告中无贷款记录的企业提供贷款\\n30、党的十八大以来，习近平总书记多次指出，实现中国梦必须弘扬中国精神。下列与之相关的说法不准确的是：\\nA、“延安精神”400、以谦虚谨慎、艰苦奋斗，敢于斗争、敢于胜利，依靠群众、团结统一的精神为核心内容\\nB、水乳交融、生死与共是“沂蒙精神”的鲜明特质";
        // value = "2021 年国家公务员考试《行测》真题（副省级）";
        String s = getNumber(value);
        System.out.println(s);
        // resultDatas = stringSplit(value);
        // System.out.println(resultDatas);
    }

    /**
     * 分割答案
     * @param dataSource
     * @return
     */
    public static List<String> stringSplit(String dataSource){
        List<String> resultDatas = new ArrayList<>();
        resultDatas.add(dataSource);
        // 本次
        List<String> selectValues = new ArrayList<>();
        for (String curronkey : SelectEnum.getSelectValue()){
            if (dataSource.contains(curronkey)){
                selectValues.add(curronkey);
            }
        }
        for (String selectValue : selectValues) {
            resultDatas = getData(resultDatas, selectValue);
        }
        return resultDatas;
    }

    public static List<String> getData(List<String> resultDatas, String key){
        List<String> remoData = new ArrayList<>();
        List<String> addData = new ArrayList<>();
        for (String data : resultDatas) {
            if (data.contains(key)){
                remoData.add(data);
                String[] splits = data.split("(?="+ key +")");
                addData.addAll(Arrays.asList(splits));
            }
        }
        resultDatas.removeAll(remoData);
        resultDatas.addAll(addData);
        return resultDatas;
    }

    public List<PptxVO> getpptxVo(List<String> resultDatas){
        List<PptxVO> pptxVOS = new ArrayList<>();
        PptxVO pptxVO = null;
        PptxVO pptxVO1 = null;
        Boolean isTitle = false;
        List<String> missData = new ArrayList<>();
        Map<Integer, List<String>> missMap= new HashMap<>();
        int count = 0;
        int nextCount = 0;
        for (String result: resultDatas){
            String number = getNumber(result);
            if (StrUtil.isNotBlank(number) && !result.contains(D.getValue())){
                count++;
                nextCount = count + 1;
                pptxVO = new PptxVO();
                pptxVO.setTitle(result);
                pptxVO.setCount(count);
                pptxVOS.add(pptxVO);
                isTitle = true;
                missData = new ArrayList<>();

                int finalCount = count;
                pptxVO1 = pptxVOS.stream().filter(pptx->pptx.getCount().equals(finalCount)).collect(Collectors.toList()).get(0);
            }
            else if (result.contains(A.getValue()) && StrUtil.isBlank(pptxVO1.getA())){
                pptxVO1.setA(result);
            }
            else if (result.contains(B.getValue()) && StrUtil.isBlank(pptxVO1.getB())){
                pptxVO1.setB(result);
            }
            else if (result.contains(C.getValue()) && StrUtil.isBlank(pptxVO1.getC())){
                pptxVO1.setC(result);
            }
            else if (result.contains(D.getValue()) && StrUtil.isBlank(pptxVO1.getD())){
                if(StrUtil.isBlank(number)){
                    pptxVO1.setD(result);
                    isTitle = false;
                }else {
                    //分割标题
                    String[] titles = result.split("(?="+ number +")");
                    pptxVO1.setD(titles[0]);
                    //新标题
                    count++;
                    nextCount = count + 1;
                    pptxVO = new PptxVO();
                    pptxVO.setTitle(titles[1]);
                    pptxVO.setCount(count);
                    pptxVOS.add(pptxVO);

                    int finalCount = count;
                    pptxVO1 = pptxVOS.stream().filter(pptx->pptx.getCount().equals(finalCount)).collect(Collectors.toList()).get(0);

                    isTitle = true;
                    missData = new ArrayList<>();
                }
            } else {
                if ((result.contains(A.getValue()) || result.contains(B.getValue()) || result.contains(C.getValue()) || result.contains(D.getValue()))
                        && missMap.containsKey(nextCount)){
                    missMap.get(nextCount).add(result);
                }
                else if (missMap.containsKey(count) && !(result.contains(A.getValue()) || result.contains(B.getValue()) || result.contains(C.getValue()) || result.contains(D.getValue()))){
                    missMap.get(count).add(result);
                }
                else {
                    missData.add(result);
                    if (result.contains(A.getValue()) || result.contains(B.getValue()) || result.contains(C.getValue()) || result.contains(D.getValue())){
                        missMap.put(nextCount ,missData);
                    }else {
                        missMap.put(count,missData);
                    }
                }
            }
        }
        // 补充数据
        if (ObjectUtil.isNotEmpty(missData)){
            for (PptxVO pptx: pptxVOS){
                if (missMap.containsKey(pptx.getCount())) {
                    List<String> missDataList = missMap.get(pptx.getCount());
                    for (String s : missDataList) {
                        if (s.contains(A.getValue())) {
                            pptx.setA(s);
                        }else if (s.contains(B.getValue())) {
                            pptx.setB(s);
                        }else if (s.contains(C.getValue())) {
                            pptx.setC(s);
                        }else if (s.contains(D.getValue())) {
                            pptx.setD(s);
                        }else {
                            pptx.setTitle(pptx.getTitle() + "\n" + s);
                        }
                    }
                }
            }
        }
        return pptxVOS;
    }

    public static String getNumber(String code){
        String result = null;
        String regEx = "[0-9]([0-9]{0,2})*[、]";
        // String regEx = "3"+"、";
        Pattern pattern = Pattern.compile(regEx, Pattern.CANON_EQ);
        Matcher matcher = pattern.matcher(code);
        while (matcher.find()){
            result = matcher.group();
        }
        return result;
    }



    // public void exportTemplate(pptxVO data) {
    //     Workbook workbook;
    //     HSSFSheet sheet;
    //     Row row;
    //
    //     int rowNum;
    //     int cellNum;
    //     String cellName;
    //     String fileName;
    //     try {
    //         //创建文档生成模板
    //         workbook = new HSSFWorkbook();
    //         //workbook = new XSSFWorkbook();
    //         //默认样式
    //         StyleSet styleSet = ExcelUtil.createStyleSet(workbook);
    //         //字体标红
    //         StyleSet styleSetRed = ExcelUtil.createStyleSet(workbook);
    //         Font font = workbook.createFont();
    //         font.setFontName("Calibri");
    //         font.setColor(HSSFColor.RED.index);
    //         font.setFontHeightInPoints((short) 10);
    //         font.setBold(true);
    //         styleSetRed.setFont(font, false);
    //         //设置单元格格式为文本格式
    //         CellStyle cellStyle = workbook.createCellStyle();
    //         //设置单元格自动换行
    //         cellStyle.setWrapText(true);
    //         //水平居中,垂直居中
    //         cellStyle.setAlignment(HorizontalAlignment.CENTER);
    //         cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
    //         DataFormat format = workbook.createDataFormat();
    //         cellStyle.setDataFormat(format.getFormat("@"));
    //
    //         //创建工作表
    //         //sheet = createSheet(workbook,"0");
    //         sheet = (HSSFSheet) workbook.createSheet("0");
    //         rowNum = 0;
    //
    //         //第一行
    //         row = RowUtil.getOrCreateRow(sheet, rowNum++);
    //         cellNum = 0;
    //         ExcelUtil.convertFromProperty(row, cellNum++, "标题", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "标题库", styleSetRed, false, cellStyle);
    //         CellUtil.mergingCells(sheet, 0, 0, 1, 6, styleSetRed.getHeadCellStyle());
    //
    //         //第二行
    //         row = RowUtil.getOrCreateRow(sheet, rowNum++);
    //         cellNum = 0;
    //         ExcelUtil.convertFromProperty(row, cellNum++, "描述", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "专用题库", styleSetRed, false, cellStyle);
    //         CellUtil.mergingCells(sheet, 0, 0, 1, 6, styleSetRed.getHeadCellStyle());
    //
    //         //第三行
    //         row = RowUtil.getOrCreateRow(sheet, rowNum++);
    //         cellNum = 0;
    //         ExcelUtil.convertFromProperty(row, cellNum++, "用时", styleSetRed, false, cellStyle);
    //         CellUtil.mergingCells(sheet, 0, 0, 1, 6, styleSetRed.getHeadCellStyle());
    //
    //         //第四行
    //         row = RowUtil.getOrCreateRow(sheet, rowNum++);
    //         cellNum = 0;
    //         ExcelUtil.convertFromProperty(row, cellNum++, "题型", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "选择项1", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "选择项2", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "选择项3", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "选择项4", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "解析", styleSetRed, false, cellStyle);
    //         ExcelUtil.convertFromProperty(row, cellNum++, "答案", styleSetRed, false, cellStyle);
    //
    //
    //         //第四行
    //         StyleSet style;
    //         for (ExcelFieldEnum excelFieldEnum : data) {
    //             style = styleSet;
    //             cellNum = excelFieldEnum.getCellNum();
    //             //下拉框
    //             if (type.equals("0")) {
    //                 //单元格样式
    //                 if (cellNum == 0 || cellNum == 1) {
    //                     style = styleSetRed;
    //                 }
    //                 if (cellNum == 1) {
    //                     //createDropDownList(sheet, sheet.getDataValidationHelper(), false, ScacList, rowNum, rowNum + 999, cellNum, cellNum);
    //                     setHSSFValidation(sheet, ScacList, rowNum, rowNum + 999, cellNum, cellNum);
    //                 }
    //                 if (cellNum == 3) {
    //                     ExcelUtil.createDropDownList(sheet, sheet.getDataValidationHelper(), false, ExternalTrapModeEnum.getValues(), rowNum, rowNum + 999, cellNum, cellNum);
    //                 }
    //                 if (cellNum == 4) {
    //                     ExcelUtil.createDropDownList(sheet, sheet.getDataValidationHelper(), false, ExternalTrapTypeEnum.getTypeValue(), rowNum, rowNum + 999, cellNum, cellNum);
    //                 }
    //             } else if (type.equals("1")) {
    //                 if (cellNum == 0 || cellNum == 5) {
    //                     style = styleSetRed;
    //                 }
    //                 if (cellNum == 1) {
    //                     //createDropDownList(sheet, sheet.getDataValidationHelper(), false, ScacList, rowNum, rowNum + 999, cellNum, cellNum);
    //                     setHSSFValidation(sheet, ScacList, rowNum, rowNum + 999, cellNum, cellNum);
    //                 }
    //                 if (cellNum == 3) {
    //                     ExcelUtil.createDropDownList(sheet, sheet.getDataValidationHelper(), false, ExternalTrapModeEnum.getValues(), rowNum, rowNum + 999, cellNum, cellNum);
    //                 }
    //                 if (cellNum == 4) {
    //                     ExcelUtil.createDropDownList(sheet, sheet.getDataValidationHelper(), false, ExternalTrapTypeEnum.getTypeValue(), rowNum, rowNum + 999, cellNum, cellNum);
    //                 }
    //             }
    //
    //             cellName = excelFieldEnum.getCellName();
    //             //单元格赋值
    //             sheet.setDefaultColumnStyle(cellNum, cellStyle);
    //             ExcelUtil.convertFromProperty(row, cellNum, cellName, style, false, cellStyle);
    //         }
    //         //第四行
    //         row = RowUtil.getOrCreateRow(sheet, rowNum++);
    //         for (ExcelFieldEnum excelFieldEnum : excelFieldEnums) {
    //             style = styleSet;
    //             cellName = excelFieldEnum.getCellNameDetail();
    //             cellNum = excelFieldEnum.getCellNum();
    //
    //             if (type.equals("0")) {
    //                 //合并第三四行单元格
    //                 if (excelFieldEnum.getCellNum() <= 15 || 21 <= excelFieldEnum.getCellNum()) {
    //                     CellUtil.mergingCells(sheet, 2, 3, excelFieldEnum.getCellNum(), excelFieldEnum.getCellNum(), styleSetRed.getHeadCellStyle());
    //                 } else {
    //                     //单元格赋值
    //                     sheet.setDefaultColumnStyle(cellNum, cellStyle);
    //                     ExcelUtil.convertFromProperty(row, cellNum, cellName, style, false, cellStyle);
    //                 }
    //             }else {
    //                 if (excelFieldEnum.getCellNum() <= 16 || 22 <= excelFieldEnum.getCellNum()) {
    //                     CellUtil.mergingCells(sheet, 2, 3, excelFieldEnum.getCellNum(), excelFieldEnum.getCellNum(), styleSetRed.getHeadCellStyle());
    //                 } else {
    //                     //单元格赋值
    //                     sheet.setDefaultColumnStyle(cellNum, cellStyle);
    //                     ExcelUtil.convertFromProperty(row, cellNum, cellName, style, false, cellStyle);
    //                 }
    //             }
    //         }
    //
    //         // 导出模板
    //         ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    //         if (null != servletRequestAttributes) {
    //             HttpServletResponse response = servletRequestAttributes.getResponse();
    //             if (null != response) {
    //                 //fileName = fileName + StringPool.UNDERSCORE + System.nanoTime() + ".xlsx";
    //                 fileName = fileName + StringPool.UNDERSCORE + System.nanoTime() + ".xls";
    //                 OutputStream outputStream = response.getOutputStream();
    //                 response.setCharacterEncoding(StringPool.UTF_8);
    //                 //response.setContentType("application/x-download");
    //                 response.setContentType("application/vnd.ms-excel");
    //                 fileName = URLEncoder.encode(fileName, StringPool.UTF_8);
    //                 response.setHeader("Content-disposition", "attachment;" + "filename*=utf-8''" + fileName);
    //                 workbook.write(outputStream);
    //                 workbook.close();
    //             }
    //         }
    //     } catch (Exception e) {
    //         log.error(e.getMessage());
    //         if (e instanceof org.springblade.core.log.exception.ServiceException) {
    //             throw new org.springblade.core.log.exception.ServiceException(e.getMessage());
    //         } else {
    //             throw new org.springblade.core.log.exception.ServiceException(messageSourceHandler.locale("external.export.template.error"));
    //         }
    //     }
    // }

    // public String doTrans(String text){
        // TranslationParamsBo paramsBo = new TranslationParamsBo();
        // paramsBo.setFrom("zh");
        // paramsBo.setSrc_text(text);
        // paramsBo.setTo("en");
        // try {
        //     // 令qps小于3
        //     Thread.sleep(400);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // return textTranslationService.textTranslation(paramsBo).getData().getTgt_text();
    // }

}
