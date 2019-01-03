import spock.lang.Specification
import spock.lang.Unroll

class BuildingTest extends Specification {
    @Unroll
    def "Should return number of strokes required to paint a building"() {
        given:
        Building building = new Building()

        when:
        def result = building.solution(inputArray)

        then:
        result == expected

        where:
        inputArray                                 | expected
        [1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2] as int[] | 9
        [1, 1, 1, 1, 1, 1] as int[]                | 1
        [5, 8] as int[]                            | 8
        [5, 1, 2, 1, 1, 999999999] as int[]        | -1
    }
}
