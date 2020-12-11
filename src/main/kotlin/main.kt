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

//    https://stackoverflow.com/questions/45685026/how-can-i-get-a-random-number-in-kotlin
    fun roll(){
        result = (1..(sides)).random()
    }

}

class DiceBag (){
    private var diceBag = ArrayList<Die>(0)

//    https://kotlinlang.org/docs/reference/control-flow.html
    fun rollAll(){
//        loop that calls roll() and display() for each element of diceBag
        for (item : Die in diceBag)
        {
            item.roll()
            item.display()
        }
    }

    fun add(die : Die){
        diceBag.add(die)
    }
}


fun main(args: Array<String>) {

    val bag = DiceBag()
    bag.add(Die(2))
    bag.add(Die(4))
    bag.add(Die(6))
    bag.add(Die(8))
    bag.add(Die(10))
    bag.add(Die(12))
    bag.rollAll()

}