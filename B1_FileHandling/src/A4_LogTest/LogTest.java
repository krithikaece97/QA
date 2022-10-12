package A4_LogTest;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	public static Logger log=LoggerFactory.getLogger(LogTest.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("D:\\Vcentry\\B1_FileHandling\\src\\A4_LogTest\\log4j.properties");
		log.info("info1");//instead of syso here we r using log
		log.error("error1");
	}

}
