package com.study.day02.array

import scala.collection.mutable.ArrayBuffer

//可变数组
object ArrayDemo4 {
  def main(args: Array[String]): Unit = {
    // 创建数组缓冲⽅式1: new 的⽅式, 空的缓冲数组
    val arr1 = new ArrayBuffer[Int]()
    arr1 += 1 // ⽤ += 同时添加多个元素
    arr1 += (2, 4, 5)
    println(arr1)

    // 使⽤ ++= 可以追加任何的集合
    arr1 ++= Array(100, 200, 300)
    println(arr1)
    // 移除最后 2个 元素
    arr1.trimEnd(2)
    // 在数组的末尾添加和移除元素是⼀个⾼效的操作
    println(arr1)
    // 从下标为 2 的位置插⼊元素 60
    arr1.insert(2, 60)
    println(arr1)
    // 移除元素 : 移除下标为 1 的元素
    arr1.remove(1)
    println(arr1)

  }
}
