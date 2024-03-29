// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.config.Grpc.message;

/**
 * Protobuf enum {@code message.TemplateStatusType}
 */
public enum TemplateStatusType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>none = 0;</code>
   */
  none(0),
  /**
   * <pre>
   * 审批中
   * </pre>
   *
   * <code>init = 1;</code>
   */
  init(1),
  /**
   * <pre>
   * 审批通过
   * </pre>
   *
   * <code>pass = 2;</code>
   */
  pass(2),
  /**
   * <pre>
   * 审批被拒绝
   * </pre>
   *
   * <code>deny = 3;</code>
   */
  deny(3),
  /**
   * <pre>
   * 审批已取消
   * </pre>
   *
   * <code>cancel = 4;</code>
   */
  cancel(4),
  /**
   * <pre>
   * 已删除
   * </pre>
   *
   * <code>delete = 5;</code>
   */
  delete(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>none = 0;</code>
   */
  public static final int none_VALUE = 0;
  /**
   * <pre>
   * 审批中
   * </pre>
   *
   * <code>init = 1;</code>
   */
  public static final int init_VALUE = 1;
  /**
   * <pre>
   * 审批通过
   * </pre>
   *
   * <code>pass = 2;</code>
   */
  public static final int pass_VALUE = 2;
  /**
   * <pre>
   * 审批被拒绝
   * </pre>
   *
   * <code>deny = 3;</code>
   */
  public static final int deny_VALUE = 3;
  /**
   * <pre>
   * 审批已取消
   * </pre>
   *
   * <code>cancel = 4;</code>
   */
  public static final int cancel_VALUE = 4;
  /**
   * <pre>
   * 已删除
   * </pre>
   *
   * <code>delete = 5;</code>
   */
  public static final int delete_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static TemplateStatusType valueOf(int value) {
    return forNumber(value);
  }

  public static TemplateStatusType forNumber(int value) {
    switch (value) {
      case 0: return none;
      case 1: return init;
      case 2: return pass;
      case 3: return deny;
      case 4: return cancel;
      case 5: return delete;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TemplateStatusType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TemplateStatusType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TemplateStatusType>() {
          public TemplateStatusType findValueByNumber(int number) {
            return TemplateStatusType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return MessageProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final TemplateStatusType[] VALUES = values();

  public static TemplateStatusType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TemplateStatusType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:message.TemplateStatusType)
}

