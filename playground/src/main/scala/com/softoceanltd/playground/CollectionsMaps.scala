package com.softoceanltd.playground

object MyCollectionsMaps {
    def main(args: Array[String]): Unit = {

        println(s"""|this initialisation: ${Map((1, "I"), (2, "II"), (3, "III"))}
        |is the same as this: ${Map(1 -> "I", 2 -> "II", 3 -> "III")}""".stripMargin)

        val myTuple = Map(1 -> "I", 2 -> "II", 3 -> "III").map { tuple2 =>
            val key = tuple2._1
            val value = tuple2._2

            key -> value.toLowerCase
        }
        println(myTuple)

        // above can be done with partial function:
        val myPartialFuncTuple = Map(1 -> "I", 2 -> "II", 3 -> "III").map { 
        case (key, value) => key -> value.toLowerCase
        }
        println(myPartialFuncTuple)

        val partitionOnList = 
            List(1,2,3,4,5,6).partition(_ % 2 == 0)
        println(partitionOnList)

        // RANGES (impelemented in efficient way)
        println(s"${Range(start=0, end=20, step=2).foreach(print)} is The Range is efficient: ${Range(start=0, end=20, step=2)}")
        println(s"${Range.inclusive(start=0, end=10).foreach(print)} includes the last element and is length of: ${Range.inclusive(start=0, end=10).length}")
        println(s"Renage can be build with shorted syntax for exclusive ${0 until 9} length: ${(0 until 9).length} and inclusive ${0 to 9}length: ${(0 to 9).length} ")
        // can be wrriten this way:
        0 to 10 by 2 foreach print
        println()
        // the above is suger and evaluates to:
        0.to(10).by(2).foreach(print)
        println()
        // because of above syntax, the comprehensions can llok not like in other languages:
        for(i <- 0 to 3) print(i)
        println()
        val myList = for(i <- 0 to 7) yield i + 1
        myList.foreach(print)
        println
        val myRange = for(c <- 'a' to 'e') yield for (n <- 0 to 10) yield c -> n
        myRange.foreach(println)
        println
        myRange.flatten.foreach(print)
        println
        val myRangeShort = ('a' to 'e').map { c => (0 to 5).map { n => c -> n}}
        myRangeShort.foreach(println)

        val myRangeGenerator = 
            for(c <- 'a' to 'h'; n <- 0 to 8 if n % 2 == 0) yield c -> n
        myRangeGenerator.foreach(print)
        println

        def fibonacci(n: Int): Int = 
            if (n <= 1) 1 else fibonacci(n - 1) * n
        1 to 9 map fibonacci foreach println

        def fibonacciTail(n: Int): Int = {
            @scala.annotation.tailrec
            def loop(x: Int, acc: Int): Int=
                if(x <= 1)
                    acc
                else
                    loop(
                        x = x -1,
                        acc = acc*x
                    )
            loop(x = n, acc = 1)
        }
        1 to 9 map fibonacciTail foreach println

        println("--" * 50)
    }
}