package com.study.day02.map

import scala.collection.mutable

//Map取值
object MapDemo3 {
  def main(args: Array[String]): Unit = {
    val map1: mutable.Map[String, Int] = mutable.Map("c" -> 100, "a" -> 50, "b" -> 20)

    //1.map(key)
    println(map1("a"))
    if (map1.contains("d")) {
      println(map1("d"))
    } else {
      println("你要查找的key不存在")
    }
    //2.map.get(key).get
    val maybeInt: Option[Int] = map1.get("b")

    val maybeInt1: Option[Int] = map1.get("d")
    println(maybeInt.get)
    println(maybeInt1)
    //3 map.getOrElse
    val v1: Int = map1.getOrElse("d", 100)
    val v2: Int = map1.getOrElse("a", 100)

    println(v1)
    println(v2)


  }
}
