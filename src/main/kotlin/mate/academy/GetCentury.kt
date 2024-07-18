package mate.academy

fun getCentury(year: Int) : Int {
      val result = if (year % 2 == 0) {
        year / 100
    }
    else {
        year / 100 + 1
    }
    return result
}