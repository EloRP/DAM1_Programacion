package coleccionesejercicios;

import java.time.LocalDateTime;

public class Registro implements Comparable{
Double temperatura;
LocalDateTime fechaHora;

public Registro(Double temperatura, LocalDateTime fechaHora) {
this.temperatura = temperatura;
this.fechaHora = fechaHora;
}

@Override
public int compareTo(Object o) {
return ((Registro) o).temperatura.compareTo(temperatura);
}

@Override
public String toString() {
return "Registro [temperatura=" + temperatura + ", fechaHora=" + fechaHora + "]";
}



}