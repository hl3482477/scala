package com.study.day02.map

import scala.collection.mutable

object MapDemo4 {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "c" -> 2, "b" -> 3)
    // 修改值
    map1("a") = 100
    // 添加键值对: key不存在的时候就是添加
    map1("aa") = 120
    println(map1)
    //  添加多个键值对
    map1 += ("bb" -> 11, "cc" -> 12)
    println(map1)
    // 删除映射关系
    map1 -= "a"
    println(map1)
    // 连接两个映射
    val map2 = map1 ++ Map("aaa" -> 4, "bbb" -> 5)
    println("map2 = " + map2)
    println("map1 = " + map1)
  }
}
