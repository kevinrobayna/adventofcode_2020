import java.util.stream.Collectors

// https://adventofcode.com/2020/day/1
class Day1(
    private val values: List<Int>
) {
    fun solve(): List<Int> {
        val solutions: MutableList<Pair<Int, Int>> = mutableListOf()

        for (outLoop in values.indices) {
            for (innerLoop in values.indices) {
                if (!outLoop.equals(innerLoop) && elementsAdd2020(outLoop, innerLoop)) {
                    solutions.add(Pair(values[outLoop], values[innerLoop]))
                }
            }
        }

        return solutions.stream().map { it.first * it.second }.collect(Collectors.toSet()).toList()
    }

    private fun elementsAdd2020(outLoop: Int, innerLoop: Int) = values[outLoop] + values[innerLoop] == 2020
}


fun main() {
    val solutions = Day1(listOf(1721, 979, 366, 299, 675, 1456)).solve()
    println("solution = $solutions")
}