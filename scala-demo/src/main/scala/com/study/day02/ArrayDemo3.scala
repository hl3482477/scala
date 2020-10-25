package com.study.day02

//区间数组
object ArrayDemo3 {
  def main(args: Array[String]): Unit = {
    //range() 方法最后一个参数为步长，默认为 1：
    var myList1 = Array.range(10, 20, 2)
    var myList2 = Array.range(10,20)

    // 输出所有数组元素
    for ( x <- myList1 ) {
      print( " " + x )
    }
    println()
    for ( x <- myList2 ) {
      print( " " + x )
    }
  }

}
