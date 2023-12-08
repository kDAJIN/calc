package calculator

fun main() {
    println("계산기를 실행합니다.")
    println("계산을 진행할 연산식을 입력해주세요.")

    val num11 = readLine()!!.toInt()
    val operator = readLine()!!.toString()
    val num22 = readLine()!!.toInt()
    val calc = Calculator2(num11,num22)




        if (operator == "+") {
            calc.add()
        } else if (operator =="-") {
            calc.sub()
        } else if (operator == "*") {
            calc.mul()
        } else if (operator == "/") {
            calc.div()
        } else if (operator == "%") {
            calc.rev()

        } else {
            println() { "잘못된 연산자 입니다.계산을 종료 합니다." }
        }


}

class Calculator2 {

    var num1:Int = 0
    var num2:Int = 0

    constructor(_num1:Int,_num2:Int){
        num1 = _num1
        num2 = _num2
    }

    fun add() {
        val result_add = num1 + num2
        println("덧셈 결과: ${result_add}")
    }

    fun sub() {
        val result_sub = num1 - num2
        println("뺄셈 결과: ${result_sub}")
    }

    fun mul() {
        val result_mul = num1 * num2
        println("곱셈 결과: ${result_mul}")
    }

    fun div() {
        val result_div = num1 / num2
        println("나눗셈 결과: ${result_div}")
    }

    fun rev() {
        val result_rev = num1 % num2
        println("나머지 값 결과: ${result_rev}")
    }

}
