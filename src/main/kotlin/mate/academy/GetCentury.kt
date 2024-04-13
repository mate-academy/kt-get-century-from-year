package mate.academy

const val CENTURY = 100;
const val ONE = 1;

fun getCentury(year: Int) : Int {
    return if (year % CENTURY == 0) {
        year / CENTURY
    } else {
        year / CENTURY + ONE
    }

}
