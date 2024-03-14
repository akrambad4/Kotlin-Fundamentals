class Dog(var name:String,var breed:String,var age:Int){

    fun move(movement:String){
        println("The dog is $movement")
    }
}

fun main() {
    var dog1 = Dog("Bob","Bulldog",6)
    var dog2 = Dog("Tracey","Chiwawa",5)
    var dog3 = Dog("Bob","Pitbull",8)
    var dog4 = Dog("Alex","German Shepherd",7)

    println(dog1.name)
    println(dog1.breed)
    println(dog1.age)

    dog1.move("walking")
    dog2.move("running")
}