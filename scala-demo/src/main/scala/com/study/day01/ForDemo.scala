package com.study.day01

object ForDemo {
  def main(args: Array[String]): Unit = {
    val r1:Range.Inclusive =1.to(10)
    println(r1)
    for(i <- r1){
      print(i+" ")
    }
    println()

    val r2:Range =1.until(10)
    println(r2)
    for(i <-r2){
      print(i+" ")
    }
    println()
    for(i<- 1 to 10 reverse){ //倒叙
      print(i+" ")
    }
    println()
    for(i <- 1 until 10){
      print(i+" ")
    }
  }
}
