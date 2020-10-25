package com.study.day02.tuple

object TupleDemo2 {
  def main(args: Array[String]): Unit = {
    val t1: (String, Int, String, Boolean) = ("a", 1, "2", true) // 是⽤ _1 开始
    println(t1._1)
    println(t1 _2)
    println(t1.productElement(0))

    //遍历
    for (t <- t1.productIterator){
      println(t)
    }
  }
}
