package view;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "root")
public class Root extends Plot{

	String background;

    String width;
    
    String height;
    
    String startupBindingsConcurrency;
    
    String normalConcurrentBindings;
    
    String maximumConcurrentBindings;
    
    public Root() {
    	super();
    }
    
	public Root(String id) {
		super(id);
	}
	
	public Root(String id, String background, String width, String height, String concurrency,
			String normal, String max) {
		super(id);
		this.background = background;
		this.width = width;
		this.height = height;
		this.startupBindingsConcurrency = concurrency;
		this.normalConcurrentBindings = normal;
		this.maximumConcurrentBindings = max;
	}

	public String getBackground() {
		return background;
	}



	public void setBackground(String background) {
		this.background = background;
	}



	public String getWidth() {
		return width;
	}



	public void setWidth(String width) {
		this.width = width;
	}



	public String getHeight() {
		return height;
	}



	public void setHeight(String height) {
		this.height = height;
	}



	public String getStartupBindingsConcurrency() {
		return startupBindingsConcurrency;
	}



	public void setStartupBindingsConcurrency(String startupBindingsConcurrency) {
		this.startupBindingsConcurrency = startupBindingsConcurrency;
	}



	public String getNormalConcurrentBindings() {
		return normalConcurrentBindings;
	}



	public void setNormalConcurrentBindings(String normalConcurrentBindings) {
		this.normalConcurrentBindings = normalConcurrentBindings;
	}



	public String getMaximumConcurrentBindings() {
		return maximumConcurrentBindings;
	}



	public void setMaximumConcurrentBindings(String maximumConcurrentBindings) {
		this.maximumConcurrentBindings = maximumConcurrentBindings;
	}



	@Override
	public String toString() {
		return "{"+background+"}";
	}

}
