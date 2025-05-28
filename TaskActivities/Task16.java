abstract class Gorilla implements Animal{
    private static boolean lather;
    private static boolean rinse;
    private boolean repeat;
    
    // lather, rinse, repeat
    public void pet() {
        Gorilla.lather = true;
        Gorilla.rinse = true;
        repeat = true;
    }

    // pet at your own risk
    public void groom() {
        System.out.println("Pet at your own risk!");
    }

    // put gorilla food into the cage
    public boolean feed(boolean timeToEat) {
        return true;
    }
}

interface Animal {
    boolean feed (boolean timeToEat);
    void groom();
    void pet();
}
