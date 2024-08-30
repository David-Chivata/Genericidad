package gestionamientoeps;

/**
 *
 * @author David Eduardo Chivata Arias
 */
class Persona {
    private Pair <String,Integer > nombreyEdad;
    private Pair <String, String> epsyFechaNacimiento;
    
    public Persona(Pair nombreyEdad){
        this.nombreyEdad = nombreyEdad;
    }
    
    public void setEpsyFechaNacimiento(Pair epsyFechaNacimiento){
        this.epsyFechaNacimiento = epsyFechaNacimiento;
    }
    
    public Pair getNombreyEdad(){
        return nombreyEdad;
    }
    
    public Pair getepsyFechaNacimiento(){
        return epsyFechaNacimiento;
    }
}

