package blog.anyelement.adapted;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Method {

    private String name;
    private List<Parameter> parameters;

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAnyElement
    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

}