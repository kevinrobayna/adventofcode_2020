import org.junit.Assert
import org.junit.Test

class Day19Test {

    private val example = Day19Test::class.java.getResource("example_day19.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day19ProblemReader(example)
        val solution = Day19(problem).solvePart1()

        Assert.assertEquals(2, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day19ProblemReader(example)
        val solution = Day19(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}