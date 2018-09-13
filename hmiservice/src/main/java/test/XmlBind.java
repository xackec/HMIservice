package test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entity.Resource;
import entity.Template;
import view.Arrow;
import view.Label;
import view.Panel;
import view.Polyline;
import view.Root;

public class XmlBind {

	public static void main(String[] args) throws Exception{
		
		
		File file = new File("lpumg.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Template.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Template customer = (Template) jaxbUnmarshaller.unmarshal(file);
		
		
		JAXBContext jc = JAXBContext.newInstance(entity.Template.class);

        Template temp = new Template();
        temp.addResource(new Resource("testid1", "testparent1"));
        temp.addResource(new Resource("testid2", "testparent2"));
        temp.getView().addRoot(new Root("","#F4F8FCFF", "1850", "1000", "1", "200", "800"));
        temp.getView().addPanel(new Panel("panel1","2","1"));
        Arrow arr = new Arrow("arrow1");
        arr.setWidth("41");
        arr.setForeground("#A4B8CFFF");
        temp.getView().addArrow(arr);
		
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(temp, System.out);

	}

}
