package stackandqueueprograms.stockspanproblem;

public class UseStocksSpan {

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        StocksSpan stock=new StocksSpan();

        System.out.println("Stock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        int[] span = stock.calculateSpan(prices);

        System.out.println("Stock Span: ");
        stock.printSpan(span);
    }
}
