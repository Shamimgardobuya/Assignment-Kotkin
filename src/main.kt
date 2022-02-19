fun main() {
   add(3,2,1,4)
    activity("writing","Drawing")
divide(12 ,5)
greeting("Angela")

}
fun add(a:Int, b:Int, c:Int,d:Int):Int {
    var sum = a + b + c + d
    return sum
}
fun activity(hobbies1: String,hobbies2: String){
    println(hobbies1)
    println(hobbies2)
}
fun divide(a:Int, b:Int):Int{
    var modulus = a%b
    return modulus
}
fun greeting(name:String){
    println("Hello $name")
}