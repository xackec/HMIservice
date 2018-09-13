package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vectorDrawing")
public class Vectordrawing extends Plot{
	
	String height;
	
	String width;
	
	String flipVertical;
	
	String drawing;
	
    String preserveAspectRatio;
    
    String xCoordinate;
    
    String yCoordinate;
    
    String zOrder;
    
    public Vectordrawing() {
    	
    }
    
    public Vectordrawing(String id) {
    	super(id);
    }

}
