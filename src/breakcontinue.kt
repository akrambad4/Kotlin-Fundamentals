fun main() {

    // Break Statement
    for (x in 50..55){
        if (x == 54){
            break
        }
        println(x)
    }

    // Continue statement
    for (y in 'd'..'h'){
        if (y == 'e'){
            continue
        }
        println("Character is $y")
    }

}