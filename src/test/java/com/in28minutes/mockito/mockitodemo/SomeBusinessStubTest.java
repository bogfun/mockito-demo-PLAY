package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(24, business.findTheGreatestFromAllData());
	}

}

class DataServiceStub implements DataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int[]{24, 6, 15};
	}
}