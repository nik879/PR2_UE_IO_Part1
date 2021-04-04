package IO.Logger_Bsp2;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) throws ErrorLevelException {
        ErrorMessage em = null;
        try {
            em = new ErrorMessage("Fatal", "Applikation shutdown", LocalDateTime.now().toString());
        } catch (ErrorLevelException e) {
            e.printStackTrace();
        }
        Logger logger = new Logger("C:\\Users\\nikik\\Desktop\\logger.txt");
        //logger.logMessage(em);
        logger.logFatal("fataler Error");
        logger.logDebug("debugging treats information");
        logger.logError("there was an issue with the incoming filestream");
        logger.logInfo("The Transaction was successful");
    }
}
