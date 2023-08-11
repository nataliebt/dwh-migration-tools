/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class GetFileMetadataByExprRequest implements org.apache.thrift.TBase<GetFileMetadataByExprRequest, GetFileMetadataByExprRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetFileMetadataByExprRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetFileMetadataByExprRequest");

  private static final org.apache.thrift.protocol.TField FILE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fileIds", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("expr", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DO_GET_FOOTERS_FIELD_DESC = new org.apache.thrift.protocol.TField("doGetFooters", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetFileMetadataByExprRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetFileMetadataByExprRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> fileIds; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer expr; // required
  public boolean doGetFooters; // optional
  /**
   * 
   * @see FileMetadataExprType
   */
  public @org.apache.thrift.annotation.Nullable FileMetadataExprType type; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILE_IDS((short)1, "fileIds"),
    EXPR((short)2, "expr"),
    DO_GET_FOOTERS((short)3, "doGetFooters"),
    /**
     * 
     * @see FileMetadataExprType
     */
    TYPE((short)4, "type");

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
        case 1: // FILE_IDS
          return FILE_IDS;
        case 2: // EXPR
          return EXPR;
        case 3: // DO_GET_FOOTERS
          return DO_GET_FOOTERS;
        case 4: // TYPE
          return TYPE;
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
  private static final int __DOGETFOOTERS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DO_GET_FOOTERS,_Fields.TYPE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_IDS, new org.apache.thrift.meta_data.FieldMetaData("fileIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.EXPR, new org.apache.thrift.meta_data.FieldMetaData("expr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.DO_GET_FOOTERS, new org.apache.thrift.meta_data.FieldMetaData("doGetFooters", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FileMetadataExprType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetFileMetadataByExprRequest.class, metaDataMap);
  }

  public GetFileMetadataByExprRequest() {
  }

  public GetFileMetadataByExprRequest(
    java.util.List<java.lang.Long> fileIds,
    java.nio.ByteBuffer expr)
  {
    this();
    this.fileIds = fileIds;
    this.expr = org.apache.thrift.TBaseHelper.copyBinary(expr);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetFileMetadataByExprRequest(GetFileMetadataByExprRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFileIds()) {
      java.util.List<java.lang.Long> __this__fileIds = new java.util.ArrayList<java.lang.Long>(other.fileIds);
      this.fileIds = __this__fileIds;
    }
    if (other.isSetExpr()) {
      this.expr = org.apache.thrift.TBaseHelper.copyBinary(other.expr);
    }
    this.doGetFooters = other.doGetFooters;
    if (other.isSetType()) {
      this.type = other.type;
    }
  }

  @Override
  public GetFileMetadataByExprRequest deepCopy() {
    return new GetFileMetadataByExprRequest(this);
  }

  @Override
  public void clear() {
    this.fileIds = null;
    this.expr = null;
    setDoGetFootersIsSet(false);
    this.doGetFooters = false;
    this.type = null;
  }

  public int getFileIdsSize() {
    return (this.fileIds == null) ? 0 : this.fileIds.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.Long> getFileIdsIterator() {
    return (this.fileIds == null) ? null : this.fileIds.iterator();
  }

  public void addToFileIds(long elem) {
    if (this.fileIds == null) {
      this.fileIds = new java.util.ArrayList<java.lang.Long>();
    }
    this.fileIds.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.Long> getFileIds() {
    return this.fileIds;
  }

  public GetFileMetadataByExprRequest setFileIds(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.Long> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public void unsetFileIds() {
    this.fileIds = null;
  }

  /** Returns true if field fileIds is set (has been assigned a value) and false otherwise */
  public boolean isSetFileIds() {
    return this.fileIds != null;
  }

  public void setFileIdsIsSet(boolean value) {
    if (!value) {
      this.fileIds = null;
    }
  }

  public byte[] getExpr() {
    setExpr(org.apache.thrift.TBaseHelper.rightSize(expr));
    return expr == null ? null : expr.array();
  }

  public java.nio.ByteBuffer bufferForExpr() {
    return org.apache.thrift.TBaseHelper.copyBinary(expr);
  }

  public GetFileMetadataByExprRequest setExpr(byte[] expr) {
    this.expr = expr == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(expr.clone());
    return this;
  }

  public GetFileMetadataByExprRequest setExpr(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer expr) {
    this.expr = org.apache.thrift.TBaseHelper.copyBinary(expr);
    return this;
  }

  public void unsetExpr() {
    this.expr = null;
  }

  /** Returns true if field expr is set (has been assigned a value) and false otherwise */
  public boolean isSetExpr() {
    return this.expr != null;
  }

  public void setExprIsSet(boolean value) {
    if (!value) {
      this.expr = null;
    }
  }

  public boolean isDoGetFooters() {
    return this.doGetFooters;
  }

  public GetFileMetadataByExprRequest setDoGetFooters(boolean doGetFooters) {
    this.doGetFooters = doGetFooters;
    setDoGetFootersIsSet(true);
    return this;
  }

  public void unsetDoGetFooters() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DOGETFOOTERS_ISSET_ID);
  }

  /** Returns true if field doGetFooters is set (has been assigned a value) and false otherwise */
  public boolean isSetDoGetFooters() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DOGETFOOTERS_ISSET_ID);
  }

  public void setDoGetFootersIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DOGETFOOTERS_ISSET_ID, value);
  }

  /**
   * 
   * @see FileMetadataExprType
   */
  @org.apache.thrift.annotation.Nullable
  public FileMetadataExprType getType() {
    return this.type;
  }

  /**
   * 
   * @see FileMetadataExprType
   */
  public GetFileMetadataByExprRequest setType(@org.apache.thrift.annotation.Nullable FileMetadataExprType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case FILE_IDS:
      if (value == null) {
        unsetFileIds();
      } else {
        setFileIds((java.util.List<java.lang.Long>)value);
      }
      break;

    case EXPR:
      if (value == null) {
        unsetExpr();
      } else {
        if (value instanceof byte[]) {
          setExpr((byte[])value);
        } else {
          setExpr((java.nio.ByteBuffer)value);
        }
      }
      break;

    case DO_GET_FOOTERS:
      if (value == null) {
        unsetDoGetFooters();
      } else {
        setDoGetFooters((java.lang.Boolean)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((FileMetadataExprType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_IDS:
      return getFileIds();

    case EXPR:
      return getExpr();

    case DO_GET_FOOTERS:
      return isDoGetFooters();

    case TYPE:
      return getType();

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
    case FILE_IDS:
      return isSetFileIds();
    case EXPR:
      return isSetExpr();
    case DO_GET_FOOTERS:
      return isSetDoGetFooters();
    case TYPE:
      return isSetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof GetFileMetadataByExprRequest)
      return this.equals((GetFileMetadataByExprRequest)that);
    return false;
  }

  public boolean equals(GetFileMetadataByExprRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_fileIds = true && this.isSetFileIds();
    boolean that_present_fileIds = true && that.isSetFileIds();
    if (this_present_fileIds || that_present_fileIds) {
      if (!(this_present_fileIds && that_present_fileIds))
        return false;
      if (!this.fileIds.equals(that.fileIds))
        return false;
    }

    boolean this_present_expr = true && this.isSetExpr();
    boolean that_present_expr = true && that.isSetExpr();
    if (this_present_expr || that_present_expr) {
      if (!(this_present_expr && that_present_expr))
        return false;
      if (!this.expr.equals(that.expr))
        return false;
    }

    boolean this_present_doGetFooters = true && this.isSetDoGetFooters();
    boolean that_present_doGetFooters = true && that.isSetDoGetFooters();
    if (this_present_doGetFooters || that_present_doGetFooters) {
      if (!(this_present_doGetFooters && that_present_doGetFooters))
        return false;
      if (this.doGetFooters != that.doGetFooters)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetFileIds()) ? 131071 : 524287);
    if (isSetFileIds())
      hashCode = hashCode * 8191 + fileIds.hashCode();

    hashCode = hashCode * 8191 + ((isSetExpr()) ? 131071 : 524287);
    if (isSetExpr())
      hashCode = hashCode * 8191 + expr.hashCode();

    hashCode = hashCode * 8191 + ((isSetDoGetFooters()) ? 131071 : 524287);
    if (isSetDoGetFooters())
      hashCode = hashCode * 8191 + ((doGetFooters) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(GetFileMetadataByExprRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetFileIds(), other.isSetFileIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileIds, other.fileIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetExpr(), other.isSetExpr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expr, other.expr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDoGetFooters(), other.isSetDoGetFooters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDoGetFooters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.doGetFooters, other.doGetFooters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetFileMetadataByExprRequest(");
    boolean first = true;

    sb.append("fileIds:");
    if (this.fileIds == null) {
      sb.append("null");
    } else {
      sb.append(this.fileIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expr:");
    if (this.expr == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.expr, sb);
    }
    first = false;
    if (isSetDoGetFooters()) {
      if (!first) sb.append(", ");
      sb.append("doGetFooters:");
      sb.append(this.doGetFooters);
      first = false;
    }
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (fileIds == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fileIds' was not present! Struct: " + toString());
    }
    if (expr == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'expr' was not present! Struct: " + toString());
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

  private static class GetFileMetadataByExprRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public GetFileMetadataByExprRequestStandardScheme getScheme() {
      return new GetFileMetadataByExprRequestStandardScheme();
    }
  }

  private static class GetFileMetadataByExprRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetFileMetadataByExprRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, GetFileMetadataByExprRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list878 = iprot.readListBegin();
                struct.fileIds = new java.util.ArrayList<java.lang.Long>(_list878.size);
                long _elem879;
                for (int _i880 = 0; _i880 < _list878.size; ++_i880)
                {
                  _elem879 = iprot.readI64();
                  struct.fileIds.add(_elem879);
                }
                iprot.readListEnd();
              }
              struct.setFileIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.expr = iprot.readBinary();
              struct.setExprIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DO_GET_FOOTERS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.doGetFooters = iprot.readBool();
              struct.setDoGetFootersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.FileMetadataExprType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, GetFileMetadataByExprRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fileIds != null) {
        oprot.writeFieldBegin(FILE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.fileIds.size()));
          for (long _iter881 : struct.fileIds)
          {
            oprot.writeI64(_iter881);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.expr != null) {
        oprot.writeFieldBegin(EXPR_FIELD_DESC);
        oprot.writeBinary(struct.expr);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDoGetFooters()) {
        oprot.writeFieldBegin(DO_GET_FOOTERS_FIELD_DESC);
        oprot.writeBool(struct.doGetFooters);
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetFileMetadataByExprRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public GetFileMetadataByExprRequestTupleScheme getScheme() {
      return new GetFileMetadataByExprRequestTupleScheme();
    }
  }

  private static class GetFileMetadataByExprRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetFileMetadataByExprRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetFileMetadataByExprRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.fileIds.size());
        for (long _iter882 : struct.fileIds)
        {
          oprot.writeI64(_iter882);
        }
      }
      oprot.writeBinary(struct.expr);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDoGetFooters()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDoGetFooters()) {
        oprot.writeBool(struct.doGetFooters);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetFileMetadataByExprRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list883 = iprot.readListBegin(org.apache.thrift.protocol.TType.I64);
        struct.fileIds = new java.util.ArrayList<java.lang.Long>(_list883.size);
        long _elem884;
        for (int _i885 = 0; _i885 < _list883.size; ++_i885)
        {
          _elem884 = iprot.readI64();
          struct.fileIds.add(_elem884);
        }
      }
      struct.setFileIdsIsSet(true);
      struct.expr = iprot.readBinary();
      struct.setExprIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.doGetFooters = iprot.readBool();
        struct.setDoGetFootersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset.FileMetadataExprType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

