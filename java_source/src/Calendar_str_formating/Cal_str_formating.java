package Calendar_str_formating;

import java. util.*;
import static java.lang.System.out;

public class Cal_str_formating {
	
	static int DAY_IM = 1000*60*60*24;
	
	public static void main(String [] args) {
		Calendar c = Calendar.getInstance();
		c.set(2004, 0,7,15,40);
		long day1 = c.getTimeInMillis();
		
		for (int x =0; x<60;x++) {
			day1 += (DAY_IM * 29.25);
			c.setTimeInMillis(day1);
			out.println(String.format("full moon on %tc", c));
		}
		
		out.println(String.format("%,6.1f", 42.000));
		out.println(String.format("%6d", 42));
	}

}
