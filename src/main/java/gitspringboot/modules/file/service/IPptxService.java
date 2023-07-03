package gitspringboot.modules.file.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.google.protobuf.ServiceException;
import gitspringboot.modules.file.vo.PptxVO;
import gitspringboot.modules.firstModule.entity.User;
import gitspringboot.modules.firstModule.model.LoginInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IPptxService {

    List<PptxVO> importPptx(MultipartFile file) throws IOException;

    List<String> importPptxx(MultipartFile file) throws IOException;

}
