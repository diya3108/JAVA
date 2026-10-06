 //Write a java program to use abstract class.
 abstract class animal
 {
    abstract  void animalsound();


    void sleep()
    {
        System.out.println("zzzzzz");
    }
 }
 class Doggy extends animal
 {
    void animalsound()
    {
        System.out.println("Doggy says: woof...woof ");
    }
 }
 class U2_P7
{
    public static void main(String args[]){
        Doggy t = new Doggy();
        t.animalsound();
        t.sleep();
    }
}
