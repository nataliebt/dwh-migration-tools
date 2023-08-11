/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class MapSchemaVersionToSerdeRequest implements org.apache.thrift.TBase<MapSchemaVersionToSerdeRequest, MapSchemaVersionToSerdeRequest._Fields>, java.io.Serializable, Cloneable, Comparable<MapSchemaVersionToSerdeRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MapSchemaVersionToSerdeRequest");

  private static final org.apache.thrift.protocol.TField SCHEMA_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("schemaVersion", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SERDE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serdeName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MapSchemaVersionToSerdeRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MapSchemaVersionToSerdeRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable SchemaVersionDescriptor schemaVersion; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String serdeName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SCHEMA_VERSION((short)1, "schemaVersion"),
    SERDE_NAME((short)2, "serdeName");

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
        case 1: // SCHEMA_VERSION
          return SCHEMA_VERSION;
        case 2: // SERDE_NAME
          return SERDE_NAME;
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
    tmpMap.put(_Fields.SCHEMA_VERSION, new org.apache.thrift.meta_data.FieldMetaData("schemaVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SchemaVersionDescriptor.class)));
    tmpMap.put(_Fields.SERDE_NAME, new org.apache.thrift.meta_data.FieldMetaData("serdeName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MapSchemaVersionToSerdeRequest.class, metaDataMap);
  }

  public MapSchemaVersionToSerdeRequest() {
  }

  public MapSchemaVersionToSerdeRequest(
    SchemaVersionDescriptor schemaVersion,
    java.lang.String serdeName)
  {
    this();
    this.schemaVersion = schemaVersion;
    this.serdeName = serdeName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MapSchemaVersionToSerdeRequest(MapSchemaVersionToSerdeRequest other) {
    if (other.isSetSchemaVersion()) {
      this.schemaVersion = new SchemaVersionDescriptor(other.schemaVersion);
    }
    if (other.isSetSerdeName()) {
      this.serdeName = other.serdeName;
    }
  }

  @Override
  public MapSchemaVersionToSerdeRequest deepCopy() {
    return new MapSchemaVersionToSerdeRequest(this);
  }

  @Override
  public void clear() {
    this.schemaVersion = null;
    this.serdeName = null;
  }

  @org.apache.thrift.annotation.Nullable
  public SchemaVersionDescriptor getSchemaVersion() {
    return this.schemaVersion;
  }

  public MapSchemaVersionToSerdeRequest setSchemaVersion(@org.apache.thrift.annotation.Nullable SchemaVersionDescriptor schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  public void unsetSchemaVersion() {
    this.schemaVersion = null;
  }

  /** Returns true if field schemaVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetSchemaVersion() {
    return this.schemaVersion != null;
  }

  public void setSchemaVersionIsSet(boolean value) {
    if (!value) {
      this.schemaVersion = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSerdeName() {
    return this.serdeName;
  }

  public MapSchemaVersionToSerdeRequest setSerdeName(@org.apache.thrift.annotation.Nullable java.lang.String serdeName) {
    this.serdeName = serdeName;
    return this;
  }

  public void unsetSerdeName() {
    this.serdeName = null;
  }

  /** Returns true if field serdeName is set (has been assigned a value) and false otherwise */
  public boolean isSetSerdeName() {
    return this.serdeName != null;
  }

  public void setSerdeNameIsSet(boolean value) {
    if (!value) {
      this.serdeName = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SCHEMA_VERSION:
      if (value == null) {
        unsetSchemaVersion();
      } else {
        setSchemaVersion((SchemaVersionDescriptor)value);
      }
      break;

    case SERDE_NAME:
      if (value == null) {
        unsetSerdeName();
      } else {
        setSerdeName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SCHEMA_VERSION:
      return getSchemaVersion();

    case SERDE_NAME:
      return getSerdeName();

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
    case SCHEMA_VERSION:
      return isSetSchemaVersion();
    case SERDE_NAME:
      return isSetSerdeName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof MapSchemaVersionToSerdeRequest)
      return this.equals((MapSchemaVersionToSerdeRequest)that);
    return false;
  }

  public boolean equals(MapSchemaVersionToSerdeRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_schemaVersion = true && this.isSetSchemaVersion();
    boolean that_present_schemaVersion = true && that.isSetSchemaVersion();
    if (this_present_schemaVersion || that_present_schemaVersion) {
      if (!(this_present_schemaVersion && that_present_schemaVersion))
        return false;
      if (!this.schemaVersion.equals(that.schemaVersion))
        return false;
    }

    boolean this_present_serdeName = true && this.isSetSerdeName();
    boolean that_present_serdeName = true && that.isSetSerdeName();
    if (this_present_serdeName || that_present_serdeName) {
      if (!(this_present_serdeName && that_present_serdeName))
        return false;
      if (!this.serdeName.equals(that.serdeName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSchemaVersion()) ? 131071 : 524287);
    if (isSetSchemaVersion())
      hashCode = hashCode * 8191 + schemaVersion.hashCode();

    hashCode = hashCode * 8191 + ((isSetSerdeName()) ? 131071 : 524287);
    if (isSetSerdeName())
      hashCode = hashCode * 8191 + serdeName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MapSchemaVersionToSerdeRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetSchemaVersion(), other.isSetSchemaVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchemaVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schemaVersion, other.schemaVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSerdeName(), other.isSetSerdeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSerdeName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serdeName, other.serdeName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MapSchemaVersionToSerdeRequest(");
    boolean first = true;

    sb.append("schemaVersion:");
    if (this.schemaVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.schemaVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serdeName:");
    if (this.serdeName == null) {
      sb.append("null");
    } else {
      sb.append(this.serdeName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (schemaVersion != null) {
      schemaVersion.validate();
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

  private static class MapSchemaVersionToSerdeRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public MapSchemaVersionToSerdeRequestStandardScheme getScheme() {
      return new MapSchemaVersionToSerdeRequestStandardScheme();
    }
  }

  private static class MapSchemaVersionToSerdeRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<MapSchemaVersionToSerdeRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, MapSchemaVersionToSerdeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SCHEMA_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.schemaVersion = new SchemaVersionDescriptor();
              struct.schemaVersion.read(iprot);
              struct.setSchemaVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERDE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serdeName = iprot.readString();
              struct.setSerdeNameIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, MapSchemaVersionToSerdeRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.schemaVersion != null) {
        oprot.writeFieldBegin(SCHEMA_VERSION_FIELD_DESC);
        struct.schemaVersion.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.serdeName != null) {
        oprot.writeFieldBegin(SERDE_NAME_FIELD_DESC);
        oprot.writeString(struct.serdeName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MapSchemaVersionToSerdeRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public MapSchemaVersionToSerdeRequestTupleScheme getScheme() {
      return new MapSchemaVersionToSerdeRequestTupleScheme();
    }
  }

  private static class MapSchemaVersionToSerdeRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<MapSchemaVersionToSerdeRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MapSchemaVersionToSerdeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSchemaVersion()) {
        optionals.set(0);
      }
      if (struct.isSetSerdeName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSchemaVersion()) {
        struct.schemaVersion.write(oprot);
      }
      if (struct.isSetSerdeName()) {
        oprot.writeString(struct.serdeName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MapSchemaVersionToSerdeRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.schemaVersion = new SchemaVersionDescriptor();
        struct.schemaVersion.read(iprot);
        struct.setSchemaVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.serdeName = iprot.readString();
        struct.setSerdeNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

