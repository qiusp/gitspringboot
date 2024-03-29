// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.config.Grpc.message;

/**
 * <pre>
 * 发送
 * </pre>
 *
 * Protobuf type {@code message.SendSmsReq}
 */
public  final class SendSmsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:message.SendSmsReq)
    SendSmsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendSmsReq.newBuilder() to construct.
  private SendSmsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendSmsReq() {
    templateCode_ = "";
    mobile_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendSmsReq(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              params_ = com.google.protobuf.MapField.newMapField(
                  ParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<String, String>
            params__ = input.readMessage(
                ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            params_.getMutableMap().put(
                params__.getKey(), params__.getValue());
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            mobile_ = s;
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
    return MessageProto.internal_static_message_SendSmsReq_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageProto.internal_static_message_SendSmsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SendSmsReq.class, Builder.class);
  }

  private int bitField0_;
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

  public static final int PARAMS_FIELD_NUMBER = 2;
  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, String> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, String>newDefaultInstance(
                MessageProto.internal_static_message_SendSmsReq_ParamsEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      String, String> params_;
  private com.google.protobuf.MapField<String, String>
  internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   * <pre>
   * 模版参数
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public boolean containsParams(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    return internalGetParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @Deprecated
  public java.util.Map<String, String> getParams() {
    return getParamsMap();
  }
  /**
   * <pre>
   * 模版参数
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public java.util.Map<String, String> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   * <pre>
   * 模版参数
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public String getParamsOrDefault(
      String key,
      String defaultValue) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 模版参数
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */

  public String getParamsOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException(); }
    java.util.Map<String, String> map =
        internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int MOBILE_FIELD_NUMBER = 3;
  private volatile Object mobile_;
  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>string mobile = 3;</code>
   */
  public String getMobile() {
    Object ref = mobile_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      mobile_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>string mobile = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMobileBytes() {
    Object ref = mobile_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      mobile_ = b;
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParams(),
        ParamsDefaultEntryHolder.defaultEntry,
        2);
    if (!getMobileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, mobile_);
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
    for (java.util.Map.Entry<String, String> entry
         : internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, String>
      params__ = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, params__);
    }
    if (!getMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, mobile_);
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
    if (!(obj instanceof SendSmsReq)) {
      return super.equals(obj);
    }
    SendSmsReq other = (SendSmsReq) obj;

    boolean result = true;
    result = result && getTemplateCode()
        .equals(other.getTemplateCode());
    result = result && internalGetParams().equals(
        other.internalGetParams());
    result = result && getMobile()
        .equals(other.getMobile());
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
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (37 * hash) + MOBILE_FIELD_NUMBER;
    hash = (53 * hash) + getMobile().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SendSmsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendSmsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendSmsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendSmsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendSmsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SendSmsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SendSmsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SendSmsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SendSmsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SendSmsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SendSmsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SendSmsReq parseFrom(
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
  public static Builder newBuilder(SendSmsReq prototype) {
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
   * 发送
   * </pre>
   *
   * Protobuf type {@code message.SendSmsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:message.SendSmsReq)
      SendSmsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageProto.internal_static_message_SendSmsReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageProto.internal_static_message_SendSmsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SendSmsReq.class, Builder.class);
    }

    // Construct using gitspringboot.modules.message.SendSmsReq.newBuilder()
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

      internalGetMutableParams().clear();
      mobile_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageProto.internal_static_message_SendSmsReq_descriptor;
    }

    public SendSmsReq getDefaultInstanceForType() {
      return SendSmsReq.getDefaultInstance();
    }

    public SendSmsReq build() {
      SendSmsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SendSmsReq buildPartial() {
      SendSmsReq result = new SendSmsReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.templateCode_ = templateCode_;
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
      result.mobile_ = mobile_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof SendSmsReq) {
        return mergeFrom((SendSmsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SendSmsReq other) {
      if (other == SendSmsReq.getDefaultInstance()) return this;
      if (!other.getTemplateCode().isEmpty()) {
        templateCode_ = other.templateCode_;
        onChanged();
      }
      internalGetMutableParams().mergeFrom(
          other.internalGetParams());
      if (!other.getMobile().isEmpty()) {
        mobile_ = other.mobile_;
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
      SendSmsReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SendSmsReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private com.google.protobuf.MapField<
        String, String> params_;
    private com.google.protobuf.MapField<String, String>
    internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }
    private com.google.protobuf.MapField<String, String>
    internalGetMutableParams() {
      onChanged();;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public boolean containsParams(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      return internalGetParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsMap()} instead.
     */
    @Deprecated
    public java.util.Map<String, String> getParams() {
      return getParamsMap();
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public java.util.Map<String, String> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public String getParamsOrDefault(
        String key,
        String defaultValue) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public String getParamsOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      java.util.Map<String, String> map =
          internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      internalGetMutableParams().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public Builder removeParams(
        String key) {
      if (key == null) { throw new NullPointerException(); }
      internalGetMutableParams().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, String>
    getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */
    public Builder putParams(
        String key,
        String value) {
      if (key == null) { throw new NullPointerException(); }
      if (value == null) { throw new NullPointerException(); }
      internalGetMutableParams().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * 模版参数
     * </pre>
     *
     * <code>map&lt;string, string&gt; params = 2;</code>
     */

    public Builder putAllParams(
        java.util.Map<String, String> values) {
      internalGetMutableParams().getMutableMap()
          .putAll(values);
      return this;
    }

    private Object mobile_ = "";
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>string mobile = 3;</code>
     */
    public String getMobile() {
      Object ref = mobile_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        mobile_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>string mobile = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMobileBytes() {
      Object ref = mobile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        mobile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>string mobile = 3;</code>
     */
    public Builder setMobile(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mobile_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>string mobile = 3;</code>
     */
    public Builder clearMobile() {
      
      mobile_ = getDefaultInstance().getMobile();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>string mobile = 3;</code>
     */
    public Builder setMobileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mobile_ = value;
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


    // @@protoc_insertion_point(builder_scope:message.SendSmsReq)
  }

  // @@protoc_insertion_point(class_scope:message.SendSmsReq)
  private static final SendSmsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SendSmsReq();
  }

  public static SendSmsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendSmsReq>
      PARSER = new com.google.protobuf.AbstractParser<SendSmsReq>() {
    public SendSmsReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendSmsReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendSmsReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SendSmsReq> getParserForType() {
    return PARSER;
  }

  public SendSmsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

