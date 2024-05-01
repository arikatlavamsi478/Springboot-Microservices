package StringProblems;

public class VarDataMem {

    interface VariableDataMember{
        int val=10;
    }

    class interfaceVariable implements VariableDataMember{
        public static void main(String[] args) {
            int val=100;
            System.out.println(val);
        }
    }
}
