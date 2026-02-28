class TheDog implements Speaker {
    public void speak() {
        System.out.println("Woof");
    }
    public void announce(String str) {
        System.out.println("The Dog says " + str + "\n");
    }
}