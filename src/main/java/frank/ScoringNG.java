package frank;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"jack", "hank", "karen", "elva", "benny"} ;
        int[] english = {80,55,34,91,65};
        int[] math = {71,99,84,62,11};
        for  (int i = 0; i < 5;i++){
            if (i !=3)
        System.out.println(names[i]+" "+english[i]+" "+math[i]+" "+(english[i]+math[i])/2);
        }
    }
}
