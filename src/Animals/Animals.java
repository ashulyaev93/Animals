package Animals;

public class Animals
{
    String name;
    protected int run;
    protected double jump;
    protected int swim;

    public Animals()
    {

    }

    public Animals(String name, int run, double jump, int swim)
    {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public void name(){
        System.out.println("Животное: " + name);
    }

    public void run(){
        System.out.println("Животное " + name + " пробежал " + run + " метров");
    }

    public void jump(){
        System.out.println("Животное " + name + " подпрыгнул на " + jump + " метра");
    }

    public void swim(){
        System.out.println("Животное " + name + " проплыл " + swim + " метров");
        System.out.println();
    }
}

