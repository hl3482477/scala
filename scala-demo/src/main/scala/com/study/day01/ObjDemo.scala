package com.study.day01

object ObjDemo {
  def main(args: Array[String]): Unit = {
    var p = new A("李四",20)
    println(p.name+" "+p.age)
  }
}

class A(inName:String,inAge:Int){
  var name =inName
  var age =inAge
  println("ok")


}
