//Parent class
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//Child class
class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}

class parallelogram:Shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main() {
    var s = Shape()
    s.draw()

    var r = Rhombus()
    r.draw()

    var p = parallelogram()
    p.draw()


}