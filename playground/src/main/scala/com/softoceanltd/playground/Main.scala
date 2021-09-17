package com.softoceanltd
package playground
// 52:42
object Main {
  /** This is the main entry point to the program.
   * When the program starts `main` nethod will be executed and
   *
   * @param args the arguments to the program.
   * @group console-output
  */
  def main(args: Array[String]): Unit = {
    println("─" * 100)


    println(args.length)
    println("hello world ")
    println(Main)
    println(
        args.mkString(
        start = "Array(",
        sep = ", ",
        end = ")"
      )
    )

    // val, var, def, lazy val, type
    // names chosen to follow JavaScript convention
    val const = {
      println("I'm going to bind const to 1337")
      1337
    }
    println(const)
    println(const)

    val inside_scope = {
      def method = 1337
      method
    }
    println(inside_scope)

    var let = {
      println("I'm going to bind let to 1337")
      1337
    }
    println(let)
    println(let)

    let = {
      println("I'm going to assing 1338 to let")
      let + 1
    }
    println(let)
    println(let)

    def function = {
      println("I'm going to function to 1337")
      println("But will recalculate it every time")
      1337
    }
    println(function)
    println(function)

    lazy val mix= {
      println("I'm going to mix to 1337")
      println("But only on demand, when used")
      1337
    }
    println(mix)
    println(mix)

    println("─" * 100)

    // functions can be define with nonalpha numeric chars
    def *(first: Int, second: Int) = first * second
    println(*(2, 4))
  }
}
