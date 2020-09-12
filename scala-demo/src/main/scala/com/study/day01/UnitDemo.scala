package com.study.day01

object UnitDemo {
  def main(args: Array[String]): Unit = {
    val  a = foo()
    println(a)
  }
  //Unit 相当于java的Void
  def  foo(): Unit ={
    println(1)
  }

  //Nothing是任何其他类型的子类型
  def a() :Nothing = {
  throw  new Exception()
  }

  /**
   * 运行结果
   * 1
   * （）
   */
}
