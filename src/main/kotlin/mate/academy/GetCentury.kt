package mate.academy

const val YEAR_MULTIPLAER = 100
const val APP_YEAR = 1
val RANGE_TO_HUNDREDS = APP_YEAR..YEAR_MULTIPLAER

fun getCentury(year: Int) : Int {
    val rangeAfterHundreds = 1..year.toString().take(2).toInt() * YEAR_MULTIPLAER

    val century: Int = when {
        year in RANGE_TO_HUNDREDS -> year.toString().take(1).toInt()
        year in rangeAfterHundreds -> year.toString().take(2).toInt()
        else -> year.toString().take(2).toInt() + APP_YEAR
    }
    return century
}
