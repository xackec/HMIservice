package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import viewutils.Stroke;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rectangle")
public class Rectangle {
	
	String height;
	
	String width;
	
    String foreground;
    
    String background;
    
    String opaque;
    
    String arrowWidth;
    
    String tipLength;
    
    String tipWidth;
    
    String factorX;
    
    String factorY;
    
    String xCoordinate;
    
    String yCoordinate;
    
    String zOrder;
	
    @XmlElement(name = "stroke")
    Stroke stroke;
    
    public Rectangle() {
    	
    }
    
    public Rectangle(String id) {
    	
    }

}
