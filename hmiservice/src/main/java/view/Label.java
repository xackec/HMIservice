package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "label")
public class Label extends Plot{
	
	String text;
	
	String iconTextGap;
	
    String xCoordinate;
    
    String yCoordinate;
    
    String zOrder;
    
    public Label() {
    	
    }
    
    public Label(String id, String text, String gap, String x, String y, String zOrder) {
    	super(id);
    	this.text = text;
    	this.iconTextGap = gap;
    	this.xCoordinate = x;
    	this.yCoordinate = y;
    	this.zOrder = zOrder;
    }
    

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconTextGap() {
		return iconTextGap;
	}

	public void setIconTextGap(String iconTextGap) {
		this.iconTextGap = iconTextGap;
	}

	public String getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(String xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public String getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(String yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public String getzOrder() {
		return zOrder;
	}

	public void setzOrder(String zOrder) {
		this.zOrder = zOrder;
	}
}
