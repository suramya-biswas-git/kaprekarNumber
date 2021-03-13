package yaksha.KaprekarNumber;

import static yaksha.KaprekarNumber.TestUtils.*;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class MainClassTest {
@Test
public void testExceptionConditon() throws Exception {

	TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
}

@Test
public void testBoundaryCondition() throws Exception {

	TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
}

@Test
public void testCheckKaprekarNumber() throws Exception {
	// Test will pass
	Number number1 = new Number(45);
	yakshaAssert(currentTest(), (KaprekarNumber.checkKaprekarNumber(number1) == 1 ? "true" : "false"),
			businessTestFile);
}
}
