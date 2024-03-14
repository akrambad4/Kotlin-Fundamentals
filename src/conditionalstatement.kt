import java.util.Scanner

fun main() {
    val room = 25
    var reader = Scanner(System.`in`)

    print("Enter room temperature : ")
    var temperature = reader.nextInt()

    if (temperature > room){
        println("Temperature is hot")
    }
    else{
        println("Temperature is cold")
    }
}