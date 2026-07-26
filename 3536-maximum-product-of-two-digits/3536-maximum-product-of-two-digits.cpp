class Solution {
public:
    int maxProduct(int n) {
        int i, j, k , pro , temp , max = -1 ;
        int arr[100000];
        for (i = 0;; i++) {
            if (n / 10 == 0) {
                arr[i] = n;
                break;
            } else {
                temp = n / 10 ;
                arr[i] = n % 10 ;
                n = temp ;
            }
        }
        for(j = 0 ; j < i+1 ; j++){
            for(k = j+1 ; k < i+1 ; k++){
                pro = arr[j] * arr[k] ;
                if(pro > max) max = pro ;
                pro = 1 ;
            }
        }
        return max ;
    }
};