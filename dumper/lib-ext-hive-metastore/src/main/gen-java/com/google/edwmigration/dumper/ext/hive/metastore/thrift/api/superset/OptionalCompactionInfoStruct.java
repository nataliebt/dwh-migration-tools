/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class OptionalCompactionInfoStruct implements org.apache.thrift.TBase<OptionalCompactionInfoStruct, OptionalCompactionInfoStruct._Fields>, java.io.Serializable, Cloneable, Comparable<OptionalCompactionInfoStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OptionalCompactionInfoStruct");

  private static final org.apache.thrift.protocol.TField CI_FIELD_DESC = new org.apache.thrift.protocol.TField("ci", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OptionalCompactionInfoStructStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OptionalCompactionInfoStructTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable CompactionInfoStruct ci; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CI((short)1, "ci");

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
        case 1: // CI
          return CI;
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
  private static final _Fields optionals[] = {_Fields.CI};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CI, new org.apache.thrift.meta_data.FieldMetaData("ci", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CompactionInfoStruct.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OptionalCompactionInfoStruct.class, metaDataMap);
  }

  public OptionalCompactionInfoStruct() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OptionalCompactionInfoStruct(OptionalCompactionInfoStruct other) {
    if (other.isSetCi()) {
      this.ci = new CompactionInfoStruct(other.ci);
    }
  }

  @Override
  public OptionalCompactionInfoStruct deepCopy() {
    return new OptionalCompactionInfoStruct(this);
  }

  @Override
  public void clear() {
    this.ci = null;
  }

  @org.apache.thrift.annotation.Nullable
  public CompactionInfoStruct getCi() {
    return this.ci;
  }

  public OptionalCompactionInfoStruct setCi(@org.apache.thrift.annotation.Nullable CompactionInfoStruct ci) {
    this.ci = ci;
    return this;
  }

  public void unsetCi() {
    this.ci = null;
  }

  /** Returns true if field ci is set (has been assigned a value) and false otherwise */
  public boolean isSetCi() {
    return this.ci != null;
  }

  public void setCiIsSet(boolean value) {
    if (!value) {
      this.ci = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CI:
      if (value == null) {
        unsetCi();
      } else {
        setCi((CompactionInfoStruct)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CI:
      return getCi();

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
    case CI:
      return isSetCi();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof OptionalCompactionInfoStruct)
      return this.equals((OptionalCompactionInfoStruct)that);
    return false;
  }

  public boolean equals(OptionalCompactionInfoStruct that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ci = true && this.isSetCi();
    boolean that_present_ci = true && that.isSetCi();
    if (this_present_ci || that_present_ci) {
      if (!(this_present_ci && that_present_ci))
        return false;
      if (!this.ci.equals(that.ci))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCi()) ? 131071 : 524287);
    if (isSetCi())
      hashCode = hashCode * 8191 + ci.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OptionalCompactionInfoStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCi(), other.isSetCi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ci, other.ci);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionalCompactionInfoStruct(");
    boolean first = true;

    if (isSetCi()) {
      sb.append("ci:");
      if (this.ci == null) {
        sb.append("null");
      } else {
        sb.append(this.ci);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ci != null) {
      ci.validate();
    }
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

  private static class OptionalCompactionInfoStructStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public OptionalCompactionInfoStructStandardScheme getScheme() {
      return new OptionalCompactionInfoStructStandardScheme();
    }
  }

  private static class OptionalCompactionInfoStructStandardScheme extends org.apache.thrift.scheme.StandardScheme<OptionalCompactionInfoStruct> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, OptionalCompactionInfoStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ci = new CompactionInfoStruct();
              struct.ci.read(iprot);
              struct.setCiIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, OptionalCompactionInfoStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ci != null) {
        if (struct.isSetCi()) {
          oprot.writeFieldBegin(CI_FIELD_DESC);
          struct.ci.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OptionalCompactionInfoStructTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public OptionalCompactionInfoStructTupleScheme getScheme() {
      return new OptionalCompactionInfoStructTupleScheme();
    }
  }

  private static class OptionalCompactionInfoStructTupleScheme extends org.apache.thrift.scheme.TupleScheme<OptionalCompactionInfoStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OptionalCompactionInfoStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCi()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCi()) {
        struct.ci.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OptionalCompactionInfoStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ci = new CompactionInfoStruct();
        struct.ci.read(iprot);
        struct.setCiIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

