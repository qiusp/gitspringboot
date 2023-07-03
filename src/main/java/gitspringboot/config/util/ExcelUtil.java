package gitspringboot.config.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.poi.excel.StyleSet;
import cn.hutool.poi.excel.cell.CellUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POI 操作excel工具类
 * @author xr.wei
 * @version 1.0
 * @since 2022/9/24
 */
public class ExcelUtil {

    /**
     * 是否空行
     * @param row
     * @return
     */
    public static boolean isEmptyRow(Row row) {
        boolean isEmpty = true;
        for (int cellNum = 0; cellNum < row.getLastCellNum(); cellNum++) {
            Cell cell = CellUtil.getOrCreateCell(row, cellNum);
            Object cellValue = CellUtil.getCellValue(cell, true);
            if (StringUtils.isNotEmpty(cellValue.toString())) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    /**
     * 创建工作表
     *
     * @param workbook
     * @param name
     * @return
     */
    public static Sheet createSheet(Workbook workbook, String name) {
        Sheet sheet;
        if(StringUtils.isNotBlank(name)){
            sheet = workbook.createSheet(name);
        }else{
            sheet = workbook.createSheet();
        }
        sheet.setDefaultColumnWidth(16);
        sheet.setDefaultRowHeightInPoints(16.5F);
        return sheet;
    }

    /**
     * 创建样式集合
     * @param workbook
     * @return
     */
    public static StyleSet createStyleSet(Workbook workbook) {
        StyleSet styleSet = new StyleSet(workbook);
        styleSet.setAlign(HorizontalAlignment.LEFT, VerticalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setFontName("Calibri");
        font.setFontHeightInPoints((short) 10);
        styleSet.setFont(font, true);

        CellStyle headerCellStyle = styleSet.getHeadCellStyle();
        Font headerFont = workbook.createFont();
        headerFont.setFontName("Calibri");
        headerFont.setFontHeightInPoints((short) 10);
        headerFont.setBold(true);
        headerCellStyle.setFont(headerFont);
        return styleSet;
    }

    /**
     * 从实体类属性数据赋值给单元格
     *
     * @param row
     * @param cellNum
     * @param value
     * @param styleSet
     * @param isHeader
     */
    public static void convertFromProperty(Row row, int cellNum, Object value, StyleSet styleSet, boolean isHeader) {
        Cell cell = CellUtil.getOrCreateCell(row, cellNum);
        CellUtil.setCellValue(cell, value, styleSet, isHeader);
    }

    /**
     * 从实体类属性数据赋值给单元格
     *
     * @param row
     * @param cellNum
     * @param value
     * @param styleSet
     * @param isHeader
     * @param cellStyle
     */
    public static void convertFromProperty(Row row, int cellNum, Object value, StyleSet styleSet, boolean isHeader, CellStyle cellStyle) {
        Cell cell = CellUtil.getOrCreateCell(row, cellNum);
        cell.setCellStyle(cellStyle);
        CellUtil.setCellValue(cell, value, styleSet, isHeader);
    }

    /**
     * 获取单元格的值
     * @param cell
     */
    public static String getCellValue(Cell cell) {
        return cell==null||"null".equals(cell) ? null : String.valueOf(CellUtil.getCellValue(cell, cell.getCellTypeEnum(), true));
    }

    /**
     * 创建下拉框
     * @param sheet
     * @param helper
     * @param allowEmpty
     * @param list
     * @param firstRow
     * @param lastRow
     * @param firstCol
     * @param lastCol
     */
    public static void createDropDownList(Sheet sheet, DataValidationHelper helper, boolean allowEmpty, String[] list, Integer firstRow, Integer lastRow, Integer firstCol, Integer lastCol){
        try{
            //获取需要生成下拉框的cell
            CellRangeAddressList addressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
            //设置下拉框数据
            DataValidationConstraint constraint = helper.createExplicitListConstraint(list);
            DataValidation validation = helper.createValidation(constraint, addressList);
            //处理Excel兼容性问题
            if(validation instanceof XSSFDataValidation){
                validation.setSuppressDropDownArrow(true);
                validation.setShowErrorBox(true);
                validation.setEmptyCellAllowed(allowEmpty);
            }else{
                validation.setSuppressDropDownArrow(false);
                validation.setEmptyCellAllowed(allowEmpty);
            }
            sheet.addValidationData(validation);
        }catch (Exception e){

        }
    }

    /**
     * 转为 Double
     * @param source 值
     * @param desc 字段描述
     * @param required 是否必填
     * @param errorMsg 错误信息包装类
     * @return
     */
    public static Double dealWithPercent(String source, String desc, boolean required, StringBuilder errorMsg){
        Double d;
        try{
            if(source.endsWith("%")){
                source = source.replace("%","");
                d = Double.valueOf(source.trim());
            }else{
                d = Double.valueOf(source.trim());
            }
        }catch (Exception e){
            d = 0d;
            if(required && null != errorMsg){
                errorMsg.append(desc).append("应为数值类型；");
            }
        }
        if(d < 1){
            d = d*100;
        }
        return d;
    }

    /**
     * 转为 Double
     * @param source 值
     * @param desc 字段描述
     * @param required 是否必填
     * @param errorMsg 错误信息包装类
     * @return
     */
    public static Double toDouble(String source, String desc, boolean required, StringBuilder errorMsg){
        Double d;
        try{
            d = Double.valueOf(source.trim());
        }catch (Exception e){
            d = 0d;
            if(required && null != errorMsg){
                errorMsg.append(desc).append("应为数值类型；");
            }
        }
        return d;
    }

    /**
     * 转为 BigDecimal
     * @param source 值
     * @param desc 字段描述
     * @param required 是否必填
     * @param errorMsg 错误信息包装类
     * @return
     */
    public static BigDecimal toBigDecimal(String source, String desc, boolean required, StringBuilder errorMsg){
        BigDecimal i;
        try{
            i = new BigDecimal(source);
        }catch (Exception e){
            i = BigDecimal.ZERO;
            if(required && null != errorMsg){
                errorMsg.append(desc).append("应为数值类型；");
            }
        }
        return i;
    }

    /**
     * 转为 Integer
     * @param source 值
     * @param desc 字段描述
     * @param required 是否必填
     * @param errorMsg 错误信息包装类
     * @return
     */
    public static Integer toInteger(String source, String desc, boolean required, StringBuilder errorMsg){
        Integer i;
        try{
            i = Integer.valueOf(source.trim());
        }catch (Exception e){
            i = 0;
            if(required && null != errorMsg){
                errorMsg.append(desc).append("应为数值类型；");
            }
        }
        return i;
    }

    /**
     * 转为 Date
     * @param source 值
     * @param desc 字段描述
     * @param required 是否必填
     * @param errorMsg 错误信息包装类
     * @return
     */
    public static Date toDate(String source, String desc, boolean required, StringBuilder errorMsg){
        Date date;
        try{
            date = DateUtil.parse(source,"yyyy-MM-dd");
        }catch (Exception e){
            date = null;
            if(required && null != errorMsg){
                errorMsg.append(desc).append("应为日期类型（格式yyyy-MM-dd）；");
            }
        }
        return date;
    }

}
