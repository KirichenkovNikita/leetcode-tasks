package topinterview150;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArray_26Test {
    public static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, 2),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void test(int[] nums, int answer) {
        var result = RemoveDuplicatesFromSortedArray_26.removeDuplicates(nums);
        assertEquals(answer, result);
    }
}