interface SwimBehaviour
{
    void swim();
}
class CanSwim implements SwimBehaviour{
    public void swim{
        System.out.println("can swim");
    }
}
class CannotSwim implements SwimBehaviour
{
    public void swim()
    {
        System.out.printl("cannot swim");
    }
}
abstract class Animal 
{
    private SwimBehaviour swimBehaviour;

    public void setSwimBehaviour(SwimBehaviour swimBehaviour)
    {
        this.swimBehaviour = swimBehaviour;
    }
    public void performSwim()
    {
        this.swimBehaviour.swim();
    }
    public void eat()
    {
        System.out.println("Eating");
    }
    public void drink()
    {
        System.out.println("Drinking");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}
class Dog extends Animal
{

}
class Cat extends Animal
{

}
public class StrategyDesign
{
    public static void main(String... x)
    {
        Dog d = new Dog();
        d.setSwimBehaviour(new CanSwim);
        d.performSwim();

        cat c = new Cat();
        c.setSwimBehaviour(new CannotSwim);
        c.performSwim();
    }
}