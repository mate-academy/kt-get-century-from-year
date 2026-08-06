package mate.academy

const val CENTURY = 100
const val ONE = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    val centuries = year / CENTURY
    if (year % CENTURY > ZERO){
        return centuries + ONE
    }
    return centuries
}
