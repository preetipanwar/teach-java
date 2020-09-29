public class  Parent {

    void Print()
    {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {

    void Print()
    {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {

    void Print()
    {
        System.out.println("subclass2");
    }
}

class TestPolymorphism3 {
    public static void main(String[] args)
    {

        subclass1  a = new subclass1();
        a.Print();

        subclass2 a1 = new subclass2();
        a1.Print();
    }
}


