
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 156
// Finish time: 16:48

public class PlanetExplorer 
{
	private final int N = 0;
	private final int E = 1;
	private final int S = 2;
	private final int W = 3;
	
	private String[] cardinalDirectionStrings = {"N", "E", "S", "W"}; 
	
	private int xMax;
	private int yMax;
	private int cardinalDirection; 
	private int x;
	private int y; 
	
	public PlanetExplorer(int x, int y, String obstacles) throws PlanetExplorerException 
	{
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		if (x < 0 || y < 0)
		{
			throw new PlanetExplorerException();
		}
		else
		{
			xMax = x;
			yMax = y;
			x = 0;
			y = 0;
			cardinalDirection = N;
		}
	}
	
	public String executeCommand(String command)
	{
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		for (int i = 0; i < command.length(); i++)
		{
			// a bug here no time to solve it!!!
			String s = command.substring(i, i);
			if ("l".equals(s))
			{
				cardinalDirection = (cardinalDirection + 3) % 4;
			}
			if ("r".equals(s))
			{
				cardinalDirection = (cardinalDirection + 1) % 4;
			}
		}
		return "(" + Integer.toString(x) + "," + Integer.toString(y) + "," + cardinalDirectionStrings[cardinalDirection]  + ")";

	}
	
	public int getX ()
	{
		return x;
	}
	
	public int getY ()
	{
		return y;
	}
	
	public int getXMax ()
	{
		return xMax;
	}
	
	public int getYMax ()
	{
		return yMax;
	}
	
}
