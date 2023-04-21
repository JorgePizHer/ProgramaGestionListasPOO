import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SalidaTest {

	int seleccion;
	
	@Test
	void testMostrarMenu() {
		assertTrue(Salida.mostrarMenu()>0 && Salida.mostrarMenu() <=6);
	}
	

	@Test
	void testMenuModificar() {
		assertFalse(Salida.menuModificar()<=0 || Salida.mostrarMenu() >6);
	}

	@Test
	void testMenuBuscar() {
		assertTrue(Salida.menuBuscar()>0 && Salida.menuBuscar() <=6);
	}

}
