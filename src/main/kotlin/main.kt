import javax.print.attribute.IntegerSyntax

import java.lang.Math
import java.util.ArrayList

// programiz.com/kotlin-programming/constructors
class Die (sides : Int){

//    https://www.programiz.com/kotlin-programming/class-objects
//    properties
    private var sides : Int = sides
    private var result : Int = 1

//    member functions


    fun display(){
        println("d$sides -> $result")
    }

    fun roll(){
        result = (1..(sides)).random()
    }

}

class DiceBag (){
    private var diceBag = ArrayList<Die>(0)

    fun rollAll(){
//        loop that calls roll() and display() for each element of diceBag

    }
}


fun main(args: Array<String>) {

    val d4 = Die(4)
    d4.roll()
    d4.display()


}