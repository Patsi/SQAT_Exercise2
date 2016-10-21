import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

public class TestPlanetExplorer 
{
	
	@Test 
	public void thePlanet_definePlanet100x100() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals(100,  planetExplorer.getXMax());
		assertEquals(100,  planetExplorer.getYMax());
	}
	
	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetNegativeX() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(-1,1,"");
		planetExplorer.getXMax();
	}

	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetNegativeY() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(1,-1,"");
		planetExplorer.getYMax();
	}

	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetOverFlowX() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(Integer.MAX_VALUE + 1,1,"");
		planetExplorer.getXMax();
	}

	@Test (expected=PlanetExplorerException.class) 
	public void thePlanet_definePlanetOverFlowY() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(1,Integer.MAX_VALUE + 1,"");
		planetExplorer.getYMax();
	}

	@Test 
	public void thePlanet_definePlanet1x2() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(1,2,"");
		assertEquals(1,  planetExplorer.getXMax());
		assertEquals(2,  planetExplorer.getYMax());
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
		assertEquals("(0,0,W)",  planetExplorer.executeCommand("l"));
	}
	
	@Test 
	public void turning_r() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals("(0,0,E)",  planetExplorer.executeCommand("r"));
	}
	
	@Test 
	public void turning_ll() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals("(0,0,S)",  planetExplorer.executeCommand("ll"));
	}
	
	@Test 
	public void turning_rr() throws PlanetExplorerException
	{
		PlanetExplorer planetExplorer = new PlanetExplorer(100,100,"");
		assertEquals("(0,0,S)",  planetExplorer.executeCommand("rr"));
	}
	
	

	@Test
	public void test_executeCommand() 
	{
		fail("Not yet implemented");
	}
}
