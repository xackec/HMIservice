package viewutils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Record{
	
	public String x = "0.0";
	
	public String y = "0.0";
	
	public Record() {
		
	}
	
	public Record(String x, String y) {
		this.x = x;
		this.y = y;
	}
	
}
