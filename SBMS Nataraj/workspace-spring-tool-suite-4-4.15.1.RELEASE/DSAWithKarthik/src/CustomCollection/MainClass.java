package CustomCollection;

public class MainClass {

    public static void main(String[] args) {
        CustomArrayList ca = new CustomArrayList();
        ca.add(1); // arr[0]=1;
        ca.add(2); // arr[1]=2;
        ca.add(3);
        ca.add(4);
        ca.add(5);
        ca.add(6);
        ca.add(7);
        ca.add(8);
      //  ca.add(10);
        ca.add(10);
        ca.add(101);
        ca.add(103);
        ca.add(105);
        ca.add(106);
        ca.add(107);
        ca.add(108);

        System.out.println(ca.get(115));
        System.out.println(ca);



    }
}
