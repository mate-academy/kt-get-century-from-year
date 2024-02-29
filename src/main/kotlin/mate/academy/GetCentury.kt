package mate.academy

const val CENTURY = 100
const val ONE = 1
fun getCentury(year: Int) : Int {
    if (year % CENTURY == 0) {
        return year/ CENTURY
    }
    return year/ CENTURY + ONE
}
