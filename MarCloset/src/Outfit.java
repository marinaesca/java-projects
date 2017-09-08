

// Marina Escalante

/* Notes:
 * This is a class for an outfit
 * Holds multiple pieces of clothing
 * 
 * ID's have four digits
 * need to be able to add or remove clothing
 * 
 * @@ allow removal of clothes by ID num??
 * 
 * */

public class Outfit {
	Clothing[] pieces = new Clothing[3];
	int ID;
	boolean complete;
	String color;
	String description;
	
	// INCOMPLETE
	public Outfit(int ID, String color, String description){
		this.ID = ID;
		this.color = color;
		this.description = description;
		complete = checkComplete();
	}
	
	public boolean checkComplete(){
		boolean[] coverage = new boolean[3];
		for(int i = 0; i < coverage.length; i++){
			if(pieces[i] != null){
				if(pieces[i].getCoverage().equals(Section.TOP)){
					coverage[0] = true;
				}
				else if(pieces[i].getCoverage().equals(Section.TOP_AND_BOTTOM)){
					coverage[0] = true;
					coverage[1] = true;
				}
				else if(pieces[i].getCoverage().equals(Section.BOTTOM)){
					coverage[1] = true;
				}
				else if(pieces[i].getCoverage().equals(Section.SHOES)){
					coverage[2] = true;
				}
			}
		}
		return coverage[0] && coverage[1] && coverage[2];
	}
	
	public String getDescription(){
		return description;
	}
	
	public void changeDescription(String descriptionNew){
		description = descriptionNew;
	}
	
	// ADD -----------------------------------------------------------
	
	public boolean addClothing(Clothing clothing){
		if(clothing != null){
			if(clothing.getCoverage().equals(Section.TOP)){
				pieces[0] = clothing;
			}
			else if(clothing.getCoverage().equals(Section.TOP_AND_BOTTOM)){
				pieces[0] = clothing;
				pieces[1] = clothing;
			}
			else if(clothing.getCoverage().equals(Section.BOTTOM)){
				pieces[1] = clothing;
			}
			else if(clothing.getCoverage().equals(Section.SHOES)){
				pieces[2] = clothing;
			}
		}
		return false;
	}
	
	public boolean addTop(Clothing top){
		// check not null, check correct section
		if(top != null && top.getCoverage().equals(Section.TOP)){
			pieces[0] = top;
			return true;
		}
		return false;
	}
	
	public boolean addBottom(Clothing bottom){
		// check not null, check correct section
		if(bottom != null && bottom.getCoverage().equals(Section.BOTTOM)){
			pieces[1] = bottom;
			return true;
		}
		return false;
	}
	
	public boolean addTopAndBottom(Clothing topAndBottom){
		// check not null, check correct section
		if(topAndBottom != null && topAndBottom.getCoverage().equals(Section.TOP_AND_BOTTOM)){
			pieces[0] = topAndBottom;
			pieces[1] = topAndBottom;
			return true;
		}
		return false;
	}
	
	public boolean addShoes(Clothing shoes){
		// check not null, check correct section
		if(shoes != null && shoes.getCoverage().equals(Section.SHOES)){
			pieces[2] = shoes;
			return true;
		}
		return false;
	}
	
	// REMOVE --------------------------------------------------------
	
	// if item is TOP_AND_BOTTOM, both will be removed
	public boolean removeTop(){
		if(pieces[0] != null){
			// check for TOP_AND_BOTTOM if so remove
			if(pieces[0].getCoverage().equals(Section.TOP_AND_BOTTOM)){
				pieces[1] = null;
			}
			// remove TOP
			pieces[0] = null;
			return true;
		}
		return false;
	}
	
	// if item is TOP_AND_BOTTOM, both will be removed
	public boolean removeBottom(){
		if(pieces[1] != null){
			// check for TOP_AND_BOTTOM if so remove
			if(pieces[1].getCoverage().equals(Section.TOP_AND_BOTTOM)){
				pieces[0] = null;
			}
			// remove BOTTOM
			pieces[1] = null;
			return true;
		}
		return false;
	}
	
	public boolean removeShoes(){
		if(pieces[2] != null){
			// remove SHOES
			pieces[2] = null;
			return true;
		}
		return false;
	}
}
