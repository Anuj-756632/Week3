package stackandqueueprograms.stockspanproblem;
import java.util.Stack;
public class StocksSpan {
    public int[] calculateSpan(int[]prices){
        int n=prices.length;
        int []span=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
    public void printSpan(int[] span){
        for(int i:span){
            System.out.println(i+" ");
        }
        System.out.println();
    }

}
