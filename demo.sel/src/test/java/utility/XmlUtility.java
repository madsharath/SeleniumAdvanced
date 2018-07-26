package utility;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlUtility {
	
	public void readxml() throws JAXBException {
		
		File f = new File("C:\\SelAdvDay2\\src\\test\\java\\TestData.xml");
		JAXBContext j = JAXBContext.newInstance(RegData.class);
		Unmarshaller u = j.createUnmarshaller();
		u.unmarshal(f);
		
		RegData r = (RegData)u.unmarshal(f);
		
		List<Data> mydata = r.getUserdata();
					
		for(Data d : mydata) {
			System.out.println(d.getfirstname());
			System.out.println(d.getlastname());
			
		} 		
	}
	
	public static void main(String args[]) throws JAXBException {
		XmlUtility x = new XmlUtility();
		x.readxml();
		
	}
	
}
