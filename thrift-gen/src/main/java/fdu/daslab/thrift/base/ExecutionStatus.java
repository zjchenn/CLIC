/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package fdu.daslab.thrift.base;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-09-26")
public enum ExecutionStatus implements org.apache.thrift.TEnum {
  PENDING(0),
  RUNNING(1),
  COMPLETED(2),
  FAILURE(3);

  private final int value;

  private ExecutionStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static ExecutionStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return PENDING;
      case 1:
        return RUNNING;
      case 2:
        return COMPLETED;
      case 3:
        return FAILURE;
      default:
        return null;
    }
  }
}
