package raw.checker;
import java.time.*;
import java.time.format.*;
import java.text.*;
public class validdate{
	
public boolean isLegalDate(String s) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
    sdf.setLenient(false);
    return sdf.parse(s, new ParsePosition(0)) != null;
}	

	
}






