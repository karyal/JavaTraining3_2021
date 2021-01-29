package unit6_javalibraries;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Simple Data Format
	// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	// https://www.journaldev.com/17899/java-simpledateformat-java-date-format
	// https://www.joda.org/joda-time/#:~:text=Joda%2DTime%20is%20the%20de,business%2Dfriendly%20Apache%202.0%20licence.
public class DataTimeTest {
	public static void main(String[] args) {
		//Date
		Date date1 = new Date();
		System.out.println(date1);
		
		DateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd zzzz");
		System.out.println(dFormat.format(date1));
		
		dFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println(dFormat.format(date1));
		
		//Calendar
		//LocalDate
		//Numbers to Date
		//Local DataTime
		//TimeStamp
		//Calculate DateTime Difference		
	}
}