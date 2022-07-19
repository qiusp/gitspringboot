// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.modules.message;

/**
 * Protobuf type {@code message.SendMsgResp}
 */
public  final class SendMsgResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:message.SendMsgResp)
    SendMsgRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendMsgResp.newBuilder() to construct.
  private SendMsgResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendMsgResp() {
    msgId_ = "";
    topicId_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendMsgResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            msgId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            topicId_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MessageProto.internal_static_message_SendMsgResp_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageProto.internal_static_message_SendMsgResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SendMsgResp.class, Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private volatile Object msgId_;
  /**
   * <pre>
   * 消息Id
   * </pre>
   *
   * <code>string msgId = 1;</code>
   */
  public String getMsgId() {
    Object ref = msgId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      msgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 消息Id
   * </pre>
   *
   * <code>string msgId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMsgIdBytes() {
    Object ref = msgId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      msgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOPICID_FIELD_NUMBER = 2;
  private volatile Object topicId_;
  /**
   * <pre>
   * 主题Id
   * </pre>
   *
   * <code>string topicId = 2;</code>
   */
  public String getTopicId() {
    Object ref = topicId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      topicId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 主题Id
   * </pre>
   *
   * <code>string topicId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTopicIdBytes() {
    Object ref = topicId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      topicId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMsgIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msgId_);
    }
    if (!getTopicIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topicId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMsgIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msgId_);
    }
    if (!getTopicIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topicId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SendMsgResp)) {
      return super.equals(obj);
    }
    SendMsgResp other = (SendMsgResp) obj;

    boolean result = true;
    result = result && getMsgId()
        .equals(other.getMsgId());
    result = result && getTopicId()
        .equals(other.getTopicId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + getMsgId().hashCode();
    hash = (37 * hash) + TOPICID_FIELD_NUMBER;
    hash = (53 * hash) + getTopicId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SendMsgResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendMsgResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendMsgResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendMsgResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendMsgResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendMsgResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendMsgResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SendMsgResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SendMsgResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SendMsgResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SendMsgResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SendMsgResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SendMsgResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code message.SendMsgResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:message.SendMsgResp)
      SendMsgRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageProto.internal_static_message_SendMsgResp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageProto.internal_static_message_SendMsgResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SendMsgResp.class, Builder.class);
    }

    // Construct using gitspringboot.modules.message.SendMsgResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      msgId_ = "";

      topicId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageProto.internal_static_message_SendMsgResp_descriptor;
    }

    public SendMsgResp getDefaultInstanceForType() {
      return SendMsgResp.getDefaultInstance();
    }

    public SendMsgResp build() {
      SendMsgResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SendMsgResp buildPartial() {
      SendMsgResp result = new SendMsgResp(this);
      result.msgId_ = msgId_;
      result.topicId_ = topicId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SendMsgResp) {
        return mergeFrom((SendMsgResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SendMsgResp other) {
      if (other == SendMsgResp.getDefaultInstance()) return this;
      if (!other.getMsgId().isEmpty()) {
        msgId_ = other.msgId_;
        onChanged();
      }
      if (!other.getTopicId().isEmpty()) {
        topicId_ = other.topicId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SendMsgResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SendMsgResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object msgId_ = "";
    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>string msgId = 1;</code>
     */
    public String getMsgId() {
      Object ref = msgId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        msgId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>string msgId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgIdBytes() {
      Object ref = msgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        msgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>string msgId = 1;</code>
     */
    public Builder setMsgId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>string msgId = 1;</code>
     */
    public Builder clearMsgId() {
      
      msgId_ = getDefaultInstance().getMsgId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息Id
     * </pre>
     *
     * <code>string msgId = 1;</code>
     */
    public Builder setMsgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgId_ = value;
      onChanged();
      return this;
    }

    private Object topicId_ = "";
    /**
     * <pre>
     * 主题Id
     * </pre>
     *
     * <code>string topicId = 2;</code>
     */
    public String getTopicId() {
      Object ref = topicId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        topicId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 主题Id
     * </pre>
     *
     * <code>string topicId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTopicIdBytes() {
      Object ref = topicId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        topicId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 主题Id
     * </pre>
     *
     * <code>string topicId = 2;</code>
     */
    public Builder setTopicId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topicId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主题Id
     * </pre>
     *
     * <code>string topicId = 2;</code>
     */
    public Builder clearTopicId() {
      
      topicId_ = getDefaultInstance().getTopicId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主题Id
     * </pre>
     *
     * <code>string topicId = 2;</code>
     */
    public Builder setTopicIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topicId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:message.SendMsgResp)
  }

  // @@protoc_insertion_point(class_scope:message.SendMsgResp)
  private static final SendMsgResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SendMsgResp();
  }

  public static SendMsgResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendMsgResp>
      PARSER = new com.google.protobuf.AbstractParser<SendMsgResp>() {
    public SendMsgResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendMsgResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendMsgResp> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SendMsgResp> getParserForType() {
    return PARSER;
  }

  public SendMsgResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

