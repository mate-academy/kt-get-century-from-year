package mate.academy

fun getCentury(year: Int) : Int {
    if (year % 100 == 0) {
        return year / 100
    }
    return year / 100 + 1
}
