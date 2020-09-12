package com.study.day01

object ConversionDemo {
  def main(args: Array[String]): Unit = {
    var a :Int =128
    var  b: Long =a
    //var  c :Short =b  错误，范围大的值不能自动转换到范围小的类型的值
    var c: Byte = a.toByte //强制类型转换
    println(c)
  }
}
