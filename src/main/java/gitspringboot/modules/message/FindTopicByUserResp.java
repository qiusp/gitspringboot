// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.modules.message;

/**
 * Protobuf type {@code message.FindTopicByUserResp}
 */
public  final class FindTopicByUserResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:message.FindTopicByUserResp)
    FindTopicByUserRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindTopicByUserResp.newBuilder() to construct.
  private FindTopicByUserResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindTopicByUserResp() {
    total_ = 0L;
    topicList_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindTopicByUserResp(
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
              topicList_ = new java.util.ArrayList<Topic>();
              mutable_bitField0_ |= 0x00000002;
            }
            topicList_.add(
                input.readMessage(Topic.parser(), extensionRegistry));
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
        topicList_ = java.util.Collections.unmodifiableList(topicList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MessageProto.internal_static_message_FindTopicByUserResp_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MessageProto.internal_static_message_FindTopicByUserResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FindTopicByUserResp.class, Builder.class);
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

  public static final int TOPICLIST_FIELD_NUMBER = 2;
  private java.util.List<Topic> topicList_;
  /**
   * <code>repeated .message.Topic topicList = 2;</code>
   */
  public java.util.List<Topic> getTopicListList() {
    return topicList_;
  }
  /**
   * <code>repeated .message.Topic topicList = 2;</code>
   */
  public java.util.List<? extends TopicOrBuilder>
      getTopicListOrBuilderList() {
    return topicList_;
  }
  /**
   * <code>repeated .message.Topic topicList = 2;</code>
   */
  public int getTopicListCount() {
    return topicList_.size();
  }
  /**
   * <code>repeated .message.Topic topicList = 2;</code>
   */
  public Topic getTopicList(int index) {
    return topicList_.get(index);
  }
  /**
   * <code>repeated .message.Topic topicList = 2;</code>
   */
  public TopicOrBuilder getTopicListOrBuilder(
      int index) {
    return topicList_.get(index);
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
    for (int i = 0; i < topicList_.size(); i++) {
      output.writeMessage(2, topicList_.get(i));
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
    for (int i = 0; i < topicList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, topicList_.get(i));
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
    if (!(obj instanceof FindTopicByUserResp)) {
      return super.equals(obj);
    }
    FindTopicByUserResp other = (FindTopicByUserResp) obj;

    boolean result = true;
    result = result && (getTotal()
        == other.getTotal());
    result = result && getTopicListList()
        .equals(other.getTopicListList());
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
    if (getTopicListCount() > 0) {
      hash = (37 * hash) + TOPICLIST_FIELD_NUMBER;
      hash = (53 * hash) + getTopicListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FindTopicByUserResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FindTopicByUserResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FindTopicByUserResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FindTopicByUserResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FindTopicByUserResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FindTopicByUserResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FindTopicByUserResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FindTopicByUserResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FindTopicByUserResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FindTopicByUserResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FindTopicByUserResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FindTopicByUserResp parseFrom(
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
  public static Builder newBuilder(FindTopicByUserResp prototype) {
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
   * Protobuf type {@code message.FindTopicByUserResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:message.FindTopicByUserResp)
      FindTopicByUserRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MessageProto.internal_static_message_FindTopicByUserResp_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MessageProto.internal_static_message_FindTopicByUserResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FindTopicByUserResp.class, Builder.class);
    }

    // Construct using gitspringboot.modules.message.FindTopicByUserResp.newBuilder()
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
        getTopicListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      total_ = 0L;

      if (topicListBuilder_ == null) {
        topicList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        topicListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MessageProto.internal_static_message_FindTopicByUserResp_descriptor;
    }

    public FindTopicByUserResp getDefaultInstanceForType() {
      return FindTopicByUserResp.getDefaultInstance();
    }

    public FindTopicByUserResp build() {
      FindTopicByUserResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public FindTopicByUserResp buildPartial() {
      FindTopicByUserResp result = new FindTopicByUserResp(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.total_ = total_;
      if (topicListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          topicList_ = java.util.Collections.unmodifiableList(topicList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.topicList_ = topicList_;
      } else {
        result.topicList_ = topicListBuilder_.build();
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
      if (other instanceof FindTopicByUserResp) {
        return mergeFrom((FindTopicByUserResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FindTopicByUserResp other) {
      if (other == FindTopicByUserResp.getDefaultInstance()) return this;
      if (other.getTotal() != 0L) {
        setTotal(other.getTotal());
      }
      if (topicListBuilder_ == null) {
        if (!other.topicList_.isEmpty()) {
          if (topicList_.isEmpty()) {
            topicList_ = other.topicList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTopicListIsMutable();
            topicList_.addAll(other.topicList_);
          }
          onChanged();
        }
      } else {
        if (!other.topicList_.isEmpty()) {
          if (topicListBuilder_.isEmpty()) {
            topicListBuilder_.dispose();
            topicListBuilder_ = null;
            topicList_ = other.topicList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            topicListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTopicListFieldBuilder() : null;
          } else {
            topicListBuilder_.addAllMessages(other.topicList_);
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
      FindTopicByUserResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (FindTopicByUserResp) e.getUnfinishedMessage();
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

    private java.util.List<Topic> topicList_ =
      java.util.Collections.emptyList();
    private void ensureTopicListIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        topicList_ = new java.util.ArrayList<Topic>(topicList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Topic, Topic.Builder, TopicOrBuilder> topicListBuilder_;

    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public java.util.List<Topic> getTopicListList() {
      if (topicListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(topicList_);
      } else {
        return topicListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public int getTopicListCount() {
      if (topicListBuilder_ == null) {
        return topicList_.size();
      } else {
        return topicListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Topic getTopicList(int index) {
      if (topicListBuilder_ == null) {
        return topicList_.get(index);
      } else {
        return topicListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder setTopicList(
        int index, Topic value) {
      if (topicListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicListIsMutable();
        topicList_.set(index, value);
        onChanged();
      } else {
        topicListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder setTopicList(
        int index, Topic.Builder builderForValue) {
      if (topicListBuilder_ == null) {
        ensureTopicListIsMutable();
        topicList_.set(index, builderForValue.build());
        onChanged();
      } else {
        topicListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder addTopicList(Topic value) {
      if (topicListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicListIsMutable();
        topicList_.add(value);
        onChanged();
      } else {
        topicListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder addTopicList(
        int index, Topic value) {
      if (topicListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTopicListIsMutable();
        topicList_.add(index, value);
        onChanged();
      } else {
        topicListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder addTopicList(
        Topic.Builder builderForValue) {
      if (topicListBuilder_ == null) {
        ensureTopicListIsMutable();
        topicList_.add(builderForValue.build());
        onChanged();
      } else {
        topicListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder addTopicList(
        int index, Topic.Builder builderForValue) {
      if (topicListBuilder_ == null) {
        ensureTopicListIsMutable();
        topicList_.add(index, builderForValue.build());
        onChanged();
      } else {
        topicListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder addAllTopicList(
        Iterable<? extends Topic> values) {
      if (topicListBuilder_ == null) {
        ensureTopicListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, topicList_);
        onChanged();
      } else {
        topicListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder clearTopicList() {
      if (topicListBuilder_ == null) {
        topicList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        topicListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Builder removeTopicList(int index) {
      if (topicListBuilder_ == null) {
        ensureTopicListIsMutable();
        topicList_.remove(index);
        onChanged();
      } else {
        topicListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Topic.Builder getTopicListBuilder(
        int index) {
      return getTopicListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public TopicOrBuilder getTopicListOrBuilder(
        int index) {
      if (topicListBuilder_ == null) {
        return topicList_.get(index);  } else {
        return topicListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public java.util.List<? extends TopicOrBuilder>
         getTopicListOrBuilderList() {
      if (topicListBuilder_ != null) {
        return topicListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(topicList_);
      }
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Topic.Builder addTopicListBuilder() {
      return getTopicListFieldBuilder().addBuilder(
          Topic.getDefaultInstance());
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public Topic.Builder addTopicListBuilder(
        int index) {
      return getTopicListFieldBuilder().addBuilder(
          index, Topic.getDefaultInstance());
    }
    /**
     * <code>repeated .message.Topic topicList = 2;</code>
     */
    public java.util.List<Topic.Builder>
         getTopicListBuilderList() {
      return getTopicListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Topic, Topic.Builder, TopicOrBuilder>
        getTopicListFieldBuilder() {
      if (topicListBuilder_ == null) {
        topicListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Topic, Topic.Builder, TopicOrBuilder>(
                topicList_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        topicList_ = null;
      }
      return topicListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:message.FindTopicByUserResp)
  }

  // @@protoc_insertion_point(class_scope:message.FindTopicByUserResp)
  private static final FindTopicByUserResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FindTopicByUserResp();
  }

  public static FindTopicByUserResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindTopicByUserResp>
      PARSER = new com.google.protobuf.AbstractParser<FindTopicByUserResp>() {
    public FindTopicByUserResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindTopicByUserResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindTopicByUserResp> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FindTopicByUserResp> getParserForType() {
    return PARSER;
  }

  public FindTopicByUserResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

