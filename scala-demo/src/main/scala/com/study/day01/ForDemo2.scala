package com.study.day01

object ForDemo2 {
  def main(args: Array[String]): Unit = {
    val s: String = "asdfff"
    for(i <- 0 until s.length){
      print(s(i)+" ")
    }
    println()
    //简洁写法
    for(i <- s){
      print(i+" ")
    }
  }

}
