package gitspringboot.modules.message;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: message.proto")
public final class messageGrpc {

  private messageGrpc() {}

  public static final String SERVICE_NAME = "message.message";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.SendSmsReq,
      gitspringboot.modules.message.SendSmsResp> getSendSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSms",
      requestType = gitspringboot.modules.message.SendSmsReq.class,
      responseType = gitspringboot.modules.message.SendSmsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.SendSmsReq,
      gitspringboot.modules.message.SendSmsResp> getSendSmsMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.SendSmsReq, gitspringboot.modules.message.SendSmsResp> getSendSmsMethod;
    if ((getSendSmsMethod = messageGrpc.getSendSmsMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendSmsMethod = messageGrpc.getSendSmsMethod) == null) {
          messageGrpc.getSendSmsMethod = getSendSmsMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.SendSmsReq, gitspringboot.modules.message.SendSmsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "SendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.SendSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.SendSmsResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendSms"))
                  .build();
          }
        }
     }
     return getSendSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.SendEmailReq,
      gitspringboot.modules.message.SendEmailResp> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = gitspringboot.modules.message.SendEmailReq.class,
      responseType = gitspringboot.modules.message.SendEmailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.SendEmailReq,
      gitspringboot.modules.message.SendEmailResp> getSendEmailMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.SendEmailReq, gitspringboot.modules.message.SendEmailResp> getSendEmailMethod;
    if ((getSendEmailMethod = messageGrpc.getSendEmailMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendEmailMethod = messageGrpc.getSendEmailMethod) == null) {
          messageGrpc.getSendEmailMethod = getSendEmailMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.SendEmailReq, gitspringboot.modules.message.SendEmailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.SendEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.SendEmailResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendEmail"))
                  .build();
          }
        }
     }
     return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.CheckStatusReq,
      gitspringboot.modules.message.CheckStatusResp> getCheckStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckStatus",
      requestType = gitspringboot.modules.message.CheckStatusReq.class,
      responseType = gitspringboot.modules.message.CheckStatusResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.CheckStatusReq,
      gitspringboot.modules.message.CheckStatusResp> getCheckStatusMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.CheckStatusReq, gitspringboot.modules.message.CheckStatusResp> getCheckStatusMethod;
    if ((getCheckStatusMethod = messageGrpc.getCheckStatusMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getCheckStatusMethod = messageGrpc.getCheckStatusMethod) == null) {
          messageGrpc.getCheckStatusMethod = getCheckStatusMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.CheckStatusReq, gitspringboot.modules.message.CheckStatusResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "CheckStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.CheckStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.CheckStatusResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("CheckStatus"))
                  .build();
          }
        }
     }
     return getCheckStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.AddTemplateReq,
      gitspringboot.modules.message.AddTemplateResp> getAddTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTemplate",
      requestType = gitspringboot.modules.message.AddTemplateReq.class,
      responseType = gitspringboot.modules.message.AddTemplateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.AddTemplateReq,
      gitspringboot.modules.message.AddTemplateResp> getAddTemplateMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.AddTemplateReq, gitspringboot.modules.message.AddTemplateResp> getAddTemplateMethod;
    if ((getAddTemplateMethod = messageGrpc.getAddTemplateMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getAddTemplateMethod = messageGrpc.getAddTemplateMethod) == null) {
          messageGrpc.getAddTemplateMethod = getAddTemplateMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.AddTemplateReq, gitspringboot.modules.message.AddTemplateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "AddTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.AddTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.AddTemplateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("AddTemplate"))
                  .build();
          }
        }
     }
     return getAddTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.ListTemplateReq,
      gitspringboot.modules.message.ListTemplateResp> getListTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTemplate",
      requestType = gitspringboot.modules.message.ListTemplateReq.class,
      responseType = gitspringboot.modules.message.ListTemplateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.ListTemplateReq,
      gitspringboot.modules.message.ListTemplateResp> getListTemplateMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.ListTemplateReq, gitspringboot.modules.message.ListTemplateResp> getListTemplateMethod;
    if ((getListTemplateMethod = messageGrpc.getListTemplateMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getListTemplateMethod = messageGrpc.getListTemplateMethod) == null) {
          messageGrpc.getListTemplateMethod = getListTemplateMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.ListTemplateReq, gitspringboot.modules.message.ListTemplateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "ListTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.ListTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.ListTemplateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("ListTemplate"))
                  .build();
          }
        }
     }
     return getListTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.DeleteTemplateReq,
      gitspringboot.modules.message.DeleteTemplateResp> getDeleteTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTemplate",
      requestType = gitspringboot.modules.message.DeleteTemplateReq.class,
      responseType = gitspringboot.modules.message.DeleteTemplateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.DeleteTemplateReq,
      gitspringboot.modules.message.DeleteTemplateResp> getDeleteTemplateMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.DeleteTemplateReq, gitspringboot.modules.message.DeleteTemplateResp> getDeleteTemplateMethod;
    if ((getDeleteTemplateMethod = messageGrpc.getDeleteTemplateMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getDeleteTemplateMethod = messageGrpc.getDeleteTemplateMethod) == null) {
          messageGrpc.getDeleteTemplateMethod = getDeleteTemplateMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.DeleteTemplateReq, gitspringboot.modules.message.DeleteTemplateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "DeleteTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.DeleteTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.DeleteTemplateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("DeleteTemplate"))
                  .build();
          }
        }
     }
     return getDeleteTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.SendMsgReq,
      gitspringboot.modules.message.SendMsgResp> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMsg",
      requestType = gitspringboot.modules.message.SendMsgReq.class,
      responseType = gitspringboot.modules.message.SendMsgResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.SendMsgReq,
      gitspringboot.modules.message.SendMsgResp> getSendMsgMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.SendMsgReq, gitspringboot.modules.message.SendMsgResp> getSendMsgMethod;
    if ((getSendMsgMethod = messageGrpc.getSendMsgMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendMsgMethod = messageGrpc.getSendMsgMethod) == null) {
          messageGrpc.getSendMsgMethod = getSendMsgMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.SendMsgReq, gitspringboot.modules.message.SendMsgResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "SendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.SendMsgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.SendMsgResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendMsg"))
                  .build();
          }
        }
     }
     return getSendMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.FindMessageByTopicReq,
      gitspringboot.modules.message.FindMessageByTopicResp> getFindMessageByTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMessageByTopic",
      requestType = gitspringboot.modules.message.FindMessageByTopicReq.class,
      responseType = gitspringboot.modules.message.FindMessageByTopicResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.FindMessageByTopicReq,
      gitspringboot.modules.message.FindMessageByTopicResp> getFindMessageByTopicMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.FindMessageByTopicReq, gitspringboot.modules.message.FindMessageByTopicResp> getFindMessageByTopicMethod;
    if ((getFindMessageByTopicMethod = messageGrpc.getFindMessageByTopicMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getFindMessageByTopicMethod = messageGrpc.getFindMessageByTopicMethod) == null) {
          messageGrpc.getFindMessageByTopicMethod = getFindMessageByTopicMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.FindMessageByTopicReq, gitspringboot.modules.message.FindMessageByTopicResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "FindMessageByTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.FindMessageByTopicReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.FindMessageByTopicResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("FindMessageByTopic"))
                  .build();
          }
        }
     }
     return getFindMessageByTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.FindTopicByUserReq,
      gitspringboot.modules.message.FindTopicByUserResp> getFindTopicByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindTopicByUser",
      requestType = gitspringboot.modules.message.FindTopicByUserReq.class,
      responseType = gitspringboot.modules.message.FindTopicByUserResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.FindTopicByUserReq,
      gitspringboot.modules.message.FindTopicByUserResp> getFindTopicByUserMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.FindTopicByUserReq, gitspringboot.modules.message.FindTopicByUserResp> getFindTopicByUserMethod;
    if ((getFindTopicByUserMethod = messageGrpc.getFindTopicByUserMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getFindTopicByUserMethod = messageGrpc.getFindTopicByUserMethod) == null) {
          messageGrpc.getFindTopicByUserMethod = getFindTopicByUserMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.FindTopicByUserReq, gitspringboot.modules.message.FindTopicByUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "FindTopicByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.FindTopicByUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.FindTopicByUserResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("FindTopicByUser"))
                  .build();
          }
        }
     }
     return getFindTopicByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.GetUnReadTopicCountReq,
      gitspringboot.modules.message.GetUnReadTopicCountResp> getGetUnReadTopicCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnReadTopicCount",
      requestType = gitspringboot.modules.message.GetUnReadTopicCountReq.class,
      responseType = gitspringboot.modules.message.GetUnReadTopicCountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.GetUnReadTopicCountReq,
      gitspringboot.modules.message.GetUnReadTopicCountResp> getGetUnReadTopicCountMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.GetUnReadTopicCountReq, gitspringboot.modules.message.GetUnReadTopicCountResp> getGetUnReadTopicCountMethod;
    if ((getGetUnReadTopicCountMethod = messageGrpc.getGetUnReadTopicCountMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getGetUnReadTopicCountMethod = messageGrpc.getGetUnReadTopicCountMethod) == null) {
          messageGrpc.getGetUnReadTopicCountMethod = getGetUnReadTopicCountMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.GetUnReadTopicCountReq, gitspringboot.modules.message.GetUnReadTopicCountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "GetUnReadTopicCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.GetUnReadTopicCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.GetUnReadTopicCountResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("GetUnReadTopicCount"))
                  .build();
          }
        }
     }
     return getGetUnReadTopicCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gitspringboot.modules.message.GetUnReadMsgCountReq,
      gitspringboot.modules.message.GetUnReadMsgCountResp> getGetUnReadMsgCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnReadMsgCount",
      requestType = gitspringboot.modules.message.GetUnReadMsgCountReq.class,
      responseType = gitspringboot.modules.message.GetUnReadMsgCountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gitspringboot.modules.message.GetUnReadMsgCountReq,
      gitspringboot.modules.message.GetUnReadMsgCountResp> getGetUnReadMsgCountMethod() {
    io.grpc.MethodDescriptor<gitspringboot.modules.message.GetUnReadMsgCountReq, gitspringboot.modules.message.GetUnReadMsgCountResp> getGetUnReadMsgCountMethod;
    if ((getGetUnReadMsgCountMethod = messageGrpc.getGetUnReadMsgCountMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getGetUnReadMsgCountMethod = messageGrpc.getGetUnReadMsgCountMethod) == null) {
          messageGrpc.getGetUnReadMsgCountMethod = getGetUnReadMsgCountMethod = 
              io.grpc.MethodDescriptor.<gitspringboot.modules.message.GetUnReadMsgCountReq, gitspringboot.modules.message.GetUnReadMsgCountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "GetUnReadMsgCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.GetUnReadMsgCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gitspringboot.modules.message.GetUnReadMsgCountResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("GetUnReadMsgCount"))
                  .build();
          }
        }
     }
     return getGetUnReadMsgCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static messageStub newStub(io.grpc.Channel channel) {
    return new messageStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static messageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new messageBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static messageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new messageFutureStub(channel);
  }

  /**
   */
  public static abstract class messageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 发送短信信息 国际区号+号码。无任何前缀默认为国内
     * </pre>
     */
    public void sendSms(gitspringboot.modules.message.SendSmsReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendSmsResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public void sendEmail(gitspringboot.modules.message.SendEmailReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendEmailResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public void checkStatus(gitspringboot.modules.message.CheckStatusReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.CheckStatusResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public void addTemplate(gitspringboot.modules.message.AddTemplateReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.AddTemplateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public void listTemplate(gitspringboot.modules.message.ListTemplateReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.ListTemplateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getListTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public void deleteTemplate(gitspringboot.modules.message.DeleteTemplateReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.DeleteTemplateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public void sendMsg(gitspringboot.modules.message.SendMsgReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendMsgResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public void findMessageByTopic(gitspringboot.modules.message.FindMessageByTopicReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.FindMessageByTopicResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindMessageByTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public void findTopicByUser(gitspringboot.modules.message.FindTopicByUserReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.FindTopicByUserResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindTopicByUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public void getUnReadTopicCount(gitspringboot.modules.message.GetUnReadTopicCountReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.GetUnReadTopicCountResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUnReadTopicCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public void getUnReadMsgCount(gitspringboot.modules.message.GetUnReadMsgCountReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.GetUnReadMsgCountResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUnReadMsgCountMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.SendSmsReq,
                gitspringboot.modules.message.SendSmsResp>(
                  this, METHODID_SEND_SMS)))
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.SendEmailReq,
                gitspringboot.modules.message.SendEmailResp>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            getCheckStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.CheckStatusReq,
                gitspringboot.modules.message.CheckStatusResp>(
                  this, METHODID_CHECK_STATUS)))
          .addMethod(
            getAddTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.AddTemplateReq,
                gitspringboot.modules.message.AddTemplateResp>(
                  this, METHODID_ADD_TEMPLATE)))
          .addMethod(
            getListTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.ListTemplateReq,
                gitspringboot.modules.message.ListTemplateResp>(
                  this, METHODID_LIST_TEMPLATE)))
          .addMethod(
            getDeleteTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.DeleteTemplateReq,
                gitspringboot.modules.message.DeleteTemplateResp>(
                  this, METHODID_DELETE_TEMPLATE)))
          .addMethod(
            getSendMsgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.SendMsgReq,
                gitspringboot.modules.message.SendMsgResp>(
                  this, METHODID_SEND_MSG)))
          .addMethod(
            getFindMessageByTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.FindMessageByTopicReq,
                gitspringboot.modules.message.FindMessageByTopicResp>(
                  this, METHODID_FIND_MESSAGE_BY_TOPIC)))
          .addMethod(
            getFindTopicByUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.FindTopicByUserReq,
                gitspringboot.modules.message.FindTopicByUserResp>(
                  this, METHODID_FIND_TOPIC_BY_USER)))
          .addMethod(
            getGetUnReadTopicCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.GetUnReadTopicCountReq,
                gitspringboot.modules.message.GetUnReadTopicCountResp>(
                  this, METHODID_GET_UN_READ_TOPIC_COUNT)))
          .addMethod(
            getGetUnReadMsgCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gitspringboot.modules.message.GetUnReadMsgCountReq,
                gitspringboot.modules.message.GetUnReadMsgCountResp>(
                  this, METHODID_GET_UN_READ_MSG_COUNT)))
          .build();
    }
  }

  /**
   */
  public static final class messageStub extends io.grpc.stub.AbstractStub<messageStub> {
    private messageStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected messageStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送短信信息 国际区号+号码。无任何前缀默认为国内
     * </pre>
     */
    public void sendSms(gitspringboot.modules.message.SendSmsReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendSmsResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public void sendEmail(gitspringboot.modules.message.SendEmailReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendEmailResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public void checkStatus(gitspringboot.modules.message.CheckStatusReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.CheckStatusResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public void addTemplate(gitspringboot.modules.message.AddTemplateReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.AddTemplateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public void listTemplate(gitspringboot.modules.message.ListTemplateReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.ListTemplateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public void deleteTemplate(gitspringboot.modules.message.DeleteTemplateReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.DeleteTemplateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public void sendMsg(gitspringboot.modules.message.SendMsgReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendMsgResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public void findMessageByTopic(gitspringboot.modules.message.FindMessageByTopicReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.FindMessageByTopicResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindMessageByTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public void findTopicByUser(gitspringboot.modules.message.FindTopicByUserReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.FindTopicByUserResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindTopicByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public void getUnReadTopicCount(gitspringboot.modules.message.GetUnReadTopicCountReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.GetUnReadTopicCountResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUnReadTopicCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public void getUnReadMsgCount(gitspringboot.modules.message.GetUnReadMsgCountReq request,
        io.grpc.stub.StreamObserver<gitspringboot.modules.message.GetUnReadMsgCountResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUnReadMsgCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class messageBlockingStub extends io.grpc.stub.AbstractStub<messageBlockingStub> {
    private messageBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected messageBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送短信信息 国际区号+号码。无任何前缀默认为国内
     * </pre>
     */
    public gitspringboot.modules.message.SendSmsResp sendSms(gitspringboot.modules.message.SendSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getSendSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public gitspringboot.modules.message.SendEmailResp sendEmail(gitspringboot.modules.message.SendEmailReq request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public gitspringboot.modules.message.CheckStatusResp checkStatus(gitspringboot.modules.message.CheckStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getCheckStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public gitspringboot.modules.message.AddTemplateResp addTemplate(gitspringboot.modules.message.AddTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getAddTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public gitspringboot.modules.message.ListTemplateResp listTemplate(gitspringboot.modules.message.ListTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getListTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public gitspringboot.modules.message.DeleteTemplateResp deleteTemplate(gitspringboot.modules.message.DeleteTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public gitspringboot.modules.message.SendMsgResp sendMsg(gitspringboot.modules.message.SendMsgReq request) {
      return blockingUnaryCall(
          getChannel(), getSendMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public gitspringboot.modules.message.FindMessageByTopicResp findMessageByTopic(gitspringboot.modules.message.FindMessageByTopicReq request) {
      return blockingUnaryCall(
          getChannel(), getFindMessageByTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public gitspringboot.modules.message.FindTopicByUserResp findTopicByUser(gitspringboot.modules.message.FindTopicByUserReq request) {
      return blockingUnaryCall(
          getChannel(), getFindTopicByUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public gitspringboot.modules.message.GetUnReadTopicCountResp getUnReadTopicCount(gitspringboot.modules.message.GetUnReadTopicCountReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUnReadTopicCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public gitspringboot.modules.message.GetUnReadMsgCountResp getUnReadMsgCount(gitspringboot.modules.message.GetUnReadMsgCountReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUnReadMsgCountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class messageFutureStub extends io.grpc.stub.AbstractStub<messageFutureStub> {
    private messageFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private messageFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected messageFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new messageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送短信信息 国际区号+号码。无任何前缀默认为国内
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.SendSmsResp> sendSms(
        gitspringboot.modules.message.SendSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.SendEmailResp> sendEmail(
        gitspringboot.modules.message.SendEmailReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.CheckStatusResp> checkStatus(
        gitspringboot.modules.message.CheckStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.AddTemplateResp> addTemplate(
        gitspringboot.modules.message.AddTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.ListTemplateResp> listTemplate(
        gitspringboot.modules.message.ListTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.DeleteTemplateResp> deleteTemplate(
        gitspringboot.modules.message.DeleteTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.SendMsgResp> sendMsg(
        gitspringboot.modules.message.SendMsgReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.FindMessageByTopicResp> findMessageByTopic(
        gitspringboot.modules.message.FindMessageByTopicReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindMessageByTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.FindTopicByUserResp> findTopicByUser(
        gitspringboot.modules.message.FindTopicByUserReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindTopicByUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.GetUnReadTopicCountResp> getUnReadTopicCount(
        gitspringboot.modules.message.GetUnReadTopicCountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUnReadTopicCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gitspringboot.modules.message.GetUnReadMsgCountResp> getUnReadMsgCount(
        gitspringboot.modules.message.GetUnReadMsgCountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUnReadMsgCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_SMS = 0;
  private static final int METHODID_SEND_EMAIL = 1;
  private static final int METHODID_CHECK_STATUS = 2;
  private static final int METHODID_ADD_TEMPLATE = 3;
  private static final int METHODID_LIST_TEMPLATE = 4;
  private static final int METHODID_DELETE_TEMPLATE = 5;
  private static final int METHODID_SEND_MSG = 6;
  private static final int METHODID_FIND_MESSAGE_BY_TOPIC = 7;
  private static final int METHODID_FIND_TOPIC_BY_USER = 8;
  private static final int METHODID_GET_UN_READ_TOPIC_COUNT = 9;
  private static final int METHODID_GET_UN_READ_MSG_COUNT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final messageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(messageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SMS:
          serviceImpl.sendSms((gitspringboot.modules.message.SendSmsReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendSmsResp>) responseObserver);
          break;
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((gitspringboot.modules.message.SendEmailReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendEmailResp>) responseObserver);
          break;
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((gitspringboot.modules.message.CheckStatusReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.CheckStatusResp>) responseObserver);
          break;
        case METHODID_ADD_TEMPLATE:
          serviceImpl.addTemplate((gitspringboot.modules.message.AddTemplateReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.AddTemplateResp>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATE:
          serviceImpl.listTemplate((gitspringboot.modules.message.ListTemplateReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.ListTemplateResp>) responseObserver);
          break;
        case METHODID_DELETE_TEMPLATE:
          serviceImpl.deleteTemplate((gitspringboot.modules.message.DeleteTemplateReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.DeleteTemplateResp>) responseObserver);
          break;
        case METHODID_SEND_MSG:
          serviceImpl.sendMsg((gitspringboot.modules.message.SendMsgReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.SendMsgResp>) responseObserver);
          break;
        case METHODID_FIND_MESSAGE_BY_TOPIC:
          serviceImpl.findMessageByTopic((gitspringboot.modules.message.FindMessageByTopicReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.FindMessageByTopicResp>) responseObserver);
          break;
        case METHODID_FIND_TOPIC_BY_USER:
          serviceImpl.findTopicByUser((gitspringboot.modules.message.FindTopicByUserReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.FindTopicByUserResp>) responseObserver);
          break;
        case METHODID_GET_UN_READ_TOPIC_COUNT:
          serviceImpl.getUnReadTopicCount((gitspringboot.modules.message.GetUnReadTopicCountReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.GetUnReadTopicCountResp>) responseObserver);
          break;
        case METHODID_GET_UN_READ_MSG_COUNT:
          serviceImpl.getUnReadMsgCount((gitspringboot.modules.message.GetUnReadMsgCountReq) request,
              (io.grpc.stub.StreamObserver<gitspringboot.modules.message.GetUnReadMsgCountResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class messageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    messageBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gitspringboot.modules.message.MessageProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("message");
    }
  }

  private static final class messageFileDescriptorSupplier
      extends messageBaseDescriptorSupplier {
    messageFileDescriptorSupplier() {}
  }

  private static final class messageMethodDescriptorSupplier
      extends messageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    messageMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (messageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new messageFileDescriptorSupplier())
              .addMethod(getSendSmsMethod())
              .addMethod(getSendEmailMethod())
              .addMethod(getCheckStatusMethod())
              .addMethod(getAddTemplateMethod())
              .addMethod(getListTemplateMethod())
              .addMethod(getDeleteTemplateMethod())
              .addMethod(getSendMsgMethod())
              .addMethod(getFindMessageByTopicMethod())
              .addMethod(getFindTopicByUserMethod())
              .addMethod(getGetUnReadTopicCountMethod())
              .addMethod(getGetUnReadMsgCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
