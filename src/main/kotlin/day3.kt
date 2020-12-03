import java.util.stream.Collectors

class Day3(
    private val map: List<List<String>>
) {
    fun solve(): Int {
        return map.size
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