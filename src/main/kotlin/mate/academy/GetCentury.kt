package mate.academy

private const val ONE_CENTURY = 100

fun getCentury(year: Int) : Int {
    var century = year / ONE_CENTURY;

    if (year % ONE_CENTURY != 0) {
        century++
    }

    return century
}
