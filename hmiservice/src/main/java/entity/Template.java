package entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Root element of template hierarchy
 * @author bogomazov.kv
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template")
@XmlRootElement
public class Template {
	
	@XmlElementWrapper(name = "resources")
	@XmlElement(name = "resource")
	List<Resource> resources = new ArrayList<Resource>();
	
	@XmlElement(name = "view")
	View view = new View();
	
	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	
	public void addResource(Resource resource) {
		resources.add(resource);
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
	
	

}
