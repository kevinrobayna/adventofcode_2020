import java.util.stream.Collectors

// https://adventofcode.com/2020/day/3
class Day3(
    private val forest: List<List<String>>
) {
    companion object {
        const val TREE = "#"
        const val DOWN = 1
        const val RIGHT = 3
    }

    fun solve(): Int {
        var position = Pair(0, 0)
        var treeCount = 0
        for (levels in forest.indices) {
            if (isTree(position.first, position.second)) {
                treeCount++
            }
            position = next(position.first, position.second)
        }
        return treeCount
    }

    fun next(x: Int, y: Int): Pair<Int, Int> {
        return Pair(x.plus(DOWN), y.plus(RIGHT) % forest[0].size)
    }

    fun isTree(x: Int, y: Int): Boolean {
        return forest[x][y] == TREE
    }

}

fun main() {
    val problem: List<List<String>> = buildMapFromString(Day3::class.java.getResource("day3.txt").readText())
    val solution = Day3(problem).solve()
    println("solution = $solution")
}

fun buildMapFromString(text: String): List<List<String>> = text
    .split('\n')
    .stream()
    .map { line ->
        line.trim()
            .split("")
            .stream()
            .filter { it != "" }
            .collect(Collectors.toList())
    }
    .collect(Collectors.toList())