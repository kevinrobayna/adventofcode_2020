import org.junit.Assert
import org.junit.Test

class Day12Test {

    private val exampleProblemString = Day12Test::class.java.getResource("example_day12.txt").readText()

    @Test
    fun exampleProblem_is_solvedCorrectly() {
        val problem = day12ProblemReader(exampleProblemString)
        val solution = Day12(problem).solvePart1()

        Assert.assertEquals(25, solution)
    }


    @Test
    fun exampleProblem_part2_is_solvedCorrectly() {
        val problem = day12ProblemReader(exampleProblemString)
        val solution = Day12(problem).solvePart2()

        Assert.assertEquals(0, solution)
    }

}