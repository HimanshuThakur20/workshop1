public class Horse implements Animal{

    @Override
    public void breath() {
        System.out.println("Horse is breathing");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");

    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");

    }

    @Override
    public void move() {
        System.out.println("Horse is moving");

    }
}
