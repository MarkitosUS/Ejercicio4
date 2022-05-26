public class Main {

    public static void main(String [] args){

    Cliente cliente = new Cliente();

    // Aqui asignamos el valor a las variables.

    cliente.setNombre("Marcos");
    cliente.getNombre();
    cliente.setEdad(24);
    cliente.getEdad();
    cliente.setTelefono(622444555);
    cliente.getTelefono();
    cliente.setCredito(5000);
    cliente.getCredito();
    cliente.setSalario(1200);


    System.out.println(" Nombre cliente: " + cliente.getNombre() + "\n Edad cliente: " + cliente.getEdad() + "\n Numero de telefono: " + cliente.getTelefono() + "\n Fondos: " + cliente.getCredito() + "$" + "\n Salario: " + cliente.getSalario() + "$");

    }
}

// Con los extends heredamos de Persona y Trabajador con la variable Cliente.
class Cliente extends Persona {

    private int credito;

    public void setCredito(int credito){

        this.credito =credito;

    }

    public int getCredito(){

        return this.credito;

    }
}

class Persona extends Trabajador {

    private int edad;

    private String nombre;

    private int telefono;

    public void setEdad(int edad){

        this.edad = edad;

    }

    public int getEdad(){

        return this.edad;

    }

    public void setTelefono(int telefono){

        this.telefono = telefono;

    }

    public int getTelefono(){

        return this.telefono;

    }

    public void setNombre(String nombre){

        this.nombre = nombre;

    }

    public String getNombre(){

        return this.nombre;

    }

}
class Trabajador {


    private int salario;

    public void setSalario(int salario){

         this.salario = salario;
    }

    public int getSalario(){

        return this.salario;

    }
}



