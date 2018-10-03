import java.util.Arrays;

public class SchoolBoy implements  Pupil {
 private String family;
    private   Register registers[];
   public SchoolBoy( String family, int mark, int subjict){
       this.registers=new Register[mark];
       this.family=family;

   }

   class Register{

       int mark;
       String subjict;
       Register(){

       }



       public Register(int mark, String subjict) {
           this.mark = mark;
           this.subjict = subjict;
       }

       public int getMark() {
           return mark;
       }

       public void setMark(int mark) {
           this.mark = mark;
       }

       public String getSubjict() {
           return subjict;
       }

       public void setSubjict(String subjict) {
           this.subjict = subjict;
       }

       @Override
       public String toString() {
           return "Register{" +
                   "mark=" + mark +
                   ", subjict='" + subjict + '\'' +
                   '}';
       }
   };


    public Register[] getRegister() {
        return registers;
    }

    public void setRegister(Register[] register) {
        this.registers = register;
    }

    @Override
    public String getFamily() {
        return this.family;
    }

    @Override
    public void setFamily(String family) {
  this.family=family;
    }

    @Override
    public int getMark(int i) {
        return registers[i].getMark();
    }

    @Override
    public void setMark(int i, int value) {
      this.registers[i].setMark(value);
    }

    @Override
    public String getSubjict(int i) {
       return this.registers[i].subjict;
    }

    @Override
    public void setSubjict(int i, String value) {
        if(registers[i]!=null){
            this.registers[i].setSubjict(value);
        }
        else{
            Register register=new Register();
            register.setSubjict(value);
            this.registers[i]=register;
        }
    }

    @Override
    public void addMarkandSubject(int mark1, String subjeict1) {
        registers= Arrays.copyOf(registers, registers.length+1);
        Register register=new Register(mark1, subjeict1);
        registers[registers.length-1]=register;
    }

    @Override
    public String toString() {
        return "SchoolBoy{" +
                "family='" + family + '\'' +
                ", registers=" + Arrays.toString(registers) +
                '}';
    }
}
