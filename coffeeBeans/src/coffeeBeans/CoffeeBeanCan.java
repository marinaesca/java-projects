// marinaescalante-finished

// consider: enums, but for 2 colors ehhh
// finished for now, can have upgrades for graphics

package coffeeBeans;

import java.util.Random;

public class CoffeeBeanCan
{
	private int black;
	private int white;
	private char[] beans;

	// empty constructor creates a rando can
	// size is 10-100
	// colors are randomized
	public CoffeeBeanCan()
	{
		Random rand1 = new Random();
		int size = rand1.nextInt(110) + 10;

		Random rand2 = new Random();
		int n = rand2.nextInt(size);

		this.black = n;
		this.white = size - n;
		this.beans = setBeans();
	}

	// constructor creates a rando can
	// size is parameter
	// colors are randomized
	public CoffeeBeanCan(int size)
	{
		Random rand = new Random();
		int n = rand.nextInt(size);

		this.black = n;
		this.white = size - n;
		this.beans = setBeans();
	}

	// constructor creates a rando can
	// size is white+black
	// colors are parameters
	public CoffeeBeanCan(int black, int white)
	{
		this.black = white;
		this.white = black;
		this.beans = setBeans();
	}

	public int getWhite()
	{
		return this.white;
	}

	public int getBlack()
	{
		return this.black;
	}

	public boolean oneLeft()
	{
		return (getBlack() + getWhite()) == 1;
	}

	public String getLastBean()
	{
		String color = "Not the last bean!";
		if (oneLeft())
		{
			color = "black";
			if (getBlack() == 0)
			{
				color = "white";
			}
		}

		return color;
	}

	//		// this may be used for drawing/ display purposes
	//		public char[] getBeans()
	//		{
	//			return this.beans;
	//		}

	// simulates the drawing of 2 beans
	// does the required methods
	// returns a char with the colors of the beans drawn
	public void drawBeans()
	{
		char[] draw = drawTwoBeans();
		char bean1 = draw[0];
		char bean2 = draw[1];

		if (bean1 == 'b' && bean2 == 'b')
		{
			optionSameColor('b');
		}
		else if (bean1 == 'w' && bean2 == 'w')
		{
			optionSameColor('w');
		}
		else // 'b' & 'w'
		{
			optionBothColor();
		}

		this.beans = setBeans();
	}

	// b will be 0, w will be 1
	public char[] drawTwoBeans()
	{
		char[] draw = new char[2];

		Random rand = new Random();

		int n = rand.nextInt(this.beans.length);
		draw[0] = this.beans[n];

		int m = rand.nextInt(this.beans.length);
		while (m == n)
		{
			m = rand.nextInt(this.beans.length);
		}

		draw[1] = this.beans[m];

		return draw;
	}

	// If the two beans are the same color, 
	// then throw both of them away and add a new black bean. 
	// translation: color subtract 2, black bean add 1
	public void optionSameColor(char c)
	{
		String color = "black";
		if (c == 'b')
		{
			this.black -= 2;
		}
		else //(c == 'w')
		{
			this.white -= 2;
			color = "white";
		}

		this.black += 1;

		System.out.println("You drew two " + color + " beans!");
		System.out.println("They were removed. A black bean was added.");
	}

	// If the two beans are different colors, 
	// then throw away the black one and return the white one to the can.
	// translation: decrement 1 black bean
	public void optionBothColor()
	{
		this.black -= 1;

		System.out.println("You drew one black bean and one white bean!");
		System.out.println("The black bean was removed.");
		System.out.println("The white bean was returned to the can.");
	}

	public char[] setBeans()
	{
		int size = getBlack() + getWhite();
		char[] temp = new char[size];

		for (int b = 0; b < getBlack(); b++)
		{
			temp[b] = 'b';
		}

		for (int w = getBlack(); w < size; w++)
		{
			temp[w] = 'w';
		}

		return temp;
	}

}
