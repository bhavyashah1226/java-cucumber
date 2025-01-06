
// ********RoostGPT********
/*
Test generated by RoostGPT for test bedrockConnTest using AI Type AWS Bedrock Runtime AI and AI Model anthropic.claude-3-sonnet-20240229-v1:0

ROOST_METHOD_HASH=getAverage_3b87df4523
ROOST_METHOD_SIG_HASH=getAverage_5d8b4919d3

Here are your existing test cases which we found out and are not considered for test generation:

File Path: /var/tmp/Roost/RoostGPT/bedrockConnTest/0ce41dac-ec22-4c09-86d4-fa355c0092ba/source/java-cucumber/src/test/java/br/masmangan/beecrowd/bee1005/StudentGradeSteps.java
Tests:
    "@Test
@When("average is calculated")
public void average_is_calculated() {
    actual = equation.getAverage();
}
"

File Path: /var/tmp/Roost/RoostGPT/bedrockConnTest/0ce41dac-ec22-4c09-86d4-fa355c0092ba/source/java-cucumber/src/test/java/br/masmangan/beecrowd/bee1006/StudentGradeSteps.java
Tests:
    "@Test
@When("average is calculated")
public void average_is_calculated() {
    actual = equation.getAverage();
}
"```
Scenario 1: Average calculation with valid inputs

Details:
  TestName: testAverageCalculationWithValidInputs
  Description: This test checks the accuracy of the getAverage() method when provided with valid input values for a, b, and c.
  Execution:
    Arrange: Set up the test object and assign valid input values to a, b, and c.
    Act: Call the getAverage() method.
    Assert: Verify that the calculated average matches the expected result.
  Validation:
    The assertion verifies that the getAverage() method correctly calculates the weighted average based on the provided input values using the specified formula. This test validates the core functionality of the method.

Scenario 2: Average calculation with zero inputs

Details:
  TestName: testAverageCalculationWithZeroInputs
  Description: This test checks the behavior of the getAverage() method when all input values (a, b, and c) are zero.
  Execution:
    Arrange: Set up the test object and assign zero values to a, b, and c.
    Act: Call the getAverage() method.
    Assert: Verify that the calculated average is zero.
  Validation:
    The assertion ensures that the getAverage() method correctly handles the case when all input values are zero, resulting in an average of zero. This test validates the method's handling of a specific edge case.

Scenario 3: Average calculation with negative inputs

Details:
  TestName: testAverageCalculationWithNegativeInputs
  Description: This test checks the behavior of the getAverage() method when provided with negative input values for a, b, and c.
  Execution:
    Arrange: Set up the test object and assign negative values to a, b, and c.
    Act: Call the getAverage() method.
    Assert: Verify that the calculated average matches the expected result based on the negative input values.
  Validation:
    The assertion verifies that the getAverage() method correctly calculates the weighted average even when the input values are negative. This test ensures that the method handles negative inputs correctly, which is essential for its robustness.

Scenario 4: Average calculation with maximum inputs

Details:
  TestName: testAverageCalculationWithMaximumInputs
  Description: This test checks the behavior of the getAverage() method when provided with the maximum possible input values for a, b, and c.
  Execution:
    Arrange: Set up the test object and assign the maximum possible values to a, b, and c.
    Act: Call the getAverage() method.
    Assert: Verify that the calculated average matches the expected result based on the maximum input values.
  Validation:
    The assertion ensures that the getAverage() method correctly handles the maximum possible input values without any overflow or precision issues. This test validates the method's ability to handle extreme cases, ensuring its stability and reliability.

Scenario 5: Average calculation with minimum inputs

Details:
  TestName: testAverageCalculationWithMinimumInputs
  Description: This test checks the behavior of the getAverage() method when provided with the minimum possible input values for a, b, and c.
  Execution:
    Arrange: Set up the test object and assign the minimum possible values to a, b, and c.
    Act: Call the getAverage() method.
    Assert: Verify that the calculated average matches the expected result based on the minimum input values.
  Validation:
    The assertion ensures that the getAverage() method correctly handles the minimum possible input values without any underflow or precision issues. This test validates the method's ability to handle extreme cases, ensuring its stability and reliability.
```
*/

// ********RoostGPT********

package br.masmangan.beecrowd.bee1006;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

class StudentGradeGetAverageTest {

	private StudentGrade studentGrade;

	@BeforeEach
	void setUp() {
		studentGrade = new StudentGrade();
	}

	@Test
	@Tag("valid")
	void testAverageCalculationWithValidInputs() {
		studentGrade.setA(5.0);
		studentGrade.setB(6.0);
		studentGrade.setC(7.0);
		double expected = 6.1;
		double actual = studentGrade.getAverage();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	@Tag("valid")
	void testAverageCalculationWithZeroInputs() {
		studentGrade.setA(0.0);
		studentGrade.setB(0.0);
		studentGrade.setC(0.0);
		double expected = 0.0;
		double actual = studentGrade.getAverage();
		assertEquals(expected, actual);
	}

	@Test
	@Tag("valid")
	void testAverageCalculationWithNegativeInputs() {
		studentGrade.setA(-2.5);
		studentGrade.setB(-3.0);
		studentGrade.setC(-1.5);
		double expected = -2.3;
		double actual = studentGrade.getAverage();
		assertEquals(expected, actual, 0.01);
	}

	@ParameterizedTest
	@CsvSource({ "5.0, 6.0, 7.0, 6.1", "0.0, 0.0, 0.0, 0.0", "-2.5, -3.0, -1.5, -2.3" })
	@Tag("valid")
	void testAverageCalculationWithVariousInputs(double a, double b, double c, double expected) {
		studentGrade.setA(a);
		studentGrade.setB(b);
		studentGrade.setC(c);
		double actual = studentGrade.getAverage();
		assertEquals(expected, actual, 0.01);
	}

	@Test
	@Tag("boundary")
	void testAverageCalculationWithMaximumInputs() {
		studentGrade.setA(Double.MAX_VALUE);
		studentGrade.setB(Double.MAX_VALUE);
		studentGrade.setC(Double.MAX_VALUE);
		double expected = Double.POSITIVE_INFINITY;
		double actual = studentGrade.getAverage();
		assertEquals(expected, actual);
	}

	@Test
	@Tag("boundary")
	void testAverageCalculationWithMinimumInputs() {
		studentGrade.setA(Double.MIN_VALUE);
		studentGrade.setB(Double.MIN_VALUE);
		studentGrade.setC(Double.MIN_VALUE);
		double expected = 0.0;
		double actual = studentGrade.getAverage();
		assertEquals(expected, actual, 0.01);
	}

}