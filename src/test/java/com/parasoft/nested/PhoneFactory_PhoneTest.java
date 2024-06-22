/**
 * 
 */
package com.parasoft.nested;

import com.parasoft.nested.PhoneFactory.Brand;
import com.parasoft.nested.PhoneFactory.Phone;
import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for Phone
 *
 * @see com.parasoft.nested.PhoneFactory.Phone
 * @author Admin
 */
public class PhoneFactory_PhoneTest {

	/**
	 * Parasoft Jtest UTA: Test for call912()
	 *
	 * @see com.parasoft.nested.PhoneFactory.Phone#call912()
	 * @author Admin
	 */
	@Test
	public void testCall912() throws Throwable {
		// Given
		String name = "name"; // UTA: default value
		Brand brand = Brand.APPLE; // UTA: default value
		Phone underTest = new Phone(name, brand);

		// When
		underTest.call912();

	}
}
