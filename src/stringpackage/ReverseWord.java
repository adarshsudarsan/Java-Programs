package stringpackage;

public class ReverseWord {

    public static void main(String[] args) {

        String word = "Testing center";
        String[] ar = word.split(" ");

        for(int i = ar.length - 1; i >= 0; i--)
        {
            System.out.print(ar[i] + " ");
        }
    }
}