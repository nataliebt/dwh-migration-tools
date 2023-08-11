/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class PartitionsStatsRequest implements org.apache.thrift.TBase<PartitionsStatsRequest, PartitionsStatsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionsStatsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionsStatsRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tblName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COL_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("colNames", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PART_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("partNames", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField VALID_WRITE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validWriteIdList", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField ENGINE_FIELD_DESC = new org.apache.thrift.protocol.TField("engine", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PartitionsStatsRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PartitionsStatsRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String dbName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String tblName; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> colNames; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partNames; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String catName; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String engine; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TBL_NAME((short)2, "tblName"),
    COL_NAMES((short)3, "colNames"),
    PART_NAMES((short)4, "partNames"),
    CAT_NAME((short)5, "catName"),
    VALID_WRITE_ID_LIST((short)6, "validWriteIdList"),
    ENGINE((short)7, "engine");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TBL_NAME
          return TBL_NAME;
        case 3: // COL_NAMES
          return COL_NAMES;
        case 4: // PART_NAMES
          return PART_NAMES;
        case 5: // CAT_NAME
          return CAT_NAME;
        case 6: // VALID_WRITE_ID_LIST
          return VALID_WRITE_ID_LIST;
        case 7: // ENGINE
          return ENGINE;
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
  private static final _Fields optionals[] = {_Fields.CAT_NAME,_Fields.VALID_WRITE_ID_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tblName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COL_NAMES, new org.apache.thrift.meta_data.FieldMetaData("colNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PART_NAMES, new org.apache.thrift.meta_data.FieldMetaData("partNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALID_WRITE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("validWriteIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENGINE, new org.apache.thrift.meta_data.FieldMetaData("engine", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionsStatsRequest.class, metaDataMap);
  }

  public PartitionsStatsRequest() {
  }

  public PartitionsStatsRequest(
    java.lang.String dbName,
    java.lang.String tblName,
    java.util.List<java.lang.String> colNames,
    java.util.List<java.lang.String> partNames,
    java.lang.String engine)
  {
    this();
    this.dbName = dbName;
    this.tblName = tblName;
    this.colNames = colNames;
    this.partNames = partNames;
    this.engine = engine;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionsStatsRequest(PartitionsStatsRequest other) {
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTblName()) {
      this.tblName = other.tblName;
    }
    if (other.isSetColNames()) {
      java.util.List<java.lang.String> __this__colNames = new java.util.ArrayList<java.lang.String>(other.colNames);
      this.colNames = __this__colNames;
    }
    if (other.isSetPartNames()) {
      java.util.List<java.lang.String> __this__partNames = new java.util.ArrayList<java.lang.String>(other.partNames);
      this.partNames = __this__partNames;
    }
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
    if (other.isSetValidWriteIdList()) {
      this.validWriteIdList = other.validWriteIdList;
    }
    if (other.isSetEngine()) {
      this.engine = other.engine;
    }
  }

  @Override
  public PartitionsStatsRequest deepCopy() {
    return new PartitionsStatsRequest(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tblName = null;
    this.colNames = null;
    this.partNames = null;
    this.catName = null;
    this.validWriteIdList = null;
    this.engine = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.dbName;
  }

  public PartitionsStatsRequest setDbName(@org.apache.thrift.annotation.Nullable java.lang.String dbName) {
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
  public java.lang.String getTblName() {
    return this.tblName;
  }

  public PartitionsStatsRequest setTblName(@org.apache.thrift.annotation.Nullable java.lang.String tblName) {
    this.tblName = tblName;
    return this;
  }

  public void unsetTblName() {
    this.tblName = null;
  }

  /** Returns true if field tblName is set (has been assigned a value) and false otherwise */
  public boolean isSetTblName() {
    return this.tblName != null;
  }

  public void setTblNameIsSet(boolean value) {
    if (!value) {
      this.tblName = null;
    }
  }

  public int getColNamesSize() {
    return (this.colNames == null) ? 0 : this.colNames.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getColNamesIterator() {
    return (this.colNames == null) ? null : this.colNames.iterator();
  }

  public void addToColNames(java.lang.String elem) {
    if (this.colNames == null) {
      this.colNames = new java.util.ArrayList<java.lang.String>();
    }
    this.colNames.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getColNames() {
    return this.colNames;
  }

  public PartitionsStatsRequest setColNames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> colNames) {
    this.colNames = colNames;
    return this;
  }

  public void unsetColNames() {
    this.colNames = null;
  }

  /** Returns true if field colNames is set (has been assigned a value) and false otherwise */
  public boolean isSetColNames() {
    return this.colNames != null;
  }

  public void setColNamesIsSet(boolean value) {
    if (!value) {
      this.colNames = null;
    }
  }

  public int getPartNamesSize() {
    return (this.partNames == null) ? 0 : this.partNames.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPartNamesIterator() {
    return (this.partNames == null) ? null : this.partNames.iterator();
  }

  public void addToPartNames(java.lang.String elem) {
    if (this.partNames == null) {
      this.partNames = new java.util.ArrayList<java.lang.String>();
    }
    this.partNames.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPartNames() {
    return this.partNames;
  }

  public PartitionsStatsRequest setPartNames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partNames) {
    this.partNames = partNames;
    return this;
  }

  public void unsetPartNames() {
    this.partNames = null;
  }

  /** Returns true if field partNames is set (has been assigned a value) and false otherwise */
  public boolean isSetPartNames() {
    return this.partNames != null;
  }

  public void setPartNamesIsSet(boolean value) {
    if (!value) {
      this.partNames = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public PartitionsStatsRequest setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
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
  public java.lang.String getValidWriteIdList() {
    return this.validWriteIdList;
  }

  public PartitionsStatsRequest setValidWriteIdList(@org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList) {
    this.validWriteIdList = validWriteIdList;
    return this;
  }

  public void unsetValidWriteIdList() {
    this.validWriteIdList = null;
  }

  /** Returns true if field validWriteIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidWriteIdList() {
    return this.validWriteIdList != null;
  }

  public void setValidWriteIdListIsSet(boolean value) {
    if (!value) {
      this.validWriteIdList = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getEngine() {
    return this.engine;
  }

  public PartitionsStatsRequest setEngine(@org.apache.thrift.annotation.Nullable java.lang.String engine) {
    this.engine = engine;
    return this;
  }

  public void unsetEngine() {
    this.engine = null;
  }

  /** Returns true if field engine is set (has been assigned a value) and false otherwise */
  public boolean isSetEngine() {
    return this.engine != null;
  }

  public void setEngineIsSet(boolean value) {
    if (!value) {
      this.engine = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case TBL_NAME:
      if (value == null) {
        unsetTblName();
      } else {
        setTblName((java.lang.String)value);
      }
      break;

    case COL_NAMES:
      if (value == null) {
        unsetColNames();
      } else {
        setColNames((java.util.List<java.lang.String>)value);
      }
      break;

    case PART_NAMES:
      if (value == null) {
        unsetPartNames();
      } else {
        setPartNames((java.util.List<java.lang.String>)value);
      }
      break;

    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    case VALID_WRITE_ID_LIST:
      if (value == null) {
        unsetValidWriteIdList();
      } else {
        setValidWriteIdList((java.lang.String)value);
      }
      break;

    case ENGINE:
      if (value == null) {
        unsetEngine();
      } else {
        setEngine((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TBL_NAME:
      return getTblName();

    case COL_NAMES:
      return getColNames();

    case PART_NAMES:
      return getPartNames();

    case CAT_NAME:
      return getCatName();

    case VALID_WRITE_ID_LIST:
      return getValidWriteIdList();

    case ENGINE:
      return getEngine();

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
    case DB_NAME:
      return isSetDbName();
    case TBL_NAME:
      return isSetTblName();
    case COL_NAMES:
      return isSetColNames();
    case PART_NAMES:
      return isSetPartNames();
    case CAT_NAME:
      return isSetCatName();
    case VALID_WRITE_ID_LIST:
      return isSetValidWriteIdList();
    case ENGINE:
      return isSetEngine();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PartitionsStatsRequest)
      return this.equals((PartitionsStatsRequest)that);
    return false;
  }

  public boolean equals(PartitionsStatsRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tblName = true && this.isSetTblName();
    boolean that_present_tblName = true && that.isSetTblName();
    if (this_present_tblName || that_present_tblName) {
      if (!(this_present_tblName && that_present_tblName))
        return false;
      if (!this.tblName.equals(that.tblName))
        return false;
    }

    boolean this_present_colNames = true && this.isSetColNames();
    boolean that_present_colNames = true && that.isSetColNames();
    if (this_present_colNames || that_present_colNames) {
      if (!(this_present_colNames && that_present_colNames))
        return false;
      if (!this.colNames.equals(that.colNames))
        return false;
    }

    boolean this_present_partNames = true && this.isSetPartNames();
    boolean that_present_partNames = true && that.isSetPartNames();
    if (this_present_partNames || that_present_partNames) {
      if (!(this_present_partNames && that_present_partNames))
        return false;
      if (!this.partNames.equals(that.partNames))
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

    boolean this_present_validWriteIdList = true && this.isSetValidWriteIdList();
    boolean that_present_validWriteIdList = true && that.isSetValidWriteIdList();
    if (this_present_validWriteIdList || that_present_validWriteIdList) {
      if (!(this_present_validWriteIdList && that_present_validWriteIdList))
        return false;
      if (!this.validWriteIdList.equals(that.validWriteIdList))
        return false;
    }

    boolean this_present_engine = true && this.isSetEngine();
    boolean that_present_engine = true && that.isSetEngine();
    if (this_present_engine || that_present_engine) {
      if (!(this_present_engine && that_present_engine))
        return false;
      if (!this.engine.equals(that.engine))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + dbName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTblName()) ? 131071 : 524287);
    if (isSetTblName())
      hashCode = hashCode * 8191 + tblName.hashCode();

    hashCode = hashCode * 8191 + ((isSetColNames()) ? 131071 : 524287);
    if (isSetColNames())
      hashCode = hashCode * 8191 + colNames.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartNames()) ? 131071 : 524287);
    if (isSetPartNames())
      hashCode = hashCode * 8191 + partNames.hashCode();

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    hashCode = hashCode * 8191 + ((isSetValidWriteIdList()) ? 131071 : 524287);
    if (isSetValidWriteIdList())
      hashCode = hashCode * 8191 + validWriteIdList.hashCode();

    hashCode = hashCode * 8191 + ((isSetEngine()) ? 131071 : 524287);
    if (isSetEngine())
      hashCode = hashCode * 8191 + engine.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PartitionsStatsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.compare(isSetTblName(), other.isSetTblName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblName, other.tblName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetColNames(), other.isSetColNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colNames, other.colNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartNames(), other.isSetPartNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partNames, other.partNames);
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
    lastComparison = java.lang.Boolean.compare(isSetValidWriteIdList(), other.isSetValidWriteIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidWriteIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validWriteIdList, other.validWriteIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEngine(), other.isSetEngine());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEngine()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.engine, other.engine);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PartitionsStatsRequest(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tblName:");
    if (this.tblName == null) {
      sb.append("null");
    } else {
      sb.append(this.tblName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colNames:");
    if (this.colNames == null) {
      sb.append("null");
    } else {
      sb.append(this.colNames);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("partNames:");
    if (this.partNames == null) {
      sb.append("null");
    } else {
      sb.append(this.partNames);
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
    if (isSetValidWriteIdList()) {
      if (!first) sb.append(", ");
      sb.append("validWriteIdList:");
      if (this.validWriteIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.validWriteIdList);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("engine:");
    if (this.engine == null) {
      sb.append("null");
    } else {
      sb.append(this.engine);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (dbName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' was not present! Struct: " + toString());
    }
    if (tblName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tblName' was not present! Struct: " + toString());
    }
    if (colNames == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colNames' was not present! Struct: " + toString());
    }
    if (partNames == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partNames' was not present! Struct: " + toString());
    }
    if (engine == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'engine' was not present! Struct: " + toString());
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

  private static class PartitionsStatsRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PartitionsStatsRequestStandardScheme getScheme() {
      return new PartitionsStatsRequestStandardScheme();
    }
  }

  private static class PartitionsStatsRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<PartitionsStatsRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionsStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tblName = iprot.readString();
              struct.setTblNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COL_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list498 = iprot.readListBegin();
                struct.colNames = new java.util.ArrayList<java.lang.String>(_list498.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem499;
                for (int _i500 = 0; _i500 < _list498.size; ++_i500)
                {
                  _elem499 = iprot.readString();
                  struct.colNames.add(_elem499);
                }
                iprot.readListEnd();
              }
              struct.setColNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PART_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list501 = iprot.readListBegin();
                struct.partNames = new java.util.ArrayList<java.lang.String>(_list501.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem502;
                for (int _i503 = 0; _i503 < _list501.size; ++_i503)
                {
                  _elem502 = iprot.readString();
                  struct.partNames.add(_elem502);
                }
                iprot.readListEnd();
              }
              struct.setPartNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VALID_WRITE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validWriteIdList = iprot.readString();
              struct.setValidWriteIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ENGINE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.engine = iprot.readString();
              struct.setEngineIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionsStatsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tblName != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tblName);
        oprot.writeFieldEnd();
      }
      if (struct.colNames != null) {
        oprot.writeFieldBegin(COL_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.colNames.size()));
          for (java.lang.String _iter504 : struct.colNames)
          {
            oprot.writeString(_iter504);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.partNames != null) {
        oprot.writeFieldBegin(PART_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partNames.size()));
          for (java.lang.String _iter505 : struct.partNames)
          {
            oprot.writeString(_iter505);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.validWriteIdList != null) {
        if (struct.isSetValidWriteIdList()) {
          oprot.writeFieldBegin(VALID_WRITE_ID_LIST_FIELD_DESC);
          oprot.writeString(struct.validWriteIdList);
          oprot.writeFieldEnd();
        }
      }
      if (struct.engine != null) {
        oprot.writeFieldBegin(ENGINE_FIELD_DESC);
        oprot.writeString(struct.engine);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionsStatsRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public PartitionsStatsRequestTupleScheme getScheme() {
      return new PartitionsStatsRequestTupleScheme();
    }
  }

  private static class PartitionsStatsRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<PartitionsStatsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionsStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tblName);
      {
        oprot.writeI32(struct.colNames.size());
        for (java.lang.String _iter506 : struct.colNames)
        {
          oprot.writeString(_iter506);
        }
      }
      {
        oprot.writeI32(struct.partNames.size());
        for (java.lang.String _iter507 : struct.partNames)
        {
          oprot.writeString(_iter507);
        }
      }
      oprot.writeString(struct.engine);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCatName()) {
        optionals.set(0);
      }
      if (struct.isSetValidWriteIdList()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
      if (struct.isSetValidWriteIdList()) {
        oprot.writeString(struct.validWriteIdList);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionsStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tblName = iprot.readString();
      struct.setTblNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list508 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.colNames = new java.util.ArrayList<java.lang.String>(_list508.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem509;
        for (int _i510 = 0; _i510 < _list508.size; ++_i510)
        {
          _elem509 = iprot.readString();
          struct.colNames.add(_elem509);
        }
      }
      struct.setColNamesIsSet(true);
      {
        org.apache.thrift.protocol.TList _list511 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
        struct.partNames = new java.util.ArrayList<java.lang.String>(_list511.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem512;
        for (int _i513 = 0; _i513 < _list511.size; ++_i513)
        {
          _elem512 = iprot.readString();
          struct.partNames.add(_elem512);
        }
      }
      struct.setPartNamesIsSet(true);
      struct.engine = iprot.readString();
      struct.setEngineIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.validWriteIdList = iprot.readString();
        struct.setValidWriteIdListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

