//Calendar
public class Main{
    public static void main(String[] args){
        
    }
}
        System.out.println("O programa começou");

        Scanner scanner = new Scanner(System.in);

        int contador = scanner.nextInt();

        while (contador > 0) {
            System.out.println("A hora é: " + Calendar.getInstance().getTime());
            contador--;
     }

        for (int numero = 0; numero < 10;) {
            System.out.println("A hora é: " + Calendar.getInstance().getTime());
        }