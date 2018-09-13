package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Circle")
public class Circle extends Plot{

String height;
	
	String width;
	
    String foreground;
    
    String incolor;
    
    String orientation;
    
    String bsize;
    
    String xCoordinate;
    
    String yCoordinate;
    
    String zOrder;
    
    public Circle() {
    	
    }
    
    public Circle(String id) {
    	super(id);
    }
}
