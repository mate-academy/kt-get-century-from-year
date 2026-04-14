package mate.academy

private const val ONE_CENTURY = 100

fun getCentury(year: Int) : Int {
    return (ONE_CENTURY - 1 + year) / ONE_CENTURY
}
