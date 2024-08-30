package gestionamientoeps;

import java.util.Scanner;
/**
 *
 * @author David Eduardo Chivata Arias
 */
public class GestionamientoEPS {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del Paciente:");
        String nombre = lector.nextLine();
        System.out.println("Ingrese la edad en años:");
        Integer edad = Integer.valueOf(lector.nextLine());
        
        
        Pair <String ,Integer> nombreyEdadPaciente = new Pair(nombre, edad);
        Persona paciente = new Persona(nombreyEdadPaciente);
        
        System.out.println("Ingrese el nombre de la EPS del Paciente:");
        String eps = lector.nextLine();
        System.out.println("Ingrese la fecha de nacimiento con formato dd/mm/aaaa");
        String fecha = lector.nextLine();
        
        Pair<String, String> epsyFechaNacimiento = new Pair(eps, fecha);
        
        paciente.setEpsyFechaNacimiento(epsyFechaNacimiento);
        
        System.out.println("Nombre y edad del paciente:" + paciente.getNombreyEdad().toString());
        System.out.println("Eps y fecha de nacimineto del paciente:" + paciente.getepsyFechaNacimiento().toString());
    }
    
}
