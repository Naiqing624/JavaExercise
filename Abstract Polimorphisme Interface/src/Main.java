
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Aslan"),
                new Cat("Simba"),
        };
        for (Animal a : animals) {
            feedFood(a);
        }

        for(Animal a : animals) {
            if (a instanceof Swim s)
                s.swim();
        }
    }

    public static void feedFood(Animal a) {
        System.out.print(a.getName() + ": ");
        a.eat();
    }
}

abstract class Animal {
    private String  name;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void   eat();

    public String getName() {
        return name;
    }
}

interface Swim {
    void    swim();
}

