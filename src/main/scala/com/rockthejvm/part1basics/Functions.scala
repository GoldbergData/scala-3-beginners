package com.rockthejvm.part1basics

object Functions {
  def aFunction(a: String, b: Int): String = {
    a + " " + b // ONE expressions
  }

  val aFunctionInvocation = aFunction("Scala", 987)

  def aNoArgFunction(): Int = 45
  def aParameterlessFunction: Int = 45

  // functions can be recursive
  def stringConcatenation(str: String, n: Int): String = {
    if (n == 0) ""
    else if (n == 1) str
    else str + stringConcatenation(str, n - 1)
  }

  val scalax3 = stringConcatenation("Scala", 3)

  // when you need loops, use recursion

  // "void" functions
  def aVoidFunction(aString: String): Unit =
    println(aString)

  def computeDoubleStringWithSideEffect(aString: String): String = {
    aVoidFunction(aString)
    aString + aString
  }

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n + 1)
  }

  /**
   * Exercises
   * 1. A greeting function (name, age)
   * 2. Factorial function n
   * 3. Fibonacci function: sum of previous two numbers
   *  fib(1) = 1
   *  fib(2) = 1
   *  fib(3) = 1 + 1
   *  fib(n) = fib(n-1) + fib(n-2)
   * 4. Tests if a number is prime
   */

  def greet(name: String, age: Int): Unit =
    println(s"Hi, my name is $name and I am $age years old.")

  def main(args: Array[String]): Unit = {
    greet("Josh", 37)
    println(scalax3)
  }
}
