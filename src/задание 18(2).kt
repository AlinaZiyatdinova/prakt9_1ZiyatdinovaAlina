import kotlin.math.*
fun main() {
    var flag = true
    while (flag == true) {
        try {
            println("Введите координаты точки М1")
            println("x1:")
            var x1 = readLine()!!.toDouble()
            println("y1:")
            var y1 = readLine()!!.toDouble()
            println("Введите координаты точки М2")
            println("x1:")
            var x2 = readLine()!!.toDouble()
            println("y2:")
            var y2 = readLine()!!.toDouble()
            println("Введите координаты точки N1")
            println("x1:")
            var x3 = readLine()!!.toDouble()
            println("y3:")
            var y3 = readLine()!!.toDouble()
            println("Введите координаты точки N2")
            println("x1:")
            var x4 = readLine()!!.toDouble()
            println("y4:")
            var y4 = readLine()!!.toDouble()
            var pr1: Double = x1 * y2 - x2 * y1
            var pr2: Double = x3 * y4 - x4 * y3
            if ((pr1 == 0.0) && ((pr2 != 0.0))) {
                println("Прямые паралелльны")
            } else if ((pr1 == 0.0) && ((pr2 == 0.0))) {
                println("Прямые совпадают")
            } else {
                var x = ((y4 * y2 - x2 * y1) / (x1 * y2 - x2 * y1))
                var y = ((x2 * y3 - x1 * y4) / (x1 * y2 - x2 * y1))
                println("Прямые пересекаются в точке ($x,$y)")
            }
            flag = false
        } catch (e: Exception) {
            println("Возникло исключение! Повторите ввод")
            flag = true
        }
    }
}