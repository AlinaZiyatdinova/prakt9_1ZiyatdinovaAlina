import kotlin.math.*
fun main() {
    var flag = true
    while (flag == true) {
        try {
            println("Введите сторону равностороннего треугольника (>0)")
            var a = readLine()!!.toDouble()
            while (a<=0.0)
            {
                println("Число должно быть больше нуля! Повторите ввод:")
                a = readLine()!!.toDouble()
            }
            var S = ((Math.pow(a,2.0)* sqrt(3.0))/4.0)
            var Rv = (a/(2.0* sqrt((3.0))))
            var Ro = (a/ sqrt(3.0))
            println("Площадь равностороннего треугольника - $S")
            println("Радиус описанной окружности - $Ro")
            println("Радиус вписанной окружности - $Rv")
            flag=false
        } catch (e: Exception) {
            println("Возникло исключение!")
            flag = true
        }
    }
}