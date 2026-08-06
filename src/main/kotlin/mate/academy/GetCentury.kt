package mate.academy

private const val ONE_HUNDRED = 100
private const val ONE = 1

fun getCentury(year: Int) : Int {
    if (year % ONE_HUNDRED == 0) {
        return year / ONE_HUNDRED
    }
    return  year / ONE_HUNDRED + ONE
}
