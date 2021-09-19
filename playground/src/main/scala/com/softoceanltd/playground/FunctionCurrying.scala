package com.softoceanltd.playground

object FunctionCurrying {
    def main(args: Array[String]): Unit = {

        // simple function:
        def plus(a: Int, b: Int): Int = a + b
        val result = plus(a=1, b=2)
        println(result)

        // can be implemented with func taking a and another func
        def plusV2(a: Int): Int => Int = b => a + b
        val secondFunc = plusV2(a=1)
        val resultV2 = secondFunc(2)
        println(resultV2)
        // It is similar to javascript reduce
        println(
            List(1,2,3,4,5).foldLeft(0){ (acc, current) => acc + current}
        )
        println(
            List(1,2,3,4,5).foldLeft(0)(_ + _)
        )

        // class can be defined wherever
        class Calculator(a: Int) {
            println("body of the class is executed during constracion")
            def add(b: Int): Int = a + b
        }
        val c = new Calculator(a = 1)
        val result1 = c.add(b=2)
        println(result1)
         
        // Object, class hidding in object
        val C = {
            class C$  // create singelton instance
            new C$
        }

        // companion objhect for clases and traits
        object ObjCalc {
            // like a static method
            var calcsCreated: Int = _

            // more protected way
            def protectedCalcsCreated: Int = _protectedCalcsCreated
            private var _protectedCalcsCreated: Int = 0
            private def protectedCalcsCreated_=(newValue: Int): Unit = _protectedCalcsCreated = newValue
        }
        class ObjCalc(a: Int) {
            ObjCalc.calcsCreated += 1
            ObjCalc.protectedCalcsCreated += 1
            def add(b: Int): Int = a + b
        }
        val myObjCalc1 = new ObjCalc(a=1)
        val myObjCalc2 = new ObjCalc(a=2)
        println(ObjCalc.calcsCreated)
        println(ObjCalc.protectedCalcsCreated)

        println("--" * 50) 
    }
}