fun main() {
    var languages = arrayOf("Python","Kotlin","JavaScript","C#","C++")
    println(languages[2])

    // Reassgning a value
    languages[2] = "Php"
    println(languages[2])

    //looping through array
    for (lang in languages){
        println(lang)
    }

    // Determing whether an element exists
    if ("Php" in languages){
        println("It exists")
    }
    else{
        println("It doesn't exists")
    }



}