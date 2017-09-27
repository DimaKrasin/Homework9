package MainApp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown = true)

public class item {
	
	
	
	public snippet getSnippet() {
		return snippet;
	}

	public void setSnippet(snippet snippet) {
		this.snippet = snippet;
	}

	snippet snippet = new snippet();

}
