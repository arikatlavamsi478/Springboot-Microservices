package StringProblems;

public class StringEx {
    public static void main(String[] args) {
        methodAdd();


    }


    public static void methodAdd() {
        String s1 = "vamsi";
        char[] ch = s1.toCharArray();

        //  String str = new String();
        for (int i = 0; i < ch.length; i++) {
            //  str = "" + ch[i] + methodAdd(i );
            // str = "" + ch[3];
            String str = Character.toString(ch[i]);
            //  System.out.print(str);

            System.out.println(str);

        }

    }
}



