fun day9ProblemReader(string: String): List<Long> {
    return string
        .split("\n")
        .map { line -> line.toLong() }
        .toList()
}


// https://adventofcode.com/2020/day/9
class Day9(
    private val numbers: List<Long>,
    private val preamble: Int,
) {

    fun solvePart1(): Long {
        for (inx in preamble..numbers.size) {
            val previousFile = numbers.slice((inx-preamble)..inx)
            if (!calculateAllCombinations(previousFile).contains(numbers[inx])) {
                return numbers[inx]
            }
        }
        return 0
    }

    private fun calculateAllCombinations(subset: List<Long>): Set<Long> {
        val additions = mutableSetOf<Long>()
        for (n1 in subset) {
            for (n2 in subset) {
                if (n1 != n2) {
                    additions.add(n1.plus(n2))
                }
            }
        }
        return additions;
    }

}

fun main() {
    val problem = day9ProblemReader(Day9::class.java.getResource("day9.txt").readText())
    println("solution = ${Day9(problem, 25).solvePart1()}")
}