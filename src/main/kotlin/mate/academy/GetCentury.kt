package mate.academy

const val ONE = 1
const val CENTURY = 100

fun getCentury(year: Int) : Int {
    val result = year / CENTURY
    if (year % CENTURY != 0) {
        return result + ONE
    }
    return result
}
