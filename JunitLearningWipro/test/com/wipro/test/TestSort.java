package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSort extends DailyTasks {

	@Test
	public void sortValues() {
		DailyTasks dt = new DailyTasks();
		int [] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = i+1;
		}
		int [] arrActual = {1,3,2,4,6,5,8,7,9,10};
		assertArrayEquals(arr,dt.sortValues(arrActual));
		
	}

}
