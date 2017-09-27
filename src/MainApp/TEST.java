package MainApp;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown = true)
public class TEST {
	
	String regionCode;
	
	ArrayList<item> items = new ArrayList<>();
	
	

	public ArrayList<item> getItems() {
		return items;
	}

//	public void setItems(ArrayList<item> items) {
//		this.items.addAll(items);
//	}
	
	public void setItems1(ArrayList<item> items) {
		this.items = items;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	

}
