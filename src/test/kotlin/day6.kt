import org.junit.Assert
import kotlin.test.Test

class Day6Test {

    private val smallProblemString = Day6Test::class.java.getResource("small_example_day6.txt").readText()
    private val exampleProblemString = Day6Test::class.java.getResource("example_day6.txt").readText()

    @Test
    fun smallProblem_is_read_correctly() {
        val problem = day6ProblemReader(smallProblemString)

        Assert.assertEquals(1, problem.size)
        Assert.assertEquals(3, problem[0].size) // three people
        Assert.assertEquals(4, problem[0][0].size) // each person replied yes to 4 questions
    }

    @Test
    fun exampleProblem_is_read_correctly() {
        val problem = day6ProblemReader(exampleProblemString)

        Assert.assertEquals(5, problem.size)
        Assert.assertEquals(1, problem[0].size) // one person
        Assert.assertEquals(3, problem[0][0].size) // this person replied yes to 3 questions
    }

    @Test
    fun smallProblem_is_solved_correctly() {
        val problem = day6ProblemReader(smallProblemString)
        val solution = Day6(problem).solveAnyone()

        Assert.assertEquals(6, solution)
    }

    @Test
    fun exampleProblem_is_solved_correctly() {
        val problem = day6ProblemReader(exampleProblemString)
        val solution = Day6(problem).solveAnyone()

        Assert.assertEquals(11, solution)
    }

    @Test
    fun exampleProblem_par2_is_solved_correctly() {
        val problem = day6ProblemReader(exampleProblemString)
        val solution = Day6(problem).solveEveryone()

        Assert.assertEquals(6, solution)
    }


}