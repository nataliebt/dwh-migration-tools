/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public class WMNullablePool implements org.apache.thrift.TBase<WMNullablePool, WMNullablePool._Fields>, java.io.Serializable, Cloneable, Comparable<WMNullablePool> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMNullablePool");

  private static final org.apache.thrift.protocol.TField RESOURCE_PLAN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlanName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField POOL_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("poolPath", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ALLOC_FRACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("allocFraction", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_PARALLELISM_FIELD_DESC = new org.apache.thrift.protocol.TField("queryParallelism", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SCHEDULING_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("schedulingPolicy", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField IS_SET_SCHEDULING_POLICY_FIELD_DESC = new org.apache.thrift.protocol.TField("isSetSchedulingPolicy", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField NS_FIELD_DESC = new org.apache.thrift.protocol.TField("ns", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new WMNullablePoolStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new WMNullablePoolTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String resourcePlanName; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String poolPath; // required
  public double allocFraction; // optional
  public int queryParallelism; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String schedulingPolicy; // optional
  public boolean isSetSchedulingPolicy; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String ns; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_PLAN_NAME((short)1, "resourcePlanName"),
    POOL_PATH((short)2, "poolPath"),
    ALLOC_FRACTION((short)3, "allocFraction"),
    QUERY_PARALLELISM((short)4, "queryParallelism"),
    SCHEDULING_POLICY((short)5, "schedulingPolicy"),
    IS_SET_SCHEDULING_POLICY((short)6, "isSetSchedulingPolicy"),
    NS((short)7, "ns");

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
        case 1: // RESOURCE_PLAN_NAME
          return RESOURCE_PLAN_NAME;
        case 2: // POOL_PATH
          return POOL_PATH;
        case 3: // ALLOC_FRACTION
          return ALLOC_FRACTION;
        case 4: // QUERY_PARALLELISM
          return QUERY_PARALLELISM;
        case 5: // SCHEDULING_POLICY
          return SCHEDULING_POLICY;
        case 6: // IS_SET_SCHEDULING_POLICY
          return IS_SET_SCHEDULING_POLICY;
        case 7: // NS
          return NS;
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
  private static final int __ALLOCFRACTION_ISSET_ID = 0;
  private static final int __QUERYPARALLELISM_ISSET_ID = 1;
  private static final int __ISSETSCHEDULINGPOLICY_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ALLOC_FRACTION,_Fields.QUERY_PARALLELISM,_Fields.SCHEDULING_POLICY,_Fields.IS_SET_SCHEDULING_POLICY,_Fields.NS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_PLAN_NAME, new org.apache.thrift.meta_data.FieldMetaData("resourcePlanName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POOL_PATH, new org.apache.thrift.meta_data.FieldMetaData("poolPath", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALLOC_FRACTION, new org.apache.thrift.meta_data.FieldMetaData("allocFraction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.QUERY_PARALLELISM, new org.apache.thrift.meta_data.FieldMetaData("queryParallelism", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCHEDULING_POLICY, new org.apache.thrift.meta_data.FieldMetaData("schedulingPolicy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_SET_SCHEDULING_POLICY, new org.apache.thrift.meta_data.FieldMetaData("isSetSchedulingPolicy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NS, new org.apache.thrift.meta_data.FieldMetaData("ns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMNullablePool.class, metaDataMap);
  }

  public WMNullablePool() {
  }

  public WMNullablePool(
    java.lang.String resourcePlanName,
    java.lang.String poolPath)
  {
    this();
    this.resourcePlanName = resourcePlanName;
    this.poolPath = poolPath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMNullablePool(WMNullablePool other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResourcePlanName()) {
      this.resourcePlanName = other.resourcePlanName;
    }
    if (other.isSetPoolPath()) {
      this.poolPath = other.poolPath;
    }
    this.allocFraction = other.allocFraction;
    this.queryParallelism = other.queryParallelism;
    if (other.isSetSchedulingPolicy()) {
      this.schedulingPolicy = other.schedulingPolicy;
    }
    this.isSetSchedulingPolicy = other.isSetSchedulingPolicy;
    if (other.isSetNs()) {
      this.ns = other.ns;
    }
  }

  @Override
  public WMNullablePool deepCopy() {
    return new WMNullablePool(this);
  }

  @Override
  public void clear() {
    this.resourcePlanName = null;
    this.poolPath = null;
    setAllocFractionIsSet(false);
    this.allocFraction = 0.0;
    setQueryParallelismIsSet(false);
    this.queryParallelism = 0;
    this.schedulingPolicy = null;
    setIsSetSchedulingPolicyIsSet(false);
    this.isSetSchedulingPolicy = false;
    this.ns = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getResourcePlanName() {
    return this.resourcePlanName;
  }

  public WMNullablePool setResourcePlanName(@org.apache.thrift.annotation.Nullable java.lang.String resourcePlanName) {
    this.resourcePlanName = resourcePlanName;
    return this;
  }

  public void unsetResourcePlanName() {
    this.resourcePlanName = null;
  }

  /** Returns true if field resourcePlanName is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlanName() {
    return this.resourcePlanName != null;
  }

  public void setResourcePlanNameIsSet(boolean value) {
    if (!value) {
      this.resourcePlanName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPoolPath() {
    return this.poolPath;
  }

  public WMNullablePool setPoolPath(@org.apache.thrift.annotation.Nullable java.lang.String poolPath) {
    this.poolPath = poolPath;
    return this;
  }

  public void unsetPoolPath() {
    this.poolPath = null;
  }

  /** Returns true if field poolPath is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolPath() {
    return this.poolPath != null;
  }

  public void setPoolPathIsSet(boolean value) {
    if (!value) {
      this.poolPath = null;
    }
  }

  public double getAllocFraction() {
    return this.allocFraction;
  }

  public WMNullablePool setAllocFraction(double allocFraction) {
    this.allocFraction = allocFraction;
    setAllocFractionIsSet(true);
    return this;
  }

  public void unsetAllocFraction() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALLOCFRACTION_ISSET_ID);
  }

  /** Returns true if field allocFraction is set (has been assigned a value) and false otherwise */
  public boolean isSetAllocFraction() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALLOCFRACTION_ISSET_ID);
  }

  public void setAllocFractionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALLOCFRACTION_ISSET_ID, value);
  }

  public int getQueryParallelism() {
    return this.queryParallelism;
  }

  public WMNullablePool setQueryParallelism(int queryParallelism) {
    this.queryParallelism = queryParallelism;
    setQueryParallelismIsSet(true);
    return this;
  }

  public void unsetQueryParallelism() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __QUERYPARALLELISM_ISSET_ID);
  }

  /** Returns true if field queryParallelism is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryParallelism() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __QUERYPARALLELISM_ISSET_ID);
  }

  public void setQueryParallelismIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __QUERYPARALLELISM_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getSchedulingPolicy() {
    return this.schedulingPolicy;
  }

  public WMNullablePool setSchedulingPolicy(@org.apache.thrift.annotation.Nullable java.lang.String schedulingPolicy) {
    this.schedulingPolicy = schedulingPolicy;
    return this;
  }

  public void unsetSchedulingPolicy() {
    this.schedulingPolicy = null;
  }

  /** Returns true if field schedulingPolicy is set (has been assigned a value) and false otherwise */
  public boolean isSetSchedulingPolicy() {
    return this.schedulingPolicy != null;
  }

  public void setSchedulingPolicyIsSet(boolean value) {
    if (!value) {
      this.schedulingPolicy = null;
    }
  }

  public boolean isIsSetSchedulingPolicy() {
    return this.isSetSchedulingPolicy;
  }

  public WMNullablePool setIsSetSchedulingPolicy(boolean isSetSchedulingPolicy) {
    this.isSetSchedulingPolicy = isSetSchedulingPolicy;
    setIsSetSchedulingPolicyIsSet(true);
    return this;
  }

  public void unsetIsSetSchedulingPolicy() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISSETSCHEDULINGPOLICY_ISSET_ID);
  }

  /** Returns true if field isSetSchedulingPolicy is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSetSchedulingPolicy() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISSETSCHEDULINGPOLICY_ISSET_ID);
  }

  public void setIsSetSchedulingPolicyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISSETSCHEDULINGPOLICY_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNs() {
    return this.ns;
  }

  public WMNullablePool setNs(@org.apache.thrift.annotation.Nullable java.lang.String ns) {
    this.ns = ns;
    return this;
  }

  public void unsetNs() {
    this.ns = null;
  }

  /** Returns true if field ns is set (has been assigned a value) and false otherwise */
  public boolean isSetNs() {
    return this.ns != null;
  }

  public void setNsIsSet(boolean value) {
    if (!value) {
      this.ns = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RESOURCE_PLAN_NAME:
      if (value == null) {
        unsetResourcePlanName();
      } else {
        setResourcePlanName((java.lang.String)value);
      }
      break;

    case POOL_PATH:
      if (value == null) {
        unsetPoolPath();
      } else {
        setPoolPath((java.lang.String)value);
      }
      break;

    case ALLOC_FRACTION:
      if (value == null) {
        unsetAllocFraction();
      } else {
        setAllocFraction((java.lang.Double)value);
      }
      break;

    case QUERY_PARALLELISM:
      if (value == null) {
        unsetQueryParallelism();
      } else {
        setQueryParallelism((java.lang.Integer)value);
      }
      break;

    case SCHEDULING_POLICY:
      if (value == null) {
        unsetSchedulingPolicy();
      } else {
        setSchedulingPolicy((java.lang.String)value);
      }
      break;

    case IS_SET_SCHEDULING_POLICY:
      if (value == null) {
        unsetIsSetSchedulingPolicy();
      } else {
        setIsSetSchedulingPolicy((java.lang.Boolean)value);
      }
      break;

    case NS:
      if (value == null) {
        unsetNs();
      } else {
        setNs((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_PLAN_NAME:
      return getResourcePlanName();

    case POOL_PATH:
      return getPoolPath();

    case ALLOC_FRACTION:
      return getAllocFraction();

    case QUERY_PARALLELISM:
      return getQueryParallelism();

    case SCHEDULING_POLICY:
      return getSchedulingPolicy();

    case IS_SET_SCHEDULING_POLICY:
      return isIsSetSchedulingPolicy();

    case NS:
      return getNs();

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
    case RESOURCE_PLAN_NAME:
      return isSetResourcePlanName();
    case POOL_PATH:
      return isSetPoolPath();
    case ALLOC_FRACTION:
      return isSetAllocFraction();
    case QUERY_PARALLELISM:
      return isSetQueryParallelism();
    case SCHEDULING_POLICY:
      return isSetSchedulingPolicy();
    case IS_SET_SCHEDULING_POLICY:
      return isSetIsSetSchedulingPolicy();
    case NS:
      return isSetNs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof WMNullablePool)
      return this.equals((WMNullablePool)that);
    return false;
  }

  public boolean equals(WMNullablePool that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_resourcePlanName = true && this.isSetResourcePlanName();
    boolean that_present_resourcePlanName = true && that.isSetResourcePlanName();
    if (this_present_resourcePlanName || that_present_resourcePlanName) {
      if (!(this_present_resourcePlanName && that_present_resourcePlanName))
        return false;
      if (!this.resourcePlanName.equals(that.resourcePlanName))
        return false;
    }

    boolean this_present_poolPath = true && this.isSetPoolPath();
    boolean that_present_poolPath = true && that.isSetPoolPath();
    if (this_present_poolPath || that_present_poolPath) {
      if (!(this_present_poolPath && that_present_poolPath))
        return false;
      if (!this.poolPath.equals(that.poolPath))
        return false;
    }

    boolean this_present_allocFraction = true && this.isSetAllocFraction();
    boolean that_present_allocFraction = true && that.isSetAllocFraction();
    if (this_present_allocFraction || that_present_allocFraction) {
      if (!(this_present_allocFraction && that_present_allocFraction))
        return false;
      if (this.allocFraction != that.allocFraction)
        return false;
    }

    boolean this_present_queryParallelism = true && this.isSetQueryParallelism();
    boolean that_present_queryParallelism = true && that.isSetQueryParallelism();
    if (this_present_queryParallelism || that_present_queryParallelism) {
      if (!(this_present_queryParallelism && that_present_queryParallelism))
        return false;
      if (this.queryParallelism != that.queryParallelism)
        return false;
    }

    boolean this_present_schedulingPolicy = true && this.isSetSchedulingPolicy();
    boolean that_present_schedulingPolicy = true && that.isSetSchedulingPolicy();
    if (this_present_schedulingPolicy || that_present_schedulingPolicy) {
      if (!(this_present_schedulingPolicy && that_present_schedulingPolicy))
        return false;
      if (!this.schedulingPolicy.equals(that.schedulingPolicy))
        return false;
    }

    boolean this_present_isSetSchedulingPolicy = true && this.isSetIsSetSchedulingPolicy();
    boolean that_present_isSetSchedulingPolicy = true && that.isSetIsSetSchedulingPolicy();
    if (this_present_isSetSchedulingPolicy || that_present_isSetSchedulingPolicy) {
      if (!(this_present_isSetSchedulingPolicy && that_present_isSetSchedulingPolicy))
        return false;
      if (this.isSetSchedulingPolicy != that.isSetSchedulingPolicy)
        return false;
    }

    boolean this_present_ns = true && this.isSetNs();
    boolean that_present_ns = true && that.isSetNs();
    if (this_present_ns || that_present_ns) {
      if (!(this_present_ns && that_present_ns))
        return false;
      if (!this.ns.equals(that.ns))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetResourcePlanName()) ? 131071 : 524287);
    if (isSetResourcePlanName())
      hashCode = hashCode * 8191 + resourcePlanName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPoolPath()) ? 131071 : 524287);
    if (isSetPoolPath())
      hashCode = hashCode * 8191 + poolPath.hashCode();

    hashCode = hashCode * 8191 + ((isSetAllocFraction()) ? 131071 : 524287);
    if (isSetAllocFraction())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(allocFraction);

    hashCode = hashCode * 8191 + ((isSetQueryParallelism()) ? 131071 : 524287);
    if (isSetQueryParallelism())
      hashCode = hashCode * 8191 + queryParallelism;

    hashCode = hashCode * 8191 + ((isSetSchedulingPolicy()) ? 131071 : 524287);
    if (isSetSchedulingPolicy())
      hashCode = hashCode * 8191 + schedulingPolicy.hashCode();

    hashCode = hashCode * 8191 + ((isSetIsSetSchedulingPolicy()) ? 131071 : 524287);
    if (isSetIsSetSchedulingPolicy())
      hashCode = hashCode * 8191 + ((isSetSchedulingPolicy) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetNs()) ? 131071 : 524287);
    if (isSetNs())
      hashCode = hashCode * 8191 + ns.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(WMNullablePool other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetResourcePlanName(), other.isSetResourcePlanName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlanName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlanName, other.resourcePlanName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPoolPath(), other.isSetPoolPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolPath, other.poolPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAllocFraction(), other.isSetAllocFraction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllocFraction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allocFraction, other.allocFraction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQueryParallelism(), other.isSetQueryParallelism());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryParallelism()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryParallelism, other.queryParallelism);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSchedulingPolicy(), other.isSetSchedulingPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSchedulingPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.schedulingPolicy, other.schedulingPolicy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetIsSetSchedulingPolicy(), other.isSetIsSetSchedulingPolicy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSetSchedulingPolicy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSetSchedulingPolicy, other.isSetSchedulingPolicy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNs(), other.isSetNs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ns, other.ns);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("WMNullablePool(");
    boolean first = true;

    sb.append("resourcePlanName:");
    if (this.resourcePlanName == null) {
      sb.append("null");
    } else {
      sb.append(this.resourcePlanName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("poolPath:");
    if (this.poolPath == null) {
      sb.append("null");
    } else {
      sb.append(this.poolPath);
    }
    first = false;
    if (isSetAllocFraction()) {
      if (!first) sb.append(", ");
      sb.append("allocFraction:");
      sb.append(this.allocFraction);
      first = false;
    }
    if (isSetQueryParallelism()) {
      if (!first) sb.append(", ");
      sb.append("queryParallelism:");
      sb.append(this.queryParallelism);
      first = false;
    }
    if (isSetSchedulingPolicy()) {
      if (!first) sb.append(", ");
      sb.append("schedulingPolicy:");
      if (this.schedulingPolicy == null) {
        sb.append("null");
      } else {
        sb.append(this.schedulingPolicy);
      }
      first = false;
    }
    if (isSetIsSetSchedulingPolicy()) {
      if (!first) sb.append(", ");
      sb.append("isSetSchedulingPolicy:");
      sb.append(this.isSetSchedulingPolicy);
      first = false;
    }
    if (isSetNs()) {
      if (!first) sb.append(", ");
      sb.append("ns:");
      if (this.ns == null) {
        sb.append("null");
      } else {
        sb.append(this.ns);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (resourcePlanName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourcePlanName' was not present! Struct: " + toString());
    }
    if (poolPath == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'poolPath' was not present! Struct: " + toString());
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

  private static class WMNullablePoolStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMNullablePoolStandardScheme getScheme() {
      return new WMNullablePoolStandardScheme();
    }
  }

  private static class WMNullablePoolStandardScheme extends org.apache.thrift.scheme.StandardScheme<WMNullablePool> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, WMNullablePool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_PLAN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourcePlanName = iprot.readString();
              struct.setResourcePlanNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POOL_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.poolPath = iprot.readString();
              struct.setPoolPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALLOC_FRACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.allocFraction = iprot.readDouble();
              struct.setAllocFractionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // QUERY_PARALLELISM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.queryParallelism = iprot.readI32();
              struct.setQueryParallelismIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SCHEDULING_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.schedulingPolicy = iprot.readString();
              struct.setSchedulingPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_SET_SCHEDULING_POLICY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSetSchedulingPolicy = iprot.readBool();
              struct.setIsSetSchedulingPolicyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // NS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ns = iprot.readString();
              struct.setNsIsSet(true);
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
    public void write(org.apache.thrift.protocol.TProtocol oprot, WMNullablePool struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourcePlanName != null) {
        oprot.writeFieldBegin(RESOURCE_PLAN_NAME_FIELD_DESC);
        oprot.writeString(struct.resourcePlanName);
        oprot.writeFieldEnd();
      }
      if (struct.poolPath != null) {
        oprot.writeFieldBegin(POOL_PATH_FIELD_DESC);
        oprot.writeString(struct.poolPath);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAllocFraction()) {
        oprot.writeFieldBegin(ALLOC_FRACTION_FIELD_DESC);
        oprot.writeDouble(struct.allocFraction);
        oprot.writeFieldEnd();
      }
      if (struct.isSetQueryParallelism()) {
        oprot.writeFieldBegin(QUERY_PARALLELISM_FIELD_DESC);
        oprot.writeI32(struct.queryParallelism);
        oprot.writeFieldEnd();
      }
      if (struct.schedulingPolicy != null) {
        if (struct.isSetSchedulingPolicy()) {
          oprot.writeFieldBegin(SCHEDULING_POLICY_FIELD_DESC);
          oprot.writeString(struct.schedulingPolicy);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsSetSchedulingPolicy()) {
        oprot.writeFieldBegin(IS_SET_SCHEDULING_POLICY_FIELD_DESC);
        oprot.writeBool(struct.isSetSchedulingPolicy);
        oprot.writeFieldEnd();
      }
      if (struct.ns != null) {
        if (struct.isSetNs()) {
          oprot.writeFieldBegin(NS_FIELD_DESC);
          oprot.writeString(struct.ns);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMNullablePoolTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public WMNullablePoolTupleScheme getScheme() {
      return new WMNullablePoolTupleScheme();
    }
  }

  private static class WMNullablePoolTupleScheme extends org.apache.thrift.scheme.TupleScheme<WMNullablePool> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMNullablePool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.resourcePlanName);
      oprot.writeString(struct.poolPath);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAllocFraction()) {
        optionals.set(0);
      }
      if (struct.isSetQueryParallelism()) {
        optionals.set(1);
      }
      if (struct.isSetSchedulingPolicy()) {
        optionals.set(2);
      }
      if (struct.isSetIsSetSchedulingPolicy()) {
        optionals.set(3);
      }
      if (struct.isSetNs()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetAllocFraction()) {
        oprot.writeDouble(struct.allocFraction);
      }
      if (struct.isSetQueryParallelism()) {
        oprot.writeI32(struct.queryParallelism);
      }
      if (struct.isSetSchedulingPolicy()) {
        oprot.writeString(struct.schedulingPolicy);
      }
      if (struct.isSetIsSetSchedulingPolicy()) {
        oprot.writeBool(struct.isSetSchedulingPolicy);
      }
      if (struct.isSetNs()) {
        oprot.writeString(struct.ns);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMNullablePool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.resourcePlanName = iprot.readString();
      struct.setResourcePlanNameIsSet(true);
      struct.poolPath = iprot.readString();
      struct.setPoolPathIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.allocFraction = iprot.readDouble();
        struct.setAllocFractionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.queryParallelism = iprot.readI32();
        struct.setQueryParallelismIsSet(true);
      }
      if (incoming.get(2)) {
        struct.schedulingPolicy = iprot.readString();
        struct.setSchedulingPolicyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isSetSchedulingPolicy = iprot.readBool();
        struct.setIsSetSchedulingPolicyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.ns = iprot.readString();
        struct.setNsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

