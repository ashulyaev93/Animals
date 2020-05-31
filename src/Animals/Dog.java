package Animals;

public class Dog extends Animals
{
    public Dog()
    {

    }

    //у каждой собаки есть эти навыки
    public Dog(String name, int run, double jump, int swim)
    {
        this.name = name;
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }
}
