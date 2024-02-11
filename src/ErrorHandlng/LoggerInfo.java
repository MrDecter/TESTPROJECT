package ErrorHandlng;

import java.util.logging.Logger;

public class LoggerInfo {
    private static Logger log = Logger.getLogger(LoggerInfo.class.getName());

    public void Log_message(){
        log.info("Сообщение");
    }
}
