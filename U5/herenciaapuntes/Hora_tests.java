package herenciaapuntes;

import static org.junit.Assert.*;
import org.junit.Test;

public class Hora_tests {
@Test
public void HorTest() {
// Prueba el método inc
Hora hora = new Hora(23,59);
hora.inc();
assertEquals(hora.hora, 0);
assertEquals(hora.minuto, 0);

Hora hora2 = new Hora(22,58);

hora2.inc();
assertEquals(hora2.hora, 22);
assertEquals(hora2.minuto, 59);

hora2.inc();
assertEquals(hora2.hora, 23);
assertEquals(hora2.minuto, 0);


// Prueba los métodos setMinutos y setHora
Hora horara = new Hora(23,59);
assertFalse(horara.setMinuto(-1));
assertFalse(horara.setMinuto(60));
assertEquals(horara.minuto, 59);
assertTrue(horara.setMinuto(0));
assertEquals(horara.minuto, 0);
assertTrue(horara.setMinuto(59));
assertEquals(horara.minuto, 59);


Hora hora3 = new Hora(23,59);

assertFalse(hora3.setHora(-1));
assertFalse(hora3.setHora(24));
assertEquals(hora3.hora, 23);
assertTrue(hora3.setHora(0));
assertEquals(hora3.hora, 0);
assertTrue(hora3.setHora(23));
assertEquals(hora3.hora, 23);

}
}