package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subwidget")
public class Subwidget extends Plot{
	
	String height;
	
	String width;
	
    String reference;
    
    String defaultContext;
    
    String xCoordinate;
    
    String yCoordinate;
    
    String zOrder;
    
    public Subwidget() {
    	
    }
    
    public Subwidget(String id) {
    	super(id);
    }

}
