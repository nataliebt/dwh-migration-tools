/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public enum WMPoolSchedulingPolicy implements org.apache.thrift.TEnum {
  FAIR(1),
  FIFO(2);

  private final int value;

  private WMPoolSchedulingPolicy(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  @Override
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static WMPoolSchedulingPolicy findByValue(int value) { 
    switch (value) {
      case 1:
        return FAIR;
      case 2:
        return FIFO;
      default:
        return null;
    }
  }
}
