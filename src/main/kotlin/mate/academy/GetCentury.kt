package mate.academy

const val CENTURY = 100

fun getCentury(year: Int) : Int {
    if (year % CENTURY != 0) {
        return (year / CENTURY) + 1
    }
    return year / CENTURY
}
