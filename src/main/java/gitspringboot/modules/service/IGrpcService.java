package gitspringboot.modules.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import gitspringboot.modules.entity.User;

import javax.net.ssl.SSLException;

public interface IGrpcService extends IService<User> {

    void getMsgCount();

    void getCount() throws SSLException;

    void getstatus();
}
