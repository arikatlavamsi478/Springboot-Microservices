package StringProblems;

public class StringArrayProblem {
    public static void main(String[] args) {
        String[] strings = {"Hello","how", "are", " you", " welcome", " to", " Tutorialspoint"};
        StringBuffer sb = new StringBuffer();

        for (int i=0; i< strings.length; i++) {
            //System.out.print(strings[i]);
            sb.append(strings[i]);
        }
        String str = sb.toString();
        char []ch=str.toCharArray();
        for (char data:
             ch) {
          //  System.out.println(data);

        }
      //  System.out.println(ch[17]);
        //System.out.println(ch);
      //  System.out.println(str);
       // System.out.println(strings);
        String str2 = str.substring(0,sb.length()-1);
        System.out.println(str2+" "+"-");
    }
}
