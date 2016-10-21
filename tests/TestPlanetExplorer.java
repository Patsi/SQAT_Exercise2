import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer 
{
	@Test 
	public void test_definePlanet100x100()
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals(100,  planetExplorer.getX());
		assertEquals(100,  planetExplorer.getY());
	}

	@Test
	public void test_executeCommand() 
	{
		fail("Not yet implemented");
	}
}
