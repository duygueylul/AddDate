package AddDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
	        Calendar cal = Calendar.getInstance();
	        System.out.println("Bugünün Tarihi: " + sdf.format(cal.getTime()));
	        cal.add(Calendar.DAY_OF_MONTH, 205); 
	        String newDate = sdf.format(cal.getTime());
	        System.out.println("Yeni Tarih : " + newDate);

	}

}
