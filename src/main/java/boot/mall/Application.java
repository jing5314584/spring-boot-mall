package boot.mall;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application 
{
	private static Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
    	logger.info("=====spring boot start success====");
    }
}
