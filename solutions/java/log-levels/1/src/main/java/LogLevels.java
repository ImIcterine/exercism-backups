public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.trim().split(":", 2);

        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] arr = logLine.trim().split(":", 2);

        if (arr[0].trim().equals("[INFO]")) {
            return "info";
        } else if (arr[0].trim().equals("[WARNING]")) {
            return "warning";
        } else if (arr[0].trim().equals("[ERROR]")) {
            return "error";
        }

        return arr[0].trim();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
