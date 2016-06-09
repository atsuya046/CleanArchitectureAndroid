package domain

class FizzBuzz(private val input: Int) {

    fun result(): String {
        return when {
            dividableWith(3) && dividableWith(5) -> "FizzBuzz"
            dividableWith(3) -> "Fizz"
            dividableWith(5) -> "Buzz"
            else -> input.toString()
        }
    }

    private fun dividableWith(num: Int): Boolean {
        return input % num == 0
    }
}