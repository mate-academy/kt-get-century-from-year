package mate.academy

const val CENTURY_LENGTH = 100

fun getCentury(year: Int) : Int {
    if (year % CENTURY_LENGTH == 0) {
        return year / CENTURY_LENGTH
    }
    return year / CENTURY_LENGTH + 1
}
