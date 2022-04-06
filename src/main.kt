fun main(){
    number(67)
    println(name(arrayOf("wangeshi","amani","tsumani")))
    decision(6)
    decision(12)
    decision(20)
    multiplication()

}
fun number(nums:Int){
    for (nums in 1..100){
        if ((nums%2!=0)){
                println(nums)
        }
  }

    }
fun name(names:Array<String>):Int{
    var name = 0
    names.forEach{x->
        if (x.length>5){
        name++
    }

}
    return name
}
fun decision(age:Int){
    if (age>6){
    println("glass of milk")
}
else if(age>6 && age >15){
    println("fanta orange ")
}
    else{
        println(" cocacola")
    }
}
fun multiplication() {
    for (f in 1..100) {
        if (f % 3 == 0) {
            println("Fizz")
        } else if (f % 5 == 0) {
            println("Buzz")
        }
        if(f%3==0 && f%5==0){
            println("FizzBuzz")

        }
    }
}



