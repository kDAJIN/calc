package caculator

// Lv3 : AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기)
// 연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기
// 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경하기
// 나머지 연산자(%) 기능은 제외합니다.
// Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
// hint. 클래스의 책임(단일책임원칙)

fun main() {


       println("계산기를 실행합니다.")
       println("계산을 진행할 두 수를 입력해 주세요.(정수만 가능)")

       var num11 = readLine()!!.toInt()
       var num22 = readLine()!!.toInt()

       var calc = Calculator3(num11, num22)
       var add = AddOper(num11, num22)
       var sub = SubstractOper(num11, num22)
       var mul = MultiplyOper(num11, num22)
       var div = DivideOper(num11, num22)

       println("진행할 계산을 선택해 주세요.")
       println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈")

       var operator = readLine()!!.toInt()

       if(operator==1) {  add.add()

       } else if(operator==2) { sub.sub()

       } else if(operator==3) { mul.mul()

       } else if(operator==4) { div.div()

       } else {
           print("잘못된 입력 입니다.계산을 종료 합니다.")
       }



}



open class Calculator3 {
    var num1: Int = 0
    var num2: Int = 0

    constructor(_num1: Int, _num2: Int) {
        num1 = _num1
        num2 = _num2
    }

}

class AddOper (_num1: Int, _num2: Int) : Calculator3(_num1, _num2) {

    fun add() {
        var result_add = num1 + num2

        println("덧셈 결과: ${result_add}")
    }

}

    class SubstractOper (_num1: Int, _num2: Int) : Calculator3(_num1, _num2) {

        fun sub() {
            var result_sub = num1 - num2

            println("뺄셈 결과: ${result_sub}")
        }

    }

    class MultiplyOper(_num1: Int, _num2: Int) : Calculator3(_num1, _num2) {

        fun mul() {
            var result_mul = num1 * num2

            println("곱셈 결과: ${result_mul}")
        }

    }

    class DivideOper(_num1: Int, _num2: Int) : Calculator3(_num1, _num2) {

        fun div() {
            var result_div = num1 / num2

            println("나눗셈 결과(몫): ${result_div}")
        }

    }