public class Main {

    public static void main(String [] args){

    Cliente cliente = new Cliente();

    // Aqui asignamos el valor a las variables.

    cliente.nombre = "Marcos";
    cliente.edad = 24;
    cliente.telefono = 622444555;
    cliente.credito = 5000;
    cliente.salario = 1200;


    System.out.println(" Nombre cliente: " + cliente.nombre + "\n Edad cliente: " + cliente.edad + "\n Numero de telefono: " + cliente.telefono + "\n Fondos: " + cliente.credito + "$" + "\n Salario: " + cliente.salario + "$");

    }
}

// Con los extends heredamos de Persona y Trabajador con la variable Cliente.
class Cliente extends Persona {

    int credito;

}

class Persona extends Trabajador {

    int edad;
    
    String nombre;

    int telefono;

}
class Trabajador {

    int salario;

}

