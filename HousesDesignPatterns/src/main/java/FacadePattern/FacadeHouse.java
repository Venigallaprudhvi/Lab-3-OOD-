package FacadePattern;

public class FacadeHouse {
	private House domestic;
	private House commercial;
	private House instituional;
	
	public FacadeHouse() {
		instituional = new Institutional();
		commercial = new Commercial();
		domestic = new Domestic();
	}
	
	public String InstitutionalHouse() {
		return instituional.build();
	}
	public String CommercialHouse() {
		return commercial.build();
	}
	public String DomesticHouse() {
		return domestic.build();
	}
	
}
