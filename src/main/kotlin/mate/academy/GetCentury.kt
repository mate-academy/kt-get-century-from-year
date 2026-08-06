package mate.academy

const val CENTURY = 100;
const val YEAR = 1;

fun getCentury(year: Int) : Int {
    return if (year % CENTURY == 0) {
        year / CENTURY
    } else {
        year / CENTURY + YEAR
    };
}
