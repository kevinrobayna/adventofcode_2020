import org.junit.Assert
import org.junit.Test

class Day16Test {

    private val example = """
            class: 1-3 or 5-7
            row: 6-11 or 33-44
            seat: 13-40 or 45-50

            7,1,14

            nearby tickets:
            7,3,47
            40,4,50
            55,2,20
            38,6,12
        """.trimIndent()

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