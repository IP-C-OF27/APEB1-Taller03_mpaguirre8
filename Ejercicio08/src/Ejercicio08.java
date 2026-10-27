public class Ejercicio08 {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        int variable7 = 200;
        int variable8 = 50;
        int variable9 = 51;
        System.out.println("Solucion al problema= ");
        boolean expresion1 = ((variable1 * variable2) + variable3 - (variable4 / variable5) + Math.pow(variable6, variable5) >= variable7);
        boolean expresion2 = (variable8 >= variable8 - variable8 + variable9);
        boolean respuesta = (expresion1 || expresion2);
           System.out.println(respuesta);
    }
}
