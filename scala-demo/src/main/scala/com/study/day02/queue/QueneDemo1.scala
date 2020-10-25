package com.study.day02.queue

import scala.collection.mutable

object QueneDemo1 {
  def main(args: Array[String]): Unit = {
    val queue1 = new mutable.Queue[Int]
    val queue2 = mutable.Queue(10, 20)

    queue1 += 10
    queue1 += 20
    println(queue1)

    queue1 ++=Array(5,6,7)
    println(queue1)
  }
}
