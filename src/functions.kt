fun main() {
    // Predefined functions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println("Minimum value is $x")

    var y = Math.max(90,124)
    println("The maximum value is $y")

    var z = Math.round(45.98)
    println(z)

    name()

    products(12,12)
    products(13,12)
    products(14,12)

    details("Allan",18)
    details("Joe",56)
    details("Mary",21)

}


// User defined function

fun name() {
    println("Allan")
}


fun products(num1:Int, num2:Int) {
    println(num1*num2)
}


fun details(name:String, age:Int){
    println("$name is $age years old")
}
