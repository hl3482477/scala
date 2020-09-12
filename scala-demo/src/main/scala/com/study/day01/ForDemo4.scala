package com.study.day01

import scala.util.control.Breaks

object ForDemo4 {
  def main(args: Array[String]): Unit = {
    var flag =false
    for(i <- 0 to 10 if !flag){
      if (i>=5){
        flag= true
      }else{
        print(i+" ")  //0 1 2 3 4
      }
    }
    println()
    //捕获异常
    Breaks.breakable(
      for(i <- 0 to 10){
        if (i>=5){
          Breaks.break() //以抛异常的形式结束，慎用
        }else{
          print(i+" ")  //0 1 2 3 4
        }
      }
    )

  }
}
