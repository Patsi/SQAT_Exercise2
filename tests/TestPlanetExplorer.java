import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class TestPlanetExplorer 
{
	@Test 
	public void thePlanet_definePlanet100x100() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals(100,  planetExplorer.getX());
		assertEquals(100,  planetExplorer.getY());
	}
	
	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetNegativeX() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(-1,1,"");
		planetExplorer.getX();
	}

	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetNegativeY() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(1,-1,"");
		planetExplorer.getY();
	}

	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetOverFlowX() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(Integer.MAX_VALUE + 1,1,"");
		planetExplorer.getX();
	}

	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetOverFlowY() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(1,Integer.MAX_VALUE + 1,"");
		planetExplorer.getY();
	}

	@Test 
	public void thePlanet_definePlanet1x2() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(1,2,"");
		assertEquals(1,  planetExplorer.getX());
		assertEquals(2,  planetExplorer.getY());
	}
	
	@Test 
	public void landing_emptyCommand() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals("(0,0,N)",  planetExplorer.executeCommand(""));
	}
	
	@Test 
	public void turning_l() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals("(0,0,N)",  planetExplorer.executeCommand(""));
	}
	
	

	@Test
	public void test_executeCommand() 
	{
		fail("Not yet implemented");
	}
}
