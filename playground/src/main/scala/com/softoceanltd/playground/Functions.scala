package com.softoceanltd.playground

object Functions {
    def main(args: Array[String]): Unit = {


        def higherOrderFunc(f: String => String) = { 
            var acc = 0
            while (acc < 10) {
                println(f(s"inside while acc: ${acc}"))
                acc += 1
            }       
        }

        def rendered(n: String): String = 
            Console.YELLOW + n + Console.RESET

        higherOrderFunc(rendered)

        List(1,2,3).foreach(println)
        // higher order functions
        val x = 
            List(1,2,3).foreach[Unit](println)

        // function with type null
        val f1: String => String = rendered
        val f2 = rendered _ // unerscore tells the return is null
        val f3 = x => rendered(x)
        val f4 =      rendered(_)  // n scala the same as above

        println(List(6, 2, 5, 9, 8).sortWith((a, b) => a <= b))
        println(  // but as a, b are used only once we don't need to specify them
                List(6, 2, 5, 9, 8).sortWith(          _ <= _))
        println(List(6, 2, 5, 9, 8).sortWith(          _ >= _))

        // Partial function
        val four = 4.toString
        higherOrderFunc {
            // case 2 => Console.RED + _ + Console.RESET
            case `four` => Console.GREEN + four + Console.RESET
            case x => Console.MAGENTA + x + Console.RESET
        }

        // Pattern matching with partial
        val result4 = 
            List(1,2,3,4,5,6,7,8,9,0) match {
                case List(_, _, third, fourth, _*) if third == fourth - 1 => 
                    true
                case _ => false
            }
        println(result4)
        val result5 = 
            List(1,2,4,4) match {
                case List(_, _, third, fourth, _*) if third == fourth - 1 => 
                    true
                case _ => false
            }
        println(result5)

        val List(_, _, third, fourth, rest @ _*) = List(1,2,3,4,5,6,7)
        println(third, fourth, rest)

        try
            println(1/0)
        catch {
            case e: ArithmeticException => 
                println(Console.RED + e + Console.RESET)
        }

        val res5: Int = 
            try 1/0
            catch {
                case e: ArithmeticException => 0
            }
            finally println("all ok")
        println(res5)


        println("--" * 50)
    }
}