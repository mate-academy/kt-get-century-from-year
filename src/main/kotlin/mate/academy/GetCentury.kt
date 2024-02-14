package mate.academy

fun getCentury(year: Int) =
    if (year % YEARS_IN_CENTURY == ZERO_REMAINDER) year / YEARS_IN_CENTURY
    else year / YEARS_IN_CENTURY + ONE

const val YEARS_IN_CENTURY = 100
const val ZERO_REMAINDER = 0
const val ONE = 1
