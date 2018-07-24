package entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import view.View;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template")
@XmlRootElement

public class Template {
	
	@XmlElementWrapper(name = "resources")
	@XmlElement(name = "resource")
	List<Resource> resources = new ArrayList<Resource>();
	
	@XmlElementWrapper(name = "view")
	@XmlElement
	List<View> views = new ArrayList<View>();


	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	
	public void addResource(Resource resource) {
		resources.add(resource);
	}
	
	public void addView(View view) {
		views.add(view);
	}

}
