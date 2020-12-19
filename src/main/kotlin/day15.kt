fun day15ProblemReader(text: String): List<String> {
    return text.split(',')
}

// https://adventofcode.com/2020/day/15
class Day15(
    private val spokenNumbers: List<String>,
) {

    fun solvePart1(): Long {
        val numbers = spokenNumbers.map { it.toLong() }.toMutableList()
        for (turn in (numbers.size + 1)..2020) {
            val lastSpoken = numbers[turn - 2]
            val spokenBefore = numbers.withIndex().filter { (_, value) -> value == lastSpoken }
            if (spokenBefore.isEmpty() || spokenBefore.size == 1) { // rule 1, first time then add 0
                numbers.add(0)
            } else { // rule 2, add difference of indexes
                numbers.add((turn - 1) - (spokenBefore[spokenBefore.size - 2].index.toLong() + 1))
            }
        }
        return numbers[2020 - 1]
    }

    fun solvePart2(): Long {
        return 0
    }
}

fun main() {
    val problem = day15ProblemReader("2,0,1,9,5,19")
    println("solution = ${Day15(problem).solvePart1()}")
    println("solution part2 = ${Day15(problem).solvePart2()}")
}