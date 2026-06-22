package mate.academy

fun getCentury(year: Int) : Int {
    val rowCentury = year / 100
    if (year % 100 == 0) {
        return rowCentury
    } else {
        return rowCentury + 1
    }
}
