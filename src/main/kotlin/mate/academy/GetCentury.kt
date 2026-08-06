package mate.academy

const val START = 0;
const val NUM_1 = 1;
const val NUM_2 = 2;
const val NUM_3 = 3;
const val NUM_4 = 4;
const val END_OF_YEAR = "0"

fun getCentury(year: Int): Int {
    val yearString = year.toString()
    val yearLength: Int = yearString.length;
    var result = 0

    if (yearLength == NUM_1) {
        result = NUM_1;
    }

    if (yearLength == NUM_3) {
        result = yearString.substring(START, NUM_1).toInt()
    }

    if (yearLength == NUM_4 && yearString.endsWith(END_OF_YEAR)) {
        result = yearString.substring(START, NUM_2).toInt()
    }

    if (yearLength == NUM_4 && !yearString.endsWith(END_OF_YEAR)) {
        result = yearString.substring(START, NUM_2).toInt() + NUM_1
    }

    return result
}
