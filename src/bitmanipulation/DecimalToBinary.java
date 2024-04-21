package bitmanipulation;

public class DecimalToBinary {


    public static String convertToBinary(int n) {

        StringBuilder binary = new StringBuilder();

        while(n > 0){
            int remainder = n % 2;
            binary.insert(0, remainder);
            n = n/2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(convertToBinary(n));
    }
}
