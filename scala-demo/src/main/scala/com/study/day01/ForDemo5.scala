package com.study.day01

object ForDemo5 {
  def main(args: Array[String]): Unit = {
    var  j = for(i <- 1 to 9) yield i*i
    println(j)//Vector(1, 4, 9, 16, 25, 36, 49, 64, 81)

    //步长为2
    for (i<- 10 to(20,2)){
      print(i+" ") //10 12 14 16 18 20
    }
  }
}
