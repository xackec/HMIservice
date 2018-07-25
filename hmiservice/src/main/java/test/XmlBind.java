package test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import entity.Resource;
import entity.Template;
import view.Panel;
import view.Polyline;
import view.Root;

public class XmlBind {

	public static void main(String[] args) throws Exception{
		JAXBContext jc = JAXBContext.newInstance(entity.Template.class);

        Template temp = new Template();
        temp.addResource(new Resource("testid1", "testparent1"));
        temp.addResource(new Resource("testid2", "testparent2"));
        temp.getView().addRoot(new Root("","#F4F8FCFF", "1850", "1000", "1", "200", "800"));
        temp.getView().addPanel(new Panel("panel1","2","1"));
        Polyline line = new Polyline("polyline1", "861", "#FF9900FF", "10.0", "7.0", "15.0", "11", "10");
        line.addPoint("0.0", "0.0");
        line.addPoint("1.0", "1.0");
        temp.getView().addPolyline(line);
		
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(temp, System.out);

	}

}
