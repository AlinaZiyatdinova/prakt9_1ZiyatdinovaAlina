import kotlin.math.*
fun main()
{
    var flag = true
    var est = ""
    while (flag == true) {
        try {
            println("Введите длину отрезка a:")
            var a = readLine()!!.toDouble()
            while (a<=0.0)
            {
                println("Число должно быть больше нуля!")
                println("Введите длину отрезка a:")
                a = readLine()!!.toDouble()
            }
            println("Введите длину отрезка b:")
            var b = readLine()!!.toDouble()
            while (b<=0.0)
            {
                println("Число должно быть больше нуля!")
                println("Введите длину отрезка a:")
                b = readLine()!!.toDouble()
            }
            println("Введите длину отрезка c:")
            var c = readLine()!!.toDouble()
            while (c<=0.0)
            {
                println("Число должно быть больше нуля!")
                println("Введите длину отрезка a:")
                c = readLine()!!.toDouble()
            }
            if (a+b>c)
            {
                if (a+c>b)
                {
                    if (b+c>a)
                    {
                        var p = (a+b+c)/2.0
                        var S = sqrt(p*(p-a)*(p-b)*(p-c))
                        var P = a+b+c

                        println ("Треугольник существует. \nПлощадь = $S\nПериметер = $P")
                    }
                }
            }
            else
                println ("Такой треугольник не существует.")
            flag = false
        }
        catch (e:Exception)
        {
            println("Возникло исключение! Повторите ввод")
            flag = true
        }
    }
}
