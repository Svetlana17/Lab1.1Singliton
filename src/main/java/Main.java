import javax.security.auth.Subject;
import java.util.Arrays;
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
        int[] A={1,2,3};
        System.out.println(A.length);
        A=Arrays.copyOf(A,A.length+1);
        System.out.println(A.length);
        A[A.length-1]=4;
        for(int x:A){

        System.out.println(x);
    }
    Student student=new Student("Ivanov", 4,4);
       student.setSubjict(0,"Math");
       student.setMark(0,10);
       student.addMarkandSubject(0,"Geo");
        System.out.println(student.toString());

       SchoolBoy schoolBoy=new SchoolBoy("Petrov", 5, 5);
      schoolBoy.setSubjict(0, "Math");
        System.out.println(schoolBoy.getSubjict(0));
        schoolBoy.setSubjict(0, "Rus");
        System.out.println(schoolBoy.getSubjict(0));

//        schoolBoy.setMark(0,5);
//        schoolBoy.addMarkandSubject(0, "Math");
        System.out.println(schoolBoy.toString());
    }


}
