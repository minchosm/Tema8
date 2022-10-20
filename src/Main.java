public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(35);
        persona.setNombre("Manolo");
        persona.setTelefono(9555555);
        System.out.println("Hola me llamo " + persona.getNombre() + ", tengo " + persona.getEdad() + " años y mi número es el " + persona.getTelefono());
    }
}