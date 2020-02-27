/**
* @author  Jaya Prakash Manne
* @version 1.0
* @since   01-Nov-2019 
*/
package com.hit.iot.util;

import java.util.UUID;

import com.fasterxml.uuid.Generators;

//https://www.journaldev.com/17182/java-uuid-generator-java-guid
public class UniversalUniqueCodeGenerator {
	
	private static UniversalUniqueCodeGenerator instance = null;

	// ========================================================================

	private UniversalUniqueCodeGenerator() { }

	// ========================================================================

	public static synchronized UniversalUniqueCodeGenerator getInstance() {
		if (instance == null) {
			instance = new UniversalUniqueCodeGenerator();
		}
		return instance;
	}

	// ========================================================================
	
	public String getUniqueCode() {
		UUID uuid = Generators.timeBasedGenerator().generate();
		return uuid.toString().replaceAll("-", "");
	}

	// ========================================================================
	
	public String getAutoGeneratedPassword() {
		// Generate random UUID
		UUID uuid = Generators.randomBasedGenerator().generate();
		return uuid.toString().replaceAll("-", "").substring(0, 15);
	}
	
	// ========================================================================
	
	/*public static void main(String[] args) {
		// Generate time-based UUID
		UUID uuid1 = Generators.timeBasedGenerator().generate();
		System.out.println("UUID : " + uuid1);
		System.out.println("UUID Version : " + uuid1.version());
		System.out.println("UUID Variant : " + uuid1.variant());

		// Generate random UUID
		UUID uuid2 = Generators.randomBasedGenerator().generate();
		System.out.println("UUID : " + uuid2);
		System.out.println("UUID Version : " + uuid2.version());
		System.out.println("UUID Variant : " + uuid2.variant());
	}*/
	
	// ========================================================================
}
