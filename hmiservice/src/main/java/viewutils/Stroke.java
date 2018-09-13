package viewutils;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import org.eclipse.persistence.oxm.annotations.XmlPath;


@XmlAccessorType(XmlAccessType.FIELD)
public class Stroke{
	
	public String lineWidth;
	
	public String endCap;
	
	@XmlPath("dashArray/table/records/record")
    public List<ShortRecord> points = new ArrayList<ShortRecord>();
	
	public Stroke() {
	}
	
	public Stroke(String endCap) {
		this.endCap = endCap;
	}
	
	public Stroke(String endCap, String lineWidth) {
		this.endCap = endCap;
		this.lineWidth = lineWidth;
	}
	
	public void addShort(String dash) {
		points.add(new ShortRecord(dash));
	}
	
}