package entity;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessType;

/**
 * Resource template mapping
 * @author bogomazov.kv
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resource")
public class Resource {

	@XmlAttribute
	public String id;
	
	@XmlAttribute
	public String parent;
	
	public Resource() {
		
	}
	
	public Resource(String id, String parent) {
		this.id = id;
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	
}
