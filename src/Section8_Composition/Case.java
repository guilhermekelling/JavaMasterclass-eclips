/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section8_Composition;

public class Case {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimensions dimentions;
	
	public Case(String model, String manufacturer, String powerSupply, Dimensions dimentions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimentions = dimentions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimentions() {
		return dimentions;
	}

}

