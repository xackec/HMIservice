package entity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import view.Arrow;
import view.Circle;
import view.Label;
import view.Panel;
import view.Polyline;
import view.Root;
import view.Subwidget;
import view.Vectordrawing;

/**
 * View template mapping
 * @author bogomazov.kv
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class View {
	
	@XmlElement(name = "root")
	List<Root> views = new ArrayList<Root>();
	
	@XmlElement(name = "panel")
	List<Panel> panels = new ArrayList<Panel>();
	
	@XmlElement(name = "polyline")
	List<Polyline> lines = new ArrayList<Polyline>();

	@XmlElement(name = "label")
	List<Label> labels = new ArrayList<Label>();
	
	@XmlElement(name = "arrow")
	List<Arrow> arrows = new ArrayList<Arrow>();
	
	@XmlElement(name = "subwidget")
	List<Subwidget> subwidgets = new ArrayList<Subwidget>();
	
	@XmlElement(name = "vectorDrawing")
	List<Vectordrawing> vectordrawings = new ArrayList<Vectordrawing>();
	
	@XmlElement(name = "Circle")
	List<Circle> circles = new ArrayList<Circle>();
	
	public void addRoot(Root root) {
		this.views.add(root);
	}
	
	public void addPanel(Panel panel) {
		this.panels.add(panel);
	}
	
	public void addPolyline(Polyline line) {
		this.lines.add(line);
	}
	
	public void addLabel(Label label) {
		this.labels.add(label);
	}
	
	public void addArrow(Arrow arrow) {
		this.arrows.add(arrow);
	}
	
	public void addSubwidget(Subwidget subwidget) {
		this.subwidgets.add(subwidget);
	}
	
	public void addVectordrawing(Vectordrawing vdrawing) {
		this.vectordrawings.add(vdrawing);
	} 
	
	public void addCircle(Circle circle) {
		this.circles.add(circle);
	}

}
