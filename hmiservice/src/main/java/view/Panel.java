package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "panel")
public class Panel extends Plot{
	
	public String layout;
	
	public String fill;
	
	public Panel() {
		
	}

	public Panel(String id) {
		super(id);
	}
	
	public Panel(String id, String layout, String fill) {
		super(id);
		this.layout = layout;
		this.fill = fill;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
