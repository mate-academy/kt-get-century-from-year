package mate.academy

private const val RANGE: Int = 100

fun getCentury(year: Int): Int {
    val century: Int = (year - 1) / RANGE + 1
    return century
}
