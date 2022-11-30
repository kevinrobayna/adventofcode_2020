import org.junit.Assert
import org.junit.Test

class Day15Test {

    @Test
    fun exampleProblemA_is_solvedCorrectly() {
        val problem = day15ProblemReader("0,3,6")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(436, solution)
    }

    @Test
    fun exampleProblemB_is_solvedCorrectly() {
        val problem = day15ProblemReader("1,3,2")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(1, solution)
    }

    @Test
    fun exampleProblemC_is_solvedCorrectly() {
        val problem = day15ProblemReader("2,1,3")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(10, solution)
    }

    @Test
    fun exampleProblemD_is_solvedCorrectly() {
        val problem = day15ProblemReader("1,2,3")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(27, solution)
    }

    @Test
    fun exampleProblemE_is_solvedCorrectly() {
        val problem = day15ProblemReader("2,3,1")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(78, solution)
    }

    @Test
    fun exampleProblemF_is_solvedCorrectly() {
        val problem = day15ProblemReader("3,2,1")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(438, solution)
    }

    @Test
    fun exampleProblemG_is_solvedCorrectly() {
        val problem = day15ProblemReader("3,1,2")
        val solution = Day15(problem).solvePart1()

        Assert.assertEquals(1836, solution)
    }

    @Test
    fun exampleProblemA_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("0,3,6")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(175594, solution)
    }

    @Test
    fun exampleProblemB_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("1,3,2")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(2578, solution)
    }

    @Test
    fun exampleProblemC_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("2,1,3")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(3544142, solution)
    }

    @Test
    fun exampleProblemD_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("1,2,3")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(261214, solution)
    }

    @Test
    fun exampleProblemE_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("2,3,1")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(6895259, solution)
    }

    @Test
    fun exampleProblemF_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("3,2,1")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(18, solution)
    }

    @Test
    fun exampleProblemG_part2_is_solvedCorrectly() {
        val problem = day15ProblemReader("3,1,2")
        val solution = Day15(problem).solvePart2()

        Assert.assertEquals(362, solution)
    }
}