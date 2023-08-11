/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class NotificationEventsCountRequest implements org.apache.thrift.TBase<NotificationEventsCountRequest, NotificationEventsCountRequest._Fields>, java.io.Serializable, Cloneable, Comparable<NotificationEventsCountRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NotificationEventsCountRequest");

  private static final org.apache.thrift.protocol.TField FROM_EVENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("fromEventId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TO_EVENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toEventId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField LIMIT_FIELD_DESC = new org.apache.thrift.protocol.TField("limit", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NotificationEventsCountRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NotificationEventsCountRequestTupleSchemeFactory();

  public long fromEventId; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String dbName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String catName; // optional
  public long toEventId; // optional
  public long limit; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FROM_EVENT_ID((short)1, "fromEventId"),
    DB_NAME((short)2, "dbName"),
    CAT_NAME((short)3, "catName"),
    TO_EVENT_ID((short)4, "toEventId"),
    LIMIT((short)5, "limit");

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
        case 1: // FROM_EVENT_ID
          return FROM_EVENT_ID;
        case 2: // DB_NAME
          return DB_NAME;
        case 3: // CAT_NAME
          return CAT_NAME;
        case 4: // TO_EVENT_ID
          return TO_EVENT_ID;
        case 5: // LIMIT
          return LIMIT;
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
  private static final int __FROMEVENTID_ISSET_ID = 0;
  private static final int __TOEVENTID_ISSET_ID = 1;
  private static final int __LIMIT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CAT_NAME,_Fields.TO_EVENT_ID,_Fields.LIMIT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FROM_EVENT_ID, new org.apache.thrift.meta_data.FieldMetaData("fromEventId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_EVENT_ID, new org.apache.thrift.meta_data.FieldMetaData("toEventId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LIMIT, new org.apache.thrift.meta_data.FieldMetaData("limit", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NotificationEventsCountRequest.class, metaDataMap);
  }

  public NotificationEventsCountRequest() {
  }

  public NotificationEventsCountRequest(
    long fromEventId,
    java.lang.String dbName)
  {
    this();
    this.fromEventId = fromEventId;
    setFromEventIdIsSet(true);
    this.dbName = dbName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotificationEventsCountRequest(NotificationEventsCountRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.fromEventId = other.fromEventId;
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
    this.toEventId = other.toEventId;
    this.limit = other.limit;
  }

  @Override
  public NotificationEventsCountRequest deepCopy() {
    return new NotificationEventsCountRequest(this);
  }

  @Override
  public void clear() {
    setFromEventIdIsSet(false);
    this.fromEventId = 0;
    this.dbName = null;
    this.catName = null;
    setToEventIdIsSet(false);
    this.toEventId = 0;
    setLimitIsSet(false);
    this.limit = 0;
  }

  public long getFromEventId() {
    return this.fromEventId;
  }

  public NotificationEventsCountRequest setFromEventId(long fromEventId) {
    this.fromEventId = fromEventId;
    setFromEventIdIsSet(true);
    return this;
  }

  public void unsetFromEventId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FROMEVENTID_ISSET_ID);
  }

  /** Returns true if field fromEventId is set (has been assigned a value) and false otherwise */
  public boolean isSetFromEventId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FROMEVENTID_ISSET_ID);
  }

  public void setFromEventIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FROMEVENTID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.dbName;
  }

  public NotificationEventsCountRequest setDbName(@org.apache.thrift.annotation.Nullable java.lang.String dbName) {
    this.dbName = dbName;
    return this;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public NotificationEventsCountRequest setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
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

  public long getToEventId() {
    return this.toEventId;
  }

  public NotificationEventsCountRequest setToEventId(long toEventId) {
    this.toEventId = toEventId;
    setToEventIdIsSet(true);
    return this;
  }

  public void unsetToEventId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOEVENTID_ISSET_ID);
  }

  /** Returns true if field toEventId is set (has been assigned a value) and false otherwise */
  public boolean isSetToEventId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOEVENTID_ISSET_ID);
  }

  public void setToEventIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOEVENTID_ISSET_ID, value);
  }

  public long getLimit() {
    return this.limit;
  }

  public NotificationEventsCountRequest setLimit(long limit) {
    this.limit = limit;
    setLimitIsSet(true);
    return this;
  }

  public void unsetLimit() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  /** Returns true if field limit is set (has been assigned a value) and false otherwise */
  public boolean isSetLimit() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LIMIT_ISSET_ID);
  }

  public void setLimitIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LIMIT_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FROM_EVENT_ID:
      if (value == null) {
        unsetFromEventId();
      } else {
        setFromEventId((java.lang.Long)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    case TO_EVENT_ID:
      if (value == null) {
        unsetToEventId();
      } else {
        setToEventId((java.lang.Long)value);
      }
      break;

    case LIMIT:
      if (value == null) {
        unsetLimit();
      } else {
        setLimit((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FROM_EVENT_ID:
      return getFromEventId();

    case DB_NAME:
      return getDbName();

    case CAT_NAME:
      return getCatName();

    case TO_EVENT_ID:
      return getToEventId();

    case LIMIT:
      return getLimit();

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
    case FROM_EVENT_ID:
      return isSetFromEventId();
    case DB_NAME:
      return isSetDbName();
    case CAT_NAME:
      return isSetCatName();
    case TO_EVENT_ID:
      return isSetToEventId();
    case LIMIT:
      return isSetLimit();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof NotificationEventsCountRequest)
      return this.equals((NotificationEventsCountRequest)that);
    return false;
  }

  public boolean equals(NotificationEventsCountRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fromEventId = true;
    boolean that_present_fromEventId = true;
    if (this_present_fromEventId || that_present_fromEventId) {
      if (!(this_present_fromEventId && that_present_fromEventId))
        return false;
      if (this.fromEventId != that.fromEventId)
        return false;
    }

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    boolean this_present_toEventId = true && this.isSetToEventId();
    boolean that_present_toEventId = true && that.isSetToEventId();
    if (this_present_toEventId || that_present_toEventId) {
      if (!(this_present_toEventId && that_present_toEventId))
        return false;
      if (this.toEventId != that.toEventId)
        return false;
    }

    boolean this_present_limit = true && this.isSetLimit();
    boolean that_present_limit = true && that.isSetLimit();
    if (this_present_limit || that_present_limit) {
      if (!(this_present_limit && that_present_limit))
        return false;
      if (this.limit != that.limit)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(fromEventId);

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + dbName.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    hashCode = hashCode * 8191 + ((isSetToEventId()) ? 131071 : 524287);
    if (isSetToEventId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(toEventId);

    hashCode = hashCode * 8191 + ((isSetLimit()) ? 131071 : 524287);
    if (isSetLimit())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(limit);

    return hashCode;
  }

  @Override
  public int compareTo(NotificationEventsCountRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetFromEventId(), other.isSetFromEventId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFromEventId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromEventId, other.fromEventId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbName(), other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.compare(isSetToEventId(), other.isSetToEventId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToEventId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toEventId, other.toEventId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetLimit(), other.isSetLimit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLimit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.limit, other.limit);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationEventsCountRequest(");
    boolean first = true;

    sb.append("fromEventId:");
    sb.append(this.fromEventId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (isSetCatName()) {
      if (!first) sb.append(", ");
      sb.append("catName:");
      if (this.catName == null) {
        sb.append("null");
      } else {
        sb.append(this.catName);
      }
      first = false;
    }
    if (isSetToEventId()) {
      if (!first) sb.append(", ");
      sb.append("toEventId:");
      sb.append(this.toEventId);
      first = false;
    }
    if (isSetLimit()) {
      if (!first) sb.append(", ");
      sb.append("limit:");
      sb.append(this.limit);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'fromEventId' because it's a primitive and you chose the non-beans generator.
    if (dbName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' was not present! Struct: " + toString());
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

  private static class NotificationEventsCountRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public NotificationEventsCountRequestStandardScheme getScheme() {
      return new NotificationEventsCountRequestStandardScheme();
    }
  }

  private static class NotificationEventsCountRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<NotificationEventsCountRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, NotificationEventsCountRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FROM_EVENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.fromEventId = iprot.readI64();
              struct.setFromEventIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TO_EVENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.toEventId = iprot.readI64();
              struct.setToEventIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LIMIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.limit = iprot.readI64();
              struct.setLimitIsSet(true);
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
      if (!struct.isSetFromEventId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'fromEventId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, NotificationEventsCountRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FROM_EVENT_ID_FIELD_DESC);
      oprot.writeI64(struct.fromEventId);
      oprot.writeFieldEnd();
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetToEventId()) {
        oprot.writeFieldBegin(TO_EVENT_ID_FIELD_DESC);
        oprot.writeI64(struct.toEventId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLimit()) {
        oprot.writeFieldBegin(LIMIT_FIELD_DESC);
        oprot.writeI64(struct.limit);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NotificationEventsCountRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public NotificationEventsCountRequestTupleScheme getScheme() {
      return new NotificationEventsCountRequestTupleScheme();
    }
  }

  private static class NotificationEventsCountRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<NotificationEventsCountRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NotificationEventsCountRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.fromEventId);
      oprot.writeString(struct.dbName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatName()) {
        optionals.set(0);
      }
      if (struct.isSetToEventId()) {
        optionals.set(1);
      }
      if (struct.isSetLimit()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
      if (struct.isSetToEventId()) {
        oprot.writeI64(struct.toEventId);
      }
      if (struct.isSetLimit()) {
        oprot.writeI64(struct.limit);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NotificationEventsCountRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.fromEventId = iprot.readI64();
      struct.setFromEventIdIsSet(true);
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.toEventId = iprot.readI64();
        struct.setToEventIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.limit = iprot.readI64();
        struct.setLimitIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

