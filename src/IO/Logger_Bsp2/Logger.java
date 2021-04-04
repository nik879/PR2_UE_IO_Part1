package IO.Logger_Bsp2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private String path;

    public Logger(String path) {
        this.path = path;
    }

    private void logMessage(ErrorMessage message) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(path,true))) {
            //ErrorMessage em = new ErrorMessage(message.getErrorLevel(), me)
            br.write(message.toLine());
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logFatal(String message) throws ErrorLevelException {
        ErrorMessage em = new ErrorMessage("Fatal",message, LocalDateTime.now().toString());
        logMessage(em);
    }
    public void logError(String message) throws ErrorLevelException {
        ErrorMessage em = new ErrorMessage("Error",message, LocalDateTime.now().toString());
        logMessage(em);
    }
    public void logInfo(String message) throws ErrorLevelException {
        ErrorMessage em = new ErrorMessage("Info",message, LocalDateTime.now().toString());
        logMessage(em);
    }
    public void logDebug(String message) throws ErrorLevelException {
        ErrorMessage em = new ErrorMessage("Debug",message, LocalDateTime.now().toString());
        logMessage(em);
    }

}
