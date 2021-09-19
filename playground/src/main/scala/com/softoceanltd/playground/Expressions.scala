package com.softoceanltd.playground

object Expressions {
    def main(args: Array[String]): Unit = {

        val result = 
            if (true && true)
                "good"
            else
                "bad"
        println(result)
        println(s"${true && false}")

        // result is Any
        val res1 = if (false) "good"
        val res2 = if (false) "good" else { () }
        println(s"The res avaluates to type Any in both res1: ${res1} and res2: ${res2}")

        val res3: AnyRef = if (true) "abcd" else Expressions
        println(s"The res2: ${res3} with type: ${res2.getClass}")
        
        def someDecision(
            first: Boolean,
            second: Boolean
        ): String =
        if (first && second)
            "awsome"
        else if (first || second)
            "still cool"
        else
            "not good"
        println(someDecision(first = false, second = false))
        println(someDecision(first = true, second = false))
        println(someDecision(first = false, second = true))
        println(someDecision(first = true, second = true))

        println(s"123 == 123 ${123 == 123}")
        println(s"123 != 123 ${123 != 123}")
        println(s"123 < 123 ${123 < 123}")
        println(s"123 > 123 ${123 > 123}")
        println(s"123 >= 123 ${123 >= 123}")
        println(s"123 <= 123 ${123 <= 123}")

        println(s"test == test ${"test" == "test"}")
        println(s"test != test ${"test" != "test"}")

        println(s"test == 1 ${"test" == 1}")  // not possible in scala3
                
        println("--" * 50)
    }
}