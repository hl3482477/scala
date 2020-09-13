package com.study.day01

object FunDemo3 {
  def main(args: Array[String]): Unit = {
      println(sum(10)) //第二个参数使用默认值
  }

  def sum(a:Int,b:Int =10) ={
    a+b
  }
}
