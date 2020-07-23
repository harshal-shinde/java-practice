package assignments;

public class ReverseStringByteArray {

    public static void main(String[] args) {
        String str = "I love India";
        byte[] strByteArray = str.getBytes();
        byte[] result = new byte[strByteArray.length];

        for(int i=0; i<strByteArray.length; i++)
            result[i] = strByteArray[strByteArray.length - i - 1];

        System.out.println(new String(result));

    }
}
