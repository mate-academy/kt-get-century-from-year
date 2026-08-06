package mate.academy
const val CENTURY = 100

fun getCentury(year: Int) : Int {
    return if (year % CENTURY > 0) year / CENTURY + 1 else year / CENTURY
}
