import java.util.Random;

public class FindingMinMax {
    public static void main(String[] args) {
        int smallest = 100, largest = 0;
        Random rd = new Random();
        int numMinMax [] = new int [10];

        for (int i = 0; i < numMinMax.length; i++){
            numMinMax[i] = (int) (Math.random() * (100) + 1); //Math.round(rd.nextInt(bound: 100)+1));
            System.out.printf(numMinMax[i] + " randomly 10 num ");
            if(numMinMax[i] > largest){
                largest = numMinMax[i];
            }
            if(numMinMax[i] < smallest){
                smallest = numMinMax[i];
            }
            System.out.println("Min " + smallest);
            System.out.println("Max " + largest);
        }
    }
}
