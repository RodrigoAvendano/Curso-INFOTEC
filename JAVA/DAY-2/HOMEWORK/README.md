## 1. Uso y significado de 5 palabras reservadas.
  
    1.FOR
    
    La palabra clave "for" se utiliza para crear un bucle for, que especifica una inicialización variable que sirve
    como un índice de control, una condición booleana y un incremento al índice de control.
    
```Java
for(int i = 0; // índice de control
            i < 100;   // condición booleana
            i++)      // modificación del índice tras cada bucle
        {
        // Lo que quieras que se ejecute varias veces
        }
```

     Si la expresión se evalúa como verdadera, el bloque de instrucciones asociado con el bucle
     se ejecuta, y luego se realiza el incremento. 
     La expresión booleana se evalúa de nuevo; esto continúa hasta que la expresión se 
     evalúa como falsa
     
```Java
for(int i=0;i<5;i++){

  System.out.println(i+"\n");
  
}
/* Resultado : 
0
1
2
3
4
*/
```     

    El índice de control, que tradicionalmente se encuentra representado con la variable i de tipo int, 
    puede en realidad tomar cualquier valor; no hace falta ni siquiera que tenga un valor 
    numérico (aunque habitualmente sea un int).

```Java
char b = 0x0041;//"A" unicode
for(String a = "A"; !a.equals("ABC"); a += b) {
    System.out.println(a);
    b++;
}
/* Resultado :
A
AB
*/
```    

    2.IF-ELSE
    
    La palabra clave if se usa para crear una sentencia if, que prueba una expresión booleana; si la expresión se 
    evalúa como verdadera, se ejecuta el bloque de instrucciones asociadas con la instrucción if. 
    Esta palabra clave también se puede utilizar para crear una sentencia if-else.
    La estructura if-else se utiliza en Java para tomar decisiones sobre un valor preexistente. Es decir, si una 
    condición basada en ese valor preexistente se cumple (si esa condición es verdadera), el programa tomará 
    un camino. Si no (si esa condición es falsa), el programa tomará otro. 
    A esa condición se la llama condición booleana, ya que un valor booleano (boolean) es aquel que solo puede 
    tomar como valor true (verdadero) o false (falso).
  
```Java
public class IfElse {
  public static void main(String args[]) {
    boolean estaLloviendo = true;
    Persona persona = new Persona();
    
    if(estaLloviendo) {
      persona.irEnMetro();
    } else {
      persona.irAndando();
    }
  }
}
```   


    3.INT
    
    La palabra clave int se utiliza para declarar una variable que puede contener un entero de complemento a dos 
    con signo de 32 bits. 
    Esta palabra clave también se usa para declarar que un método devuelve un valor del tipo primitivo int. 
    Tine un valor de 4 bytes(32bits) y un rango aproximado de 9 -2.000.000.000 a 2.000.000.000
 
```Java
int dinero = 100;
System.out.println("Tengo "+dinero+" pesos");
//Resultado: Tengo 100 pesos
```  

    4.LONG
    
    La palabra clave long se usa para declarar una variable que puede contener un entero de complemento a dos con signo de 64 bits. 
    Esta palabra clave también se usa para declarar que un método devuelve un valor del tipo primitivo long.
    Tine un valor de 8 bytes(64bits) y un rango aproximado de 9 trillones.
    Si nosotros colocaramos una cantidad en una variable long como 300,000,000
    veríamos el error "error: integer number too large: 3000000000"
    el rango de int alcanza solo hasta los 2 mil millones, y todo número entero es variable de tipo int para Java. 
    La solución consiste en añadir una "L" (en mayúscula o en minúscula) al final del número entero:
    
```Java
public class IntenLong {
	public static void main (String[] args) {
		long numeroGrande = 3000_000_000L;
	}
}
```

    5.SHORT
    
    La palabra clave corta se usa para declarar un campo que puede contener un entero de complemento de dos con signo de 16 bits. 
    Esta palabra clave también se usa para declarar que un método devuelve un valor del tipo primitivo short.  
    Tine un valor de 2 bytes(16bits) y un rango aproximado de -32768 a 32767.
    
```Java
public class Valshort {
	public static void main (String[] args) {
	short num = 3000;
	}
}
```    
    
