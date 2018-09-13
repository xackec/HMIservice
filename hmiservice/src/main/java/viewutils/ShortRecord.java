package viewutils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlAccessorType(XmlAccessType.FIELD)
public class ShortRecord{
	
	@XmlPath("value/@name")
	public String name = "dash";
	
	@XmlPath("value/text()")
	public String dash;
	
	public ShortRecord() {
		
	}
	
	public ShortRecord(String dash) {
		this.dash = dash;
	}
	
	@Override
	public String toString() {
		return dash;
	}
	
}
