import org.junit.Assert
import org.junit.Test

class Day11Test {

    private val exampleProblemString = Day11Test::class.java.getResource("example_day11.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day11ProblemReader(exampleProblemString)
        val solution = Day11(problem).solvePart1()

        Assert.assertEquals(37, solution)
    }


    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day11ProblemReader(exampleProblemString)
        val solution = Day11(problem).solvePart2()

        Assert.assertEquals(26, solution)
    }

}