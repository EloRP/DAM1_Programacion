/*FICHEROS
FICHEROS DE TEXTO
LECTURA
.readLine() ➡️ Leer la línea.
InputStreamReader in = new InputStreamReader(new BufferedReader("[NOMBRE].txt"))

.next[TipoPrimitivo]() ➡️ Leer el siguiente tipo primitivo, si el siguiente elemento no es ese elemento primitivo, salta excepción.
.nextLine() ➡️ Lee la siguiente línea como cadena de texto.
.next() ➡️ Lee el siguiente elemento como cadena de texto, hasta que se encuentra un carácter vacío/espacio. [" "]
.hasNext() ➡️ Devuelve true si quedan elementos por leer, false en caso contrario.
.hasNext[TipoPrimitivo]() ➡️ Devuelve true si el siguiente elemento coincide con el tipo primitivo, false si no quedan elementos o no coincide.
Scanner sc = new Scanner(new FileReader("[NOMBRE].txt"))

ESCRITURA
.write() ➡️ Escribe el tipo primitivo, en entero o en String.
.flush() ➡️ Escribe todo lo almacenado en el búfer.
.newLine() ➡️ Añade una nueva línea en el fichero.
.append() ➡️ Escribe al final del archivo.
OutputStreamWriter out = new OutputStreamWriter(new BufferedWriter("[NOMBRE].txt"))

FICHEROS BINARIOS
LECTURA
.readObject() ➡️ Lee un objeto
.read[TipoPrimitivo]() ➡️ Lee el tipo primitivo
ObjectInputStream in = new ObjectInputStream(new FileInputStream("[NOMBRE].dat"))

ESCRITURA
.writeObject() ➡️ Escribe un objecto, éste debe ser Serializable.
.write() ➡️ Escribe un entero, un array de bytes o un subArray de bytes.
.write[TipoPrimitivo]() ➡️ Escribe el tipo primitivo.
.flush() ➡️ Escribe todo lo que tiene almacenado en memoria.
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("[NOMBRE].dat"), true/false)

/* En true se añaden los datos al final del fichero, con false se sobreescribe el fichero */