package gitspringboot.modules.controller;

import gitspringboot.config.Grpc.GrpcServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.net.ssl.SSLException;

@RestController
@RequestMapping("/grpc")
public class GrpcController {
    @Resource
    private GrpcServiceImpl grpcService;

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
