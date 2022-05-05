import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroA;
        int numeroB;

        String operaciones;

         final int capacidadMinima = 5;

        PilaUtils pila = new PilaUtils(capacidadMinima);

        Scanner sc = new Scanner(System.in);


        System.out.println("Que operación quieres realizar? (suma, resta, multiplicación, división)");

        switch (operaciones = sc.next()) {
            case "suma":
                System.out.println("Introduce el  primer número en la pila");

                numeroA = sc.nextInt();


                System.out.println("Introduce el segundo número en la pila");
                numeroB = sc.nextInt();
                String operador = "+";
                pila.push(numeroA + numeroB);
                pila.push("=");
                pila.push(numeroA);
                pila.push(operador);
                pila.push(numeroB);

                break;
            case "resta":
                System.out.println("Introduce el  primer número en la pila");

                numeroA = sc.nextInt();


                System.out.println("Introduce el segundo número en la pila");
                numeroB = sc.nextInt();
                String operadorResta = "-";
                pila.push(numeroA - numeroB);
                pila.push("=");
                pila.push(numeroA);
                pila.push(operadorResta);
                pila.push(numeroB);
                break;
            case "multiplicación":
                System.out.println("Introduce el  primer número en la pila");

                numeroA = sc.nextInt();


                System.out.println("Introduce el segundo número en la pila");
                numeroB = sc.nextInt();
                String operadorProducto = "*";
                pila.push(numeroA * numeroB);
                pila.push("=");
                pila.push(numeroA);
                pila.push(operadorProducto);
                pila.push(numeroB);
                break;
            case "división":
                System.out.println("Introduce el  primer número en la pila");

                numeroA = sc.nextInt();


                System.out.println("Introduce el segundo número en la pila");
                numeroB = sc.nextInt();
                String operadorDivision = "/";
                float resultado = (float) numeroA / numeroB;
                int resultadoEntero = Math.round(resultado) ;
                pila.push(resultadoEntero);
                pila.push("=");
                pila.push(numeroA);
                pila.push(operadorDivision);
                pila.push(numeroB);
                break  ;
        }


        System.out.println(pila);




    }
}
