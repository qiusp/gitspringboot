package gitspringboot.modules.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import gitspringboot.modules.entity.User;
import gitspringboot.modules.mapper.UserMapper;
import gitspringboot.modules.message.*;
import gitspringboot.modules.service.IGrpcService;
import io.grpc.*;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NegotiationType;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContextBuilder;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.concurrent.Executor;


@Service
@Slf4j
public class GrpcServiceImpl extends ServiceImpl<UserMapper, User> implements IGrpcService {

   @GrpcClient("ot.rockbang.com.cn:443")
   private messageGrpc.messageBlockingStub messageBlockingStub;

    /**
     * GrpcClient
     */
    @Override
    public void getMsgCount() {

        GetUnReadMsgCountReq build = GetUnReadMsgCountReq.newBuilder().setUserId("2").build();

        messageGrpc.messageBlockingStub stu = messageBlockingStub
                .withCallCredentials(new CallCredentials() {
            @Override
            public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
                Metadata metadata = new Metadata();
                Metadata.Key<String> app = Metadata.Key.of("app", Metadata.ASCII_STRING_MARSHALLER);
                Metadata.Key<String> token = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
                metadata.put(app, "bo");
                metadata.put(token, "12345");
                metadataApplier.apply(metadata);
            }
            @Override
            public void thisUsesUnstableApi() {

            }
        });

        GetUnReadMsgCountResp resp = stu.getUnReadMsgCount(build);
        System.out.println(resp.getCount());

    }

    /**
     * channel
     */
    @Override
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
     * GrpcClient
     */
    @Override
    public void getstatus() {
        SendSmsReq build = SendSmsReq.newBuilder().setTemplateCode("SMS_243141466").setMobile("15280209987")
                .putParams("code", "434334").build();

        messageGrpc.messageBlockingStub stu = messageBlockingStub
                .withCallCredentials(new CallCredentials() {
                    @Override
                    public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
                        Metadata metadata = new Metadata();
                        Metadata.Key<String> app = Metadata.Key.of("app", Metadata.ASCII_STRING_MARSHALLER);
                        Metadata.Key<String> token = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
                        metadata.put(app, "bo");
                        metadata.put(token, "12345");
                        metadataApplier.apply(metadata);
                    }

                    @Override
                    public void thisUsesUnstableApi() {

                    }
                });
        SendSmsResp resp = stu.sendSms(build);
        System.out.println(resp.toString());
    }

    /**
     * 认证
     */
    public SslContext getSslContext() throws SSLException {
        File pem = new File("E:\\TestDir\\ot.rockbang.com.cn.pem");
        if (pem.isFile()){
            System.out.println("文件没问题");
        }
        SslContextBuilder builder = GrpcSslContexts.forClient();
        SslContext sslContext = builder.trustManager(pem).build();
        return sslContext;
    }

    private ManagedChannel channels() throws SSLException {

        SslContext sslContext = getSslContext();
        ManagedChannel channel = NettyChannelBuilder
//                .forAddress("127.0.0.1",9089)
                .forAddress("ot.rockbang.com.cn",443)
                .negotiationType(NegotiationType.TLS)
                .sslContext(sslContext)
                //.usePlaintext()
                .build();
        return channel;
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
