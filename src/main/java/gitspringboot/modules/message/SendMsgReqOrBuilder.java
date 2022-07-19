// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package gitspringboot.modules.message;

public interface SendMsgReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:message.SendMsgReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 所属主题Id
   * </pre>
   *
   * <code>string topicId = 2;</code>
   */
  String getTopicId();
  /**
   * <pre>
   * 所属主题Id
   * </pre>
   *
   * <code>string topicId = 2;</code>
   */
  com.google.protobuf.ByteString
      getTopicIdBytes();

  /**
   * <pre>
   * 消息内容
   * </pre>
   *
   * <code>string body = 3;</code>
   */
  String getBody();
  /**
   * <pre>
   * 消息内容
   * </pre>
   *
   * <code>string body = 3;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * 发起方
   * </pre>
   *
   * <code>string from = 4;</code>
   */
  String getFrom();
  /**
   * <pre>
   * 发起方
   * </pre>
   *
   * <code>string from = 4;</code>
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <pre>
   * 接收方
   * </pre>
   *
   * <code>string to = 5;</code>
   */
  String getTo();
  /**
   * <pre>
   * 接收方
   * </pre>
   *
   * <code>string to = 5;</code>
   */
  com.google.protobuf.ByteString
      getToBytes();

  /**
   * <pre>
   * 附件链接
   * </pre>
   *
   * <code>string attachmentLink = 6;</code>
   */
  String getAttachmentLink();
  /**
   * <pre>
   * 附件链接
   * </pre>
   *
   * <code>string attachmentLink = 6;</code>
   */
  com.google.protobuf.ByteString
      getAttachmentLinkBytes();

  /**
   * <pre>
   * 入口关联链接
   * </pre>
   *
   * <code>string Link = 7;</code>
   */
  String getLink();
  /**
   * <pre>
   * 入口关联链接
   * </pre>
   *
   * <code>string Link = 7;</code>
   */
  com.google.protobuf.ByteString
      getLinkBytes();
}
