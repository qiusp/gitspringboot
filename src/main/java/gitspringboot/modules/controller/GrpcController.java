package gitspringboot.modules.controller;

import gitspringboot.modules.service.IGrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.net.ssl.SSLException;

@RestController
@RequestMapping("/grpc")
public class GrpcController {
    @Resource
    private IGrpcService grpcService;

    @GetMapping("/getMsgCount")
    public void getMsgCount() {
        grpcService.getMsgCount();
    }

    @RequestMapping("/getCount")
    public void getCount() throws SSLException {
        grpcService.getCount();
    }

    @RequestMapping("/getstatus")
    public void getstatus() {
        grpcService.getstatus();
    }
}
