package test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entity.Resource;
import entity.Template;
import view.Root;

public class XmlBind {

	public static void main(String[] args) throws Exception{
		JAXBContext jc = JAXBContext.newInstance(entity.Template.class);

        Template temp = new Template();
        temp.addResource(new Resource("testid1", "testparent1"));
        temp.addResource(new Resource("testid2", "testparent2"));
        temp.addView(new Root(""));

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(temp, System.out);

	}

}
