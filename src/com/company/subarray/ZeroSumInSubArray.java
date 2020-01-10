package com.company.subarray;

public class ZeroSumInSubArray {



        public static boolean zeroSubArraySum(int[] arr){
            if(arr.length == 0) return false;
            else
                return zeroSubArraySum(arr,0,arr[0]);
        }

        public static boolean zeroSubArraySum(int[] arr, int index,int sum){

            if( arr.length -1 == index){
                return sum == 0;
            }

            if(sum == 0) return true;

            return zeroSubArraySum(arr,index+1,sum + arr[index+1]) ||
                    zeroSubArraySum(arr,index+1,arr[index+1]);

        }

        public static void main(String args[] ) throws Exception {
            int arr1[] = {};                       // Expecting false
            int arr2[] = {1};                      // Expecting false
            int arr3[] = {1,2,3,4};                // Expecting false
            int arr4[] = {1,-1};                   // Expecting true  :index {0,1}
            int arr5[] = {1,-1,1};                 // Expecting true  :index {0,1} or index {1,0}
            int arr6[] = {100,-2,2};               // Expecting true  :index {1,2}
            int arr7[] = {0};                      // Expecting true  :index {0}
            int arr8[] = {4,5,6,0,1,1,1};          // Expecting true  :index {3}
            int arr9[] = {100,9,2,1,1,1,0};        // Expecting true  :index {6}
            int arr10[]= {-4, 2, -4, 2, 8};        // Expecting true  :index {1,2,3}
            int arr11[]= {-4, 11,2,10,-19,1};      // Expecting true  :index {0,1,2,3,4}
            int arr12[]= {1,1,1,1,1,-5};           // Expecting true  :index {0,1,2,3,4,5}


            System.out.println("arr1: " + zeroSubArraySum(arr1));
            System.out.println("arr2: " + zeroSubArraySum(arr2));
            System.out.println("arr3: " + zeroSubArraySum(arr3));
            System.out.println("arr4: " + zeroSubArraySum(arr4));
            System.out.println("arr5: " + zeroSubArraySum(arr5));
            System.out.println("arr6: " + zeroSubArraySum(arr6));
            System.out.println("arr7: " + zeroSubArraySum(arr7));
            System.out.println("arr8: " + zeroSubArraySum(arr8));
            System.out.println("arr9: " + zeroSubArraySum(arr9));
            System.out.println("arr10: " + zeroSubArraySum(arr10));
            System.out.println("arr11: " + zeroSubArraySum(arr11));
            System.out.println("arr12: " + zeroSubArraySum(arr12));
        }
    }


