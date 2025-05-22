import java.util.Scanner;

public class Prompter {
    static Scanner scanner = new Scanner(System.in);

    public static String promptSimple(String message) {
        String value = "";
        while (value.isEmpty()) {
            System.out.printf("%s: ", message);
            value = scanner.nextLine().trim();
        }
        return value;
    }

    public static Integer promptIntSimple(String message) {
        Integer i = null;
        while (i == null) {
            String text = promptSimple(message);
            try {
                i = Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return i;
    }

    public static String prompt(String message, String defaultValue) {
        String name = "";
        System.out.printf("%s (%s): ", message, defaultValue);
        name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            name = defaultValue;
        }
        return name;
    }

    public static Integer promptInt(String message, Integer defaultValue) {
        Integer i = null;
        while (i == null) {
            String text = prompt(message, defaultValue.toString());
            try {
                i = Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return i;
    }

    public static double promptDouble(String message, Double defaultValue) {
        Double d = null;
        while (d == null) {
            String text = prompt(message, defaultValue.toString());
            try {
                d = Double.parseDouble(text);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return d;
    }
}
