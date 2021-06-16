package com.bj58.fly.etl

import java.io.PrintWriter //实现文件的写入
import scala.io.Source // 实现文件的读取

class Counter {
  var value = 0
  def increment(step: Int): Unit =
  {
    value += step
  }

  def current(): Int = {
    value
  }
}

object ScalaLearnOwn {
  def main(args: Array[String]): Unit = {
    println(3 max 5 max 6)
    var field = 123
    println(field)

    // 写文件
    val outputFile = new PrintWriter("/Users/a58/companyproject/SparkLearn/src/main/resources/test1.txt")
    outputFile.println("Hello World")
    outputFile.print("Spark is good")
    outputFile.close()

    // 文件的读取
    val inputFile = Source.fromFile("/Users/a58/companyproject/SparkLearn/src/main/resources/test1.txt")
    for (line <- inputFile.getLines()) println(line)
    inputFile.close()

    // 控制结构
    val x: Int = 6
    if (x > 4) {
      println("x>4")
    }
    else {
      println("x<=4")
    }
    // 集合
    var mySet = Set("Hadoop", "Spark")
    mySet += "Scala"
    println(mySet)

    import scala.collection.mutable.Set
    val myMutableSet = Set("Database", "BigData")
    myMutableSet += "Cloud Computing"
    println(myMutableSet)

    // 映射 map
    val university = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University", "PKU" -> "Peking University")
    println(university("XMU"))
    // 可变映射
    import scala.collection.mutable.Map
    val university2 = Map("XMU" -> "Xiamen University", "THU" -> "Tsinghua University", "PKU" -> "Peking University")
    university2 += ("TJU" -> "Tianjin University")
    println(university2)

    // 类的简单使用
    val myCounter = new Counter
    myCounter.value = 5
    myCounter.increment(3)
    println(myCounter.current)

    // 函数
    /**
     * counter的类型是“(Int) => Int”，表示该函数是具有一个整数类型参数并返回一个整数的函数
     */
    val counter:(Int)=>Int={value =>value+1}
    print(counter(5))


  }

  //

}
