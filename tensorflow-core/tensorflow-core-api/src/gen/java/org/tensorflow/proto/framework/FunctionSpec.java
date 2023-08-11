// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/saved_object_graph.proto

package org.tensorflow.proto.framework;

/**
 * <pre>
 * Represents `FunctionSpec` used in `Function`. This represents a
 * function that has been wrapped as a TensorFlow `Function`.
 * </pre>
 *
 * Protobuf type {@code tensorflow.FunctionSpec}
 */
public  final class FunctionSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.FunctionSpec)
    FunctionSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionSpec.newBuilder() to construct.
  private FunctionSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionSpec() {
    jitCompile_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FunctionSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            org.tensorflow.proto.framework.StructuredValue.Builder subBuilder = null;
            if (fullargspec_ != null) {
              subBuilder = fullargspec_.toBuilder();
            }
            fullargspec_ = input.readMessage(org.tensorflow.proto.framework.StructuredValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fullargspec_);
              fullargspec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            isMethod_ = input.readBool();
            break;
          }
          case 42: {
            org.tensorflow.proto.framework.StructuredValue.Builder subBuilder = null;
            if (inputSignature_ != null) {
              subBuilder = inputSignature_.toBuilder();
            }
            inputSignature_ = input.readMessage(org.tensorflow.proto.framework.StructuredValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(inputSignature_);
              inputSignature_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            jitCompile_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_FunctionSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_FunctionSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.FunctionSpec.class, org.tensorflow.proto.framework.FunctionSpec.Builder.class);
  }

  /**
   * <pre>
   * Whether the function should be compiled by XLA.
   * The public interface to `tf.function` uses an optional boolean to
   * represent three distinct states for this field.  Unfortunately, proto3
   * removes the ability to explicitly check for the presence or absence of a
   * field, so we instead map to an enum.
   * See `tf.function` for details.
   * </pre>
   *
   * Protobuf enum {@code tensorflow.FunctionSpec.JitCompile}
   */
  public enum JitCompile
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DEFAULT = 0;</code>
     */
    DEFAULT(0),
    /**
     * <code>ON = 1;</code>
     */
    ON(1),
    /**
     * <code>OFF = 2;</code>
     */
    OFF(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DEFAULT = 0;</code>
     */
    public static final int DEFAULT_VALUE = 0;
    /**
     * <code>ON = 1;</code>
     */
    public static final int ON_VALUE = 1;
    /**
     * <code>OFF = 2;</code>
     */
    public static final int OFF_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static JitCompile valueOf(int value) {
      return forNumber(value);
    }

    public static JitCompile forNumber(int value) {
      switch (value) {
        case 0: return DEFAULT;
        case 1: return ON;
        case 2: return OFF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JitCompile>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JitCompile> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JitCompile>() {
            public JitCompile findValueByNumber(int number) {
              return JitCompile.forNumber(number);
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
      return org.tensorflow.proto.framework.FunctionSpec.getDescriptor().getEnumTypes().get(0);
    }

    private static final JitCompile[] VALUES = values();

    public static JitCompile valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private JitCompile(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tensorflow.FunctionSpec.JitCompile)
  }

  public static final int FULLARGSPEC_FIELD_NUMBER = 1;
  private org.tensorflow.proto.framework.StructuredValue fullargspec_;
  /**
   * <pre>
   * Full arg spec from inspect.getfullargspec().
   * </pre>
   *
   * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
   */
  public boolean hasFullargspec() {
    return fullargspec_ != null;
  }
  /**
   * <pre>
   * Full arg spec from inspect.getfullargspec().
   * </pre>
   *
   * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
   */
  public org.tensorflow.proto.framework.StructuredValue getFullargspec() {
    return fullargspec_ == null ? org.tensorflow.proto.framework.StructuredValue.getDefaultInstance() : fullargspec_;
  }
  /**
   * <pre>
   * Full arg spec from inspect.getfullargspec().
   * </pre>
   *
   * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
   */
  public org.tensorflow.proto.framework.StructuredValueOrBuilder getFullargspecOrBuilder() {
    return getFullargspec();
  }

  public static final int IS_METHOD_FIELD_NUMBER = 2;
  private boolean isMethod_;
  /**
   * <pre>
   * Whether this represents a class method.
   * </pre>
   *
   * <code>bool is_method = 2;</code>
   */
  public boolean getIsMethod() {
    return isMethod_;
  }

  public static final int INPUT_SIGNATURE_FIELD_NUMBER = 5;
  private org.tensorflow.proto.framework.StructuredValue inputSignature_;
  /**
   * <pre>
   * The input signature, if specified.
   * </pre>
   *
   * <code>.tensorflow.StructuredValue input_signature = 5;</code>
   */
  public boolean hasInputSignature() {
    return inputSignature_ != null;
  }
  /**
   * <pre>
   * The input signature, if specified.
   * </pre>
   *
   * <code>.tensorflow.StructuredValue input_signature = 5;</code>
   */
  public org.tensorflow.proto.framework.StructuredValue getInputSignature() {
    return inputSignature_ == null ? org.tensorflow.proto.framework.StructuredValue.getDefaultInstance() : inputSignature_;
  }
  /**
   * <pre>
   * The input signature, if specified.
   * </pre>
   *
   * <code>.tensorflow.StructuredValue input_signature = 5;</code>
   */
  public org.tensorflow.proto.framework.StructuredValueOrBuilder getInputSignatureOrBuilder() {
    return getInputSignature();
  }

  public static final int JIT_COMPILE_FIELD_NUMBER = 6;
  private int jitCompile_;
  /**
   * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
   */
  public int getJitCompileValue() {
    return jitCompile_;
  }
  /**
   * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
   */
  public org.tensorflow.proto.framework.FunctionSpec.JitCompile getJitCompile() {
    @SuppressWarnings("deprecation")
    org.tensorflow.proto.framework.FunctionSpec.JitCompile result = org.tensorflow.proto.framework.FunctionSpec.JitCompile.valueOf(jitCompile_);
    return result == null ? org.tensorflow.proto.framework.FunctionSpec.JitCompile.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fullargspec_ != null) {
      output.writeMessage(1, getFullargspec());
    }
    if (isMethod_ != false) {
      output.writeBool(2, isMethod_);
    }
    if (inputSignature_ != null) {
      output.writeMessage(5, getInputSignature());
    }
    if (jitCompile_ != org.tensorflow.proto.framework.FunctionSpec.JitCompile.DEFAULT.getNumber()) {
      output.writeEnum(6, jitCompile_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fullargspec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFullargspec());
    }
    if (isMethod_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isMethod_);
    }
    if (inputSignature_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getInputSignature());
    }
    if (jitCompile_ != org.tensorflow.proto.framework.FunctionSpec.JitCompile.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, jitCompile_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.proto.framework.FunctionSpec)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.FunctionSpec other = (org.tensorflow.proto.framework.FunctionSpec) obj;

    if (hasFullargspec() != other.hasFullargspec()) return false;
    if (hasFullargspec()) {
      if (!getFullargspec()
          .equals(other.getFullargspec())) return false;
    }
    if (getIsMethod()
        != other.getIsMethod()) return false;
    if (hasInputSignature() != other.hasInputSignature()) return false;
    if (hasInputSignature()) {
      if (!getInputSignature()
          .equals(other.getInputSignature())) return false;
    }
    if (jitCompile_ != other.jitCompile_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFullargspec()) {
      hash = (37 * hash) + FULLARGSPEC_FIELD_NUMBER;
      hash = (53 * hash) + getFullargspec().hashCode();
    }
    hash = (37 * hash) + IS_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsMethod());
    if (hasInputSignature()) {
      hash = (37 * hash) + INPUT_SIGNATURE_FIELD_NUMBER;
      hash = (53 * hash) + getInputSignature().hashCode();
    }
    hash = (37 * hash) + JIT_COMPILE_FIELD_NUMBER;
    hash = (53 * hash) + jitCompile_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.FunctionSpec parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.proto.framework.FunctionSpec prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Represents `FunctionSpec` used in `Function`. This represents a
   * function that has been wrapped as a TensorFlow `Function`.
   * </pre>
   *
   * Protobuf type {@code tensorflow.FunctionSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FunctionSpec)
      org.tensorflow.proto.framework.FunctionSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_FunctionSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_FunctionSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.FunctionSpec.class, org.tensorflow.proto.framework.FunctionSpec.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.FunctionSpec.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fullargspecBuilder_ == null) {
        fullargspec_ = null;
      } else {
        fullargspec_ = null;
        fullargspecBuilder_ = null;
      }
      isMethod_ = false;

      if (inputSignatureBuilder_ == null) {
        inputSignature_ = null;
      } else {
        inputSignature_ = null;
        inputSignatureBuilder_ = null;
      }
      jitCompile_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.SavedObjectGraphProtos.internal_static_tensorflow_FunctionSpec_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.FunctionSpec getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.FunctionSpec.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.FunctionSpec build() {
      org.tensorflow.proto.framework.FunctionSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.FunctionSpec buildPartial() {
      org.tensorflow.proto.framework.FunctionSpec result = new org.tensorflow.proto.framework.FunctionSpec(this);
      if (fullargspecBuilder_ == null) {
        result.fullargspec_ = fullargspec_;
      } else {
        result.fullargspec_ = fullargspecBuilder_.build();
      }
      result.isMethod_ = isMethod_;
      if (inputSignatureBuilder_ == null) {
        result.inputSignature_ = inputSignature_;
      } else {
        result.inputSignature_ = inputSignatureBuilder_.build();
      }
      result.jitCompile_ = jitCompile_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.proto.framework.FunctionSpec) {
        return mergeFrom((org.tensorflow.proto.framework.FunctionSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.FunctionSpec other) {
      if (other == org.tensorflow.proto.framework.FunctionSpec.getDefaultInstance()) return this;
      if (other.hasFullargspec()) {
        mergeFullargspec(other.getFullargspec());
      }
      if (other.getIsMethod() != false) {
        setIsMethod(other.getIsMethod());
      }
      if (other.hasInputSignature()) {
        mergeInputSignature(other.getInputSignature());
      }
      if (other.jitCompile_ != 0) {
        setJitCompileValue(other.getJitCompileValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.proto.framework.FunctionSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.framework.FunctionSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.tensorflow.proto.framework.StructuredValue fullargspec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.StructuredValue, org.tensorflow.proto.framework.StructuredValue.Builder, org.tensorflow.proto.framework.StructuredValueOrBuilder> fullargspecBuilder_;
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public boolean hasFullargspec() {
      return fullargspecBuilder_ != null || fullargspec_ != null;
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public org.tensorflow.proto.framework.StructuredValue getFullargspec() {
      if (fullargspecBuilder_ == null) {
        return fullargspec_ == null ? org.tensorflow.proto.framework.StructuredValue.getDefaultInstance() : fullargspec_;
      } else {
        return fullargspecBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public Builder setFullargspec(org.tensorflow.proto.framework.StructuredValue value) {
      if (fullargspecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fullargspec_ = value;
        onChanged();
      } else {
        fullargspecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public Builder setFullargspec(
        org.tensorflow.proto.framework.StructuredValue.Builder builderForValue) {
      if (fullargspecBuilder_ == null) {
        fullargspec_ = builderForValue.build();
        onChanged();
      } else {
        fullargspecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public Builder mergeFullargspec(org.tensorflow.proto.framework.StructuredValue value) {
      if (fullargspecBuilder_ == null) {
        if (fullargspec_ != null) {
          fullargspec_ =
            org.tensorflow.proto.framework.StructuredValue.newBuilder(fullargspec_).mergeFrom(value).buildPartial();
        } else {
          fullargspec_ = value;
        }
        onChanged();
      } else {
        fullargspecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public Builder clearFullargspec() {
      if (fullargspecBuilder_ == null) {
        fullargspec_ = null;
        onChanged();
      } else {
        fullargspec_ = null;
        fullargspecBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public org.tensorflow.proto.framework.StructuredValue.Builder getFullargspecBuilder() {
      
      onChanged();
      return getFullargspecFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    public org.tensorflow.proto.framework.StructuredValueOrBuilder getFullargspecOrBuilder() {
      if (fullargspecBuilder_ != null) {
        return fullargspecBuilder_.getMessageOrBuilder();
      } else {
        return fullargspec_ == null ?
            org.tensorflow.proto.framework.StructuredValue.getDefaultInstance() : fullargspec_;
      }
    }
    /**
     * <pre>
     * Full arg spec from inspect.getfullargspec().
     * </pre>
     *
     * <code>.tensorflow.StructuredValue fullargspec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.StructuredValue, org.tensorflow.proto.framework.StructuredValue.Builder, org.tensorflow.proto.framework.StructuredValueOrBuilder> 
        getFullargspecFieldBuilder() {
      if (fullargspecBuilder_ == null) {
        fullargspecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.framework.StructuredValue, org.tensorflow.proto.framework.StructuredValue.Builder, org.tensorflow.proto.framework.StructuredValueOrBuilder>(
                getFullargspec(),
                getParentForChildren(),
                isClean());
        fullargspec_ = null;
      }
      return fullargspecBuilder_;
    }

    private boolean isMethod_ ;
    /**
     * <pre>
     * Whether this represents a class method.
     * </pre>
     *
     * <code>bool is_method = 2;</code>
     */
    public boolean getIsMethod() {
      return isMethod_;
    }
    /**
     * <pre>
     * Whether this represents a class method.
     * </pre>
     *
     * <code>bool is_method = 2;</code>
     */
    public Builder setIsMethod(boolean value) {
      
      isMethod_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether this represents a class method.
     * </pre>
     *
     * <code>bool is_method = 2;</code>
     */
    public Builder clearIsMethod() {
      
      isMethod_ = false;
      onChanged();
      return this;
    }

    private org.tensorflow.proto.framework.StructuredValue inputSignature_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.StructuredValue, org.tensorflow.proto.framework.StructuredValue.Builder, org.tensorflow.proto.framework.StructuredValueOrBuilder> inputSignatureBuilder_;
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public boolean hasInputSignature() {
      return inputSignatureBuilder_ != null || inputSignature_ != null;
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public org.tensorflow.proto.framework.StructuredValue getInputSignature() {
      if (inputSignatureBuilder_ == null) {
        return inputSignature_ == null ? org.tensorflow.proto.framework.StructuredValue.getDefaultInstance() : inputSignature_;
      } else {
        return inputSignatureBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public Builder setInputSignature(org.tensorflow.proto.framework.StructuredValue value) {
      if (inputSignatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputSignature_ = value;
        onChanged();
      } else {
        inputSignatureBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public Builder setInputSignature(
        org.tensorflow.proto.framework.StructuredValue.Builder builderForValue) {
      if (inputSignatureBuilder_ == null) {
        inputSignature_ = builderForValue.build();
        onChanged();
      } else {
        inputSignatureBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public Builder mergeInputSignature(org.tensorflow.proto.framework.StructuredValue value) {
      if (inputSignatureBuilder_ == null) {
        if (inputSignature_ != null) {
          inputSignature_ =
            org.tensorflow.proto.framework.StructuredValue.newBuilder(inputSignature_).mergeFrom(value).buildPartial();
        } else {
          inputSignature_ = value;
        }
        onChanged();
      } else {
        inputSignatureBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public Builder clearInputSignature() {
      if (inputSignatureBuilder_ == null) {
        inputSignature_ = null;
        onChanged();
      } else {
        inputSignature_ = null;
        inputSignatureBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public org.tensorflow.proto.framework.StructuredValue.Builder getInputSignatureBuilder() {
      
      onChanged();
      return getInputSignatureFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    public org.tensorflow.proto.framework.StructuredValueOrBuilder getInputSignatureOrBuilder() {
      if (inputSignatureBuilder_ != null) {
        return inputSignatureBuilder_.getMessageOrBuilder();
      } else {
        return inputSignature_ == null ?
            org.tensorflow.proto.framework.StructuredValue.getDefaultInstance() : inputSignature_;
      }
    }
    /**
     * <pre>
     * The input signature, if specified.
     * </pre>
     *
     * <code>.tensorflow.StructuredValue input_signature = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.proto.framework.StructuredValue, org.tensorflow.proto.framework.StructuredValue.Builder, org.tensorflow.proto.framework.StructuredValueOrBuilder> 
        getInputSignatureFieldBuilder() {
      if (inputSignatureBuilder_ == null) {
        inputSignatureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.proto.framework.StructuredValue, org.tensorflow.proto.framework.StructuredValue.Builder, org.tensorflow.proto.framework.StructuredValueOrBuilder>(
                getInputSignature(),
                getParentForChildren(),
                isClean());
        inputSignature_ = null;
      }
      return inputSignatureBuilder_;
    }

    private int jitCompile_ = 0;
    /**
     * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
     */
    public int getJitCompileValue() {
      return jitCompile_;
    }
    /**
     * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
     */
    public Builder setJitCompileValue(int value) {
      jitCompile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
     */
    public org.tensorflow.proto.framework.FunctionSpec.JitCompile getJitCompile() {
      @SuppressWarnings("deprecation")
      org.tensorflow.proto.framework.FunctionSpec.JitCompile result = org.tensorflow.proto.framework.FunctionSpec.JitCompile.valueOf(jitCompile_);
      return result == null ? org.tensorflow.proto.framework.FunctionSpec.JitCompile.UNRECOGNIZED : result;
    }
    /**
     * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
     */
    public Builder setJitCompile(org.tensorflow.proto.framework.FunctionSpec.JitCompile value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jitCompile_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tensorflow.FunctionSpec.JitCompile jit_compile = 6;</code>
     */
    public Builder clearJitCompile() {
      
      jitCompile_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.FunctionSpec)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FunctionSpec)
  private static final org.tensorflow.proto.framework.FunctionSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.FunctionSpec();
  }

  public static org.tensorflow.proto.framework.FunctionSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionSpec>
      PARSER = new com.google.protobuf.AbstractParser<FunctionSpec>() {
    @java.lang.Override
    public FunctionSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FunctionSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FunctionSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.FunctionSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
