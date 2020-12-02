import java.util.stream.Collectors

// https://adventofcode.com/2020/day/1
class Day1(
    private val values: List<Int>
) {
    fun solve(): Pair<Int, Int> {
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
            .get(0)
    }
}


fun main() {
    val problem = Day1::class.java.getResource("day1.txt")
        .readText()
        .split('\n')
        .stream()
        .map { it.toInt() }
        .collect(Collectors.toList())
    val pair = Day1(problem).solve()
    println("solution = $pair, x*y = ${pair.first * pair.second}")
}