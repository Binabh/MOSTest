package np.com.binabh.common;

public class MyCommonClass {
    private int num1;
    private int num2;
    private int sum = 0;
    public MyCommonClass(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void add(){
        sum = num1+num2;
    }
    public String getSum(){ return Integer.toString(sum);}
}