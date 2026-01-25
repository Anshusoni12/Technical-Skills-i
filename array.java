//Given an array count no of element having atleast one element  greater than itself...

// Observation :- For every max Element there won't be any element Greater than itsef 

//Example :- [-1,6,5,3,4,-2]

// Pseudocode 
// 1.Iterate and find the max of the array.
// 2.Iterate and get the no. of elements which are not equals to max.


class array {
    public static void main(String[] args) {
        int a[] = {-1,6,5,3,4,-2};
        int max = a[0];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]> max ){
                max = a[i];   
            }
        }
        for (int i = 0;i<a.length;i++){
            if (a[i]!=max){
                count=count+1;
            }
        }
         System.out.println("print max:"+max);
         System.out.println("print count:"+ count);
                }
        
    }


    
