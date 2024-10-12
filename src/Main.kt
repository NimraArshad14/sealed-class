fun main() {

    val addition = operation.add(10)
    val subtraction = operation.subtract(3)
    val multiplication = operation.multiply(4)

    println(evaluate(addition))
    println(evaluate(subtraction))
    println(evaluate(multiplication))
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