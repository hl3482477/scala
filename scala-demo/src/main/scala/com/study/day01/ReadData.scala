package com.study.day01

import scala.io.StdIn

object ReadData {
  def main(args: Array[String]): Unit = {
    val name =StdIn.readLine()
    val age = StdIn.readInt()
    println("name:"+name)
    println("age:"+age)
  }
}
