//flow control
// if/else
if (1<3) println("impossible") else println("the world is dum")
if (1>3) {
  println("Impossible")
  println("Really")
}
else {
  println("The world makes sense")
  println("still.")
}

//Matching
val number = "that"
number match {
  case "that" => println("one")
  case "2" => println("Two")
  case "3" => println("Three")
  case "_" => println("Something else")
}
for (x<- 1 to 4) {
  val squared = x*x
  println(squared)
}
var x = 10
while (x>=0) {
  println(x)
  x-=1
}
x = 0
do { println(x); x+=1} while (x<=10)
// Expressions
{val x =10; x+20}
println({val x = 10; x+20})
// Fibonacci sequence

var k_1 = 0
var k_2 = 1
var y = 0
println(k_1)
println(k_2)
for (x <- 0 to 10) {
  y = k_1 + k_2
  println(y)
  k_1 = k_2
  k_2 = y
}
