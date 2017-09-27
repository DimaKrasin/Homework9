package MainApp;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown = true)
public class snippet {

	Date publishedAt;
	String title;
}
