// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.alican.grpcHelloWorld.proto_gen.hello;

/**
 * Protobuf type {@code com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse}
 */
public  final class HelloResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse)
    HelloResponseOrBuilder {
  // Use HelloResponse.newBuilder() to construct.
  private HelloResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloResponse() {
    greeting_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HelloResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            greeting_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (createdDate_ != null) {
              subBuilder = createdDate_.toBuilder();
            }
            createdDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(createdDate_);
              createdDate_ = subBuilder.buildPartial();
            }

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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceOuterClass.internal_static_com_alican_grpcHelloWorld_proto_gen_hello_HelloResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceOuterClass.internal_static_com_alican_grpcHelloWorld_proto_gen_hello_HelloResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.class, com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.Builder.class);
  }

  public static final int GREETING_FIELD_NUMBER = 1;
  private volatile java.lang.Object greeting_;
  /**
   * <code>string greeting = 1;</code>
   */
  public java.lang.String getGreeting() {
    java.lang.Object ref = greeting_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      greeting_ = s;
      return s;
    }
  }
  /**
   * <code>string greeting = 1;</code>
   */
  public com.google.protobuf.ByteString
      getGreetingBytes() {
    java.lang.Object ref = greeting_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      greeting_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDDATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp createdDate_;
  /**
   * <code>.google.protobuf.Timestamp createdDate = 2;</code>
   */
  public boolean hasCreatedDate() {
    return createdDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp createdDate = 2;</code>
   */
  public com.google.protobuf.Timestamp getCreatedDate() {
    return createdDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp createdDate = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder() {
    return getCreatedDate();
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
    if (!getGreetingBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, greeting_);
    }
    if (createdDate_ != null) {
      output.writeMessage(2, getCreatedDate());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGreetingBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, greeting_);
    }
    if (createdDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreatedDate());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse)) {
      return super.equals(obj);
    }
    com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse other = (com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse) obj;

    boolean result = true;
    result = result && getGreeting()
        .equals(other.getGreeting());
    result = result && (hasCreatedDate() == other.hasCreatedDate());
    if (hasCreatedDate()) {
      result = result && getCreatedDate()
          .equals(other.getCreatedDate());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GREETING_FIELD_NUMBER;
    hash = (53 * hash) + getGreeting().hashCode();
    if (hasCreatedDate()) {
      hash = (37 * hash) + CREATEDDATE_FIELD_NUMBER;
      hash = (53 * hash) + getCreatedDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parseFrom(
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
  public static Builder newBuilder(com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse)
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceOuterClass.internal_static_com_alican_grpcHelloWorld_proto_gen_hello_HelloResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceOuterClass.internal_static_com_alican_grpcHelloWorld_proto_gen_hello_HelloResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.class, com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.Builder.class);
    }

    // Construct using com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
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
      greeting_ = "";

      if (createdDateBuilder_ == null) {
        createdDate_ = null;
      } else {
        createdDate_ = null;
        createdDateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceOuterClass.internal_static_com_alican_grpcHelloWorld_proto_gen_hello_HelloResponse_descriptor;
    }

    public com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse getDefaultInstanceForType() {
      return com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.getDefaultInstance();
    }

    public com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse build() {
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse buildPartial() {
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse result = new com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse(this);
      result.greeting_ = greeting_;
      if (createdDateBuilder_ == null) {
        result.createdDate_ = createdDate_;
      } else {
        result.createdDate_ = createdDateBuilder_.build();
      }
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
      if (other instanceof com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse) {
        return mergeFrom((com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse other) {
      if (other == com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.getDefaultInstance()) return this;
      if (!other.getGreeting().isEmpty()) {
        greeting_ = other.greeting_;
        onChanged();
      }
      if (other.hasCreatedDate()) {
        mergeCreatedDate(other.getCreatedDate());
      }
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
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object greeting_ = "";
    /**
     * <code>string greeting = 1;</code>
     */
    public java.lang.String getGreeting() {
      java.lang.Object ref = greeting_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        greeting_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string greeting = 1;</code>
     */
    public com.google.protobuf.ByteString
        getGreetingBytes() {
      java.lang.Object ref = greeting_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        greeting_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string greeting = 1;</code>
     */
    public Builder setGreeting(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      greeting_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string greeting = 1;</code>
     */
    public Builder clearGreeting() {
      
      greeting_ = getDefaultInstance().getGreeting();
      onChanged();
      return this;
    }
    /**
     * <code>string greeting = 1;</code>
     */
    public Builder setGreetingBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      greeting_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp createdDate_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public boolean hasCreatedDate() {
      return createdDateBuilder_ != null || createdDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public com.google.protobuf.Timestamp getCreatedDate() {
      if (createdDateBuilder_ == null) {
        return createdDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createdDate_;
      } else {
        return createdDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public Builder setCreatedDate(com.google.protobuf.Timestamp value) {
      if (createdDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createdDate_ = value;
        onChanged();
      } else {
        createdDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public Builder setCreatedDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdDateBuilder_ == null) {
        createdDate_ = builderForValue.build();
        onChanged();
      } else {
        createdDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public Builder mergeCreatedDate(com.google.protobuf.Timestamp value) {
      if (createdDateBuilder_ == null) {
        if (createdDate_ != null) {
          createdDate_ =
            com.google.protobuf.Timestamp.newBuilder(createdDate_).mergeFrom(value).buildPartial();
        } else {
          createdDate_ = value;
        }
        onChanged();
      } else {
        createdDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public Builder clearCreatedDate() {
      if (createdDateBuilder_ == null) {
        createdDate_ = null;
        onChanged();
      } else {
        createdDate_ = null;
        createdDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedDateBuilder() {
      
      onChanged();
      return getCreatedDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedDateOrBuilder() {
      if (createdDateBuilder_ != null) {
        return createdDateBuilder_.getMessageOrBuilder();
      } else {
        return createdDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createdDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp createdDate = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedDateFieldBuilder() {
      if (createdDateBuilder_ == null) {
        createdDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreatedDate(),
                getParentForChildren(),
                isClean());
        createdDate_ = null;
      }
      return createdDateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse)
  }

  // @@protoc_insertion_point(class_scope:com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse)
  private static final com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse();
  }

  public static com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloResponse>
      PARSER = new com.google.protobuf.AbstractParser<HelloResponse>() {
    public HelloResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloResponse> getParserForType() {
    return PARSER;
  }

  public com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

