package com.slowfrog.qwop;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CrashetFilterTest {

	@Test
	public void test() {
		CrashedFilter fixture = new CrashedFilter();
		
		
		RunInfo crashedInfo = new RunInfo(null, 0, true, true, 0, 0);
		
		RunInfo notCrashedInfo = new RunInfo(null, 0, false, true, 0, 0);
		
		
		assertFalse(fixture.matches(notCrashedInfo));
		
		assertTrue(fixture.matches(crashedInfo));
	}

}
