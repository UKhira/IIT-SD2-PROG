public class Module {
    
    String code;
    double testMark;
    double cwMark;

    public Module(String code, double testMark, double CWMark){
        this.code = code;
        this.testMark = testMark;
        this.cwMark = CWMark;
    }

    private double getFinalMark(){
        double finalMark = this.testMark/2 + this.cwMark/2;
        return finalMark;
    }

    public void status(){
        if((getFinalMark()) < 40){
            System.out.println("Module Fail");
        }
        else{
            System.out.println("Module Passed");
        }
    }
    public String getCode(){
        return this.code;
    }
}
