fun main() {

    var greeting = "hello world"
    var firstname = "Allan"
    var lastname = "Kimani"

    // String concatenation
    println(firstname + " "+lastname)
    println(firstname.plus(lastname))

    // Accessing an element in s string
    println(greeting[6])

    // Determinning an index position
    println(greeting.indexOf("world"))
    println(greeting.indexOf('h'))


    // Modifying a string
    println(greeting.uppercase())

    // String Interpolation
    println("Hello there, my name is $firstname $lastname")

    // Size of a string
    println(greeting.length)

}