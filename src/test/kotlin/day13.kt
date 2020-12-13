import org.junit.Assert
import org.junit.Test

class Day13Test {

    private val exampleProblemString = Day13Test::class.java.getResource("example_day13.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day13ProblemReader(exampleProblemString)
        val solution = Day13(problem).solvePart1()

        Assert.assertEquals(295, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day13ProblemReader(exampleProblemString)
        val solution = Day13(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}