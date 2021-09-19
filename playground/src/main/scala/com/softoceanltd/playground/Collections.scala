package com.softoceanltd.playground

object Collections {
    def main(args: Array[String]): Unit = {

        // don't import this all as it shadows immutable
        // import scala.collection.mutable._
        // insted:
        import scala.collection.mutable

        var bla = mutable.ArraySeq(1,2, 3)
        println(bla)

        // Word on imports: They can take all
        object MyStuff {
            val inside = 123  // will not be visible outside
        }
        import MyStuff.inside // import makes it visible outside
        println(inside)

        println(s"Iterables are on top: ${Iterable(4, 5, 6)} as List ${Iterable(4).getClass()} ")
        // Collections need the same type 
        // Collections are dynamic sides
        // Sequesnce (ordered)
        println(s"Sequesnce is: ${Seq(1,2,3)} which defaults to: ${List(1,2,3)}")
        println(s"Indexed Sequesnce is: ${IndexedSeq(1,2,3)} which defaults to: ${Vector(1,2,3)} at is optimised for access by index: ${IndexedSeq(1,2,3)(1)} ")
        // Set (unordered)
        println(s"The set does not have duplicates: ${Set(4,2,2,2,3,1,1)} and are optimesed for number of elements less than five ${Set(4,2,2,2,3,1,1,0)}")
        println(s"There are other set types: ${scala.collection.immutable.HashSet(4,2,2,2,3,1,1)}") 

        // when we work with them htey create another collection
        println(s"${List(1,2,3).map(_ + 1)}")
        println(s"${List(0,1,2,3,4,5,6,7,8,9).filter(_ % 2 != 0).map(_ + .5)}")

        // flatMap need to be wrapped into iterable
        println(s"This emptying even values: ${List(1,2,3, 4,5,6,7).flatMap { n =>
            if (n % 2 == 0)
                List.empty
            else
                List(n) } 
            }"
        )
        // flatMap is useful for nested collections
        val matrix = 
            List(
                List(1,2,3),
                List(4,5,6),
                List(7,8,9)
            )
        println(matrix)
        matrix.foreach(println)
        matrix.flatten.foreach(println)

        // Map (key: val pair)
        matrix.map(_.reverse).flatten.foreach(println)  // flatten is the same
        matrix.flatMap(_.reverse).foreach(println)      // as ftalMap

        println("--" * 50)
    }
}