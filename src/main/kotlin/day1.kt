import java.util.stream.Collectors

// https://adventofcode.com/2020/day/1
class Day1(
    private val values: List<Int>
) {
    fun solve(): List<Pair<Int, Int>> {
        val pairs: MutableList<Pair<Int, Int>> = mutableListOf()

        for (outLoop in values.indices) {
            for (innerLoop in values.indices) {
                if (!outLoop.equals(innerLoop)) {
                    val first = Math.max(values[outLoop], values[innerLoop])
                    val second = Math.min(values[outLoop], values[innerLoop])
                    pairs.add(Pair(first, second))
                }
            }
        }

        return pairs
            .filter { it.first + it.second == 2020 }
            .distinct()
    }
}


fun main() {
    val solutions = Day1(listOf(1721, 979, 366, 299, 675, 1456)).solve()
    println("solution = $solutions, x*y = ${solutions[0].first * solutions[0].second}")
}