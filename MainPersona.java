import java.util.Scanner;
public class MainPersona {
public static void main(String[] args) {
Scanner per1 = new Scanner(System.in);
System.out.println("ingresa tu nombre:");
String nombre=per1.next();
System.out.println("Escribe tu apellido");
String apellido=per1.next();
System.out.println("ingresa tu edad");
int edad=per1.nextInt();
System.out.println("Escribe tu altura");
double altura=per1.nextDouble();

Persona obj = new Persona ();
obj.nombre=nombre;
obj.apellido=apellido;
obj.edad=edad;
obj.altura=altura;

obj.mostrarNombre();
obj.mostrarApellido();
obj.mostrarEdad();
obj.mostrarAltura();
    }
}