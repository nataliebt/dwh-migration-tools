/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class GetRuntimeStatsRequest implements org.apache.thrift.TBase<GetRuntimeStatsRequest, GetRuntimeStatsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetRuntimeStatsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetRuntimeStatsRequest");

  private static final org.apache.thrift.protocol.TField MAX_WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("maxWeight", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField MAX_CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("maxCreateTime", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetRuntimeStatsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetRuntimeStatsRequestTupleSchemeFactory();

  public int maxWeight; // required
  public int maxCreateTime; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAX_WEIGHT((short)1, "maxWeight"),
    MAX_CREATE_TIME((short)2, "maxCreateTime");

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
        case 1: // MAX_WEIGHT
          return MAX_WEIGHT;
        case 2: // MAX_CREATE_TIME
          return MAX_CREATE_TIME;
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
  private static final int __MAXWEIGHT_ISSET_ID = 0;
  private static final int __MAXCREATETIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX_WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("maxWeight", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("maxCreateTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetRuntimeStatsRequest.class, metaDataMap);
  }

  public GetRuntimeStatsRequest() {
  }

  public GetRuntimeStatsRequest(
    int maxWeight,
    int maxCreateTime)
  {
    this();
    this.maxWeight = maxWeight;
    setMaxWeightIsSet(true);
    this.maxCreateTime = maxCreateTime;
    setMaxCreateTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetRuntimeStatsRequest(GetRuntimeStatsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.maxWeight = other.maxWeight;
    this.maxCreateTime = other.maxCreateTime;
  }

  @Override
  public GetRuntimeStatsRequest deepCopy() {
    return new GetRuntimeStatsRequest(this);
  }

  @Override
  public void clear() {
    setMaxWeightIsSet(false);
    this.maxWeight = 0;
    setMaxCreateTimeIsSet(false);
    this.maxCreateTime = 0;
  }

  public int getMaxWeight() {
    return this.maxWeight;
  }

  public GetRuntimeStatsRequest setMaxWeight(int maxWeight) {
    this.maxWeight = maxWeight;
    setMaxWeightIsSet(true);
    return this;
  }

  public void unsetMaxWeight() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXWEIGHT_ISSET_ID);
  }

  /** Returns true if field maxWeight is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxWeight() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXWEIGHT_ISSET_ID);
  }

  public void setMaxWeightIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXWEIGHT_ISSET_ID, value);
  }

  public int getMaxCreateTime() {
    return this.maxCreateTime;
  }

  public GetRuntimeStatsRequest setMaxCreateTime(int maxCreateTime) {
    this.maxCreateTime = maxCreateTime;
    setMaxCreateTimeIsSet(true);
    return this;
  }

  public void unsetMaxCreateTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXCREATETIME_ISSET_ID);
  }

  /** Returns true if field maxCreateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxCreateTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXCREATETIME_ISSET_ID);
  }

  public void setMaxCreateTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXCREATETIME_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MAX_WEIGHT:
      if (value == null) {
        unsetMaxWeight();
      } else {
        setMaxWeight((java.lang.Integer)value);
      }
      break;

    case MAX_CREATE_TIME:
      if (value == null) {
        unsetMaxCreateTime();
      } else {
        setMaxCreateTime((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX_WEIGHT:
      return getMaxWeight();

    case MAX_CREATE_TIME:
      return getMaxCreateTime();

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
    case MAX_WEIGHT:
      return isSetMaxWeight();
    case MAX_CREATE_TIME:
      return isSetMaxCreateTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetRuntimeStatsRequest)
      return this.equals((GetRuntimeStatsRequest)that);
    return false;
  }

  public boolean equals(GetRuntimeStatsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_maxWeight = true;
    boolean that_present_maxWeight = true;
    if (this_present_maxWeight || that_present_maxWeight) {
      if (!(this_present_maxWeight && that_present_maxWeight))
        return false;
      if (this.maxWeight != that.maxWeight)
        return false;
    }

    boolean this_present_maxCreateTime = true;
    boolean that_present_maxCreateTime = true;
    if (this_present_maxCreateTime || that_present_maxCreateTime) {
      if (!(this_present_maxCreateTime && that_present_maxCreateTime))
        return false;
      if (this.maxCreateTime != that.maxCreateTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + maxWeight;

    hashCode = hashCode * 8191 + maxCreateTime;

    return hashCode;
  }

  @Override
  public int compareTo(GetRuntimeStatsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetMaxWeight(), other.isSetMaxWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxWeight, other.maxWeight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMaxCreateTime(), other.isSetMaxCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxCreateTime, other.maxCreateTime);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetRuntimeStatsRequest(");
    boolean first = true;

    sb.append("maxWeight:");
    sb.append(this.maxWeight);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxCreateTime:");
    sb.append(this.maxCreateTime);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'maxWeight' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'maxCreateTime' because it's a primitive and you chose the non-beans generator.
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

  private static class GetRuntimeStatsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public GetRuntimeStatsRequestStandardScheme getScheme() {
      return new GetRuntimeStatsRequestStandardScheme();
    }
  }

  private static class GetRuntimeStatsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetRuntimeStatsRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, GetRuntimeStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX_WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxWeight = iprot.readI32();
              struct.setMaxWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MAX_CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maxCreateTime = iprot.readI32();
              struct.setMaxCreateTimeIsSet(true);
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
      if (!struct.isSetMaxWeight()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'maxWeight' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetMaxCreateTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'maxCreateTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, GetRuntimeStatsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAX_WEIGHT_FIELD_DESC);
      oprot.writeI32(struct.maxWeight);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MAX_CREATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.maxCreateTime);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetRuntimeStatsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public GetRuntimeStatsRequestTupleScheme getScheme() {
      return new GetRuntimeStatsRequestTupleScheme();
    }
  }

  private static class GetRuntimeStatsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetRuntimeStatsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetRuntimeStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.maxWeight);
      oprot.writeI32(struct.maxCreateTime);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetRuntimeStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.maxWeight = iprot.readI32();
      struct.setMaxWeightIsSet(true);
      struct.maxCreateTime = iprot.readI32();
      struct.setMaxCreateTimeIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

