package projects;
import java.util.Scanner;

public class AverageUpdate {
    public static void main(String[] args) {
        int calcSum = 0; int x,y,readerInput;
        Scanner reader = new Scanner(System.in); 

        for (x=0; x<1; x++) {
            for (y=0; y<3; y++) {
                int note = y+1;
                System.out.print("Digit for note "+note+": ");
                readerInput = reader.nextInt();
                calcSum += readerInput;
            }
            calcSum = calcSum / 3;
            System.out.println("Note "+calcSum);
            if (calcSum >= 6) {
                System.out.println("Congratulations");
            }
        }
    }    
}
