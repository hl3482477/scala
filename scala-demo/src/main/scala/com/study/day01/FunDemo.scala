package com.study.day01

object FunDemo {
  def main(args: Array[String]): Unit={
    println(sum(10,20))
  }

/*  def sum(a:Int,b:Int) ={
    // return a +b //错误，类型推导不能出现return
    a+b
  }*/

  def sum(a:Int,b:Int){
   return a+b       //返回值是Unit
  }
}
