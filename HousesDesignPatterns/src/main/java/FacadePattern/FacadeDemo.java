package FacadePattern;

public class FacadeDemo {

	public static void main(String[] args) {
		FacadeHouse house = new FacadeHouse();
		
		house.DomesticHouse();
		house.CommercialHouse();
		house.InstitutionalHouse();

	}

}
