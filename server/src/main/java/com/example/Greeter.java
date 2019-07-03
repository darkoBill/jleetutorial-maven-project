package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
   * Changes the name of this Student.
   * This may involve a lengthy legal process.
   * @param someone This Student's new name.
   *                Should include both first
   *                and last name.*/

  public final String greet(final String someone) {
    /**
     * @return greeting This returns a greeting.*/
    return String.format("Hello, %s!", someone);
  }
}
