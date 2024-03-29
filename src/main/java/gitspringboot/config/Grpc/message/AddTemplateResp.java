// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.config.Grpc.message;

/**
 * <pre>
 * 模版响应请求
 * </pre>
 *
 * Protobuf type {@code message.AddTemplateResp}
 */
public  final class AddTemplateResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:message.AddTemplateResp)
    AddTemplateRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddTemplateResp.newBuilder() to construct.
  private AddTemplateResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddTemplateResp() {
    templateCode_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddTemplateResp(
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

            templateCode_ = s;
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
    return MessageProto.internal_static_message_AddTemplateResp_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageProto.internal_static_message_AddTemplateResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AddTemplateResp.class, Builder.class);
  }

  public static final int TEMPLATECODE_FIELD_NUMBER = 1;
  private volatile Object templateCode_;
  /**
   * <pre>
   * 模版代码
   * </pre>
   *
   * <code>string templateCode = 1;</code>
   */
  public String getTemplateCode() {
    Object ref = templateCode_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      templateCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 模版代码
   * </pre>
   *
   * <code>string templateCode = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTemplateCodeBytes() {
    Object ref = templateCode_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      templateCode_ = b;
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
    if (!getTemplateCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, templateCode_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTemplateCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, templateCode_);
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
    if (!(obj instanceof AddTemplateResp)) {
      return super.equals(obj);
    }
    AddTemplateResp other = (AddTemplateResp) obj;

    boolean result = true;
    result = result && getTemplateCode()
        .equals(other.getTemplateCode());
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
    hash = (37 * hash) + TEMPLATECODE_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AddTemplateResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AddTemplateResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AddTemplateResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AddTemplateResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AddTemplateResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AddTemplateResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AddTemplateResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AddTemplateResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AddTemplateResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AddTemplateResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AddTemplateResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AddTemplateResp parseFrom(
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
  public static Builder newBuilder(AddTemplateResp prototype) {
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
   * <pre>
   * 模版响应请求
   * </pre>
   *
   * Protobuf type {@code message.AddTemplateResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:message.AddTemplateResp)
      AddTemplateRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageProto.internal_static_message_AddTemplateResp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageProto.internal_static_message_AddTemplateResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AddTemplateResp.class, Builder.class);
    }

    // Construct using gitspringboot.modules.message.AddTemplateResp.newBuilder()
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
      templateCode_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageProto.internal_static_message_AddTemplateResp_descriptor;
    }

    public AddTemplateResp getDefaultInstanceForType() {
      return AddTemplateResp.getDefaultInstance();
    }

    public AddTemplateResp build() {
      AddTemplateResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AddTemplateResp buildPartial() {
      AddTemplateResp result = new AddTemplateResp(this);
      result.templateCode_ = templateCode_;
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
      if (other instanceof AddTemplateResp) {
        return mergeFrom((AddTemplateResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AddTemplateResp other) {
      if (other == AddTemplateResp.getDefaultInstance()) return this;
      if (!other.getTemplateCode().isEmpty()) {
        templateCode_ = other.templateCode_;
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
      AddTemplateResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AddTemplateResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object templateCode_ = "";
    /**
     * <pre>
     * 模版代码
     * </pre>
     *
     * <code>string templateCode = 1;</code>
     */
    public String getTemplateCode() {
      Object ref = templateCode_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        templateCode_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 模版代码
     * </pre>
     *
     * <code>string templateCode = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTemplateCodeBytes() {
      Object ref = templateCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        templateCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 模版代码
     * </pre>
     *
     * <code>string templateCode = 1;</code>
     */
    public Builder setTemplateCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 模版代码
     * </pre>
     *
     * <code>string templateCode = 1;</code>
     */
    public Builder clearTemplateCode() {
      
      templateCode_ = getDefaultInstance().getTemplateCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 模版代码
     * </pre>
     *
     * <code>string templateCode = 1;</code>
     */
    public Builder setTemplateCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:message.AddTemplateResp)
  }

  // @@protoc_insertion_point(class_scope:message.AddTemplateResp)
  private static final AddTemplateResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AddTemplateResp();
  }

  public static AddTemplateResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddTemplateResp>
      PARSER = new com.google.protobuf.AbstractParser<AddTemplateResp>() {
    public AddTemplateResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddTemplateResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddTemplateResp> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AddTemplateResp> getParserForType() {
    return PARSER;
  }

  public AddTemplateResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

