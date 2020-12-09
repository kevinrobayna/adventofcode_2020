import org.junit.Assert
import org.junit.Test

class Day9Test {

    private val exampleProblemString = Day9Test::class.java.getResource("example_day9.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day9ProblemReader(exampleProblemString)
        val solution = Day9(problem, 5).solvePart1()

        Assert.assertEquals(127, solution)
    }

    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day9ProblemReader(exampleProblemString)
        val solution = Day9(problem, 5).solvePart2()

        Assert.assertEquals(62, solution)
    }



}