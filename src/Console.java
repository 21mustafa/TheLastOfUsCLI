package src;

public class Console {
    public static void logWithDelay(String log) {
        sleep(1500);
        System.out.println(log);
    }

    public static void logWithLongDelay(String log) {
        sleep(2500);
        System.out.println(log);
    }

    public static void log(String log) {
        System.out.println(log);
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }

    public static boolean getInput(String yesMessage, String noMessage) {
        String answer = System.console().readLine();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println(yesMessage);
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println(noMessage);
        } else {
            System.out.println("Sorry, not a valid answer.");
            System.exit(-1);
        }
        return false;
    }
}
