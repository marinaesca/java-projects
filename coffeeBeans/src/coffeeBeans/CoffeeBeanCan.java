// marinaescalante-unfinished
package coffeeBeans;

import java.util.Random;

public class CoffeeBeanCan
{
	private int black;
	private int white;
	private int beans;

	// empty constructor creates a rando can
	// size is 10-100
	// colors are randomized
	public CoffeeBeanCan()
	{
		Random rand1 = new Random();
		int size = rand1.nextInt(110) + 10;

		Random rand2 = new Random();
		int n = rand2.nextInt(size);

		this.white = n;
		this.black = size - n;
		this.beans = size;

	}

	// empty constructor creates a rando can
	// size is parameter
	// colors are randomized
	public CoffeeBeanCan(int size)
	{
		Random rand = new Random();
		int n = rand.nextInt(size);

		this.white = n;
		this.black = size - n;
		this.beans = size;
	}

	// empty constructor creates a rando can
	// size is white+black
	// colors are parameters
	public CoffeeBeanCan(int white, int black)
	{
		this.white = white;
		this.black = black;
		this.beans = white + black;
	}

	public int getWhite()
	{
		return this.white;
	}

	public int getBlack()
	{
		return this.black;
	}

	public int getBeans()
	{
		return this.beans;
	}

}
