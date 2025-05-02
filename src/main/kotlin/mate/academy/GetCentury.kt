package mate.academy

const val DEL = 100
fun getCentury(year: Int) : Int {
    val sum = if(year%DEL > 0) 1 else 0
    println(year%DEL)
    val sen = sum + year/DEL
    return sen
}
