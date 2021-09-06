package interfacesConGeometria;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class InterfacesTest {
	

@Before
public void setup() throws Exception {
	
}	
        Punto origen = new Punto (0,0);
		Punto copiaP1 = new Punto (0,0);
		Punto p2 = new Punto (1,0);
		Punto p3 = new Punto (-1,0);
		Punto p4 = new Punto (0,2);
		Punto p5 = new Punto (0,-2);
		Punto p6 = new Punto (4,5);
		Segmento sParaleloX = new Segmento (new Punto(1,1),new Punto(8,1));  
		Segmento sParaleloY = new Segmento (new Punto(-1,1),new Punto(-1,-8));
		Segmento sPendiente2 = new Segmento (new Punto(1,1),new Punto(2,3));
		Segmento sOtroPendiente2 = new Segmento (new Punto(-5,3),new Punto(-4,5));
		Figura cu = new Cuadrado (new Punto(1,1), 3.0);
		Cuadrado cu1 = new Cuadrado (origen, 3.0);// misma área que cu
		Cuadrado cu2 = new Cuadrado (p6, 5.0);//Área 25 u cuadradas
		Circulo ci1 = new Circulo (origen, 1.0);//Área Pi u cuadradas
		
	
		
	@Test
	public void comparaPuntosTest() {
		
		assertTrue(origen.compareTo(copiaP1) == 0);
		assertTrue(origen.compareTo(p2) == -1);
		assertTrue(p2.compareTo(p3) == 1);
		assertTrue(p4.compareTo(p5) == 1);
		assertTrue(p2.compareTo(p6) == -1);
		assertTrue(p6.compareTo(origen) == 1);
	}
	
	@Test
	public void segmentosParalelosTest() {
		assertTrue(sParaleloX.esParaleloAx());
		assertTrue(sParaleloY.esParaleloAy());
		assertTrue(sPendiente2.esParaleloAotro(sOtroPendiente2));
	}
	
	@Test
	public void mueveTest() {
		origen.desplazar(3, 12);
		assertEquals(origen.compareTo(new Punto (3,12)), 0 );
		
	}
	
	/*
	
	
	@Test 
	public void segmentosMalConstruidos() throws Exception {
		Segmento sMal = new Segmento (new Punto(1,1), new Punto(1,1)); 
		sMal.desplazar(0, 0);
	}
	
	
	*/

}
