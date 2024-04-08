package frgp.utn.edu.ar.packageTest;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import frgp.utn.edu.ar.entidad.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	@DisplayName("Validar correos con al menos un n�mero. ")
	public void testCorreo__AlMenosUnNumero__retornaTrue() {
		assertTrue(Email.validarCorreo("abcDEFG1"), "No valida correos con al menos un n�mero");
	}
	
	@Test
	@DisplayName("Validar correos que no tengan n�meros. ")
	public void testCorreo__AlMenosUnNumero__retornaFalse() {
		assertFalse(Email.validarCorreo("abcDEFGh"), "No valida correos sin n�meros");
	}
	

}
