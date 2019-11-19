public class Exchange {
    public int[] exchangeAB(int[] AB) {
        int tmp;
        tmp=AB[0];
        AB[0]=AB[1];
        AB[1]=tmp;
        return AB;

    }
}