package mate.academy

fun getCentury(year: Int) : Int {
    val sum = if(year%100 > 0) 1 else 0
    println(year%100)
    val sen = sum + year/100
    return sen
}
