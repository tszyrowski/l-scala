package com.softoceanltd.playground

object CollectionsArray {
    def main(args: Array[String]): Unit = {

        // mutable collections
        val myLsit = List(1,2,3)  // Scala array
        println(myLsit)

        val fruits = Array("array", "apple", "orange", "bannan")
        println(fruits(2))       // this is sintactic sugare to call apply method
        println(fruits.apply(2)) // as shown here

        // we can mutate array
        fruits(2) = "melon"
        println(fruits.mkString(", "), " or: ", fruits.toList)

        fruits.foreach(print(_, " "))

        fruits.mapInPlace(_.reverse)        // syntax for the same as:
        fruits.mapInPlace(f => f.reverse)   // fruit comes in and reverse
        println()
        fruits.mapInPlace(_.reverse).foreach(println)
        fruits.map(_.reverse).foreach(print(_, " "))
        println()
        println("mapInPlace operates on val but map does not change it")
        fruits.foreach(print(_, " "))

        println("--" * 50)
    }
}
