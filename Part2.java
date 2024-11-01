public class Part2 {

            static void ejercicio2 (int numeroEntregas ,float notaPrueba,float notaPracticas,int totalEntregas ) {
                boolean noSeguidaAC=false;
                float notaFinal = 0;
                float notaEntregas = 0;

                if (notaPrueba < 7) {
                    System.out.println("Estas suspendido para la nota final");

                } else if (numeroEntregas < (70 * totalEntregas / 100)) {
                    System.out.println("Estas suspendido. No has seguido evaluación continua.");
                    noSeguidaAC = true;

                } else if (numeroEntregas == (70 * totalEntregas / 100)) {
                    notaEntregas = 10;
                } else if (numeroEntregas >= (90 * totalEntregas / 100)) {
                    notaEntregas = 8;
                } else if (numeroEntregas >= (80 * totalEntregas / 100)) {
                    notaEntregas = 6;
                } else if (numeroEntregas >= (70 * totalEntregas / 100)) {
                    notaEntregas = 4;
                }
                notaFinal = (float) (notaPrueba * 0.20) + (float) (notaEntregas * 0.10) + (float) (notaPracticas * 0.70);
                if (notaFinal < 5 && noSeguidaAC) {
                    System.out.println("Estas suspendido para la nota final. Tiene que seguir evaluación contínua");
                } else {
                    System.out.println(" Haz los ejercicios preparatorios para la PAF2.");
                }
            }
        public static void main(String[] args) {
          ejercicio2 (10,6,10,10);

    }
}
