package tp2junit;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;


public class MoneyTest {
	Money eur14,eur13,eur27,usd17,yen15,result;
	PorteFeuille PF1,PF2;
	Vector<Money> v1,v2,v3;
	@Before
	public void ins() {
		eur14=new Money (14,"EUR");
		eur13=new Money (13,"EUR");
		eur27=new Money (27,"EUR");
		yen15=new Money (15,"YEN");
		usd17=new Money (17,"USD");
		result=eur14.add(eur13);
		//doublures : si je fait add(eur13) alors tu me retournes : 27 euro ==> le test sera indépendant de la méthode "add" développée et le résultat indiqué (27 euro) sera retourné
		v1=new Vector<Money>();
		v2=new Vector<Money>();
		v3=new Vector<Money>();
		v1.add(yen15);
		v1.add(eur13);
		v2.add(usd17);
		v2.add(yen15);
		v3.add(yen15);
		v3.add(eur27);
		PF1= new PorteFeuille(v1);
		PF2= new PorteFeuille(v2);

	}
	
/*
 	@Test
	public void testPFequals() { 
		assertNotEquals(PF1,null); 
		assertEquals(PF1, PF1); 
		assertTrue(!PF1.equals(yen15)); 
		assertTrue(!yen15.equals(PF1)); 
		assertTrue(!PF1.equals(PF2));
	}
	@Test
	public void test() {
		
		assertNotEquals(eur14,null);
		assertNotEquals(eur14,null);
		assertTrue(eur14.equals(eur14));
		assertTrue(!eur14.equals(eur13));
		assertTrue(eur13.equals(new  Money(13,"EUR"))); 
	}
	
	@Test
	public void testadd() {
		assertTrue(result.equals(eur27));
		
	}
*/
	@Test
	public void testGlobal()
	{
		assertNotEquals(PF1,null); 
		assertEquals(PF1, PF1); 
		assertTrue(!PF1.equals(yen15)); 
		assertTrue(!yen15.equals(PF1)); 
		assertTrue(!PF1.equals(PF2));
		assertNotEquals(eur14,null);
		assertNotEquals(eur14,null);
		assertTrue(eur14.equals(eur14));
		assertTrue(!eur14.equals(eur13));
		assertTrue(eur13.equals(new  Money(13,"EUR"))); 
		assertTrue(result.equals(eur27));

	}

}
