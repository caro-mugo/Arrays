import kotlin.system.measureNanoTime

fun main(){
nameofgirls(arrayOf("carol","godona","faith","maxwell"))
cities(arrayOf("harare","mumbai","dodoma","jakarta"))
    getNumbers(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    girlsName(arrayOf("caro","sheilang","skish"))

}
fun nameofgirls(name: Array<String>){
    println(name.contentToString())

    }
fun cities(name:Array<String>){
    name.forEach { names ->
        println(names.capitalize())

    }
}
fun getNumbers(name:Array<Int>){
    var numbers= name[2]+name[5]
    println(numbers)

    var answer=name.indexOf(158)
    println(answer)
    var add=name.sortedArray()
    println(add.contentToString())
}
fun girlsName(names: Array<String>): Array< String>{
    var name=names
    println(name.contentToString())
    return name
}

