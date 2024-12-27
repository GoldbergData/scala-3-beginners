package com.rockthejvm.part1basics

object Expressions {
  val meaningOfLife: Int = 40 + 2
  val mathExpression: Int = 2 + 3 * 4
  val equalityTest: Boolean = 1 == 2
  val nonEqualityTest = !equalityTest

  // instructions vs expressions
  // expressions ar evaluated, instructions are executed
  // we think in terms of expressions in scala
  // ifs are expressions

  val aCondition = true
  val anIfExpressions = if (aCondition) 45 else 99

  // code blocks
  val aCodeBlock = {
    val localValue = 78
    // last expression is what's returned
    localValue + 54
  }

  // everything is an expression in scala

  /**
   * Exercise:
   * Without running the code, what do you think these values will print out?
   */
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  val yetAnotherValue = println("Scala")
  def main(args: Array[String]): Unit = {
    println(someValue) // prints true
    println(someOtherValue) // prints 42
    println(yetAnotherValue) // prints None
  }
}
