package gitspringboot.modules.file.controller;

import gitspringboot.config.util.R;
import gitspringboot.modules.file.service.IPptxService;
import gitspringboot.modules.file.vo.PptxVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/pptx")
public class pptxController {

    @Resource
    private IPptxService pptxService;

    // @ApiOperationSupport(order = 51)
    // @ApiOperation(value = "读取pptx", notes = "读取pptx")
    // @ApiImplicitParams({
    //         @ApiImplicitParam(name = "file", value = "pptx文件", required = true, paramType = "form", dataType = "file"),
    // })
    @PostMapping(value = "/importPptx")
    public R<List<PptxVO>> importPptx(@RequestParam(value = "file") MultipartFile file) throws IOException {
        return R.ok(pptxService.importPptx(file));
    }

    @PostMapping(value = "/importPptxx")
    public R<List<String>> importPptxx(@RequestParam(value = "file") MultipartFile file) throws IOException {
        return R.ok(pptxService.importPptxx(file));
    }
}
