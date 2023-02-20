package co.edu

import org.apache.spark.sql.SparkSession

object SparkSessionTest extends App {
  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExample")
    .getOrCreate();

  println(spark.version)

}
