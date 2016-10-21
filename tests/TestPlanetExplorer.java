import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer 
{
	@Test 
	public void thePlanet_definePlanet100x100()
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals(100,  planetExplorer.getX());
		assertEquals(100,  planetExplorer.getY());
	}
	
	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetNegativeX()
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(-1,-1,"");
		planetExplorer.getX();
	}

	
	@Test
	public void test_executeCommand() 
	{
		fail("Not yet implemented");
	}
}
