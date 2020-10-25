package com.study.day02.map

object MapDemo1 {
  def main(args: Array[String]): Unit = {

    // 创建不可变映射 ⽅式1 推荐, 可读性好
    val map1 = Map("c"->100,"a"->50,"b"->"20")
    val map2 = Map(("c",100),("a",50),("b","20"))
    for (elem <- map1) {
      println(elem)
      println("key = "+elem._1)
      println("value = "+elem._2)
    }
  }
}
