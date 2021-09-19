package com.softoceanltd.playground

object CollectionsMaps {
    def main(args: Array[String]): Unit = {

        val list = List(1,2,3)
        println("original list: ", list)
        println("prepended    : ", 0 :: list)  // infix notation NOT for 0.::(list) but if ends with : it is right associative so list.::(0)
        println("after adding : ", list)
        // another associativity
        println("assciativity : ", 0 +: list :+ 4)  // appending recreate list
        println("concat       : ", list ::: List(4,5,6) ++ List(7,8))  // for list ::: is ok but for collections needs to be ++
        println(1 :: 2 :: 3 :: Nil.empty)  // used in pattern matching

        val myMap = Map(1 -> "I", 2 -> "II", 3 -> "III")
        println(myMap + (4 -> "IV"))
        println(myMap + (3 -> "changed"))
        println(myMap + (3 -> "changed") ++ myMap)  // the last overwrites

        // convertions done wtih .to
        println(List(1,2,3).to(Vector))

        // can convert between Java and Scala
        val hashSet = {
            val result = new java.util.HashSet[Int]

            result.add(1)
            result.add(2)
            result.add(3)
            result.add(3)
            result.add(2)
            result.add(1)

            result
        }
        println(hashSet)

        import scala.jdk.CollectionConverters._

        val scalaSet = hashSet.asScala
        println(scalaSet)
        val javaSet = scalaSet.asJava
        println(javaSet)

        // method creation is done through the object.apply
        object MyCollection {
            def apply(ints: Int*): Seq[Int] = ints
        }
        val c1 = MyCollection()
        println(c1)
        println(MyCollection(1,2,3,4))

        object MyNonEmptyCollection {
            def apply(first: Int, rest: Int*): Seq[Int] = first +: rest
        }
        println(MyNonEmptyCollection(1))  // need at least one elelment

        println("--" * 50) 
    }
}