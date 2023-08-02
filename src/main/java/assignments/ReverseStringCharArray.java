package assignments;

public class ReverseStringCharArray {
    public static void main(String[] args) {

        String input = "Never give up";
        char[] charArrayInput = input.toCharArray();
        for(int index= charArrayInput.length-1; index>=0; index--) {
            System.out.print(charArrayInput[index]);
        }
    }
}
