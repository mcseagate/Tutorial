public class LearningJava {
    public static void main(String[]args){
        int x = 11;
        int p = 50;
        int r = 70;
        int t = 12;
        int s = 18;
        int answer = multiplyNumbs(x);
        int answer2 = addNums(p, r);
        boolean answer3 = equalNum(t,s);
        System.out.println("The result is:" + answer);
        System.out.println("The result is:" + answer2);
        System.out.println("int t and int s are equal:" + answer3);
    }

    public static int multiplyNumbs(int a){
        int ans = a * 7;
        return ans;
    }

    public static int addNums (int p, int r){
        int ans = p + r;
        return ans;
    }

    public static boolean equalNum(int t, int s){
       if (t == s) return true;
       else return false;

       }

}
