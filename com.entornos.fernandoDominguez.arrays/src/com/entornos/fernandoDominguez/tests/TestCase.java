package com.entornos.fernandoDominguez.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.entornos.fernandoDominguez.arrays.MisArrays;


@TestInstance(Lifecycle.PER_CLASS)
class TestCase {

	static int array1[];
	static int array2[];
	static int array3[];

	@BeforeAll
	static void setUpBeforeClass() {

		array1 = new int[] { 1, 3, 2, 1, 5 };
		array2 = new int[] { 4, 3, 2, 1 };
		array3 = new int[] { 8 };
	}

	@Test
	void testMedia() {
		assertEquals(2.4, MisArrays.media(array1));
		assertEquals(2.5, MisArrays.media(array2));
		assertEquals(8, MisArrays.media(array3));
	}

}
