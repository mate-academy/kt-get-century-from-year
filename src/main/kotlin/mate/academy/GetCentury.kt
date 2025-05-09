package mate.academy

private const val CENTURY_LENGTH = 100

fun getCentury(year: Int) : Int {
    val temp = year / CENTURY_LENGTH
    val diff = year % CENTURY_LENGTH
    return if (diff == 0) {
        temp
    } else {
        temp + 1
    }
}
