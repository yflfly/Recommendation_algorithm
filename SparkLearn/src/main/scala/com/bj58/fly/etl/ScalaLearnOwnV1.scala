package com.bj58.fly.etl

import org.apache.spark.{SparkConf, SparkContext}

object ScalaLearnOwnV1 {
  def main(args: Array[String]): Unit = {
    // args(0) -> 1
    // 1.设置spark配置信息
    val conf = new SparkConf().setAppName("SparkLearn").setMaster("local")

    // 2. 设置运行信息
    val sc = new SparkContext(conf)


    val rdd=sc.parallelize(Array(1,2,3,4,5))
    println(rdd.count()) // 5 count() 返回数据集中元素个数
    println(rdd.first()) // 1 first() 返回数据集中第一个元素
    rdd.take(3)
    println(rdd.reduce((a,b)=>a+b)) // 15
    rdd.foreach(elem=>println(elem))
    println(rdd.collect()) //

  }

}
