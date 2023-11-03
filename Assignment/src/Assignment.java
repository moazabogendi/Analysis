public class Assignment {

    public static int Naive(int n, int m) {
    	int j=1;
        for (int i=0;i<m;i++) {
            j*= n;
        }
        return j;
    }
    public static int DivideAndConquer(int n, int m) {
    	if (m==0) {
            return 1;
        } else if (m%2==0) {
        	m=m/2;
            int j = DivideAndConquer(n,m);
            j*=j;
            return j;
        } else {
        	m=m-1;
        	m=m/2;
            int j=DivideAndConquer(n,m);
            j*=j*n;
            return j;
        }
    }

 
    public static void main(String[] args) {
    	  int n = 6;
          int m = 7;
          int result = DivideAndConquer(n, m);
          System.out.println(result);
    }
}