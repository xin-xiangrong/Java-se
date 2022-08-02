import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //改变原有数组元素的值
    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    //并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transfrom(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * arr[i];
        }
    }
    //求数组的平均值
    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static int avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    //如数组：[1,2,3,4,5,6]
    //调整后可能是：[1, 5, 3, 4, 2, 6]
    public static void oddNumbersAhead(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            while ((arr[left]%2!=1) && (left<right)){
                left++;
            }
            while ((arr[right]%2!=0) && (left<right)){
                right--;
            }
            //交换
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
    public static int myBinarySearch(int[] arr, int k){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right){
            mid = left + (right - left)/2;
            if(arr[mid] > k){
                right = mid-1;
            }else if(arr[mid] < k){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //两数之和
    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //你可以按任意顺序返回答案。
    //示例 1：
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    public static int[] twoNumSumpos(int[] nums, int target){
        int[] ret = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++){
                if(nums[i] + nums[j] == target){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }

        }
        return ret;
    }
    public static void main1(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 8;
        int[] ret = twoNumSumpos(nums, target);
        System.out.println(Arrays.toString(ret));
    }
    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    public static int findSingleNum(int[] arr){
       int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }
    public static void main2(String[] args){
        int arr[] = {1,2,3,4,5,1,2,3,4};
        int ret = findSingleNum(arr);
        System.out.println(ret);
    }
    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    public static int findNum(int[] arr){
        int ret = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ret){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                ret = arr[i+1];
            }
        }
        return ret;
    }
    public static void main3(String[] args){
        int[] arr = {1,1,2,3,4,5,5,5,5,5,5,5,5,5};
        int ret = findNum(arr);
        System.out.println(ret);
    }
    /*给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
    示例 1：
    输入：arr = [2,6,4,1]
    输出：false
    解释：不存在连续三个元素都是奇数的情况。
    示例 2：
    输入：arr = [1,2,34,3,4,5,7,23,12]
    输出：true
    解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。
     */
    public static boolean isCoiledThreeOdd(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                count++;
                if(count == 3){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,3,5,7,1,2,3};
        boolean ret = isCoiledThreeOdd(arr);
        System.out.println(ret);
    }
}
