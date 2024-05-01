package StringProblems;

public class Singleton {

    final int a = 10;

    private Singleton singleton;

    private Singleton(Singleton singleton) {
        this.singleton = singleton;
    }

    void reference(Singleton singleton){
        this.singleton = singleton;
    }

    static int sum(int a){
        return 10;
    }
}
