// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.modules.message;

/**
 * Protobuf type {@code message.ListTemplateResp}
 */
public  final class ListTemplateResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:message.ListTemplateResp)
    ListTemplateRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTemplateResp.newBuilder() to construct.
  private ListTemplateResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTemplateResp() {
    total_ = 0L;
    templateList_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTemplateResp(
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
          case 8: {

            total_ = input.readUInt64();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              templateList_ = new java.util.ArrayList<Template>();
              mutable_bitField0_ |= 0x00000002;
            }
            templateList_.add(
                input.readMessage(Template.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        templateList_ = java.util.Collections.unmodifiableList(templateList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MessageProto.internal_static_message_ListTemplateResp_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageProto.internal_static_message_ListTemplateResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ListTemplateResp.class, Builder.class);
  }

  private int bitField0_;
  public static final int TOTAL_FIELD_NUMBER = 1;
  private long total_;
  /**
   * <code>uint64 total = 1;</code>
   */
  public long getTotal() {
    return total_;
  }

  public static final int TEMPLATELIST_FIELD_NUMBER = 2;
  private java.util.List<Template> templateList_;
  /**
   * <pre>
   * 模版列表
   * </pre>
   *
   * <code>repeated .message.Template templateList = 2;</code>
   */
  public java.util.List<Template> getTemplateListList() {
    return templateList_;
  }
  /**
   * <pre>
   * 模版列表
   * </pre>
   *
   * <code>repeated .message.Template templateList = 2;</code>
   */
  public java.util.List<? extends TemplateOrBuilder>
      getTemplateListOrBuilderList() {
    return templateList_;
  }
  /**
   * <pre>
   * 模版列表
   * </pre>
   *
   * <code>repeated .message.Template templateList = 2;</code>
   */
  public int getTemplateListCount() {
    return templateList_.size();
  }
  /**
   * <pre>
   * 模版列表
   * </pre>
   *
   * <code>repeated .message.Template templateList = 2;</code>
   */
  public Template getTemplateList(int index) {
    return templateList_.get(index);
  }
  /**
   * <pre>
   * 模版列表
   * </pre>
   *
   * <code>repeated .message.Template templateList = 2;</code>
   */
  public TemplateOrBuilder getTemplateListOrBuilder(
      int index) {
    return templateList_.get(index);
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
    if (total_ != 0L) {
      output.writeUInt64(1, total_);
    }
    for (int i = 0; i < templateList_.size(); i++) {
      output.writeMessage(2, templateList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (total_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, total_);
    }
    for (int i = 0; i < templateList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, templateList_.get(i));
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
    if (!(obj instanceof ListTemplateResp)) {
      return super.equals(obj);
    }
    ListTemplateResp other = (ListTemplateResp) obj;

    boolean result = true;
    result = result && (getTotal()
        == other.getTotal());
    result = result && getTemplateListList()
        .equals(other.getTemplateListList());
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
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotal());
    if (getTemplateListCount() > 0) {
      hash = (37 * hash) + TEMPLATELIST_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ListTemplateResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListTemplateResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListTemplateResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListTemplateResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListTemplateResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListTemplateResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListTemplateResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListTemplateResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListTemplateResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ListTemplateResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListTemplateResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListTemplateResp parseFrom(
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
  public static Builder newBuilder(ListTemplateResp prototype) {
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
   * Protobuf type {@code message.ListTemplateResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:message.ListTemplateResp)
      ListTemplateRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageProto.internal_static_message_ListTemplateResp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageProto.internal_static_message_ListTemplateResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ListTemplateResp.class, Builder.class);
    }

    // Construct using gitspringboot.modules.message.ListTemplateResp.newBuilder()
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
        getTemplateListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      total_ = 0L;

      if (templateListBuilder_ == null) {
        templateList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        templateListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageProto.internal_static_message_ListTemplateResp_descriptor;
    }

    public ListTemplateResp getDefaultInstanceForType() {
      return ListTemplateResp.getDefaultInstance();
    }

    public ListTemplateResp build() {
      ListTemplateResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ListTemplateResp buildPartial() {
      ListTemplateResp result = new ListTemplateResp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.total_ = total_;
      if (templateListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          templateList_ = java.util.Collections.unmodifiableList(templateList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.templateList_ = templateList_;
      } else {
        result.templateList_ = templateListBuilder_.build();
      }
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
      if (other instanceof ListTemplateResp) {
        return mergeFrom((ListTemplateResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ListTemplateResp other) {
      if (other == ListTemplateResp.getDefaultInstance()) return this;
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
      }
      if (templateListBuilder_ == null) {
        if (!other.templateList_.isEmpty()) {
          if (templateList_.isEmpty()) {
            templateList_ = other.templateList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTemplateListIsMutable();
            templateList_.addAll(other.templateList_);
          }
          onChanged();
        }
      } else {
        if (!other.templateList_.isEmpty()) {
          if (templateListBuilder_.isEmpty()) {
            templateListBuilder_.dispose();
            templateListBuilder_ = null;
            templateList_ = other.templateList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            templateListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTemplateListFieldBuilder() : null;
          } else {
            templateListBuilder_.addAllMessages(other.templateList_);
          }
        }
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
      ListTemplateResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ListTemplateResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long total_ ;
    /**
     * <code>uint64 total = 1;</code>
     */
    public long getTotal() {
      return total_;
    }
    /**
     * <code>uint64 total = 1;</code>
     */
    public Builder setTotal(long value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 total = 1;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<Template> templateList_ =
      java.util.Collections.emptyList();
    private void ensureTemplateListIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        templateList_ = new java.util.ArrayList<Template>(templateList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Template, Template.Builder, TemplateOrBuilder> templateListBuilder_;

    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public java.util.List<Template> getTemplateListList() {
      if (templateListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(templateList_);
      } else {
        return templateListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public int getTemplateListCount() {
      if (templateListBuilder_ == null) {
        return templateList_.size();
      } else {
        return templateListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Template getTemplateList(int index) {
      if (templateListBuilder_ == null) {
        return templateList_.get(index);
      } else {
        return templateListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder setTemplateList(
        int index, Template value) {
      if (templateListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplateListIsMutable();
        templateList_.set(index, value);
        onChanged();
      } else {
        templateListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder setTemplateList(
        int index, Template.Builder builderForValue) {
      if (templateListBuilder_ == null) {
        ensureTemplateListIsMutable();
        templateList_.set(index, builderForValue.build());
        onChanged();
      } else {
        templateListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder addTemplateList(Template value) {
      if (templateListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplateListIsMutable();
        templateList_.add(value);
        onChanged();
      } else {
        templateListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder addTemplateList(
        int index, Template value) {
      if (templateListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplateListIsMutable();
        templateList_.add(index, value);
        onChanged();
      } else {
        templateListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder addTemplateList(
        Template.Builder builderForValue) {
      if (templateListBuilder_ == null) {
        ensureTemplateListIsMutable();
        templateList_.add(builderForValue.build());
        onChanged();
      } else {
        templateListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder addTemplateList(
        int index, Template.Builder builderForValue) {
      if (templateListBuilder_ == null) {
        ensureTemplateListIsMutable();
        templateList_.add(index, builderForValue.build());
        onChanged();
      } else {
        templateListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder addAllTemplateList(
        Iterable<? extends Template> values) {
      if (templateListBuilder_ == null) {
        ensureTemplateListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, templateList_);
        onChanged();
      } else {
        templateListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder clearTemplateList() {
      if (templateListBuilder_ == null) {
        templateList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        templateListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Builder removeTemplateList(int index) {
      if (templateListBuilder_ == null) {
        ensureTemplateListIsMutable();
        templateList_.remove(index);
        onChanged();
      } else {
        templateListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Template.Builder getTemplateListBuilder(
        int index) {
      return getTemplateListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public TemplateOrBuilder getTemplateListOrBuilder(
        int index) {
      if (templateListBuilder_ == null) {
        return templateList_.get(index);  } else {
        return templateListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public java.util.List<? extends TemplateOrBuilder>
         getTemplateListOrBuilderList() {
      if (templateListBuilder_ != null) {
        return templateListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(templateList_);
      }
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Template.Builder addTemplateListBuilder() {
      return getTemplateListFieldBuilder().addBuilder(
          Template.getDefaultInstance());
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public Template.Builder addTemplateListBuilder(
        int index) {
      return getTemplateListFieldBuilder().addBuilder(
          index, Template.getDefaultInstance());
    }
    /**
     * <pre>
     * 模版列表
     * </pre>
     *
     * <code>repeated .message.Template templateList = 2;</code>
     */
    public java.util.List<Template.Builder>
         getTemplateListBuilderList() {
      return getTemplateListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Template, Template.Builder, TemplateOrBuilder>
        getTemplateListFieldBuilder() {
      if (templateListBuilder_ == null) {
        templateListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Template, Template.Builder, TemplateOrBuilder>(
                templateList_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        templateList_ = null;
      }
      return templateListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:message.ListTemplateResp)
  }

  // @@protoc_insertion_point(class_scope:message.ListTemplateResp)
  private static final ListTemplateResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListTemplateResp();
  }

  public static ListTemplateResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTemplateResp>
      PARSER = new com.google.protobuf.AbstractParser<ListTemplateResp>() {
    public ListTemplateResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTemplateResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTemplateResp> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListTemplateResp> getParserForType() {
    return PARSER;
  }

  public ListTemplateResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
