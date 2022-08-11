package gitspringboot.config.Grpc.message;

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
  private static volatile io.grpc.MethodDescriptor<SendSmsReq,
          SendSmsResp> getSendSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendSms",
      requestType = SendSmsReq.class,
      responseType = SendSmsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SendSmsReq,
          SendSmsResp> getSendSmsMethod() {
    io.grpc.MethodDescriptor<SendSmsReq, SendSmsResp> getSendSmsMethod;
    if ((getSendSmsMethod = messageGrpc.getSendSmsMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendSmsMethod = messageGrpc.getSendSmsMethod) == null) {
          messageGrpc.getSendSmsMethod = getSendSmsMethod = 
              io.grpc.MethodDescriptor.<SendSmsReq, SendSmsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "SendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendSmsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendSmsResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendSms"))
                  .build();
          }
        }
     }
     return getSendSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SendEmailReq,
          SendEmailResp> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmail",
      requestType = SendEmailReq.class,
      responseType = SendEmailResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SendEmailReq,
          SendEmailResp> getSendEmailMethod() {
    io.grpc.MethodDescriptor<SendEmailReq, SendEmailResp> getSendEmailMethod;
    if ((getSendEmailMethod = messageGrpc.getSendEmailMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendEmailMethod = messageGrpc.getSendEmailMethod) == null) {
          messageGrpc.getSendEmailMethod = getSendEmailMethod = 
              io.grpc.MethodDescriptor.<SendEmailReq, SendEmailResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "SendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendEmailReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendEmailResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendEmail"))
                  .build();
          }
        }
     }
     return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CheckStatusReq,
          CheckStatusResp> getCheckStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckStatus",
      requestType = CheckStatusReq.class,
      responseType = CheckStatusResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CheckStatusReq,
          CheckStatusResp> getCheckStatusMethod() {
    io.grpc.MethodDescriptor<CheckStatusReq, CheckStatusResp> getCheckStatusMethod;
    if ((getCheckStatusMethod = messageGrpc.getCheckStatusMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getCheckStatusMethod = messageGrpc.getCheckStatusMethod) == null) {
          messageGrpc.getCheckStatusMethod = getCheckStatusMethod = 
              io.grpc.MethodDescriptor.<CheckStatusReq, CheckStatusResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "CheckStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckStatusReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CheckStatusResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("CheckStatus"))
                  .build();
          }
        }
     }
     return getCheckStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AddTemplateReq,
          AddTemplateResp> getAddTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddTemplate",
      requestType = AddTemplateReq.class,
      responseType = AddTemplateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<AddTemplateReq,
          AddTemplateResp> getAddTemplateMethod() {
    io.grpc.MethodDescriptor<AddTemplateReq, AddTemplateResp> getAddTemplateMethod;
    if ((getAddTemplateMethod = messageGrpc.getAddTemplateMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getAddTemplateMethod = messageGrpc.getAddTemplateMethod) == null) {
          messageGrpc.getAddTemplateMethod = getAddTemplateMethod = 
              io.grpc.MethodDescriptor.<AddTemplateReq, AddTemplateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "AddTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AddTemplateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("AddTemplate"))
                  .build();
          }
        }
     }
     return getAddTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListTemplateReq,
          ListTemplateResp> getListTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTemplate",
      requestType = ListTemplateReq.class,
      responseType = ListTemplateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ListTemplateReq,
          ListTemplateResp> getListTemplateMethod() {
    io.grpc.MethodDescriptor<ListTemplateReq, ListTemplateResp> getListTemplateMethod;
    if ((getListTemplateMethod = messageGrpc.getListTemplateMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getListTemplateMethod = messageGrpc.getListTemplateMethod) == null) {
          messageGrpc.getListTemplateMethod = getListTemplateMethod = 
              io.grpc.MethodDescriptor.<ListTemplateReq, ListTemplateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "ListTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListTemplateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("ListTemplate"))
                  .build();
          }
        }
     }
     return getListTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DeleteTemplateReq,
          DeleteTemplateResp> getDeleteTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTemplate",
      requestType = DeleteTemplateReq.class,
      responseType = DeleteTemplateResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DeleteTemplateReq,
          DeleteTemplateResp> getDeleteTemplateMethod() {
    io.grpc.MethodDescriptor<DeleteTemplateReq, DeleteTemplateResp> getDeleteTemplateMethod;
    if ((getDeleteTemplateMethod = messageGrpc.getDeleteTemplateMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getDeleteTemplateMethod = messageGrpc.getDeleteTemplateMethod) == null) {
          messageGrpc.getDeleteTemplateMethod = getDeleteTemplateMethod = 
              io.grpc.MethodDescriptor.<DeleteTemplateReq, DeleteTemplateResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "DeleteTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteTemplateReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteTemplateResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("DeleteTemplate"))
                  .build();
          }
        }
     }
     return getDeleteTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SendMsgReq,
          SendMsgResp> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMsg",
      requestType = SendMsgReq.class,
      responseType = SendMsgResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SendMsgReq,
          SendMsgResp> getSendMsgMethod() {
    io.grpc.MethodDescriptor<SendMsgReq, SendMsgResp> getSendMsgMethod;
    if ((getSendMsgMethod = messageGrpc.getSendMsgMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getSendMsgMethod = messageGrpc.getSendMsgMethod) == null) {
          messageGrpc.getSendMsgMethod = getSendMsgMethod = 
              io.grpc.MethodDescriptor.<SendMsgReq, SendMsgResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "SendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendMsgReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SendMsgResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("SendMsg"))
                  .build();
          }
        }
     }
     return getSendMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FindMessageByTopicReq,
          FindMessageByTopicResp> getFindMessageByTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMessageByTopic",
      requestType = FindMessageByTopicReq.class,
      responseType = FindMessageByTopicResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FindMessageByTopicReq,
          FindMessageByTopicResp> getFindMessageByTopicMethod() {
    io.grpc.MethodDescriptor<FindMessageByTopicReq, FindMessageByTopicResp> getFindMessageByTopicMethod;
    if ((getFindMessageByTopicMethod = messageGrpc.getFindMessageByTopicMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getFindMessageByTopicMethod = messageGrpc.getFindMessageByTopicMethod) == null) {
          messageGrpc.getFindMessageByTopicMethod = getFindMessageByTopicMethod = 
              io.grpc.MethodDescriptor.<FindMessageByTopicReq, FindMessageByTopicResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "FindMessageByTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindMessageByTopicReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindMessageByTopicResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("FindMessageByTopic"))
                  .build();
          }
        }
     }
     return getFindMessageByTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FindTopicByUserReq,
          FindTopicByUserResp> getFindTopicByUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindTopicByUser",
      requestType = FindTopicByUserReq.class,
      responseType = FindTopicByUserResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FindTopicByUserReq,
          FindTopicByUserResp> getFindTopicByUserMethod() {
    io.grpc.MethodDescriptor<FindTopicByUserReq, FindTopicByUserResp> getFindTopicByUserMethod;
    if ((getFindTopicByUserMethod = messageGrpc.getFindTopicByUserMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getFindTopicByUserMethod = messageGrpc.getFindTopicByUserMethod) == null) {
          messageGrpc.getFindTopicByUserMethod = getFindTopicByUserMethod = 
              io.grpc.MethodDescriptor.<FindTopicByUserReq, FindTopicByUserResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "FindTopicByUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindTopicByUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FindTopicByUserResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("FindTopicByUser"))
                  .build();
          }
        }
     }
     return getFindTopicByUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetUnReadTopicCountReq,
          GetUnReadTopicCountResp> getGetUnReadTopicCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnReadTopicCount",
      requestType = GetUnReadTopicCountReq.class,
      responseType = GetUnReadTopicCountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetUnReadTopicCountReq,
          GetUnReadTopicCountResp> getGetUnReadTopicCountMethod() {
    io.grpc.MethodDescriptor<GetUnReadTopicCountReq, GetUnReadTopicCountResp> getGetUnReadTopicCountMethod;
    if ((getGetUnReadTopicCountMethod = messageGrpc.getGetUnReadTopicCountMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getGetUnReadTopicCountMethod = messageGrpc.getGetUnReadTopicCountMethod) == null) {
          messageGrpc.getGetUnReadTopicCountMethod = getGetUnReadTopicCountMethod = 
              io.grpc.MethodDescriptor.<GetUnReadTopicCountReq, GetUnReadTopicCountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "GetUnReadTopicCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUnReadTopicCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUnReadTopicCountResp.getDefaultInstance()))
                  .setSchemaDescriptor(new messageMethodDescriptorSupplier("GetUnReadTopicCount"))
                  .build();
          }
        }
     }
     return getGetUnReadTopicCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetUnReadMsgCountReq,
          GetUnReadMsgCountResp> getGetUnReadMsgCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnReadMsgCount",
      requestType = GetUnReadMsgCountReq.class,
      responseType = GetUnReadMsgCountResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetUnReadMsgCountReq,
          GetUnReadMsgCountResp> getGetUnReadMsgCountMethod() {
    io.grpc.MethodDescriptor<GetUnReadMsgCountReq, GetUnReadMsgCountResp> getGetUnReadMsgCountMethod;
    if ((getGetUnReadMsgCountMethod = messageGrpc.getGetUnReadMsgCountMethod) == null) {
      synchronized (messageGrpc.class) {
        if ((getGetUnReadMsgCountMethod = messageGrpc.getGetUnReadMsgCountMethod) == null) {
          messageGrpc.getGetUnReadMsgCountMethod = getGetUnReadMsgCountMethod = 
              io.grpc.MethodDescriptor.<GetUnReadMsgCountReq, GetUnReadMsgCountResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "message.message", "GetUnReadMsgCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUnReadMsgCountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetUnReadMsgCountResp.getDefaultInstance()))
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
    public void sendSms(SendSmsReq request,
                        io.grpc.stub.StreamObserver<SendSmsResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public void sendEmail(SendEmailReq request,
                          io.grpc.stub.StreamObserver<SendEmailResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public void checkStatus(CheckStatusReq request,
                            io.grpc.stub.StreamObserver<CheckStatusResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public void addTemplate(AddTemplateReq request,
                            io.grpc.stub.StreamObserver<AddTemplateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getAddTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public void listTemplate(ListTemplateReq request,
                             io.grpc.stub.StreamObserver<ListTemplateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getListTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public void deleteTemplate(DeleteTemplateReq request,
                               io.grpc.stub.StreamObserver<DeleteTemplateResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public void sendMsg(SendMsgReq request,
                        io.grpc.stub.StreamObserver<SendMsgResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMsgMethod(), responseObserver);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public void findMessageByTopic(FindMessageByTopicReq request,
                                   io.grpc.stub.StreamObserver<FindMessageByTopicResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindMessageByTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public void findTopicByUser(FindTopicByUserReq request,
                                io.grpc.stub.StreamObserver<FindTopicByUserResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFindTopicByUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public void getUnReadTopicCount(GetUnReadTopicCountReq request,
                                    io.grpc.stub.StreamObserver<GetUnReadTopicCountResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUnReadTopicCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public void getUnReadMsgCount(GetUnReadMsgCountReq request,
                                  io.grpc.stub.StreamObserver<GetUnReadMsgCountResp> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUnReadMsgCountMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      SendSmsReq,
                      SendSmsResp>(
                  this, METHODID_SEND_SMS)))
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      SendEmailReq,
                      SendEmailResp>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            getCheckStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      CheckStatusReq,
                      CheckStatusResp>(
                  this, METHODID_CHECK_STATUS)))
          .addMethod(
            getAddTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      AddTemplateReq,
                      AddTemplateResp>(
                  this, METHODID_ADD_TEMPLATE)))
          .addMethod(
            getListTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      ListTemplateReq,
                      ListTemplateResp>(
                  this, METHODID_LIST_TEMPLATE)))
          .addMethod(
            getDeleteTemplateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      DeleteTemplateReq,
                      DeleteTemplateResp>(
                  this, METHODID_DELETE_TEMPLATE)))
          .addMethod(
            getSendMsgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      SendMsgReq,
                      SendMsgResp>(
                  this, METHODID_SEND_MSG)))
          .addMethod(
            getFindMessageByTopicMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      FindMessageByTopicReq,
                      FindMessageByTopicResp>(
                  this, METHODID_FIND_MESSAGE_BY_TOPIC)))
          .addMethod(
            getFindTopicByUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      FindTopicByUserReq,
                      FindTopicByUserResp>(
                  this, METHODID_FIND_TOPIC_BY_USER)))
          .addMethod(
            getGetUnReadTopicCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      GetUnReadTopicCountReq,
                      GetUnReadTopicCountResp>(
                  this, METHODID_GET_UN_READ_TOPIC_COUNT)))
          .addMethod(
            getGetUnReadMsgCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      GetUnReadMsgCountReq,
                      GetUnReadMsgCountResp>(
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
    public void sendSms(SendSmsReq request,
                        io.grpc.stub.StreamObserver<SendSmsResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public void sendEmail(SendEmailReq request,
                          io.grpc.stub.StreamObserver<SendEmailResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public void checkStatus(CheckStatusReq request,
                            io.grpc.stub.StreamObserver<CheckStatusResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public void addTemplate(AddTemplateReq request,
                            io.grpc.stub.StreamObserver<AddTemplateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public void listTemplate(ListTemplateReq request,
                             io.grpc.stub.StreamObserver<ListTemplateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public void deleteTemplate(DeleteTemplateReq request,
                               io.grpc.stub.StreamObserver<DeleteTemplateResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public void sendMsg(SendMsgReq request,
                        io.grpc.stub.StreamObserver<SendMsgResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public void findMessageByTopic(FindMessageByTopicReq request,
                                   io.grpc.stub.StreamObserver<FindMessageByTopicResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindMessageByTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public void findTopicByUser(FindTopicByUserReq request,
                                io.grpc.stub.StreamObserver<FindTopicByUserResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindTopicByUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public void getUnReadTopicCount(GetUnReadTopicCountReq request,
                                    io.grpc.stub.StreamObserver<GetUnReadTopicCountResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUnReadTopicCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public void getUnReadMsgCount(GetUnReadMsgCountReq request,
                                  io.grpc.stub.StreamObserver<GetUnReadMsgCountResp> responseObserver) {
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
    public SendSmsResp sendSms(SendSmsReq request) {
      return blockingUnaryCall(
          getChannel(), getSendSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public SendEmailResp sendEmail(SendEmailReq request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public CheckStatusResp checkStatus(CheckStatusReq request) {
      return blockingUnaryCall(
          getChannel(), getCheckStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public AddTemplateResp addTemplate(AddTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getAddTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public ListTemplateResp listTemplate(ListTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getListTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public DeleteTemplateResp deleteTemplate(DeleteTemplateReq request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public SendMsgResp sendMsg(SendMsgReq request) {
      return blockingUnaryCall(
          getChannel(), getSendMsgMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public FindMessageByTopicResp findMessageByTopic(FindMessageByTopicReq request) {
      return blockingUnaryCall(
          getChannel(), getFindMessageByTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public FindTopicByUserResp findTopicByUser(FindTopicByUserReq request) {
      return blockingUnaryCall(
          getChannel(), getFindTopicByUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public GetUnReadTopicCountResp getUnReadTopicCount(GetUnReadTopicCountReq request) {
      return blockingUnaryCall(
          getChannel(), getGetUnReadTopicCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public GetUnReadMsgCountResp getUnReadMsgCount(GetUnReadMsgCountReq request) {
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
    public com.google.common.util.concurrent.ListenableFuture<SendSmsResp> sendSms(
        SendSmsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送邮箱信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SendEmailResp> sendEmail(
        SendEmailReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 检查发送结果 预留
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CheckStatusResp> checkStatus(
        CheckStatusReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建模版
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<AddTemplateResp> addTemplate(
        AddTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAddTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 列出所有短信模版
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ListTemplateResp> listTemplate(
        ListTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除模版
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<DeleteTemplateResp> deleteTemplate(
        DeleteTemplateReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 发送站内信
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SendMsgResp> sendMsg(
        SendMsgReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 通过主题获取主题下的消息（并标记已读）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<FindMessageByTopicResp> findMessageByTopic(
        FindMessageByTopicReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindMessageByTopicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 通过用户查找主题
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<FindTopicByUserResp> findTopicByUser(
        FindTopicByUserReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindTopicByUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取主题的未读数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetUnReadTopicCountResp> getUnReadTopicCount(
        GetUnReadTopicCountReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUnReadTopicCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取未读消息数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GetUnReadMsgCountResp> getUnReadMsgCount(
        GetUnReadMsgCountReq request) {
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
          serviceImpl.sendSms((SendSmsReq) request,
              (io.grpc.stub.StreamObserver<SendSmsResp>) responseObserver);
          break;
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((SendEmailReq) request,
              (io.grpc.stub.StreamObserver<SendEmailResp>) responseObserver);
          break;
        case METHODID_CHECK_STATUS:
          serviceImpl.checkStatus((CheckStatusReq) request,
              (io.grpc.stub.StreamObserver<CheckStatusResp>) responseObserver);
          break;
        case METHODID_ADD_TEMPLATE:
          serviceImpl.addTemplate((AddTemplateReq) request,
              (io.grpc.stub.StreamObserver<AddTemplateResp>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATE:
          serviceImpl.listTemplate((ListTemplateReq) request,
              (io.grpc.stub.StreamObserver<ListTemplateResp>) responseObserver);
          break;
        case METHODID_DELETE_TEMPLATE:
          serviceImpl.deleteTemplate((DeleteTemplateReq) request,
              (io.grpc.stub.StreamObserver<DeleteTemplateResp>) responseObserver);
          break;
        case METHODID_SEND_MSG:
          serviceImpl.sendMsg((SendMsgReq) request,
              (io.grpc.stub.StreamObserver<SendMsgResp>) responseObserver);
          break;
        case METHODID_FIND_MESSAGE_BY_TOPIC:
          serviceImpl.findMessageByTopic((FindMessageByTopicReq) request,
              (io.grpc.stub.StreamObserver<FindMessageByTopicResp>) responseObserver);
          break;
        case METHODID_FIND_TOPIC_BY_USER:
          serviceImpl.findTopicByUser((FindTopicByUserReq) request,
              (io.grpc.stub.StreamObserver<FindTopicByUserResp>) responseObserver);
          break;
        case METHODID_GET_UN_READ_TOPIC_COUNT:
          serviceImpl.getUnReadTopicCount((GetUnReadTopicCountReq) request,
              (io.grpc.stub.StreamObserver<GetUnReadTopicCountResp>) responseObserver);
          break;
        case METHODID_GET_UN_READ_MSG_COUNT:
          serviceImpl.getUnReadMsgCount((GetUnReadMsgCountReq) request,
              (io.grpc.stub.StreamObserver<GetUnReadMsgCountResp>) responseObserver);
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
      return MessageProto.getDescriptor();
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
