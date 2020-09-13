package com.study.day01

object ExtendsDemo {
  def main(args: Array[String]): Unit = {
    val  son1:Father = new Son
    println(son1.isInstanceOf[Son])
    println(son1.isInstanceOf[Father])
    if (son1.isInstanceOf[Son]){
      val son2:Son =son1.asInstanceOf[Son]
      son2.say
    }
    println(classOf[Son])

    /**
     * true
     * true
     * hh
     * class com.study.day01.Son
     */
  }
}

class Father{

}

class Son extends Father{
  def  say ={
    println("hh")
  }
}
