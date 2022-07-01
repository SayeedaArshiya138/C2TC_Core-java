package com.cg.Junit;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestInterfaceblogger {
	@Test
	@RepeatedTest(10)
	void test() {
		System.out.println("test case passed");
	}

}
