package com.shuttlemanagement.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.shuttlemanagement.domain.Shuttle;

/**
 * The Class ShuttleServiceTest.
 * 
 * @author Kazim Ulusoy
 */
public class ShuttleServiceTest {

	/** The shuttle service. */
	@Mock
	private ShuttleService shuttleService;

	/**
	 * Setup.
	 */
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Test save.
	 */
	@Test
	public void testSave() {
		Shuttle shuttle = new Shuttle("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

		// expectation
		when(shuttleService.save(shuttle)).thenReturn(new Shuttle());

		// Execute the method being tested
		Shuttle shuttleSaved = shuttleService.save(shuttle);

		// verify
		assertNotNull(shuttleSaved);
	}

	/**
	 * Test save exception.
	 */
	@Test()
	public void testSaveException() {
		// Execute the method being tested
		Shuttle shuttleSaved = shuttleService.save(new Shuttle());

		assertNull(shuttleSaved);
	}

}
