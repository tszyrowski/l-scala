package com.softoceanltd.playground

object Types {
    def main(args: Array[String]): Unit = {

        // type nothing (trhowing Exception
        // val nothing: Nothing = throw new Exception

        val unit1: Unit = ()
        val unit2: Unit = {}
        val unit3: Unit = {()}
        println(unit1, unit2, unit3)

        // null is only one
        val danger: Null = null
        println(danger)

        val yes: Boolean = true
        val no: Boolean = false
        println(yes, no)

        val byteMin: Byte = Byte.MinValue
        val byteMax: Byte = Byte.MaxValue
        println("Bytes: ", byteMin, byteMax)
        val shortMin: Short = Short.MinValue
        val shortMax: Short = Short.MaxValue
        println("Short: ", shortMin, shortMax)

        val intMin: Int = Int.MinValue
        val intMax: Int = Int.MaxValue
        println("Int: ", intMin, intMax)

        val longMin: Long = Long.MinValue
        val longMax: Long = Long.MaxValue
        println("Long: ", longMin, longMax)
        // to specify long var
        val a1 = 9223372036854775807L
        println("a1 as long: ", a1)

        val floatMin: Float = Float.MinValue
        val floatMinPos: Float = Float.MinPositiveValue
        val floatMax: Float = Float.MaxValue
        val floatNegInf: Float = Float.NegativeInfinity
        println("Floats: ", floatMin, floatMinPos, floatMax, floatNegInf)

        val doubleMin: Double = Double.MinValue
        val doubleMax: Double = Double.MaxValue
        println("Double: ", doubleMin, doubleMax, " diff: ", doubleMax-doubleMin)
        println("Diff double - Float: ", doubleMax - floatMax)

        // TYPE ALIAS
        type N = Int
        val myFavNumber: N = 1337
        println(myFavNumber, " is type of: ", myFavNumber.getClass())

        // CHARACTER AND STRING single for CHAR, double for STRING
        println('a', 'A', '\u2500', '\n')
        println("a", "A", "\u2500", "\n","""|\n""".stripMargin)

        println(
            """Raw string
             includes space"""
        )
        println(
            """#But space
             #can be striped""".stripMargin('#')
        )
        // with pipe
        println(
            """|Margin striped
                   |with pipe""".stripMargin
        )
        // extrapolation
        println(s"string with s can ahve interpolation to var: $myFavNumber")
        println(s"but need curly brace if expresion: ${myFavNumber + 2}")
        println(f"can be formatted: ${myFavNumber + 2}%d or ${myFavNumber + 2}%8.2f")

        println(
            raw"""|can use escape\n
                  |and be interpoated: ${myFavNumber + 5}""".stripMargin
        )

        println("--" * 50)

    }
}