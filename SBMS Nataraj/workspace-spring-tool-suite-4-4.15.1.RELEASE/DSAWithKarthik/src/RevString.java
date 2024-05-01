public class RevString {

    public static void main(String[] args) {

        String str = "vamsi";
        char [] ch = str.toCharArray();

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(String.valueOf(ch[i]));

        }
    }
}
