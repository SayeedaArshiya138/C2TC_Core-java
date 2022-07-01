package com.cg.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)


public interface TestInterfaceblogger {
	@BeforeAll
	default void beforeAllTest() {
		System.out.println("before all test");
	}
	@AfterAll
	default void afterAllTest() {
		System.out.println("after all test");
	}
	@Test
	default void testMethod() {
		System.out.println("test method");
	}

}
