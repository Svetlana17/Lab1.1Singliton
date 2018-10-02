public class Singliton {
    public static Singliton singliton;

    private Singliton(){
        System.out.println("Pattern");
    }
    static Singliton getSingliton(){
        if(singliton==null){
            singliton=new Singliton();

        }
        return  singliton;
    }
}
