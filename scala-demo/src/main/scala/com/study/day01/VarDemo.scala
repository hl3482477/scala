package com.study.day01

object VarDemo {
  def main(args:Array[String]): Unit = {
    var n1:Int = 10
    println(n1)
    n1=20
    println(n1)
    val n2 :Int = 100
    println(n2)
    var n4 =2 //不指名类型，scala 会自动判断
    println(n4)
    println(n4.getClass.getSimpleName) //得到该变量的类型
  }
}
