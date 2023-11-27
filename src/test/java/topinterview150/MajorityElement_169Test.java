package topinterview150;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElement_169Test {
    public static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3,2,3}, 3),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void test(int[] nums, int answer) {
        var result = MajorityElement_169.majorityElement(nums);
        assertEquals(answer, result);
    }
}