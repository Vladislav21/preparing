package Patterns.Singleton;

public class Main {
    public static void main(String[] args) {
            ProgramLogger.getProgramLogger().addLogInfo("First test");
            ProgramLogger.getProgramLogger().addLogInfo("Second test");
            ProgramLogger.getProgramLogger().addLogInfo("Third test");

            ProgramLogger.getProgramLogger().showLogFile();
    }
}