## 2. ¿Cómo compilar un archivo .java y como ejecutarlo usando solamente la terminal de comandos (Terminal/CMD).?
   
  Desde nuestra terminal debemos movernos a la localización de la carpeta donde se encuentra nuestro archivo.
  A continuación daremos la instrucción para que se realice el proceso de compilación del programa, para lo que 
  escribiremos 
  
```Batchfile
javac Nombre_de_nuestro_programa.java
```
  
  Donde “javac” es el nombre del compilador (javac.exe) que transformará el programa que hemos escrito nosotros en lenguaje Java al 
  lenguaje de la máquina virtual Java (bytecode), dando como resultado un nuevo archivo “Nombre_de_nuestro_programa.class” 
  que se creará en este mismo directorio.
  
  Finalmente, vamos a pedirle al intérprete que ejecute el programa, es decir, que transforme el código de la máquina virtual 
  Java en código máquina interpretable por nuestro ordenador y lo ejecute. Para ello escribiremos en la ventana consola: 
  
```Batchfile
java Nombre_de_nuestro_programa
```
  
  Veremos un resultado como el siguiente (utilizando el primer resultado del archivo JavaApp.java de este repistorio)
  
 ```Batchfile
1. Palabra Reservada for
A
AB
``` 
  
## 3. ¿Cómo capturar datos introducidos desde nuestro teclado y elabora un pequeño programa utilizándolo.?

Para solicitar datos por teclado se puede crear un objeto de la clase Scanner. Mediante ese objeto se puede llamar/invocar a 
los métodos que permiten capturar datos tanto numéricos como textuales.
Al utilizar Scanner se debe importar la respectiva clase, en este caso

```Java
import java.util.Scanner;
```

Un ejemplo de la creación del objeto Scanner es:

```Java
import java.util.Scanner;

public class Ejemplo3{

  public static void main (String[] args){

    Scanner lectura = new Scanner (System.in);

    System.out.println("Ingrese su nombre: ");

    String nombre = lectura.next();

    System.out.println("Ingrese su edad: ");

    int edad = lectura.nextInt();

    System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);

  }

}
```

Esto arrojará un resultado como el siguiente :

![img1](imgs/"terminal.png")
  
## 4. Elabora un programa usando los diferentes operadores aritméticos vistos en clase, asigna los resultados de estas operaciones a distintas variables e imprima en consola los resultados usando estas variables.

```Java
import java.util.Scanner;

public class Ejemplo3{

  public static void main (String[] args){

    Scanner lectura = new Scanner (System.in);

        System.out.println("Ingresa cantidad 1: ");

        int cant1 = lectura.nextInt();

        System.out.println("Ingresa cantidad 2: ");

        int cant2 = lectura.nextInt();

        double suma, resta, mult, div;

        suma = cant1 + cant2;

        resta = cant1 - cant2;

        mult = cant1 * cant2;

        div = cant1 / cant2;

        System.out.print("Suma: " + suma + 
        "\nResta: " + resta + 
        "\nMultiplicación: " + mult + 
        "\nDivisión: " + div + "\n");

  }

}
```

Obtendremos un resultado como el siguiente :

![img2](imgs/"operaciones.png")

## 5. Elabora un fragmento de código dónde realices 6 conversiones de tipos de datos ( 3 de manera implícita y 3 de manera explícita) e imprime en consola los resultados.

```Java
System.out.println("Explícitas");
        
double d = 100.04; 

//casting de tipo
long l = (long)d;

//casting de tipo
int i = (int)l; 

System.out.println("Valor Double "+d);

//parte fraccionaria perdida
System.out.println("Valor Long "+l); 

//parte fraccionaria perdida
System.out.println("Valor Int "+i); 

System.out.println("Implícitas");

byte x = 5;
int y = x;
float z = y;

System.out.println("X: " + x + ", Y: "+ y +", Z: "+z);
```
Resultado:

![img3](imgs/"conversion.png")

### Fuentes
1. [Bucle For](https://javautodidacta.es/bucle-for-java/).
2. [If-Else](https://javautodidacta.es/if-else-en-java/)
3. [INT, LONG, SHORT](https://www.ciberaula.com/cursos/java/palabras_reservadas_java.php)
4. [VARIABLES PRIMITIVAS 1](https://javautodidacta.es/variable-primitiva-en-java/)
