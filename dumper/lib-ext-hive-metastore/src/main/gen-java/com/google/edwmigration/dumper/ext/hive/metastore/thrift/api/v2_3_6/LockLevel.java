/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.v2_3_6;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public enum LockLevel implements org.apache.thrift.TEnum {
  DB(1),
  TABLE(2),
  PARTITION(3);

  private final int value;

  private LockLevel(int value) {
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
  public static LockLevel findByValue(int value) { 
    switch (value) {
      case 1:
        return DB;
      case 2:
        return TABLE;
      case 3:
        return PARTITION;
      default:
        return null;
    }
  }
}
