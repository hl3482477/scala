package com.study.day02.array

//二维数组
object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    val myMatrix = Array.ofDim[Int](3, 4)
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
  }
}
