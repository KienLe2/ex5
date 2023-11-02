public class FillingArray {
    public static void main(String[] args) {
        int numberArray[] = new int [10];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = numberArray.length-1-i;
            System.out.println("Method-1 For: " +i);
        }
        for (int x:numberArray) {
            System.out.println("Method-21 For: " + numberArray[x]);
        }
    }
}
