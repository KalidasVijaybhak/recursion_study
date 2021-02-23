fun main(args: Array<String>) {
  println("Hello world!")
  print(factorial(5))
}

fun factorial(num :Int):Int{


if(num == 0)
  return 1

else
  return num*factorial(num-1)

}
