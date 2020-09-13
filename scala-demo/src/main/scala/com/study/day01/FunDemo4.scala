package com.study.day01

import scala.beans.BeanProperty

object FunDemo4 {
  def main(args: Array[String]): Unit = {
        var  p1 =new Person()
    p1.teacher =new Teacher()
    println(p1.getAge)
    p1.setAge(100)
    println(p1.getAge)
    println(p1.teacher.name)
  }
}

class Person{
  @BeanProperty
  //声明属性，而且必须给该属性赋值
  var age =10
  //属性可以使用默认值：使用_
  var teacher:Teacher=_
}

class Teacher{
  var  name ="haha"
}