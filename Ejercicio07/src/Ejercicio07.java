public class Ejercicio07 {
    public static void main(String[] args) {
        int variable1 = 81;
        int variable2 = 9;
        int variable3 = 3;
        int variable4 = 10;
        int variable5 = 1;
        int variable6 = 100;
        int variable7 = 25;
        System.out.println("Solucion al problema= ");
           boolean expresion1 = (((Math.sqrt(variable1) + variable2) / variable3) == variable2);
           boolean expresion2 = (variable4 > variable5);
           boolean expresion3 = ((variable6 / variable7) >= Math.sqrt(variable6));
           boolean respuesta = ((expresion1) || (expresion2) & (expresion3));
           System.out.println(respuesta);
    }
    
}
