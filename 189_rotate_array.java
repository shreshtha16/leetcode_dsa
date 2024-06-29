class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;  //if the length of k > n
        
        int i = n-k;
        int j = n-1;
        
        while(i<=j){
            swap(arr, i, j);            //Swappong using two pointers approach
            i++;
            j--;
        }
        
        int p = 0;
        int q = n-1-k;
        
        while(p<=q){
            swap(arr, p, q);
            p++;
            q--;
        }
        
        int l = 0;
        int m = n-1;
        
        while(l<=m){
            swap(arr, l, m);
            l++;
            m--;
        }
    }

    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}