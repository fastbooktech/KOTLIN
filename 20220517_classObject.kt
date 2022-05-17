package com.example.udemy7_class_object
fun main(){
    println("program started")
    val cheeseBurger : ThisisClass2 = ThisisClass2("CHEESE", "BURGER", 1)
    val chickenBurger = ThisisClass2("CHICKEN","BURGER", 2)
    val frenchFries = ThisisClass2("POTATO", "FRENCHFRIES", 1)
}
class ThisisClass1
class ThisisClass2 public constructor(mainTopping: String, type: String, num: Int ){
    init {
        println("Your menu is accepted")
        println("mainTopping is $mainTopping, type is $type, and you ordered $num $mainTopping $type")
    }
}