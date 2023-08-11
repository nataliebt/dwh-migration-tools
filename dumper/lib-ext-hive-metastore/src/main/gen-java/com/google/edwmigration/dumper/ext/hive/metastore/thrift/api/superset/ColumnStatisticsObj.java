/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class ColumnStatisticsObj implements org.apache.thrift.TBase<ColumnStatisticsObj, ColumnStatisticsObj._Fields>, java.io.Serializable, Cloneable, Comparable<ColumnStatisticsObj> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnStatisticsObj");

  private static final org.apache.thrift.protocol.TField COL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("colName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("colType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STATS_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("statsData", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ColumnStatisticsObjStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ColumnStatisticsObjTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String colName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String colType; // required
  public @org.apache.thrift.annotation.Nullable ColumnStatisticsData statsData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL_NAME((short)1, "colName"),
    COL_TYPE((short)2, "colType"),
    STATS_DATA((short)3, "statsData");

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
        case 1: // COL_NAME
          return COL_NAME;
        case 2: // COL_TYPE
          return COL_TYPE;
        case 3: // STATS_DATA
          return STATS_DATA;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL_NAME, new org.apache.thrift.meta_data.FieldMetaData("colName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("colType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATS_DATA, new org.apache.thrift.meta_data.FieldMetaData("statsData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsData.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnStatisticsObj.class, metaDataMap);
  }

  public ColumnStatisticsObj() {
  }

  public ColumnStatisticsObj(
    java.lang.String colName,
    java.lang.String colType,
    ColumnStatisticsData statsData)
  {
    this();
    this.colName = colName;
    this.colType = colType;
    this.statsData = statsData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnStatisticsObj(ColumnStatisticsObj other) {
    if (other.isSetColName()) {
      this.colName = other.colName;
    }
    if (other.isSetColType()) {
      this.colType = other.colType;
    }
    if (other.isSetStatsData()) {
      this.statsData = new ColumnStatisticsData(other.statsData);
    }
  }

  @Override
  public ColumnStatisticsObj deepCopy() {
    return new ColumnStatisticsObj(this);
  }

  @Override
  public void clear() {
    this.colName = null;
    this.colType = null;
    this.statsData = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColName() {
    return this.colName;
  }

  public ColumnStatisticsObj setColName(@org.apache.thrift.annotation.Nullable java.lang.String colName) {
    this.colName = colName;
    return this;
  }

  public void unsetColName() {
    this.colName = null;
  }

  /** Returns true if field colName is set (has been assigned a value) and false otherwise */
  public boolean isSetColName() {
    return this.colName != null;
  }

  public void setColNameIsSet(boolean value) {
    if (!value) {
      this.colName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getColType() {
    return this.colType;
  }

  public ColumnStatisticsObj setColType(@org.apache.thrift.annotation.Nullable java.lang.String colType) {
    this.colType = colType;
    return this;
  }

  public void unsetColType() {
    this.colType = null;
  }

  /** Returns true if field colType is set (has been assigned a value) and false otherwise */
  public boolean isSetColType() {
    return this.colType != null;
  }

  public void setColTypeIsSet(boolean value) {
    if (!value) {
      this.colType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public ColumnStatisticsData getStatsData() {
    return this.statsData;
  }

  public ColumnStatisticsObj setStatsData(@org.apache.thrift.annotation.Nullable ColumnStatisticsData statsData) {
    this.statsData = statsData;
    return this;
  }

  public void unsetStatsData() {
    this.statsData = null;
  }

  /** Returns true if field statsData is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsData() {
    return this.statsData != null;
  }

  public void setStatsDataIsSet(boolean value) {
    if (!value) {
      this.statsData = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COL_NAME:
      if (value == null) {
        unsetColName();
      } else {
        setColName((java.lang.String)value);
      }
      break;

    case COL_TYPE:
      if (value == null) {
        unsetColType();
      } else {
        setColType((java.lang.String)value);
      }
      break;

    case STATS_DATA:
      if (value == null) {
        unsetStatsData();
      } else {
        setStatsData((ColumnStatisticsData)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COL_NAME:
      return getColName();

    case COL_TYPE:
      return getColType();

    case STATS_DATA:
      return getStatsData();

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
    case COL_NAME:
      return isSetColName();
    case COL_TYPE:
      return isSetColType();
    case STATS_DATA:
      return isSetStatsData();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ColumnStatisticsObj)
      return this.equals((ColumnStatisticsObj)that);
    return false;
  }

  public boolean equals(ColumnStatisticsObj that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_colName = true && this.isSetColName();
    boolean that_present_colName = true && that.isSetColName();
    if (this_present_colName || that_present_colName) {
      if (!(this_present_colName && that_present_colName))
        return false;
      if (!this.colName.equals(that.colName))
        return false;
    }

    boolean this_present_colType = true && this.isSetColType();
    boolean that_present_colType = true && that.isSetColType();
    if (this_present_colType || that_present_colType) {
      if (!(this_present_colType && that_present_colType))
        return false;
      if (!this.colType.equals(that.colType))
        return false;
    }

    boolean this_present_statsData = true && this.isSetStatsData();
    boolean that_present_statsData = true && that.isSetStatsData();
    if (this_present_statsData || that_present_statsData) {
      if (!(this_present_statsData && that_present_statsData))
        return false;
      if (!this.statsData.equals(that.statsData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetColName()) ? 131071 : 524287);
    if (isSetColName())
      hashCode = hashCode * 8191 + colName.hashCode();

    hashCode = hashCode * 8191 + ((isSetColType()) ? 131071 : 524287);
    if (isSetColType())
      hashCode = hashCode * 8191 + colType.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatsData()) ? 131071 : 524287);
    if (isSetStatsData())
      hashCode = hashCode * 8191 + statsData.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ColumnStatisticsObj other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetColName(), other.isSetColName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colName, other.colName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColType(), other.isSetColType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colType, other.colType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetStatsData(), other.isSetStatsData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsData, other.statsData);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ColumnStatisticsObj(");
    boolean first = true;

    sb.append("colName:");
    if (this.colName == null) {
      sb.append("null");
    } else {
      sb.append(this.colName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colType:");
    if (this.colType == null) {
      sb.append("null");
    } else {
      sb.append(this.colType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statsData:");
    if (this.statsData == null) {
      sb.append("null");
    } else {
      sb.append(this.statsData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (colName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colName' was not present! Struct: " + toString());
    }
    if (colType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colType' was not present! Struct: " + toString());
    }
    if (statsData == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statsData' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ColumnStatisticsObjStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ColumnStatisticsObjStandardScheme getScheme() {
      return new ColumnStatisticsObjStandardScheme();
    }
  }

  private static class ColumnStatisticsObjStandardScheme extends org.apache.thrift.scheme.StandardScheme<ColumnStatisticsObj> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colName = iprot.readString();
              struct.setColNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colType = iprot.readString();
              struct.setColTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATS_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.statsData = new ColumnStatisticsData();
              struct.statsData.read(iprot);
              struct.setStatsDataIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.colName != null) {
        oprot.writeFieldBegin(COL_NAME_FIELD_DESC);
        oprot.writeString(struct.colName);
        oprot.writeFieldEnd();
      }
      if (struct.colType != null) {
        oprot.writeFieldBegin(COL_TYPE_FIELD_DESC);
        oprot.writeString(struct.colType);
        oprot.writeFieldEnd();
      }
      if (struct.statsData != null) {
        oprot.writeFieldBegin(STATS_DATA_FIELD_DESC);
        struct.statsData.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColumnStatisticsObjTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public ColumnStatisticsObjTupleScheme getScheme() {
      return new ColumnStatisticsObjTupleScheme();
    }
  }

  private static class ColumnStatisticsObjTupleScheme extends org.apache.thrift.scheme.TupleScheme<ColumnStatisticsObj> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.colName);
      oprot.writeString(struct.colType);
      struct.statsData.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.colName = iprot.readString();
      struct.setColNameIsSet(true);
      struct.colType = iprot.readString();
      struct.setColTypeIsSet(true);
      struct.statsData = new ColumnStatisticsData();
      struct.statsData.read(iprot);
      struct.setStatsDataIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

