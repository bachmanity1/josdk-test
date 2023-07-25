package com.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.javaoperatorsdk.operator.junit.AbstractOperatorExtension;
import io.javaoperatorsdk.operator.junit.LocallyRunOperatorExtension;

public class ExampleE2ETest {
	@RegisterExtension
	AbstractOperatorExtension operator = LocallyRunOperatorExtension.builder().withReconciler(new ExampleController()).build();

	@Test
	public void someTest() {
		System.out.println("I FAIL if you use josdk version 4.4.0 with fabric8 version 6.8.0, but I SUCCEED if you downgrade fabric8 to version 6.7.2");
	}
}
