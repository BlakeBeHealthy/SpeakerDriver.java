class Philosopher implements Speaker {

    public void speak() {
        System.out.println("I'm a Philosopher");


    }
    public void announce(String str) {
        System.out.println("The Philosopher says " + str + "\n");

    }
}