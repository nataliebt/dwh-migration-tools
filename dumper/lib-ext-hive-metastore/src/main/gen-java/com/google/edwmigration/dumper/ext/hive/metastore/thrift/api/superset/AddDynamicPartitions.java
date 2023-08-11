/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class AddDynamicPartitions implements org.apache.thrift.TBase<AddDynamicPartitions, AddDynamicPartitions._Fields>, java.io.Serializable, Cloneable, Comparable<AddDynamicPartitions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddDynamicPartitions");

  private static final org.apache.thrift.protocol.TField TXNID_FIELD_DESC = new org.apache.thrift.protocol.TField("txnid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WRITEID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeid", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITIONNAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionnames", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField OPERATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("operationType", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddDynamicPartitionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddDynamicPartitionsTupleSchemeFactory();

  public long txnid; // required
  public long writeid; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String dbname; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String tablename; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partitionnames; // required
  /**
   * 
   * @see DataOperationType
   */
  public @org.apache.thrift.annotation.Nullable DataOperationType operationType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TXNID((short)1, "txnid"),
    WRITEID((short)2, "writeid"),
    DBNAME((short)3, "dbname"),
    TABLENAME((short)4, "tablename"),
    PARTITIONNAMES((short)5, "partitionnames"),
    /**
     * 
     * @see DataOperationType
     */
    OPERATION_TYPE((short)6, "operationType");

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
        case 1: // TXNID
          return TXNID;
        case 2: // WRITEID
          return WRITEID;
        case 3: // DBNAME
          return DBNAME;
        case 4: // TABLENAME
          return TABLENAME;
        case 5: // PARTITIONNAMES
          return PARTITIONNAMES;
        case 6: // OPERATION_TYPE
          return OPERATION_TYPE;
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
  private static final int __TXNID_ISSET_ID = 0;
  private static final int __WRITEID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.OPERATION_TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TXNID, new org.apache.thrift.meta_data.FieldMetaData("txnid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WRITEID, new org.apache.thrift.meta_data.FieldMetaData("writeid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONNAMES, new org.apache.thrift.meta_data.FieldMetaData("partitionnames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPERATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("operationType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, DataOperationType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddDynamicPartitions.class, metaDataMap);
  }

  public AddDynamicPartitions() {
    this.operationType = com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.DataOperationType.UNSET;

  }

  public AddDynamicPartitions(
    long txnid,
    long writeid,
    java.lang.String dbname,
    java.lang.String tablename,
    java.util.List<java.lang.String> partitionnames)
  {
    this();
    this.txnid = txnid;
    setTxnidIsSet(true);
    this.writeid = writeid;
    setWriteidIsSet(true);
    this.dbname = dbname;
    this.tablename = tablename;
    this.partitionnames = partitionnames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddDynamicPartitions(AddDynamicPartitions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.txnid = other.txnid;
    this.writeid = other.writeid;
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetPartitionnames()) {
      java.util.List<java.lang.String> __this__partitionnames = new java.util.ArrayList<java.lang.String>(other.partitionnames);
      this.partitionnames = __this__partitionnames;
    }
    if (other.isSetOperationType()) {
      this.operationType = other.operationType;
    }
  }

  @Override
  public AddDynamicPartitions deepCopy() {
    return new AddDynamicPartitions(this);
  }

  @Override
  public void clear() {
    setTxnidIsSet(false);
    this.txnid = 0;
    setWriteidIsSet(false);
    this.writeid = 0;
    this.dbname = null;
    this.tablename = null;
    this.partitionnames = null;
    this.operationType = com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.DataOperationType.UNSET;

  }

  public long getTxnid() {
    return this.txnid;
  }

  public AddDynamicPartitions setTxnid(long txnid) {
    this.txnid = txnid;
    setTxnidIsSet(true);
    return this;
  }

  public void unsetTxnid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  /** Returns true if field txnid is set (has been assigned a value) and false otherwise */
  public boolean isSetTxnid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TXNID_ISSET_ID);
  }

  public void setTxnidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TXNID_ISSET_ID, value);
  }

  public long getWriteid() {
    return this.writeid;
  }

  public AddDynamicPartitions setWriteid(long writeid) {
    this.writeid = writeid;
    setWriteidIsSet(true);
    return this;
  }

  public void unsetWriteid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeid is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbname() {
    return this.dbname;
  }

  public AddDynamicPartitions setDbname(@org.apache.thrift.annotation.Nullable java.lang.String dbname) {
    this.dbname = dbname;
    return this;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTablename() {
    return this.tablename;
  }

  public AddDynamicPartitions setTablename(@org.apache.thrift.annotation.Nullable java.lang.String tablename) {
    this.tablename = tablename;
    return this;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  public int getPartitionnamesSize() {
    return (this.partitionnames == null) ? 0 : this.partitionnames.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPartitionnamesIterator() {
    return (this.partitionnames == null) ? null : this.partitionnames.iterator();
  }

  public void addToPartitionnames(java.lang.String elem) {
    if (this.partitionnames == null) {
      this.partitionnames = new java.util.ArrayList<java.lang.String>();
    }
    this.partitionnames.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPartitionnames() {
    return this.partitionnames;
  }

  public AddDynamicPartitions setPartitionnames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partitionnames) {
    this.partitionnames = partitionnames;
    return this;
  }

  public void unsetPartitionnames() {
    this.partitionnames = null;
  }

  /** Returns true if field partitionnames is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionnames() {
    return this.partitionnames != null;
  }

  public void setPartitionnamesIsSet(boolean value) {
    if (!value) {
      this.partitionnames = null;
    }
  }

  /**
   * 
   * @see DataOperationType
   */
  @org.apache.thrift.annotation.Nullable
  public DataOperationType getOperationType() {
    return this.operationType;
  }

  /**
   * 
   * @see DataOperationType
   */
  public AddDynamicPartitions setOperationType(@org.apache.thrift.annotation.Nullable DataOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  public void unsetOperationType() {
    this.operationType = null;
  }

  /** Returns true if field operationType is set (has been assigned a value) and false otherwise */
  public boolean isSetOperationType() {
    return this.operationType != null;
  }

  public void setOperationTypeIsSet(boolean value) {
    if (!value) {
      this.operationType = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TXNID:
      if (value == null) {
        unsetTxnid();
      } else {
        setTxnid((java.lang.Long)value);
      }
      break;

    case WRITEID:
      if (value == null) {
        unsetWriteid();
      } else {
        setWriteid((java.lang.Long)value);
      }
      break;

    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((java.lang.String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((java.lang.String)value);
      }
      break;

    case PARTITIONNAMES:
      if (value == null) {
        unsetPartitionnames();
      } else {
        setPartitionnames((java.util.List<java.lang.String>)value);
      }
      break;

    case OPERATION_TYPE:
      if (value == null) {
        unsetOperationType();
      } else {
        setOperationType((DataOperationType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TXNID:
      return getTxnid();

    case WRITEID:
      return getWriteid();

    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case PARTITIONNAMES:
      return getPartitionnames();

    case OPERATION_TYPE:
      return getOperationType();

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
    case TXNID:
      return isSetTxnid();
    case WRITEID:
      return isSetWriteid();
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case PARTITIONNAMES:
      return isSetPartitionnames();
    case OPERATION_TYPE:
      return isSetOperationType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof AddDynamicPartitions)
      return this.equals((AddDynamicPartitions)that);
    return false;
  }

  public boolean equals(AddDynamicPartitions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_txnid = true;
    boolean that_present_txnid = true;
    if (this_present_txnid || that_present_txnid) {
      if (!(this_present_txnid && that_present_txnid))
        return false;
      if (this.txnid != that.txnid)
        return false;
    }

    boolean this_present_writeid = true;
    boolean that_present_writeid = true;
    if (this_present_writeid || that_present_writeid) {
      if (!(this_present_writeid && that_present_writeid))
        return false;
      if (this.writeid != that.writeid)
        return false;
    }

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_partitionnames = true && this.isSetPartitionnames();
    boolean that_present_partitionnames = true && that.isSetPartitionnames();
    if (this_present_partitionnames || that_present_partitionnames) {
      if (!(this_present_partitionnames && that_present_partitionnames))
        return false;
      if (!this.partitionnames.equals(that.partitionnames))
        return false;
    }

    boolean this_present_operationType = true && this.isSetOperationType();
    boolean that_present_operationType = true && that.isSetOperationType();
    if (this_present_operationType || that_present_operationType) {
      if (!(this_present_operationType && that_present_operationType))
        return false;
      if (!this.operationType.equals(that.operationType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(txnid);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(writeid);

    hashCode = hashCode * 8191 + ((isSetDbname()) ? 131071 : 524287);
    if (isSetDbname())
      hashCode = hashCode * 8191 + dbname.hashCode();

    hashCode = hashCode * 8191 + ((isSetTablename()) ? 131071 : 524287);
    if (isSetTablename())
      hashCode = hashCode * 8191 + tablename.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartitionnames()) ? 131071 : 524287);
    if (isSetPartitionnames())
      hashCode = hashCode * 8191 + partitionnames.hashCode();

    hashCode = hashCode * 8191 + ((isSetOperationType()) ? 131071 : 524287);
    if (isSetOperationType())
      hashCode = hashCode * 8191 + operationType.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(AddDynamicPartitions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTxnid(), other.isSetTxnid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTxnid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.txnid, other.txnid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetWriteid(), other.isSetWriteid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeid, other.writeid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDbname(), other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTablename(), other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartitionnames(), other.isSetPartitionnames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionnames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionnames, other.partitionnames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOperationType(), other.isSetOperationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operationType, other.operationType);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AddDynamicPartitions(");
    boolean first = true;

    sb.append("txnid:");
    sb.append(this.txnid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("writeid:");
    sb.append(this.writeid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbname:");
    if (this.dbname == null) {
      sb.append("null");
    } else {
      sb.append(this.dbname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tablename:");
    if (this.tablename == null) {
      sb.append("null");
    } else {
      sb.append(this.tablename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partitionnames:");
    if (this.partitionnames == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionnames);
    }
    first = false;
    if (isSetOperationType()) {
      if (!first) sb.append(", ");
      sb.append("operationType:");
      if (this.operationType == null) {
        sb.append("null");
      } else {
        sb.append(this.operationType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'txnid' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'writeid' because it's a primitive and you chose the non-beans generator.
    if (dbname == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbname' was not present! Struct: " + toString());
    }
    if (tablename == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablename' was not present! Struct: " + toString());
    }
    if (partitionnames == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitionnames' was not present! Struct: " + toString());
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

  private static class AddDynamicPartitionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AddDynamicPartitionsStandardScheme getScheme() {
      return new AddDynamicPartitionsStandardScheme();
    }
  }

  private static class AddDynamicPartitionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<AddDynamicPartitions> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TXNID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.txnid = iprot.readI64();
              struct.setTxnidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WRITEID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeid = iprot.readI64();
              struct.setWriteidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITIONNAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list780 = iprot.readListBegin();
                struct.partitionnames = new java.util.ArrayList<java.lang.String>(_list780.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem781;
                for (int _i782 = 0; _i782 < _list780.size; ++_i782)
                {
                  _elem781 = iprot.readString();
                  struct.partitionnames.add(_elem781);
                }
                iprot.readListEnd();
              }
              struct.setPartitionnamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPERATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operationType = com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.DataOperationType.findByValue(iprot.readI32());
              struct.setOperationTypeIsSet(true);
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
      if (!struct.isSetTxnid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'txnid' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetWriteid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'writeid' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TXNID_FIELD_DESC);
      oprot.writeI64(struct.txnid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(WRITEID_FIELD_DESC);
      oprot.writeI64(struct.writeid);
      oprot.writeFieldEnd();
      if (struct.dbname != null) {
        oprot.writeFieldBegin(DBNAME_FIELD_DESC);
        oprot.writeString(struct.dbname);
        oprot.writeFieldEnd();
      }
      if (struct.tablename != null) {
        oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
        oprot.writeString(struct.tablename);
        oprot.writeFieldEnd();
      }
      if (struct.partitionnames != null) {
        oprot.writeFieldBegin(PARTITIONNAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partitionnames.size()));
          for (java.lang.String _iter783 : struct.partitionnames)
          {
            oprot.writeString(_iter783);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.operationType != null) {
        if (struct.isSetOperationType()) {
          oprot.writeFieldBegin(OPERATION_TYPE_FIELD_DESC);
          oprot.writeI32(struct.operationType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddDynamicPartitionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public AddDynamicPartitionsTupleScheme getScheme() {
      return new AddDynamicPartitionsTupleScheme();
    }
  }

  private static class AddDynamicPartitionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<AddDynamicPartitions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.txnid);
      oprot.writeI64(struct.writeid);
      oprot.writeString(struct.dbname);
      oprot.writeString(struct.tablename);
      {
        oprot.writeI32(struct.partitionnames.size());
        for (java.lang.String _iter784 : struct.partitionnames)
        {
          oprot.writeString(_iter784);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOperationType()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetOperationType()) {
        oprot.writeI32(struct.operationType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddDynamicPartitions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.txnid = iprot.readI64();
      struct.setTxnidIsSet(true);
      struct.writeid = iprot.readI64();
      struct.setWriteidIsSet(true);
      struct.dbname = iprot.readString();
      struct.setDbnameIsSet(true);
      struct.tablename = iprot.readString();
      struct.setTablenameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list785 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.partitionnames = new java.util.ArrayList<java.lang.String>(_list785.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem786;
        for (int _i787 = 0; _i787 < _list785.size; ++_i787)
        {
          _elem786 = iprot.readString();
          struct.partitionnames.add(_elem786);
        }
      }
      struct.setPartitionnamesIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.operationType = com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.DataOperationType.findByValue(iprot.readI32());
        struct.setOperationTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

