package edu.cnm.deepdive;

import java.util.Arrays;

/**
 * Enumerated values representing operators in a postfix (RPN) calculator. Each operator has a token
 * that is used to recognize the operator in a string, and to represent the operator.
 */
public enum Operator {

  /** Pop 2 values form stack, pushed sum of the 2 back onto stack*/
  ADD("+"),
  /** Pop 2 values form stack, pushed difference of the 2 back onto stack*/
  SUBTRACT("-"),
  /** Pop 2 values form stack, pushed product of the 2 back onto stack*/
  MULTIPLY("*"),
  /** Pop 2 values form stack, pushed quotient (real) of the 2 back onto stack*/
  DIVIDE("/"),
  /** Pop 1 values form stack, pushed its square root back onto stack*/
  SQUARE_ROOT("sqrt"),
  /** Pop 2 values form stack, pushed the value f 1st raised to the second back onto stack*/
  POWER("^"),
  /** Pop 2 values form stack, pushed remainder (after truncated division) of the 2 back onto stack*/
  MODULO("%");

  private String token;

  Operator(String token) {
    this.token = token;
  }

  /**
   * Exercises the Operator enum by printing all of the enumerated values (as an array).
   * @param args command line arguments (ignored).
   */
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Operator.values()));
  }

  @Override
  public String toString() {
    return token;
  }
}
