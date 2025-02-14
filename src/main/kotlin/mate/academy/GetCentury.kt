package mate.academy

fun getCentury(year: Int) : Int {
    if (year % 100 != 0) {
        return year / 100 + 1
    }
    return year / 100
}
