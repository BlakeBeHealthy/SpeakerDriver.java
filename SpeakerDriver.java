public class SpeakerDriver {

    public static void main(String[] args) {
        Speaker speak;

        speak = new Philosopher();
        speak.speak();
        speak.announce("\"the earth revolves around the sun!\"");

        speak = new TheDog();
        speak.speak();
        speak.announce("\"there is a squirrel outside\"");

        speak = new TheRobot();
        speak.speak();
        speak.announce("\"system online!\"");
    }
}