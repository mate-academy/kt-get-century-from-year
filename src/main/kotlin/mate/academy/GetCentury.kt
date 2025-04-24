package mate.academy
private const val CENTURY = 100

fun getCentury(year: Int) : Int {
    if (year % CENTURY != 0) {
        return (year / CENTURY) + 1
    } else {
        return year / CENTURY
    }
}
