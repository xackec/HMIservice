package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "root")
public class Root extends View{

	@XmlElement
	String background;

	@XmlElement
    String width;
    
	@XmlElement
    String height;
    
	@XmlElement
    String startupBindingsConcurrency;
    
	@XmlElement
    String normalConcurrentBindings;
    
	@XmlElement
    String maximumConcurrentBindings;
    
	public Root(String id) {
		super(id);
	}

	@Override
	public String toString() {
		return "{"+background+"}";
	}

}
