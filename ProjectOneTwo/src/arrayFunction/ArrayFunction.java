package arrayFunction;

import arrayInterface.ArrayInterface;

public class ArrayFunction implements ArrayInterface {
    @Override
    public int binarySearch(int number, int[] array) {
        int left = 0;
        int right = array.length -1;

        //判断left <= right 不满足则 返回-1
        while(left <= right){
            //找数组中间下标  mid = (left + right)/2 = 6
            int mid = (left + right)/2;
            //判断如果array[] == number 则返回下标 mid
            if(number == array[mid]){
                return mid;
            }
            //否则判断 number 是否大于 array[mid]
            //number > array[mid] ;则 left = mid +1;
            //number < array[mid] ;则 right = mid -1;
            if(number > array[mid]){
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        return -1;

    }
}
