public class CicloWile {
    public static void main(String[] args) throws Exception {

        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contador es: " + contador);
            contador++;
        }

        int contador2 = 11;
        do {
            System.out.println("Esto es antes de la condicion");
            System.out.println(contador2);
            contador2++;
        } while (contador2 <= 5);
    }
}
