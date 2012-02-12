package blog.anyelement.adapted;

import java.io.File;
import javax.xml.bind.*;

public class Demo {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Method.class, Parameter.class,
                Address.class);
        ParameterAdapter adapter = new ParameterAdapter(jc);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setAdapter(adapter);
        File xml = new File("src/main/resources/input.xml");
        Method action = (Method) unmarshaller.unmarshal(xml);

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setAdapter(adapter);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(action, System.out);
    }

}