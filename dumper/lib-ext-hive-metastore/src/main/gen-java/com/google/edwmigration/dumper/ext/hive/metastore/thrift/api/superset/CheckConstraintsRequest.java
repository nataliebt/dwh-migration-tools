/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class CheckConstraintsRequest implements org.apache.thrift.TBase<CheckConstraintsRequest, CheckConstraintsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CheckConstraintsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CheckConstraintsRequest");

  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("db_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tbl_name", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CheckConstraintsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CheckConstraintsRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String catName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String db_name; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String tbl_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAT_NAME((short)1, "catName"),
    DB_NAME((short)2, "db_name"),
    TBL_NAME((short)3, "tbl_name");

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
        case 1: // CAT_NAME
          return CAT_NAME;
        case 2: // DB_NAME
          return DB_NAME;
        case 3: // TBL_NAME
          return TBL_NAME;
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
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("db_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tbl_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CheckConstraintsRequest.class, metaDataMap);
  }

  public CheckConstraintsRequest() {
  }

  public CheckConstraintsRequest(
    java.lang.String catName,
    java.lang.String db_name,
    java.lang.String tbl_name)
  {
    this();
    this.catName = catName;
    this.db_name = db_name;
    this.tbl_name = tbl_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckConstraintsRequest(CheckConstraintsRequest other) {
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
    if (other.isSetDb_name()) {
      this.db_name = other.db_name;
    }
    if (other.isSetTbl_name()) {
      this.tbl_name = other.tbl_name;
    }
  }

  @Override
  public CheckConstraintsRequest deepCopy() {
    return new CheckConstraintsRequest(this);
  }

  @Override
  public void clear() {
    this.catName = null;
    this.db_name = null;
    this.tbl_name = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public CheckConstraintsRequest setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
    this.catName = catName;
    return this;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDb_name() {
    return this.db_name;
  }

  public CheckConstraintsRequest setDb_name(@org.apache.thrift.annotation.Nullable java.lang.String db_name) {
    this.db_name = db_name;
    return this;
  }

  public void unsetDb_name() {
    this.db_name = null;
  }

  /** Returns true if field db_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDb_name() {
    return this.db_name != null;
  }

  public void setDb_nameIsSet(boolean value) {
    if (!value) {
      this.db_name = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTbl_name() {
    return this.tbl_name;
  }

  public CheckConstraintsRequest setTbl_name(@org.apache.thrift.annotation.Nullable java.lang.String tbl_name) {
    this.tbl_name = tbl_name;
    return this;
  }

  public void unsetTbl_name() {
    this.tbl_name = null;
  }

  /** Returns true if field tbl_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTbl_name() {
    return this.tbl_name != null;
  }

  public void setTbl_nameIsSet(boolean value) {
    if (!value) {
      this.tbl_name = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDb_name();
      } else {
        setDb_name((java.lang.String)value);
      }
      break;

    case TBL_NAME:
      if (value == null) {
        unsetTbl_name();
      } else {
        setTbl_name((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CAT_NAME:
      return getCatName();

    case DB_NAME:
      return getDb_name();

    case TBL_NAME:
      return getTbl_name();

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
    case CAT_NAME:
      return isSetCatName();
    case DB_NAME:
      return isSetDb_name();
    case TBL_NAME:
      return isSetTbl_name();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof CheckConstraintsRequest)
      return this.equals((CheckConstraintsRequest)that);
    return false;
  }

  public boolean equals(CheckConstraintsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    boolean this_present_db_name = true && this.isSetDb_name();
    boolean that_present_db_name = true && that.isSetDb_name();
    if (this_present_db_name || that_present_db_name) {
      if (!(this_present_db_name && that_present_db_name))
        return false;
      if (!this.db_name.equals(that.db_name))
        return false;
    }

    boolean this_present_tbl_name = true && this.isSetTbl_name();
    boolean that_present_tbl_name = true && that.isSetTbl_name();
    if (this_present_tbl_name || that_present_tbl_name) {
      if (!(this_present_tbl_name && that_present_tbl_name))
        return false;
      if (!this.tbl_name.equals(that.tbl_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    hashCode = hashCode * 8191 + ((isSetDb_name()) ? 131071 : 524287);
    if (isSetDb_name())
      hashCode = hashCode * 8191 + db_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetTbl_name()) ? 131071 : 524287);
    if (isSetTbl_name())
      hashCode = hashCode * 8191 + tbl_name.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(CheckConstraintsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCatName(), other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDb_name(), other.isSetDb_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_name, other.db_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTbl_name(), other.isSetTbl_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTbl_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tbl_name, other.tbl_name);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckConstraintsRequest(");
    boolean first = true;

    sb.append("catName:");
    if (this.catName == null) {
      sb.append("null");
    } else {
      sb.append(this.catName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("db_name:");
    if (this.db_name == null) {
      sb.append("null");
    } else {
      sb.append(this.db_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tbl_name:");
    if (this.tbl_name == null) {
      sb.append("null");
    } else {
      sb.append(this.tbl_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (catName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'catName' was not present! Struct: " + toString());
    }
    if (db_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db_name' was not present! Struct: " + toString());
    }
    if (tbl_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tbl_name' was not present! Struct: " + toString());
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

  private static class CheckConstraintsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public CheckConstraintsRequestStandardScheme getScheme() {
      return new CheckConstraintsRequestStandardScheme();
    }
  }

  private static class CheckConstraintsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<CheckConstraintsRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db_name = iprot.readString();
              struct.setDb_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tbl_name = iprot.readString();
              struct.setTbl_nameIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catName != null) {
        oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
        oprot.writeString(struct.catName);
        oprot.writeFieldEnd();
      }
      if (struct.db_name != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.db_name);
        oprot.writeFieldEnd();
      }
      if (struct.tbl_name != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tbl_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckConstraintsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public CheckConstraintsRequestTupleScheme getScheme() {
      return new CheckConstraintsRequestTupleScheme();
    }
  }

  private static class CheckConstraintsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<CheckConstraintsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.catName);
      oprot.writeString(struct.db_name);
      oprot.writeString(struct.tbl_name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.catName = iprot.readString();
      struct.setCatNameIsSet(true);
      struct.db_name = iprot.readString();
      struct.setDb_nameIsSet(true);
      struct.tbl_name = iprot.readString();
      struct.setTbl_nameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

