public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new NotFly(), new Drown(), new MuteQuack());
    }

  
    public void display() {
        System.out.println("I am a Decoy Duck!");
    }
}