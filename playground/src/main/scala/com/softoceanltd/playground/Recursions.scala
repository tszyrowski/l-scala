package com.softoceanltd.playground

object Recursions {
    def main(args: Array[String]): Unit = {

        def loop1(acc: Int): Unit =
            if (acc < 10) {
                println(s"acc now is: $acc")
                loop1(acc + 1)
            }
        loop1(0)

        @scala.annotation.tailrec
        def loop2(acc: Int): Unit =
            if (acc < 10) {
                println(s"acc now is: $acc")
                loop2(acc + 1)
                // after loop nothing can be exected as can't be optimised
                //println("hi")
            }
        loop2(0)

        //  loop
        var acc = 0
        while (acc < 10) {
            println(s"inside while acc: ${acc}")
            acc += 1
        }
        println("--" * 50)
    }
}