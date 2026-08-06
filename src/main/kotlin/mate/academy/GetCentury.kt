package mate.academy

const val YEARS_IN_CENTURY = 100
const val ADDITIONAL_CENTURY = 1

fun getCentury(year: Int): Int
= if (year % YEARS_IN_CENTURY == 0) year / YEARS_IN_CENTURY else year / YEARS_IN_CENTURY + ADDITIONAL_CENTURY
