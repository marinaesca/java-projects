
// Marina Escalante

/* Notes:
 * This is a class for a single item of clothing
 * 
 * Clothing ID's have 3 digits
 * First digit meaning:
 * 1 - shirt
 * 2 - pant
 * 3 - full coverage
 * 4 - shoes
 * 
 * */

public class Clothing {
	int ID;
	Section coverage;
	String color;
	String description;
	
	public Clothing(int ID, Section coverage, String color, String description){
		this.ID = ID;
		this.coverage = coverage;
		this.color = color;
		this.description = description;
	}
	
	public int getID(){
		return ID;
	}
	
	public Section getCoverage(){
		return coverage;
	}
	
	public void changeCoverage(Section coverageNew){
		coverage = coverageNew;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void changeDescription(String descriptionNew){
		description = descriptionNew;
	}
}
