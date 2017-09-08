// marina escalante

package farm;

import java.awt.Color;
import java.awt.Graphics;

public class LadyBug extends Insect {
	
	public LadyBug() {
		
	}
	
	public Color getColor() {
		return Color.RED;
	}
	
	// Default numLegs is 6
	
	public String toString() {
		return ":)";
	}

	public boolean canFly() {
		return true;
	}
	
	// 10 width & 6 height
	public void draw(Graphics g, int x, int y) {
		// body
		g.setColor(Color.RED);
		g.fillOval(x, y, 4, 3);
		g.setColor(Color.BLACK);
		g.fillOval(x + 3, y + 1, 2, 2);
	}

}
