package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence extends DailyTasks {

	@Test
	public void checkPresence() {
		DailyTasks dt = new DailyTasks();
		assertTrue(dt.checkPresence("vinay","na"));
//		assertFalse(dt.checkPresence("vinay", "na"));
	}

}
