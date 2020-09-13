package com.study.day01

object FunDemo2 {
  def main(args: Array[String]): Unit = {
    //没有形参可省略括号
    foo
  }

  //返回值不确定就用any
  def sum(a:Int,b:Int) :Any ={
    if (false){
      a+b
    }else{
      "hello"
    }
  }

  def foo={
    println("hhh")
  }
}
