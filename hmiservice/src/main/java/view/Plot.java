package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Plot {

	@XmlAttribute
	public String resourceID;
	
	@XmlElement(name = "cursor")
	public Cursor cursor = new Cursor();

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}
	
	public Plot() {
		
	}

	public Plot(String id) {
		this.resourceID = id;
	}
	
	
	
	public abstract String toString();
	
	@XmlAccessorType(XmlAccessType.FIELD)
	static class Cursor{
		
		public Cursor() {
			
		}
		
		public Cursor(String value) {
			this.value = value;
		}
		
		@XmlAttribute
		public String contentType = "base64";
		
		@XmlValue
		public String value = "Gg==";
		
	}
}