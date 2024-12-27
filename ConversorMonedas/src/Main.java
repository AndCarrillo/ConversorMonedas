import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta= new  ConsultarMoneda();
        int opcion=0;
        while (opcion !=7){
            System.out.println("******\n"+
            "1 Dolar => Peso Argentino \n"+
            "2 Peso argentino => Dollar\n"+
            "3 Dolar => Real Brasileño\n"+
            "4 Real Brasileño => Dolar\n"+
            "5 Dolar => Peso colombiano\n"+
            "6 Peso colombiano => Dolar\n"+
            "7 Salir\n"+
            "Elija una opción válida:\n"+
            "**********************"
            );
        opcion = lectura.nextInt();
        lectura.nextLine();
        switch (opcion){
            case 1:ConvertirMoneda.convertir("USD","ARS",consulta,lectura);
            break;
            case 2:
                ConvertirMoneda.convertir("ARS","USD",consulta,lectura);
                break;
            case 3:ConvertirMoneda.convertir("USD","BRL",consulta,lectura);
                break;
            case 4:ConvertirMoneda.convertir("BRL","USD",consulta,lectura);
                break;
            case 5:ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                break;
            case 6:ConvertirMoneda.convertir("COP","USD",consulta,lectura);
                break;
            case 7:
                System.out.println("Gracias!");
                break;
        }
        }
    }
}