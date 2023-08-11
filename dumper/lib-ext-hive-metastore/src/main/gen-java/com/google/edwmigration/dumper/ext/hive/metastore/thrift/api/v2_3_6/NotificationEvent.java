/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.v2_3_6;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class NotificationEvent implements org.apache.thrift.TBase<NotificationEvent, NotificationEvent._Fields>, java.io.Serializable, Cloneable, Comparable<NotificationEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NotificationEvent");

  private static final org.apache.thrift.protocol.TField EVENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("eventId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField EVENT_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("eventTime", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EVENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("eventType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField MESSAGE_FORMAT_FIELD_DESC = new org.apache.thrift.protocol.TField("messageFormat", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NotificationEventStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NotificationEventTupleSchemeFactory();

  public long eventId; // required
  public int eventTime; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String eventType; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String dbName; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String tableName; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String message; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String messageFormat; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EVENT_ID((short)1, "eventId"),
    EVENT_TIME((short)2, "eventTime"),
    EVENT_TYPE((short)3, "eventType"),
    DB_NAME((short)4, "dbName"),
    TABLE_NAME((short)5, "tableName"),
    MESSAGE((short)6, "message"),
    MESSAGE_FORMAT((short)7, "messageFormat");

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
        case 1: // EVENT_ID
          return EVENT_ID;
        case 2: // EVENT_TIME
          return EVENT_TIME;
        case 3: // EVENT_TYPE
          return EVENT_TYPE;
        case 4: // DB_NAME
          return DB_NAME;
        case 5: // TABLE_NAME
          return TABLE_NAME;
        case 6: // MESSAGE
          return MESSAGE;
        case 7: // MESSAGE_FORMAT
          return MESSAGE_FORMAT;
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
  private static final int __EVENTID_ISSET_ID = 0;
  private static final int __EVENTTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DB_NAME,_Fields.TABLE_NAME,_Fields.MESSAGE_FORMAT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EVENT_ID, new org.apache.thrift.meta_data.FieldMetaData("eventId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EVENT_TIME, new org.apache.thrift.meta_data.FieldMetaData("eventTime", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.EVENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("eventType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_FORMAT, new org.apache.thrift.meta_data.FieldMetaData("messageFormat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NotificationEvent.class, metaDataMap);
  }

  public NotificationEvent() {
  }

  public NotificationEvent(
    long eventId,
    int eventTime,
    java.lang.String eventType,
    java.lang.String message)
  {
    this();
    this.eventId = eventId;
    setEventIdIsSet(true);
    this.eventTime = eventTime;
    setEventTimeIsSet(true);
    this.eventType = eventType;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NotificationEvent(NotificationEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.eventId = other.eventId;
    this.eventTime = other.eventTime;
    if (other.isSetEventType()) {
      this.eventType = other.eventType;
    }
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
    if (other.isSetMessageFormat()) {
      this.messageFormat = other.messageFormat;
    }
  }

  @Override
  public NotificationEvent deepCopy() {
    return new NotificationEvent(this);
  }

  @Override
  public void clear() {
    setEventIdIsSet(false);
    this.eventId = 0;
    setEventTimeIsSet(false);
    this.eventTime = 0;
    this.eventType = null;
    this.dbName = null;
    this.tableName = null;
    this.message = null;
    this.messageFormat = null;
  }

  public long getEventId() {
    return this.eventId;
  }

  public NotificationEvent setEventId(long eventId) {
    this.eventId = eventId;
    setEventIdIsSet(true);
    return this;
  }

  public void unsetEventId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EVENTID_ISSET_ID);
  }

  /** Returns true if field eventId is set (has been assigned a value) and false otherwise */
  public boolean isSetEventId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EVENTID_ISSET_ID);
  }

  public void setEventIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EVENTID_ISSET_ID, value);
  }

  public int getEventTime() {
    return this.eventTime;
  }

  public NotificationEvent setEventTime(int eventTime) {
    this.eventTime = eventTime;
    setEventTimeIsSet(true);
    return this;
  }

  public void unsetEventTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EVENTTIME_ISSET_ID);
  }

  /** Returns true if field eventTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEventTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EVENTTIME_ISSET_ID);
  }

  public void setEventTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EVENTTIME_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEventType() {
    return this.eventType;
  }

  public NotificationEvent setEventType(@org.apache.thrift.annotation.Nullable java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  public void unsetEventType() {
    this.eventType = null;
  }

  /** Returns true if field eventType is set (has been assigned a value) and false otherwise */
  public boolean isSetEventType() {
    return this.eventType != null;
  }

  public void setEventTypeIsSet(boolean value) {
    if (!value) {
      this.eventType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.dbName;
  }

  public NotificationEvent setDbName(@org.apache.thrift.annotation.Nullable java.lang.String dbName) {
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
  public java.lang.String getTableName() {
    return this.tableName;
  }

  public NotificationEvent setTableName(@org.apache.thrift.annotation.Nullable java.lang.String tableName) {
    this.tableName = tableName;
    return this;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessage() {
    return this.message;
  }

  public NotificationEvent setMessage(@org.apache.thrift.annotation.Nullable java.lang.String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getMessageFormat() {
    return this.messageFormat;
  }

  public NotificationEvent setMessageFormat(@org.apache.thrift.annotation.Nullable java.lang.String messageFormat) {
    this.messageFormat = messageFormat;
    return this;
  }

  public void unsetMessageFormat() {
    this.messageFormat = null;
  }

  /** Returns true if field messageFormat is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageFormat() {
    return this.messageFormat != null;
  }

  public void setMessageFormatIsSet(boolean value) {
    if (!value) {
      this.messageFormat = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EVENT_ID:
      if (value == null) {
        unsetEventId();
      } else {
        setEventId((java.lang.Long)value);
      }
      break;

    case EVENT_TIME:
      if (value == null) {
        unsetEventTime();
      } else {
        setEventTime((java.lang.Integer)value);
      }
      break;

    case EVENT_TYPE:
      if (value == null) {
        unsetEventType();
      } else {
        setEventType((java.lang.String)value);
      }
      break;

    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((java.lang.String)value);
      }
      break;

    case MESSAGE_FORMAT:
      if (value == null) {
        unsetMessageFormat();
      } else {
        setMessageFormat((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EVENT_ID:
      return getEventId();

    case EVENT_TIME:
      return getEventTime();

    case EVENT_TYPE:
      return getEventType();

    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case MESSAGE:
      return getMessage();

    case MESSAGE_FORMAT:
      return getMessageFormat();

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
    case EVENT_ID:
      return isSetEventId();
    case EVENT_TIME:
      return isSetEventTime();
    case EVENT_TYPE:
      return isSetEventType();
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case MESSAGE:
      return isSetMessage();
    case MESSAGE_FORMAT:
      return isSetMessageFormat();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof NotificationEvent)
      return this.equals((NotificationEvent)that);
    return false;
  }

  public boolean equals(NotificationEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_eventId = true;
    boolean that_present_eventId = true;
    if (this_present_eventId || that_present_eventId) {
      if (!(this_present_eventId && that_present_eventId))
        return false;
      if (this.eventId != that.eventId)
        return false;
    }

    boolean this_present_eventTime = true;
    boolean that_present_eventTime = true;
    if (this_present_eventTime || that_present_eventTime) {
      if (!(this_present_eventTime && that_present_eventTime))
        return false;
      if (this.eventTime != that.eventTime)
        return false;
    }

    boolean this_present_eventType = true && this.isSetEventType();
    boolean that_present_eventType = true && that.isSetEventType();
    if (this_present_eventType || that_present_eventType) {
      if (!(this_present_eventType && that_present_eventType))
        return false;
      if (!this.eventType.equals(that.eventType))
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

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    boolean this_present_messageFormat = true && this.isSetMessageFormat();
    boolean that_present_messageFormat = true && that.isSetMessageFormat();
    if (this_present_messageFormat || that_present_messageFormat) {
      if (!(this_present_messageFormat && that_present_messageFormat))
        return false;
      if (!this.messageFormat.equals(that.messageFormat))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(eventId);

    hashCode = hashCode * 8191 + eventTime;

    hashCode = hashCode * 8191 + ((isSetEventType()) ? 131071 : 524287);
    if (isSetEventType())
      hashCode = hashCode * 8191 + eventType.hashCode();

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + dbName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
    if (isSetMessage())
      hashCode = hashCode * 8191 + message.hashCode();

    hashCode = hashCode * 8191 + ((isSetMessageFormat()) ? 131071 : 524287);
    if (isSetMessageFormat())
      hashCode = hashCode * 8191 + messageFormat.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NotificationEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetEventId(), other.isSetEventId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventId, other.eventId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEventTime(), other.isSetEventTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventTime, other.eventTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEventType(), other.isSetEventType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventType, other.eventType);
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
    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMessage(), other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMessageFormat(), other.isSetMessageFormat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageFormat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageFormat, other.messageFormat);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationEvent(");
    boolean first = true;

    sb.append("eventId:");
    sb.append(this.eventId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventTime:");
    sb.append(this.eventTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventType:");
    if (this.eventType == null) {
      sb.append("null");
    } else {
      sb.append(this.eventType);
    }
    first = false;
    if (isSetDbName()) {
      if (!first) sb.append(", ");
      sb.append("dbName:");
      if (this.dbName == null) {
        sb.append("null");
      } else {
        sb.append(this.dbName);
      }
      first = false;
    }
    if (isSetTableName()) {
      if (!first) sb.append(", ");
      sb.append("tableName:");
      if (this.tableName == null) {
        sb.append("null");
      } else {
        sb.append(this.tableName);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    if (isSetMessageFormat()) {
      if (!first) sb.append(", ");
      sb.append("messageFormat:");
      if (this.messageFormat == null) {
        sb.append("null");
      } else {
        sb.append(this.messageFormat);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'eventId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'eventTime' because it's a primitive and you chose the non-beans generator.
    if (eventType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'eventType' was not present! Struct: " + toString());
    }
    if (message == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'message' was not present! Struct: " + toString());
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

  private static class NotificationEventStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public NotificationEventStandardScheme getScheme() {
      return new NotificationEventStandardScheme();
    }
  }

  private static class NotificationEventStandardScheme extends org.apache.thrift.scheme.StandardScheme<NotificationEvent> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, NotificationEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EVENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.eventId = iprot.readI64();
              struct.setEventIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENT_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.eventTime = iprot.readI32();
              struct.setEventTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EVENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.eventType = iprot.readString();
              struct.setEventTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MESSAGE_FORMAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.messageFormat = iprot.readString();
              struct.setMessageFormatIsSet(true);
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
      if (!struct.isSetEventId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'eventId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetEventTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'eventTime' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, NotificationEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EVENT_ID_FIELD_DESC);
      oprot.writeI64(struct.eventId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(EVENT_TIME_FIELD_DESC);
      oprot.writeI32(struct.eventTime);
      oprot.writeFieldEnd();
      if (struct.eventType != null) {
        oprot.writeFieldBegin(EVENT_TYPE_FIELD_DESC);
        oprot.writeString(struct.eventType);
        oprot.writeFieldEnd();
      }
      if (struct.dbName != null) {
        if (struct.isSetDbName()) {
          oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
          oprot.writeString(struct.dbName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tableName != null) {
        if (struct.isSetTableName()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.tableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.message);
        oprot.writeFieldEnd();
      }
      if (struct.messageFormat != null) {
        if (struct.isSetMessageFormat()) {
          oprot.writeFieldBegin(MESSAGE_FORMAT_FIELD_DESC);
          oprot.writeString(struct.messageFormat);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NotificationEventTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public NotificationEventTupleScheme getScheme() {
      return new NotificationEventTupleScheme();
    }
  }

  private static class NotificationEventTupleScheme extends org.apache.thrift.scheme.TupleScheme<NotificationEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NotificationEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.eventId);
      oprot.writeI32(struct.eventTime);
      oprot.writeString(struct.eventType);
      oprot.writeString(struct.message);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDbName()) {
        optionals.set(0);
      }
      if (struct.isSetTableName()) {
        optionals.set(1);
      }
      if (struct.isSetMessageFormat()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDbName()) {
        oprot.writeString(struct.dbName);
      }
      if (struct.isSetTableName()) {
        oprot.writeString(struct.tableName);
      }
      if (struct.isSetMessageFormat()) {
        oprot.writeString(struct.messageFormat);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NotificationEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.eventId = iprot.readI64();
      struct.setEventIdIsSet(true);
      struct.eventTime = iprot.readI32();
      struct.setEventTimeIsSet(true);
      struct.eventType = iprot.readString();
      struct.setEventTypeIsSet(true);
      struct.message = iprot.readString();
      struct.setMessageIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.dbName = iprot.readString();
        struct.setDbNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tableName = iprot.readString();
        struct.setTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.messageFormat = iprot.readString();
        struct.setMessageFormatIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

