package mate.academy

const val AGE_YEARS = 100
const val NEXT_YEAR_TO_AGE = 1
const val ZERO_AS_RESULT = 0
fun getCentury(year: Int) : Int {

    if (year % AGE_YEARS == ZERO_AS_RESULT) {
        return year / AGE_YEARS
    } else {
        return year / AGE_YEARS + NEXT_YEAR_TO_AGE
    }
}
