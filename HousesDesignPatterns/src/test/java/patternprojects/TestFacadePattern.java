package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FacadePattern.FacadeHouse;


class TestFacadePattern {

	@Test
	void testDomesticHouse() {
		FacadeHouse house = new FacadeHouse();
		
		house.DomesticHouse();
		
		assertEquals("Buld Individual House",house.DomesticHouse());
	}

	@Test
	void testCommercialHouse() {
		FacadeHouse house = new FacadeHouse();
		
		house.CommercialHouse();
		
		
		assertEquals("Build Commercial building", house.CommercialHouse());
	}
	

	@Test
	void testInstitutional() {
		FacadeHouse house = new FacadeHouse();

		house.InstitutionalHouse();
		
		assertEquals("Build Institutional building", house.InstitutionalHouse());
	}

}
