public class Assignment2 {
    public static void mergeSort(int[] n) {
        if (n.length > 1) {
            int mid=n.length / 2;
            int[]left=new int[mid];
            int[] right=new int[n.length - mid];

            for (int i=0;i<mid;i++) {
                left[i]=n[i];
            }

            for (int i=mid;i<n.length;i++) {
                right[i-mid]=n[i];
            }

            mergeSort(left);
            mergeSort(right);

            int i=0;
            int j=0;
            int k=0;

            while (i<left.length&&j<right.length) {
                if (left[i]<right[j]) {
                    n[k++]=left[i++];
                }else {
                    n[k++]=right[j++];
                }
            }

            while(i<left.length) {
                n[k++]=left[i++];
            }

            while (j<right.length) {
                n[k++]=right[j++];
            }
        }
    }

    public static void findPairs(int[] n, int Sum) {
        for (int i=0;i<n.length;i++) {
            int k= Sum-n[i];
            if(binarySearch(n,k)) {
                System.out.println(n[i]+"+"+k+"="+Sum);
            }
        }
    }

    public static boolean binarySearch(int[] n, int x) {
        int left=0;
        int right=n.length - 1;

        while(left<=right) {
            int mid=left+(right-left)/2;

            if (n[mid]==x) {
                return true;
            }else if(n[mid]<x) {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] n = {7,4,2,9,2,0};
        int Sum = 7;

        mergeSort(n);
        findPairs(n,Sum);
    }
}
