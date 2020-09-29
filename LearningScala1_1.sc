// Values are immutable constants
val hello: String = "Hola!"
// Variables are mutable
var helloThere: String = hello
helloThere = hello+" There!"
println(helloThere)
val immutableHelloThere = hello + " There"
println(immutableHelloThere)
// Data type

val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.1425
val piSinglePrecision: Float = 3.122f
val bigNumber: Long=112233444
val smallNumber: Byte = 127
 println("Here is a mess: " + numberOne + truth + letterA + pi)
println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")
println(s"I can use the s prefix to use variables like $numberOne $truth")
println(s"The s prefix in't limited to varibales; I can include any expressin. like ${1+2}")

val theUltimateAnswer: String = "To life, 42 and everything "
val pattern = """.* ([\d]+).*""".r
val pattern(answersString) = theUltimateAnswer
val answer = answersString.toInt
println(answer)
// Boolean
val isGreater = 1>2
val isLesser = 1<2
val impossible = isGreater & isLesser
val anotherWay = isGreater || isLesser
val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain

val pi_number: Double = 3.142356789
val double_pi = pi_number*2
println(f"the double number of pi is $double_pi%.3f")

