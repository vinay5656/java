package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestStringConcat {

	@Test
	public void doStringConcatTest() {
		DailyTasks dt = new DailyTasks();
		assertEquals("Vinay Chouhan",dt.doStringConcat("Vinay", "Chouhan"));
	}

}
