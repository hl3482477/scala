package com.study.day02.tuple

object TupleDemo1 {
  def main(args: Array[String]): Unit = {
    //元组的创建，推荐方式1
    val t1:(String,Int,String,Boolean) =("1",1,"2",true)
    val t2: Tuple4[String, Int, String, Boolean] = ("a", 1, "2", true)

    println(t1)
    println(t2)
  }
}
