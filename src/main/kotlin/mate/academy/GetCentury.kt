package mate.academy

const val NUMBER_OF_CHARS_TO_DROP = 2
const val ZERO = 0

fun getCentury(year: Int) : Int {
    val dateCharArray = "0000".toCharArray()

    for ((index, value) in year.toString().reversed().toCharArray().withIndex()) {
        dateCharArray[index] = value
    }

    val localYear = dateCharArray
        .map { it.toString() }
        .reduce { result, e -> "$result$e" }
        .reversed()

    var century = localYear.dropLast(NUMBER_OF_CHARS_TO_DROP).toInt()
    val decade = localYear.drop(NUMBER_OF_CHARS_TO_DROP).toInt()
    if (decade > ZERO) {
        return ++century
    }
    return century
}
