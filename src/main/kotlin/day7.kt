data class Bag(
    val tag: String,
    val count: Int
)

fun day7ProblemReader(string: String): Map<String, List<Bag>> {
    return string
        .split("\n")
        .map { line ->
            line
                .replace("bags", "bag")
                .replace(".", "")
                .replace(" contain", ",")
        }
        .map { line ->
            line.split(",")
                .map { it.trim() }
                .toList()
        }
        .filter { it.size > 1 }
        .map { line ->
            val listOfBags = mutableListOf<Bag>()
            val key = line[0]
            for (inx in line.indices) {
                if (inx != 0) {
                    val tag = line[inx].filter { !it.isDigit() }.trim()
                    val count = line[inx].filter { it.isDigit() }
                    if (count.isEmpty()) {
                        listOfBags.add(Bag(tag, 0))
                    } else {
                        listOfBags.add(Bag(tag, count.toInt()))
                    }
                }
            }
            key to listOfBags
        }
        .toMap()
}


// https://adventofcode.com/2020/day/7
class Day7(
    private val bags: Map<String, List<Bag>>,
) {

    companion object {
        const val GOLD = "shiny gold bag"
    }

    fun solveAtLeastOneGold(): Int {
        val isGold = mutableMapOf<String, Lazy<Boolean>>()
        for ((key: String, items: List<Bag>) in bags) {
            isGold[key] = lazy(LazyThreadSafetyMode.NONE) {
                items.any { (tag, _) -> tag == GOLD || isGold[tag]?.value == true }
            }
        }
        return isGold.values.count { it.value }
    }

}

fun main() {
    val problem = day7ProblemReader(Day6::class.java.getResource("day7.txt").readText())
    println("solution = ${Day7(problem).solveAtLeastOneGold()}")
}