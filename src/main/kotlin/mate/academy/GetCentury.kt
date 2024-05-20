package mate.academy

fun getCentury(year: Int): Int
= if (year % 100 == 0) year / 100 else year / 100 + 1
