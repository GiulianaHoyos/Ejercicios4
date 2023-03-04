public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;

        if (numeroIf > 0 ) {
            System.out.println("Es Positivo");
        } else if(numeroIf < 0){
            System.out.println("Es Negativo");
        } else {
            System.out.println("Es 0");
        }

        ////////////////////// ejercicio 2 ////
        System.out.println("");

        int numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        }

        ////////////////////// ejercicio 3 ////
        System.out.println("");


        int numeroDoWhile = 1;

        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile +4;

        } while (numeroDoWhile < 5 );

        /////////////////////// ejercicio 4 ////
        System.out.println("");

        for(int numeroFor = 0; numeroFor <=3; numeroFor = numeroFor +1){
            System.out.println(numeroFor);
        }

        /////////////////////// ejercicio 5 ////
        System.out.println("");

        var estacion = "invierno";

        switch(estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es estacion");
        }
    }

}
