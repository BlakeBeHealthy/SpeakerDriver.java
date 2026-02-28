class TheRobot implements Speaker {
    public void speak() {
        System.out.println("Beep");
    }
    public void announce(String str) {
        System.out.println("The Robot says " + str);
    }
}