public class BasicPart02 {
    public static void main(String[] args) {
//        System.out.println("..");
        int n = 10;
        int d = 0;
//In java bitwise or logical and (&) check both sides
// but short-circuit and (&&) check left side, if it is false then the result will be false.
        if(d!=0 & (n%d)==0){
            System.out.println(d + " is a factor " + n);}

    } //This result shows "division by zero" for d = 0;

}
