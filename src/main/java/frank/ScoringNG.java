package frank;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Jack", "Hank", "Karen", "Elva", "Benny"} ;
        int[] English = {80,55,34,91,65};
        int[] Math = {71,99,84,62,11};
        for  (int i = 0; i < 5;i++){
        System.out.println(names[i]+" "+English[i]+" "+Math[i]+" "+(English[i]+Math[i])/2);
        }
    }
}
