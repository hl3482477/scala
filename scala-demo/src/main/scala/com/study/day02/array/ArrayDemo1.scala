package com.study.day02.array

object ArrayDemo1 {

  def main(args: Array[String]): Unit = {
    //方式一
    // var myList = Array(1,2,3)

    //方式二
    var myList: Array[Int] = new Array[Int](3)
    myList(0) = 1
    myList(1) = 2
    myList(2) = 3

    for (x <- myList) {
      println(x)
    }
  }

}
