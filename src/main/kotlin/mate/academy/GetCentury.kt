package mate.academy

fun getCentury(year: Int) : Int {
    if (year / 100 != 0) {
        if (year % 10 != 0) {
            return year / 100 + 1
        }
    } else {
        return year
    }
    return 0
}
