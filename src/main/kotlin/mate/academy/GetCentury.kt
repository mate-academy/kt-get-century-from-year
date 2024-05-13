package mate.academy

fun getCentury(year: Int) : Int {
    val remindResult = year % 100
    return if (remindResult == 0) {
        year / 100
    } else {
        (year / 100) + 1
    }
}
