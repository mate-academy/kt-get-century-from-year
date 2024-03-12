package mate.academy

const val CENTURY = 100

fun getCentury(year: Int) : Int {
    val centuries = year / CENTURY
    if (year % CENTURY > 0) {
        return centuries + 1
    }
    return centuries
}
