package junit5_geometria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.App;
import JUnit.Junit09_Geometria.dto.Geometria;

public class GeometriaTest {
	
	private Geometria geo;
	private App app;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		geo = new Geometria();
		app = new App();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAreacuadrado() {
		
		Geometria geometria = new Geometria();
		int result = geometria.areacuadrado(4);
		assertEquals(16, result);
	}

	@Test
	public void testAreatriangulo() {
		
	    Geometria geometria = new Geometria();
	    int result = geometria.areatriangulo(5, 6);
	    assertEquals(15, result);
	}

	@Test
	public void testArearectangulo() {
		
	    Geometria geometria = new Geometria();
	    int result = geometria.arearectangulo(7, 8);
	    assertEquals(56, result);
	}

	@Test
	public void testAreapentagono() {
		
	    Geometria geometria = new Geometria();
	    int result = geometria.areapentagono(4, 9);
	    assertEquals(18, result);
	}

	@Test
	public void testArearombo() {
		
	    Geometria geometria = new Geometria();
	    int result = geometria.arearombo(10, 5);
	    assertEquals(25, result);
	}

	@Test
	public void testArearomboide() {
		
	    Geometria geometria = new Geometria();
	    int result = geometria.arearomboide(9, 3);
	    assertEquals(27, result);
	}

	@Test
	public void testAreatrapecio() {
		
	    Geometria geometria = new Geometria();
	    int result = geometria.areatrapecio(3, 5, 6);
	    assertEquals(24, result);
	}


	@Test
	public void testFigura() {
		Geometria geometria = new Geometria();
		assertEquals("cuadrado", geometria.figura(1));
		assertEquals("Circulo", geometria.figura(2));
		assertEquals("Triangulo", geometria.figura(3));
		assertEquals("Rectangulo", geometria.figura(4));
		assertEquals("Pentagono", geometria.figura(5));
		assertEquals("Rombo", geometria.figura(6));
		assertEquals("Romboide", geometria.figura(7));
		assertEquals("Trapecio", geometria.figura(8));
		assertEquals("Default", geometria.figura(9));
	}
	
	@Test
	public void testGetId() {
		
		int testId = 32;
		geo.setId(testId);
		assertEquals(testId, geo.getId());
	}
	
	@Test
	public void testGetNombre() {
		
		String testNombre = "cuadrado";
		geo.setNom(testNombre);
		assertEquals(testNombre, geo.getNom());
	}
	
	@Test
	public void testGetArea() {
		
		double testArea = 2.0;
		geo.setArea(testArea);
		assertEquals(testArea, geo.getArea(), 0.05);
	}
	
	@Test
	public void testToString() {
		
		int testId = 32;
		String testNombre = "cuadrado";
		double testArea = 2.0;
		
		geo.setId(testId);
		geo.setNom(testNombre);
		geo.setArea(testArea);
		
		String print = "Campos --> " + testId + testNombre + testArea;
	}

}

