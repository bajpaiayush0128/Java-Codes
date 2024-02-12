class Base {
    void base_method() {
        System.out.println("base");
    }
}

// Single inheritance class
class Child1 extends Base {
    void child1_method() {
        System.out.println("child1");
    }
}

// Multilevel inheritance class
class GrandChild extends Child1 {
    void grandchild_method() {
        System.out.println("grandchild");
    }
}

// Hierarchical inheritance class
class Child2 extends Base {
    void child2_method() {
        System.out.println("child2");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        System.out.println("UID: 20BCS4468");
        System.out.println("Name: Ayush Bajpai");
        System.out.println("Class: 20BDA-4/B");
        System.out.println("Subject: PBLJ");

        // Single
        System.out.println("Single inheritance");
        Child1 d = new Child1();
        d.child1_method();
        d.base_method();

        // Multilevel
        System.out.println("Multilevel inheritance");
        GrandChild bd = new GrandChild();
        bd.grandchild_method();
        bd.child1_method();
        bd.base_method();

        // Hierarchical
        System.out.println("Hierarchical inheritance");
        Child2 c = new Child2();
        c.child2_method();
        c.base_method();
    }
}