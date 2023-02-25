package optimization;

import java.util.*;

public class Optimization {
    static Set<A> setA = new HashSet<>();

    public static void main(String[] args) {
        add(new A(1));
        add(new A(2));
        add(new A(1));

        System.out.println("Size: " + setA.size());
    }


    static void add(A obj) {
        boolean isUnique = true;

        for(A a : setA){
            if(a.id == obj.id){
                isUnique = false;
                break;
            }
        }

        if(isUnique)
            setA.add(obj);
    }
}

class A {
    int id;

    A(int id){
        this.id = id;
    }
}
