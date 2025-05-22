
class Main{
    public static void main(String[] args) {
        String name = Prompter.promptSimple("User Name");
        int age = Prompter.promptIntSimple("Age");

        String color = Prompter.prompt("Color", "Black");
        int width = (int) Prompter.promptInt("Width", 100);

        double feet = Prompter.promptDouble("Feet", 5.0);
    }
}
