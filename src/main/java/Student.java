import java.util.Arrays;

public class Student implements  Pupil {

    private String family;



  private   int mark[];
   private String subjict[];

    public Student(String family, int mark, int subjict) {
       this.family = family;
        this.mark = new int[mark];
        this.subjict = new String[subjict];

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    public int getMark(int i) {
        return mark[i];
    }

    public void setMark(int i, int value ) {
        this.mark[i] = value;
    }

    public String getSubjict(int i) {
        return subjict[i];
    }

    public void setSubjict(int i, String value) {
        this.subjict[i] = value;
    }
    public void addMarkandSubject(int mark1, String subjeict1){
        subjict = Arrays.copyOf(subjict, subjict.length + 1);
        subjict[subjict.length-1]=subjeict1;
        mark=Arrays.copyOf(mark, mark.length+1);
        mark[mark.length-1]=mark1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "family='" + family + '\'' +
                ", mark=" + Arrays.toString(mark) +
                ", subjict=" + Arrays.toString(subjict) +
                '}';
    }
}
