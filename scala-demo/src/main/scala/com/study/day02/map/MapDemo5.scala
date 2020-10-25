package com.study.day02.map

import scala.collection.mutable

object MapDemo5 {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "c" -> 2, "b" -> 3)
    for ((k,v)<- map1){
      println(k+ "=" +v)
    }
    println("===========")
    for (elem <- map1.keys) {
      println("k = "+elem)
    }
    println("===========")
    for (elem <- map1) {
      println(elem._1+" = "+elem._2)
    }
  }
}
