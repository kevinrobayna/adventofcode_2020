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

// https://adventofcode.com/2020/day/1
class Day1Part2(
    private val values: List<Int>
) {
    fun solve(): Triple<Int, Int, Int> {
        val tuples: MutableList<Triple<Int, Int, Int>> = mutableListOf()

        for (outLoop in values) {
            for (innerLoop in values) {
                for (innerInnerLoop in values) {
                    val points = listOf(outLoop, innerLoop, innerInnerLoop).sorted()
                    tuples.add(Triple(points[0], points[1], points[2]))
                }
            }
        }

        return tuples
            .filter { it.first.plus(it.second).plus(it.third) == 2020 }
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
    val triple = Day1Part2(problem).solve()
    println("solution = $triple, x*y*z = ${triple.first * triple.second * triple.third}")
}