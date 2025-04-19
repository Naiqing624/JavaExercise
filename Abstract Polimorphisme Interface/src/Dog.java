public class Dog extends Animal implements Swim {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    void eat() {
        System.out.println("bone");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}

