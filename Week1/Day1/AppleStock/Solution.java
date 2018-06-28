// import org.junit.Test;
// import org.junit.runner.JUnitCore;
// import org.junit.runner.Result;
// import org.junit.runner.notification.Failure;

// import static org.junit.Assert.*;

public class Solution {

    public static int getMaxProfit(int[] stockPrices) {

        // calculate the max profit
        int max_profit=stockPrices[1]-stockPrices[0];
        for(int i=0;i<stockPrices.length;i++){
            int j=i+1;
            //max_profit = stockPrices[j]-stockPrices[i];
            //System.out.println(stockPrices.length);
            while (j<stockPrices.length) {
                if (stockPrices[j]-stockPrices[i]>max_profit) {
                    max_profit=stockPrices[j]-stockPrices[i];
                    System.out.println(max_profit+":"+i+":"+j);
                }
                j++;
            }
            /*if(j<stockPrices.length){
            if(stockPrices[j]-stockPrices[i]>max_profit){
                max_profit=stockPrices[j]-stockPrices[i];
                 System.out.println(max_profit+":"+i+":"+j);
            }
            //profit = stockPrices[++i]-stockPrices[i];
            System.out.println(j+"j");
            j++;
            System.out.println(max_profit+":"+i+"-"+j);
            }
            System.out.println(max_profit+":"+i+"*"+j);*/
        }
        System.out.println(max_profit);
        return max_profit;
    }

    public static void main(String[] args) {
        //getMaxProfit(new int[] {1, 5, 3, 2});
        //getMaxProfit(new int[] {7, 2, 8, 9});
        //getMaxProfit(new int[] {1, 6, 7, 9});
        getMaxProfit(new int[] {9, 7, 4, 1});
       // getMaxProfit(new int[] {1, 1, 1, 1});
        //getMaxProfit(new int[] {5});

    }



/*

   // tests

    @Test
    public void priceGoesUpThenDownTest() {
        final int actual = getMaxProfit(new int[] {1, 5, 3, 2});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownThenUpTest() {
        final int actual = getMaxProfit(new int[] {7, 2, 8, 9});
        final int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesUpAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 6, 7, 9});
        final int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void priceGoesDownAllDayTest() {
        final int actual = getMaxProfit(new int[] {9, 7, 4, 1});
        final int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    public void priceStaysTheSameAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 1, 1, 1});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void exceptionWithOnePriceTest() {
        getMaxProfit(new int[] {5});
    }

    @Test(expected = Exception.class)
    public void exceptionWithEmptyPricesTest() {
        getMaxProfit(new int[] {});
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }*/
}