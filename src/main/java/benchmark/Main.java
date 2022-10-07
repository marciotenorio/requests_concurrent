package benchmark;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger logger = Logger.getLogger("main");

        logger.info(LocalDateTime.now().toString());

        org.openjdk.jmh.Main.main(args);

        logger.info(LocalDateTime.now().toString());
    }
}
