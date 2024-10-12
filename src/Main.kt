fun main() {

    val addition = operation.add(10)
    val subtraction = operation.subtract(3)
    val multiplication = operation.multiply(4)

    println(evaluate(addition))
    println(evaluate(subtraction))
    println(evaluate(multiplication))

    println("==================")

    val rectangle = rectangle(width = 4.5 , height = 5.6)
    val circle = circle(5.0)

    println(calculatearea(rectangle))
    println(calculatearea(circle))
}
sealed  class operation {

    class add(val value : Int) : operation(){}
    class subtract(val value : Int) : operation(){}
    class multiply(val value : Int) : operation(){}
}
fun evaluate(op : operation) : Int {
     return when(op) {
         is operation.add -> op.value + 5
         is operation.subtract -> 5 -  op.value
         is operation.multiply -> 5 * op.value
     }

}
sealed interface shape
class rectangle(val width : Double , val height : Double) : shape
class circle (val radius : Double) : shape

fun calculatearea(shape:shape) : Double {
    return when(shape) {
        is rectangle -> shape.width * shape.height
        is circle -> shape.radius * shape.radius
    }
}