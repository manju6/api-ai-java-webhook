package hello;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebResponse {
	
	@JsonProperty( "groupBy" )
	private String groupBy;
	
	@JsonProperty( "count" )
    private String count;
	
	
    private final String source = "CPM";
    
    
	public String getGroupBy() {
		return groupBy;
	}
	public String getCount() {
		return count;
	}
	public String getSource() {
		return source;
	}
	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}
	public void setCount(String count) {
		this.count = count;
	}

	
    
	
	
    

}
