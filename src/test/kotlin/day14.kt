import org.junit.Assert
import org.junit.Test

class Day14Test {

    private val exampleProblemString = Day14Test::class.java.getResource("example_day14.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day14ProblemReader(exampleProblemString)
        val solution = Day14(problem).solvePart1()

        Assert.assertEquals(165, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day14ProblemReader(exampleProblemString)
        val solution = Day14(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}