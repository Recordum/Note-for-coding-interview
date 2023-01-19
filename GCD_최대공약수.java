public class GCD_최대공약수 {
    public static int getGCD(int num1, int num2) {
        int big;
        int small;
        if(num1>=num2){
            big = num1;
            small = num2;
        }else {
            big = num2;
            small = num1;
        }

        if(big % small == 0){
            return small;
        }
        return getGCD(small, big%small);
    }
    public static void main(String[] args) {

        System.out.println(getGCD(12, 8));

    }
}
