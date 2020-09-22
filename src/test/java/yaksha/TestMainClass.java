package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestMainClass {
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@Test
	void testQuickSort() throws Exception {
		Integer expectedResult[] = { 23, 23, 23, 34, 45, 65, 67, 89, 90, 101 };
		List<Integer> expectedResultList = Arrays.asList(expectedResult);
		int[] arr = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		// Input : 90 23 101 45 65 23 67 89 34 23
		Array array = new Array(arr, 0, arr.length - 1);
		int result[] = QuickSort.quickSort(array);
		List<Integer> resultList = new ArrayList<Integer>(result.length);
		for (int i : result) {
			resultList.add(i);
		}
		yakshaAssert(currentTest(), (expectedResultList.containsAll(resultList) ? "true" : "false"), businessTestFile);
	}
}
