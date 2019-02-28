package cx.Graph;

/**
 * 定点类
 */
public class Vertex {
    private String value;

    public void setValue(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

    public Vertex(String value){
        super();
        this.value=value;
    }

}
