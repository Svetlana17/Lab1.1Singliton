import java.util.Properties;

public class Main {
    public  static  void main(String[] args){
        Singliton singliton=Singliton.getSingliton();
        System.out.println(singliton);

        Properties properties = SinglitonProperties.getProperties();
        Properties properties1 = SinglitonProperties.getProperties();
        Properties properties2 = SinglitonProperties.getProperties();
        System.out.println(properties.getProperty("Function"));
        System.out.println(properties1.getProperty("Function"));
        System.out.println(properties2.getProperty("Function"));

    }
}
