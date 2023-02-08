package gitspringboot.config.Grpc;


import gitspringboot.config.Grpc.message.*;
import io.grpc.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLException;


@Service
@Slf4j
public class GrpcServiceImpl {

   //@GrpcClient("ot.rockbang.com.cn:443")
   @GrpcClient("grpc-message-server")
    private messageGrpc.messageBlockingStub messageBlockingStub;

    MyCredentials myCredentials = new MyCredentials();

    /**
     * GrpcClient
     */
    public void getMsgCount() {

        GetUnReadMsgCountReq build = GetUnReadMsgCountReq.newBuilder().setUserId("2").build();
        GetUnReadMsgCountResp resp = messageBlockingStub.withCallCredentials(myCredentials).getUnReadMsgCount(build);
        System.out.println(resp.getCount());

    }

    /**
     * GrpcClient
     */
    public void getstatus() {
        SendSmsReq build = SendSmsReq.newBuilder().setTemplateCode("SMS_243141466").setMobile("15280209987")
                .putParams("code", "434334").build();

        messageGrpc.messageBlockingStub stu = messageBlockingStub
                .withCallCredentials(myCredentials);
        SendSmsResp resp = stu.sendSms(build);
        System.out.println(resp.toString());
    }

    /**
     * channel
     */
    public void getCount() throws SSLException {
        ManagedChannel channel = channel();

        MyCredentials myCredentials = new MyCredentials();

        messageGrpc.messageBlockingStub myServiceStub = messageGrpc.newBlockingStub(channel).withCallCredentials(myCredentials);

        GetUnReadMsgCountReq getUnReadMsgCountReq = GetUnReadMsgCountReq.newBuilder().setUserId("2").build();

        try {
            GetUnReadMsgCountResp getUnReadMsgCountResp = myServiceStub.getUnReadMsgCount(getUnReadMsgCountReq);
            close();
            getUnReadMsgCountResp.getCount();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * 不用认证
     * @return
     */
    private ManagedChannel channel() {

        return ManagedChannelBuilder
                .forAddress("ot.rockbang.com.cn",443)
                .usePlaintext()
                .build();
    }

    private void close(){
        ManagedChannel channel = channel();

        if(null != channel){
            channel.shutdown();
        }
    }

}
