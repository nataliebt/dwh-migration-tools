/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.edwmigration.dumper.ext.hive.metastore.thrift.api.superset;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.17.0)", date = "2023-08-11")
public enum ClientCapability implements org.apache.thrift.TEnum {
  TEST_CAPABILITY(1),
  INSERT_ONLY_TABLES(2);

  private final int value;

  private ClientCapability(int value) {
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
  public static ClientCapability findByValue(int value) { 
    switch (value) {
      case 1:
        return TEST_CAPABILITY;
      case 2:
        return INSERT_ONLY_TABLES;
      default:
        return null;
    }
  }
}
