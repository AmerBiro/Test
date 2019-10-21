import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            boolean valid;
            System.out.println("Indtast radius for en cylinder");
            double Radius = scan.nextDouble();
            System.out.println("Indtast højde for en cylinder");
            double Height = scan.nextDouble();
            if (Radius >= 0 && Height >=0) {
                double resultat = (Math.PI * (Math.pow(Radius, 2) * Height));
                System.out.printf("Rumfanget af den ønskede cylinder er: " + "%.2f", resultat);
                System.out.println("");
            }
            else {
                System.out.println("Sorry, something went wrong");
            }
        }while (true);
    }
}
