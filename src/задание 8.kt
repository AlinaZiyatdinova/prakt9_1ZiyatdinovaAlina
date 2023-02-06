import kotlin.math.*
fun main()
{
    var flag = true
    while (flag == true)
    {
        try
        {
            println("Введите а (a>0):")
            var a = readLine()!!.toDouble()
            while (a<=0.0)
            {
                println("Ошибка! а должно быть больше нуля!")
                a = readLine()!!.toDouble()
            }
            println("Введите b:")
            var b = readLine()!!.toDouble()
            println("Введите c:")
            var c = readLine()!!.toDouble()
            val x0 = -(b/(2*a))
            val y0 = -(((Math.pow(b,2.0))-(4*a*c))/(4*a))
            println("Вершина параболы - ($x0,$y0)")
            println("Коэффиценты: a-$a, b-$b, c-$c")
            flag = false
        }
        catch (e:Exception)
        {
            println("Возникло исключение! Повторите ввод:")
            flag = true
        }
    }
}