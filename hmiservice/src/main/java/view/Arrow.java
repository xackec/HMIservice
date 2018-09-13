package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import viewutils.Stroke;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrow")
public class Arrow extends Plot{
	
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
    
    public Arrow() {
	}
    
    public Arrow(String id) {
    	super(id);
    	stroke = new Stroke("0");
    }
    
    

	public void setHeight(String height) {
		this.height = height;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public void setForeground(String foreground) {
		this.foreground = foreground;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public void setOpaque(String opaque) {
		this.opaque = opaque;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
