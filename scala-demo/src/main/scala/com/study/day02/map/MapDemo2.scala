package com.study.day02.map

import scala.collection.mutable

object MapDemo2 {
  def main(args: Array[String]): Unit = {
    // 创建可变映射
    val map1: mutable.Map[String, Int] = mutable.Map("c" -> 100, "a" -> 50, "b" -> 20)

     for (elem <- map1) {
       println(elem)
       println("key = "+elem._1)
       println("value = "+elem._2)
     }
    println(map1("a"))
    if (map1.contains("d")) {
      println(map1("d"))
    } else {
      println("你要查找的key不存在")
    }
}

}
