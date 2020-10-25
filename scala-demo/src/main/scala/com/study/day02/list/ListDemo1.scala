package com.study.day02.list

object ListDemo1 {

    def main(args: Array[String]): Unit = {
      val list1 = List(10,20,30,3)

      val list2 = List(0,20,30,3)
        /*
         * :: 在list头部添加
         * :::两个拼接list  也可用List.concat
         * Nill 空的lis
         */

      println(10::list1)
      println(10+:list1)

      println(list1:::list2)
      println(List.concat(list1,list2))
    }

}
