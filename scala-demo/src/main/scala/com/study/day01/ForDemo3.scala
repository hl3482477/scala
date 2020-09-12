package com.study.day01

object ForDemo3 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10 if(i%2==0)){
      print(i+" ")
    }
    //2 4 6 8 10
  }
}
