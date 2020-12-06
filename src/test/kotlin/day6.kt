import org.junit.Assert
import kotlin.test.Test

class Day6Test {

    private val smallProblemString = Day6Test::class.java.getResource("small_example_day6.txt").readText()
    private val exampleProblemString = Day6Test::class.java.getResource("example_day6.txt").readText()

    @Test
    fun smallProblem_is_read_correctly() {
        val problem = day6ProblemReader(smallProblemString)

        Assert.assertEquals(1, problem.size)
        Assert.assertEquals(6, problem[0].size)
    }

    @Test
    fun exampleProblem_is_read_correctly() {
        val problem = day6ProblemReader(exampleProblemString)

        Assert.assertEquals(5, problem.size)
        Assert.assertEquals(3, problem[0].size)
        Assert.assertEquals(3, problem[1].size)
        Assert.assertEquals(3, problem[2].size)
        Assert.assertEquals(1, problem[3].size)
        Assert.assertEquals(1, problem[4].size)
    }

    @Test
    fun smallProblem_is_solved_correctly() {
        val problem = day6ProblemReader(smallProblemString)
        val solution = Day6(problem).solve()

        Assert.assertEquals(6, solution)
    }

    @Test
    fun exampleProblem_is_solved_correctly() {
        val problem = day6ProblemReader(exampleProblemString)
        val solution = Day6(problem).solve()

        Assert.assertEquals(11, solution)
    }


}