package view;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import viewutils.Record;
import viewutils.Stroke;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "polyline")
public class Polyline extends Plot{
	
	public Polyline() {
		
	}
	
	public Polyline(String id) {
		super(id);
	}
	
	public Polyline(String id, String height, String foreground, String outer, String inner, String angle, String x, String y) {
		super(id);
		
		this.height = height;
		this.foreground = foreground;
		this.outerRadius = outer;
		this.innerRadius = inner;
		this.angle = angle;
		this.xCoordinate = x;
		this.yCoordinate = y;
	}

	String height;
	
	String width;
	
    String foreground;
    
    @XmlElement(name = "stroke")
    Stroke stroke = new Stroke();
    
	@XmlElementWrapper(name = "points")
	@XmlElement(name = "record")
    public List<Record> points = new ArrayList<Record>();
    
	String outerRadius;
    
    String innerRadius;
    
    String angle;
    
    String xCoordinate;
    
    String yCoordinate;
    


	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getForeground() {
		return foreground;
	}

	public void setForeground(String foreground) {
		this.foreground = foreground;
	}

	public String getOuterRadius() {
		return outerRadius;
	}

	public void setOuterRadius(String outerRadius) {
		this.outerRadius = outerRadius;
	}

	public String getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
	}

	public String getAngle() {
		return angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
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

	public List<Record> getPoints() {
		return points;
	}

	public void setPoints(List<Record> points) {
		this.points = points;
	}
	
	public void addPoint(String x, String y) {
		this.points.add(new Record(x, y));
	}

}
