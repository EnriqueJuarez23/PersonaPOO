import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Scanner per1 = new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
        String nombre = per1.next();
        System.out.println("Escribe tu apellido");
        String apellido = per1.next();
        System.out.println("ingresa tu edad");
        int edad = per1.nextInt();
        System.out.println("Escribe tu altura");
        double altura = per1.nextDouble();

        Persona obj = new Persona();
        obj.setNombre(nombre);
        obj.setApellido(apellido);
        obj.setEdad(edad);
        obj.setAltura(altura);

        obj.getNombre();
        obj.getApellido();
        obj.getEdad();
        obj.getAltura();
        System.out.println(obj.toString());

        Persona per2 = new Persona();
        System.out.println("ingresa tu nombre:");
        String nombre2 = per1.next();
        System.out.println("Escribe tu apellido");
        String apellido2 = per1.next();
        System.out.println("ingresa tu edad");
        int edad2 = per1.nextInt();
        System.out.println("Escribe tu altura");

        double altura2 = per1.nextDouble();
        per2.setNombre(nombre2);
        per2.setApellido(apellido2);
        per2.setEdad(edad2);
        per2.setAltura(altura2);
        
        per2.getNombre();
        per2.getApellido();
        per2.getEdad();
        per2.getAltura();
        System.out.println(per2.toString());
    }
}