import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Deque<int[]> q = new ArrayDeque<>();
        q.push(new int[]{sc.nextInt(),1});
        int res=0;
        for( int i=1 ; i<n ; i++){
            int x=sc.nextInt();
            while(!q.isEmpty()){
                if(x<q.peek()[0]){
                    res++;
                    q.push(new int[]{x,1});
                    break;
                }
                else{
                    int[] tmp = q.pop();
                    res += tmp[1];
                    if(tmp[0]==x){
                        res += !q.isEmpty() ? 1 : 0;
                        q.push(new int[]{x,tmp[1]+1});
                        break;
                    }
                }
            }
            if(q.isEmpty()){
                q.push(new int[]{x,1});
            }
        }
        System.out.println(res);
    }
}
