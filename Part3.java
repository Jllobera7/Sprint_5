public class Part3 {
    static void ejercicio3(int temperatura, int edad, int peso) {
        int dosisParacetamol;

        if (temperatura < 38) {
            System.out.println("El niño está bien");
        } else {
                if (temperatura < 39) {
                    System.out.println("Es recomendable darle un baño para bajar la temperatura");
                }

                if (edad < 3) {
                    System.out.println("Consulta un médico");
                } else if (edad < 12) {
                    dosisParacetamol = 15 * peso;
                    System.out.println("Debe de darle " + dosisParacetamol + "mg de paracetamol");
                } else {
                    dosisParacetamol = 500;
                    System.out.println("Debe de darle " + dosisParacetamol + "mg de paracetamol cada 8h");
                }

                if (temperatura >= 40) {
                    System.out.println("Debe de llevar al niño al hospital URGENTEMENTE!");
                }
            }
            }
public static void main(String[] args) {
   ejercicio3(40,10,10);

}

}
