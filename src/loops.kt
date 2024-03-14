fun main() {

    //while loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    var x = 100
    while (x >= 95){
        println("Counter is $x")
        x--
    }

    // Do...while loop

    var num = 20
    do{
        println(num)
        num++
    }while (num <= 25)

    //for loop
    var furniture = arrayOf("Table","Chair","Desk",)
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(40,50,60,70,80,90)
    for (mark in marks){
        println(mark)
    }

    for (numbers in 30..35){
        println(numbers)
    }

    for (letters in 'a'..'d'){
        println(letters)
    }



}