/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.v2_3_6;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class MetadataPpdResult implements org.apache.thrift.TBase<MetadataPpdResult, MetadataPpdResult._Fields>, java.io.Serializable, Cloneable, Comparable<MetadataPpdResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetadataPpdResult");

  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INCLUDE_BITSET_FIELD_DESC = new org.apache.thrift.protocol.TField("includeBitset", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MetadataPpdResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MetadataPpdResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer metadata; // optional
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer includeBitset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA((short)1, "metadata"),
    INCLUDE_BITSET((short)2, "includeBitset");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METADATA
          return METADATA;
        case 2: // INCLUDE_BITSET
          return INCLUDE_BITSET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.METADATA,_Fields.INCLUDE_BITSET};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.INCLUDE_BITSET, new org.apache.thrift.meta_data.FieldMetaData("includeBitset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetadataPpdResult.class, metaDataMap);
  }

  public MetadataPpdResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetadataPpdResult(MetadataPpdResult other) {
    if (other.isSetMetadata()) {
      this.metadata = org.apache.thrift.TBaseHelper.copyBinary(other.metadata);
    }
    if (other.isSetIncludeBitset()) {
      this.includeBitset = org.apache.thrift.TBaseHelper.copyBinary(other.includeBitset);
    }
  }

  @Override
  public MetadataPpdResult deepCopy() {
    return new MetadataPpdResult(this);
  }

  @Override
  public void clear() {
    this.metadata = null;
    this.includeBitset = null;
  }

  public byte[] getMetadata() {
    setMetadata(org.apache.thrift.TBaseHelper.rightSize(metadata));
    return metadata == null ? null : metadata.array();
  }

  public java.nio.ByteBuffer bufferForMetadata() {
    return org.apache.thrift.TBaseHelper.copyBinary(metadata);
  }

  public MetadataPpdResult setMetadata(byte[] metadata) {
    this.metadata = metadata == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(metadata.clone());
    return this;
  }

  public MetadataPpdResult setMetadata(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer metadata) {
    this.metadata = org.apache.thrift.TBaseHelper.copyBinary(metadata);
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public byte[] getIncludeBitset() {
    setIncludeBitset(org.apache.thrift.TBaseHelper.rightSize(includeBitset));
    return includeBitset == null ? null : includeBitset.array();
  }

  public java.nio.ByteBuffer bufferForIncludeBitset() {
    return org.apache.thrift.TBaseHelper.copyBinary(includeBitset);
  }

  public MetadataPpdResult setIncludeBitset(byte[] includeBitset) {
    this.includeBitset = includeBitset == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(includeBitset.clone());
    return this;
  }

  public MetadataPpdResult setIncludeBitset(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer includeBitset) {
    this.includeBitset = org.apache.thrift.TBaseHelper.copyBinary(includeBitset);
    return this;
  }

  public void unsetIncludeBitset() {
    this.includeBitset = null;
  }

  /** Returns true if field includeBitset is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeBitset() {
    return this.includeBitset != null;
  }

  public void setIncludeBitsetIsSet(boolean value) {
    if (!value) {
      this.includeBitset = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        if (value instanceof byte[]) {
          setMetadata((byte[])value);
        } else {
          setMetadata((java.nio.ByteBuffer)value);
        }
      }
      break;

    case INCLUDE_BITSET:
      if (value == null) {
        unsetIncludeBitset();
      } else {
        if (value instanceof byte[]) {
          setIncludeBitset((byte[])value);
        } else {
          setIncludeBitset((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA:
      return getMetadata();

    case INCLUDE_BITSET:
      return getIncludeBitset();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case METADATA:
      return isSetMetadata();
    case INCLUDE_BITSET:
      return isSetIncludeBitset();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof MetadataPpdResult)
      return this.equals((MetadataPpdResult)that);
    return false;
  }

  public boolean equals(MetadataPpdResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_includeBitset = true && this.isSetIncludeBitset();
    boolean that_present_includeBitset = true && that.isSetIncludeBitset();
    if (this_present_includeBitset || that_present_includeBitset) {
      if (!(this_present_includeBitset && that_present_includeBitset))
        return false;
      if (!this.includeBitset.equals(that.includeBitset))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMetadata()) ? 131071 : 524287);
    if (isSetMetadata())
      hashCode = hashCode * 8191 + metadata.hashCode();

    hashCode = hashCode * 8191 + ((isSetIncludeBitset()) ? 131071 : 524287);
    if (isSetIncludeBitset())
      hashCode = hashCode * 8191 + includeBitset.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MetadataPpdResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMetadata(), other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIncludeBitset(), other.isSetIncludeBitset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeBitset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeBitset, other.includeBitset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataPpdResult(");
    boolean first = true;

    if (isSetMetadata()) {
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.metadata, sb);
      }
      first = false;
    }
    if (isSetIncludeBitset()) {
      if (!first) sb.append(", ");
      sb.append("includeBitset:");
      if (this.includeBitset == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.includeBitset, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetadataPpdResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public MetadataPpdResultStandardScheme getScheme() {
      return new MetadataPpdResultStandardScheme();
    }
  }

  private static class MetadataPpdResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<MetadataPpdResult> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadata = iprot.readBinary();
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INCLUDE_BITSET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.includeBitset = iprot.readBinary();
              struct.setIncludeBitsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          oprot.writeBinary(struct.metadata);
          oprot.writeFieldEnd();
        }
      }
      if (struct.includeBitset != null) {
        if (struct.isSetIncludeBitset()) {
          oprot.writeFieldBegin(INCLUDE_BITSET_FIELD_DESC);
          oprot.writeBinary(struct.includeBitset);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetadataPpdResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public MetadataPpdResultTupleScheme getScheme() {
      return new MetadataPpdResultTupleScheme();
    }
  }

  private static class MetadataPpdResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<MetadataPpdResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMetadata()) {
        optionals.set(0);
      }
      if (struct.isSetIncludeBitset()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMetadata()) {
        oprot.writeBinary(struct.metadata);
      }
      if (struct.isSetIncludeBitset()) {
        oprot.writeBinary(struct.includeBitset);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.metadata = iprot.readBinary();
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.includeBitset = iprot.readBinary();
        struct.setIncludeBitsetIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

