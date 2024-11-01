//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void ejercicio1(int edad) {
        int curso = 0;
        int ciclo = 0;
        if (edad < 3) {
            System.out.println("La edad es demasiado inferior. " +"su curso es : "+ curso);
        } else if (edad < 6) {
            ciclo = 0;
            System.out.println("Es de esucación infantil. " + "su curso es : "+curso);
        } else if (edad < 7) {
            ciclo = 1;
            curso = 1;
            System.out.println("Es de educación primária.Ciclo inicial " +"su curso es : "+ curso);
        } else if (edad < 8) {
            ciclo = 1;
            curso = 2;
            System.out.println("Es de educación primária.Ciclo inicial " + "su curso es : "+curso);
        } else if (edad < 9) {
            ciclo = 2;
            curso = 3;
            System.out.println("Es de educación primária.Ciclo mediano " + "su curso es : "+curso);
        } else if (edad < 10) {
            ciclo = 2;
            curso = 4;
            System.out.println("Es de educación primária.Ciclo mediano " +"su curso es : "+curso);
        } else if (edad < 11) {
            ciclo = 3;
            curso = 5;
            System.out.println("Es de educación primária.Ciclo superior " + "su curso es : "+curso);
        } else if (edad < 12) {
            ciclo = 3;
            curso = 6;
            System.out.println("Es de educación primária.Ciclo superior " + "su curso es : "+curso);
        } else {
            System.out.println("La edad es demasiado superior.");
        }
    }
    public static void main(String[] args) {
        ejercicio1(11);
    }
}