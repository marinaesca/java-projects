// Marina Escalante

package farm;

import java.awt.Color;
import java.awt.Graphics;

public class Bee extends Insect {

	public Bee() {

	}

	public Color getColor() {
		return Color.YELLOW;
	}

	public int numOfLegs() {
		return 6;
	}

	public String toString() {
		return "Bzz Bzz";
	}

	public boolean canFly() {
		return true;
	}

	// 10 width & 6 height
	public void draw(Graphics g, int x, int y, boolean head) {
		// body
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 10, 6);
		// stripes & head
		g.setColor(Color.BLACK);
		g.drawLine(x + 1, y + 1, x + 1, y + 4);
		g.drawLine(x + 3, y, x + 3, y + 5);
		g.drawLine(x + 5, y, x + 5, y + 5);
		g.drawLine(x + 7, y + 1, x + 7, y + 4);
		if (head) {
			g.fillOval(x + 7, y - 1, 4, 4);
		}
		//wings
		Color wings = new Color(204, 255, 255);
		g.setColor(wings);
		g.fillOval(x + 4, y - 4, 2, 2);
		g.fillOval(x + 3, y - 3, 2, 2);
		g.fillOval(x + 2, y - 4, 2, 2);
	}
}
