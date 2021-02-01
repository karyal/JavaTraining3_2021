package unit6_javalibraries;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Simple Data Format
	// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	// https://www.journaldev.com/17899/java-simpledateformat-java-date-format
	// https://www.joda.org/joda-time/#:~:text=Joda%2DTime%20is%20the%20de,business%2Dfriendly%20Apache%202.0%20licence.
public class DataTimeTest {
	public static void main(String[] args) throws Exception{
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
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		Date firstDate = sdf.parse("06/24/2017");
		Date secondDate = sdf.parse("06/30/2017");
		long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
		long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		System.out.println(diff);
		
		//https://www.geeksforgeeks.org/find-the-duration-of-difference-between-two-dates-in-java/#:~:text=Find%20the%20time%20difference%20between,the%20difference%20between%20two%20dates.
	}
}