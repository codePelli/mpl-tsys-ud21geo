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
	public void testApp() {
		
		app.main(new String[0]);
	}

	@Test
	public void testAreacuadrado() {
		
		int result = geo.areacuadrado(4);
		assertEquals(16, result);
	}

	@Test
	public void testAreatriangulo() {
		
	    int result = geo.areatriangulo(5, 6);
	    assertEquals(15, result);
	}

	@Test
	public void testArearectangulo() {
		
	    int result = geo.arearectangulo(7, 8);
	    assertEquals(56, result);
	}

	@Test
	public void testAreapentagono() {
		
	    int result = geo.areapentagono(4, 9);
	    assertEquals(18, result);
	}

	@Test
	public void testArearombo() {
		
	    int result = geo.arearombo(10, 5);
	    assertEquals(25, result);
	}

	@Test
	public void testArearomboide() {
		
	    int result = geo.arearomboide(9, 3);
	    assertEquals(27, result);
	}

	@Test
	public void testAreatrapecio() {
		
	    int result = geo.areatrapecio(3, 5, 6);
	    assertEquals(24, result);
	}


	@Test
	public void testFigura() {

		assertEquals("cuadrado", geo.figura(1));
		assertEquals("Circulo", geo.figura(2));
		assertEquals("Triangulo", geo.figura(3));
		assertEquals("Rectangulo", geo.figura(4));
		assertEquals("Pentagono", geo.figura(5));
		assertEquals("Rombo", geo.figura(6));
		assertEquals("Romboide", geo.figura(7));
		assertEquals("Trapecio", geo.figura(8));
		assertEquals("Default", geo.figura(9));
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
	
	@Test
	public void testConstructor() {
		
		int testId = 30;
		Geometria geom = new Geometria(testId);
		assertEquals(testId, geom.getId());
	}
	
	@Test
	public void testAreaCirculo() {
		
		double resultado = geo.areaCirculo(5);
		assertEquals(77, resultado, 2);
	}
	
	@Test
	public void testAreaTrianguloCero() {
		
		int resultado = geo.areatriangulo(0, 2);
		assertEquals(0, resultado, 1);
	}
	
	@Test
	public void testAreaCuadradoCero() {
		
		int resultado = geo.areacuadrado(0);
		assertEquals(0, resultado);
	}
	
	@Test
	public void testAreaCuadradoValorNulo() {
		
		int resultado = geo.areacuadrado(-2);
		assertEquals(4, resultado);
	}
	
}