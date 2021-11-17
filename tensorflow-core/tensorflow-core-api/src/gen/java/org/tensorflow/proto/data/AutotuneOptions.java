// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/dataset_options.proto

package org.tensorflow.proto.data;

/**
 * <pre>
 * next: 4
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.AutotuneOptions}
 */
public  final class AutotuneOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.AutotuneOptions)
    AutotuneOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AutotuneOptions.newBuilder() to construct.
  private AutotuneOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AutotuneOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AutotuneOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AutotuneOptions(
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
          case 8: {
            optionalEnabledCase_ = 1;
            optionalEnabled_ = input.readBool();
            break;
          }
          case 16: {
            optionalCpuBudgetCase_ = 2;
            optionalCpuBudget_ = input.readInt32();
            break;
          }
          case 24: {
            optionalRamBudgetCase_ = 3;
            optionalRamBudget_ = input.readInt64();
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
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_AutotuneOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_AutotuneOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.data.AutotuneOptions.class, org.tensorflow.proto.data.AutotuneOptions.Builder.class);
  }

  private int optionalEnabledCase_ = 0;
  private java.lang.Object optionalEnabled_;
  public enum OptionalEnabledCase
      implements com.google.protobuf.Internal.EnumLite {
    ENABLED(1),
    OPTIONALENABLED_NOT_SET(0);
    private final int value;
    private OptionalEnabledCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalEnabledCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalEnabledCase forNumber(int value) {
      switch (value) {
        case 1: return ENABLED;
        case 0: return OPTIONALENABLED_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalEnabledCase
  getOptionalEnabledCase() {
    return OptionalEnabledCase.forNumber(
        optionalEnabledCase_);
  }

  private int optionalCpuBudgetCase_ = 0;
  private java.lang.Object optionalCpuBudget_;
  public enum OptionalCpuBudgetCase
      implements com.google.protobuf.Internal.EnumLite {
    CPU_BUDGET(2),
    OPTIONALCPUBUDGET_NOT_SET(0);
    private final int value;
    private OptionalCpuBudgetCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalCpuBudgetCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalCpuBudgetCase forNumber(int value) {
      switch (value) {
        case 2: return CPU_BUDGET;
        case 0: return OPTIONALCPUBUDGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalCpuBudgetCase
  getOptionalCpuBudgetCase() {
    return OptionalCpuBudgetCase.forNumber(
        optionalCpuBudgetCase_);
  }

  private int optionalRamBudgetCase_ = 0;
  private java.lang.Object optionalRamBudget_;
  public enum OptionalRamBudgetCase
      implements com.google.protobuf.Internal.EnumLite {
    RAM_BUDGET(3),
    OPTIONALRAMBUDGET_NOT_SET(0);
    private final int value;
    private OptionalRamBudgetCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OptionalRamBudgetCase valueOf(int value) {
      return forNumber(value);
    }

    public static OptionalRamBudgetCase forNumber(int value) {
      switch (value) {
        case 3: return RAM_BUDGET;
        case 0: return OPTIONALRAMBUDGET_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OptionalRamBudgetCase
  getOptionalRamBudgetCase() {
    return OptionalRamBudgetCase.forNumber(
        optionalRamBudgetCase_);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  /**
   * <code>bool enabled = 1;</code>
   */
  public boolean getEnabled() {
    if (optionalEnabledCase_ == 1) {
      return (java.lang.Boolean) optionalEnabled_;
    }
    return false;
  }

  public static final int CPU_BUDGET_FIELD_NUMBER = 2;
  /**
   * <code>int32 cpu_budget = 2;</code>
   */
  public int getCpuBudget() {
    if (optionalCpuBudgetCase_ == 2) {
      return (java.lang.Integer) optionalCpuBudget_;
    }
    return 0;
  }

  public static final int RAM_BUDGET_FIELD_NUMBER = 3;
  /**
   * <code>int64 ram_budget = 3;</code>
   */
  public long getRamBudget() {
    if (optionalRamBudgetCase_ == 3) {
      return (java.lang.Long) optionalRamBudget_;
    }
    return 0L;
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
    if (optionalEnabledCase_ == 1) {
      output.writeBool(
          1, (boolean)((java.lang.Boolean) optionalEnabled_));
    }
    if (optionalCpuBudgetCase_ == 2) {
      output.writeInt32(
          2, (int)((java.lang.Integer) optionalCpuBudget_));
    }
    if (optionalRamBudgetCase_ == 3) {
      output.writeInt64(
          3, (long)((java.lang.Long) optionalRamBudget_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optionalEnabledCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            1, (boolean)((java.lang.Boolean) optionalEnabled_));
    }
    if (optionalCpuBudgetCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            2, (int)((java.lang.Integer) optionalCpuBudget_));
    }
    if (optionalRamBudgetCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((java.lang.Long) optionalRamBudget_));
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
    if (!(obj instanceof org.tensorflow.proto.data.AutotuneOptions)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.data.AutotuneOptions other = (org.tensorflow.proto.data.AutotuneOptions) obj;

    if (!getOptionalEnabledCase().equals(other.getOptionalEnabledCase())) return false;
    switch (optionalEnabledCase_) {
      case 1:
        if (getEnabled()
            != other.getEnabled()) return false;
        break;
      case 0:
      default:
    }
    if (!getOptionalCpuBudgetCase().equals(other.getOptionalCpuBudgetCase())) return false;
    switch (optionalCpuBudgetCase_) {
      case 2:
        if (getCpuBudget()
            != other.getCpuBudget()) return false;
        break;
      case 0:
      default:
    }
    if (!getOptionalRamBudgetCase().equals(other.getOptionalRamBudgetCase())) return false;
    switch (optionalRamBudgetCase_) {
      case 3:
        if (getRamBudget()
            != other.getRamBudget()) return false;
        break;
      case 0:
      default:
    }
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
    switch (optionalEnabledCase_) {
      case 1:
        hash = (37 * hash) + ENABLED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getEnabled());
        break;
      case 0:
      default:
    }
    switch (optionalCpuBudgetCase_) {
      case 2:
        hash = (37 * hash) + CPU_BUDGET_FIELD_NUMBER;
        hash = (53 * hash) + getCpuBudget();
        break;
      case 0:
      default:
    }
    switch (optionalRamBudgetCase_) {
      case 3:
        hash = (37 * hash) + RAM_BUDGET_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRamBudget());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.AutotuneOptions parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.data.AutotuneOptions prototype) {
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
   * next: 4
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.AutotuneOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.AutotuneOptions)
      org.tensorflow.proto.data.AutotuneOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_AutotuneOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_AutotuneOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.AutotuneOptions.class, org.tensorflow.proto.data.AutotuneOptions.Builder.class);
    }

    // Construct using org.tensorflow.proto.data.AutotuneOptions.newBuilder()
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
      optionalEnabledCase_ = 0;
      optionalEnabled_ = null;
      optionalCpuBudgetCase_ = 0;
      optionalCpuBudget_ = null;
      optionalRamBudgetCase_ = 0;
      optionalRamBudget_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.data.DatasetOptionsProtos.internal_static_tensorflow_data_AutotuneOptions_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.AutotuneOptions getDefaultInstanceForType() {
      return org.tensorflow.proto.data.AutotuneOptions.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.data.AutotuneOptions build() {
      org.tensorflow.proto.data.AutotuneOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.AutotuneOptions buildPartial() {
      org.tensorflow.proto.data.AutotuneOptions result = new org.tensorflow.proto.data.AutotuneOptions(this);
      if (optionalEnabledCase_ == 1) {
        result.optionalEnabled_ = optionalEnabled_;
      }
      if (optionalCpuBudgetCase_ == 2) {
        result.optionalCpuBudget_ = optionalCpuBudget_;
      }
      if (optionalRamBudgetCase_ == 3) {
        result.optionalRamBudget_ = optionalRamBudget_;
      }
      result.optionalEnabledCase_ = optionalEnabledCase_;
      result.optionalCpuBudgetCase_ = optionalCpuBudgetCase_;
      result.optionalRamBudgetCase_ = optionalRamBudgetCase_;
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
      if (other instanceof org.tensorflow.proto.data.AutotuneOptions) {
        return mergeFrom((org.tensorflow.proto.data.AutotuneOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.data.AutotuneOptions other) {
      if (other == org.tensorflow.proto.data.AutotuneOptions.getDefaultInstance()) return this;
      switch (other.getOptionalEnabledCase()) {
        case ENABLED: {
          setEnabled(other.getEnabled());
          break;
        }
        case OPTIONALENABLED_NOT_SET: {
          break;
        }
      }
      switch (other.getOptionalCpuBudgetCase()) {
        case CPU_BUDGET: {
          setCpuBudget(other.getCpuBudget());
          break;
        }
        case OPTIONALCPUBUDGET_NOT_SET: {
          break;
        }
      }
      switch (other.getOptionalRamBudgetCase()) {
        case RAM_BUDGET: {
          setRamBudget(other.getRamBudget());
          break;
        }
        case OPTIONALRAMBUDGET_NOT_SET: {
          break;
        }
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
      org.tensorflow.proto.data.AutotuneOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.data.AutotuneOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int optionalEnabledCase_ = 0;
    private java.lang.Object optionalEnabled_;
    public OptionalEnabledCase
        getOptionalEnabledCase() {
      return OptionalEnabledCase.forNumber(
          optionalEnabledCase_);
    }

    public Builder clearOptionalEnabled() {
      optionalEnabledCase_ = 0;
      optionalEnabled_ = null;
      onChanged();
      return this;
    }

    private int optionalCpuBudgetCase_ = 0;
    private java.lang.Object optionalCpuBudget_;
    public OptionalCpuBudgetCase
        getOptionalCpuBudgetCase() {
      return OptionalCpuBudgetCase.forNumber(
          optionalCpuBudgetCase_);
    }

    public Builder clearOptionalCpuBudget() {
      optionalCpuBudgetCase_ = 0;
      optionalCpuBudget_ = null;
      onChanged();
      return this;
    }

    private int optionalRamBudgetCase_ = 0;
    private java.lang.Object optionalRamBudget_;
    public OptionalRamBudgetCase
        getOptionalRamBudgetCase() {
      return OptionalRamBudgetCase.forNumber(
          optionalRamBudgetCase_);
    }

    public Builder clearOptionalRamBudget() {
      optionalRamBudgetCase_ = 0;
      optionalRamBudget_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>bool enabled = 1;</code>
     */
    public boolean getEnabled() {
      if (optionalEnabledCase_ == 1) {
        return (java.lang.Boolean) optionalEnabled_;
      }
      return false;
    }
    /**
     * <code>bool enabled = 1;</code>
     */
    public Builder setEnabled(boolean value) {
      optionalEnabledCase_ = 1;
      optionalEnabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enabled = 1;</code>
     */
    public Builder clearEnabled() {
      if (optionalEnabledCase_ == 1) {
        optionalEnabledCase_ = 0;
        optionalEnabled_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int32 cpu_budget = 2;</code>
     */
    public int getCpuBudget() {
      if (optionalCpuBudgetCase_ == 2) {
        return (java.lang.Integer) optionalCpuBudget_;
      }
      return 0;
    }
    /**
     * <code>int32 cpu_budget = 2;</code>
     */
    public Builder setCpuBudget(int value) {
      optionalCpuBudgetCase_ = 2;
      optionalCpuBudget_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 cpu_budget = 2;</code>
     */
    public Builder clearCpuBudget() {
      if (optionalCpuBudgetCase_ == 2) {
        optionalCpuBudgetCase_ = 0;
        optionalCpuBudget_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int64 ram_budget = 3;</code>
     */
    public long getRamBudget() {
      if (optionalRamBudgetCase_ == 3) {
        return (java.lang.Long) optionalRamBudget_;
      }
      return 0L;
    }
    /**
     * <code>int64 ram_budget = 3;</code>
     */
    public Builder setRamBudget(long value) {
      optionalRamBudgetCase_ = 3;
      optionalRamBudget_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ram_budget = 3;</code>
     */
    public Builder clearRamBudget() {
      if (optionalRamBudgetCase_ == 3) {
        optionalRamBudgetCase_ = 0;
        optionalRamBudget_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:tensorflow.data.AutotuneOptions)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.AutotuneOptions)
  private static final org.tensorflow.proto.data.AutotuneOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.data.AutotuneOptions();
  }

  public static org.tensorflow.proto.data.AutotuneOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutotuneOptions>
      PARSER = new com.google.protobuf.AbstractParser<AutotuneOptions>() {
    @java.lang.Override
    public AutotuneOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AutotuneOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AutotuneOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutotuneOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.data.AutotuneOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

