package mate.academy

fun getCentury(year: Int) : Int {
    return if (year % 100 == 0) {
        year / 100
    } else {
        year / 100 + 1
    }
}
