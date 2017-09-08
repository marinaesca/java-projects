import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

// add in graphics later
// folder with in order photos
// run these parallel and feed into 'closet'

// category should be an enum, also something to add in later


/* NOTES: 
 * Clothing ID's have 3 digits
 * First digit meaning:
 * 1 - shirt
 * 2 - pant
 * 3 - full coverage
 * 4 - shoes
 * 
 * file format - two lines:
 * ID coverage color
 * description
 */

public class Closet {
	public static void main(String[] args) {
//		DrawingPanel p1 = new DrawingPanel(1200, 600);
//		Graphics g = p1.getGraphics();
//		Color mustard = new Color(204, 204, 0);
//		p1.setBackground(mustard);
		HashMap<Integer, Clothing> wardrobe = new HashMap<Integer, Clothing>();
		
		input(wardrobe);
		menu();
		listWardrobe(wardrobe);
	}
	
	// read in from file and place in wardrobe
	public static void input(HashMap<Integer, Clothing> wardrobe){
		File file = new File("marina_clothes_input.txt");
	    try {
	    	Scanner reader = new Scanner(file);
	        while (reader.hasNext()) {
	        	Scanner readLine = new Scanner(reader.nextLine());
	            int ID = readLine.nextInt();
	            Section coverage = convertSection(readLine.next());
	            String color = readLine.next();
	            String description = reader.nextLine();
	            
	            Clothing temp = new Clothing(ID, coverage, color, description);
	            wardrobe.put(ID, temp);
	        }
	        reader.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void menu(){
		// welcome
		// loop what do you want to do
		// also option for quit
		// things to do:
		//	 list wardrobe
		//	 list outfits
		//	 create outfit
		
		// to create an outfit you need to write to a file
		// outfits stored in a file that can be hand input or use program to write to
		// outfit ID's will have 4 digits
	}
	
	// output all contents of the wardrobe
	public static void listWardrobe(HashMap<Integer, Clothing> wardrobe){
		System.out.println("PRINTING OUT CONTENTS OF WARDROBE: \n\n");
		for (int ID : wardrobe.keySet()) {
			Clothing temp = wardrobe.get(ID);
			System.out.println("ID: " + ID);
			System.out.println("Coverage: " + temp.coverage);
			System.out.println("Color: " + temp.color);
			System.out.println("Description: " + temp.description + "\n");
		}
	}
	
	// helper method - converts strings to Sections
	public static Section convertSection(String str){
		if(str.equals("TOP")){
			return Section.TOP;
		}
		else if(str.equals("TOP_AND_BOTTOM")){
			return Section.TOP_AND_BOTTOM;
		}
		else if(str.equals("BOTTOM")){
			return Section.BOTTOM;
		}
		else if(str.equals("SHOES")){
			return Section.SHOES;
		}
		return null;
	}
}










