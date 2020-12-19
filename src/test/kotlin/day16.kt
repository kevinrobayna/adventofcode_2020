import org.junit.Assert
import org.junit.Test

class Day16Test {

    private val example = Day16Test::class.java.getResource("example_day16.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day16ProblemReader(example)
        val solution = Day16(problem).solvePart1()

        Assert.assertEquals(71, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day16ProblemReader(example)
        val solution = Day16(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}