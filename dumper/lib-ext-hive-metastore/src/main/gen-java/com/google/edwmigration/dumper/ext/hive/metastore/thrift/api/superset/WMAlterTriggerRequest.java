/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class WMAlterTriggerRequest implements org.apache.thrift.TBase<WMAlterTriggerRequest, WMAlterTriggerRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WMAlterTriggerRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMAlterTriggerRequest");

  private static final org.apache.thrift.protocol.TField TRIGGER_FIELD_DESC = new org.apache.thrift.protocol.TField("trigger", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMAlterTriggerRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMAlterTriggerRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable WMTrigger trigger; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRIGGER((short)1, "trigger");

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
        case 1: // TRIGGER
          return TRIGGER;
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
  private static final _Fields optionals[] = {_Fields.TRIGGER};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRIGGER, new org.apache.thrift.meta_data.FieldMetaData("trigger", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WMTrigger.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMAlterTriggerRequest.class, metaDataMap);
  }

  public WMAlterTriggerRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMAlterTriggerRequest(WMAlterTriggerRequest other) {
    if (other.isSetTrigger()) {
      this.trigger = new WMTrigger(other.trigger);
    }
  }

  @Override
  public WMAlterTriggerRequest deepCopy() {
    return new WMAlterTriggerRequest(this);
  }

  @Override
  public void clear() {
    this.trigger = null;
  }

  @org.apache.thrift.annotation.Nullable
  public WMTrigger getTrigger() {
    return this.trigger;
  }

  public WMAlterTriggerRequest setTrigger(@org.apache.thrift.annotation.Nullable WMTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  public void unsetTrigger() {
    this.trigger = null;
  }

  /** Returns true if field trigger is set (has been assigned a value) and false otherwise */
  public boolean isSetTrigger() {
    return this.trigger != null;
  }

  public void setTriggerIsSet(boolean value) {
    if (!value) {
      this.trigger = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TRIGGER:
      if (value == null) {
        unsetTrigger();
      } else {
        setTrigger((WMTrigger)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TRIGGER:
      return getTrigger();

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
    case TRIGGER:
      return isSetTrigger();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof WMAlterTriggerRequest)
      return this.equals((WMAlterTriggerRequest)that);
    return false;
  }

  public boolean equals(WMAlterTriggerRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_trigger = true && this.isSetTrigger();
    boolean that_present_trigger = true && that.isSetTrigger();
    if (this_present_trigger || that_present_trigger) {
      if (!(this_present_trigger && that_present_trigger))
        return false;
      if (!this.trigger.equals(that.trigger))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTrigger()) ? 131071 : 524287);
    if (isSetTrigger())
      hashCode = hashCode * 8191 + trigger.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMAlterTriggerRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTrigger(), other.isSetTrigger());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrigger()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trigger, other.trigger);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMAlterTriggerRequest(");
    boolean first = true;

    if (isSetTrigger()) {
      sb.append("trigger:");
      if (this.trigger == null) {
        sb.append("null");
      } else {
        sb.append(this.trigger);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (trigger != null) {
      trigger.validate();
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

  private static class WMAlterTriggerRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMAlterTriggerRequestStandardScheme getScheme() {
      return new WMAlterTriggerRequestStandardScheme();
    }
  }

  private static class WMAlterTriggerRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMAlterTriggerRequest> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, WMAlterTriggerRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRIGGER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.trigger = new WMTrigger();
              struct.trigger.read(iprot);
              struct.setTriggerIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, WMAlterTriggerRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.trigger != null) {
        if (struct.isSetTrigger()) {
          oprot.writeFieldBegin(TRIGGER_FIELD_DESC);
          struct.trigger.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMAlterTriggerRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMAlterTriggerRequestTupleScheme getScheme() {
      return new WMAlterTriggerRequestTupleScheme();
    }
  }

  private static class WMAlterTriggerRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMAlterTriggerRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMAlterTriggerRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTrigger()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTrigger()) {
        struct.trigger.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMAlterTriggerRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.trigger = new WMTrigger();
        struct.trigger.read(iprot);
        struct.setTriggerIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
