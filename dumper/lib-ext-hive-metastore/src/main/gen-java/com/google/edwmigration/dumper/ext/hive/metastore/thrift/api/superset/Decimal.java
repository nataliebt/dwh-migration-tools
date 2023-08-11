/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class Decimal implements org.apache.thrift.TBase<Decimal, Decimal._Fields>, java.io.Serializable, Cloneable, Comparable<Decimal> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Decimal");

  private static final org.apache.thrift.protocol.TField SCALE_FIELD_DESC = new org.apache.thrift.protocol.TField("scale", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField UNSCALED_FIELD_DESC = new org.apache.thrift.protocol.TField("unscaled", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DecimalStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DecimalTupleSchemeFactory();

  public short scale; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer unscaled; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCALE((short)3, "scale"),
    UNSCALED((short)1, "unscaled");

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
        case 3: // SCALE
          return SCALE;
        case 1: // UNSCALED
          return UNSCALED;
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
  private static final int __SCALE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SCALE, new org.apache.thrift.meta_data.FieldMetaData("scale", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.UNSCALED, new org.apache.thrift.meta_data.FieldMetaData("unscaled", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Decimal.class, metaDataMap);
  }

  public Decimal() {
  }

  public Decimal(
    short scale,
    java.nio.ByteBuffer unscaled)
  {
    this();
    this.scale = scale;
    setScaleIsSet(true);
    this.unscaled = org.apache.thrift.TBaseHelper.copyBinary(unscaled);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Decimal(Decimal other) {
    __isset_bitfield = other.__isset_bitfield;
    this.scale = other.scale;
    if (other.isSetUnscaled()) {
      this.unscaled = org.apache.thrift.TBaseHelper.copyBinary(other.unscaled);
    }
  }

  @Override
  public Decimal deepCopy() {
    return new Decimal(this);
  }

  @Override
  public void clear() {
    setScaleIsSet(false);
    this.scale = 0;
    this.unscaled = null;
  }

  public short getScale() {
    return this.scale;
  }

  public Decimal setScale(short scale) {
    this.scale = scale;
    setScaleIsSet(true);
    return this;
  }

  public void unsetScale() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  /** Returns true if field scale is set (has been assigned a value) and false otherwise */
  public boolean isSetScale() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SCALE_ISSET_ID);
  }

  public void setScaleIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SCALE_ISSET_ID, value);
  }

  public byte[] getUnscaled() {
    setUnscaled(org.apache.thrift.TBaseHelper.rightSize(unscaled));
    return unscaled == null ? null : unscaled.array();
  }

  public java.nio.ByteBuffer bufferForUnscaled() {
    return org.apache.thrift.TBaseHelper.copyBinary(unscaled);
  }

  public Decimal setUnscaled(byte[] unscaled) {
    this.unscaled = unscaled == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(unscaled.clone());
    return this;
  }

  public Decimal setUnscaled(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer unscaled) {
    this.unscaled = org.apache.thrift.TBaseHelper.copyBinary(unscaled);
    return this;
  }

  public void unsetUnscaled() {
    this.unscaled = null;
  }

  /** Returns true if field unscaled is set (has been assigned a value) and false otherwise */
  public boolean isSetUnscaled() {
    return this.unscaled != null;
  }

  public void setUnscaledIsSet(boolean value) {
    if (!value) {
      this.unscaled = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCALE:
      if (value == null) {
        unsetScale();
      } else {
        setScale((java.lang.Short)value);
      }
      break;

    case UNSCALED:
      if (value == null) {
        unsetUnscaled();
      } else {
        if (value instanceof byte[]) {
          setUnscaled((byte[])value);
        } else {
          setUnscaled((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCALE:
      return getScale();

    case UNSCALED:
      return getUnscaled();

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
    case SCALE:
      return isSetScale();
    case UNSCALED:
      return isSetUnscaled();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Decimal)
      return this.equals((Decimal)that);
    return false;
  }

  public boolean equals(Decimal that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_scale = true;
    boolean that_present_scale = true;
    if (this_present_scale || that_present_scale) {
      if (!(this_present_scale && that_present_scale))
        return false;
      if (this.scale != that.scale)
        return false;
    }

    boolean this_present_unscaled = true && this.isSetUnscaled();
    boolean that_present_unscaled = true && that.isSetUnscaled();
    if (this_present_unscaled || that_present_unscaled) {
      if (!(this_present_unscaled && that_present_unscaled))
        return false;
      if (!this.unscaled.equals(that.unscaled))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + scale;

    hashCode = hashCode * 8191 + ((isSetUnscaled()) ? 131071 : 524287);
    if (isSetUnscaled())
      hashCode = hashCode * 8191 + unscaled.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Decimal other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetScale(), other.isSetScale());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScale()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scale, other.scale);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUnscaled(), other.isSetUnscaled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnscaled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unscaled, other.unscaled);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Decimal(");
    boolean first = true;

    sb.append("scale:");
    sb.append(this.scale);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unscaled:");
    if (this.unscaled == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.unscaled, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'scale' because it's a primitive and you chose the non-beans generator.
    if (unscaled == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'unscaled' was not present! Struct: " + toString());
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DecimalStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DecimalStandardScheme getScheme() {
      return new DecimalStandardScheme();
    }
  }

  private static class DecimalStandardScheme extends org.apache.thrift.scheme.StandardScheme<Decimal> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, Decimal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 3: // SCALE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.scale = iprot.readI16();
              struct.setScaleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 1: // UNSCALED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.unscaled = iprot.readBinary();
              struct.setUnscaledIsSet(true);
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
      if (!struct.isSetScale()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'scale' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, Decimal struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.unscaled != null) {
        oprot.writeFieldBegin(UNSCALED_FIELD_DESC);
        oprot.writeBinary(struct.unscaled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SCALE_FIELD_DESC);
      oprot.writeI16(struct.scale);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DecimalTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DecimalTupleScheme getScheme() {
      return new DecimalTupleScheme();
    }
  }

  private static class DecimalTupleScheme extends org.apache.thrift.scheme.TupleScheme<Decimal> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Decimal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI16(struct.scale);
      oprot.writeBinary(struct.unscaled);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Decimal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.scale = iprot.readI16();
      struct.setScaleIsSet(true);
      struct.unscaled = iprot.readBinary();
      struct.setUnscaledIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

