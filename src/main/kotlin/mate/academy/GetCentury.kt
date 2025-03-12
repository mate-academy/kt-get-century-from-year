package mate.academy

const val ONE_CENTURY= 100
const val ZERO = 0

fun getCentury(year: Int) : Int {
    var centuries = year / ONE_CENTURY
    if (year % ONE_CENTURY > ZERO) {
        ++centuries
    }
    return centuries
}
