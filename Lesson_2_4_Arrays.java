public class Lesson_2_4_Arrays
{
    public static void main(String[] args)
    {
        int[] testArray1 = {1,2,3,4};
        int testArray2[] = new int[]{0,1,2,3,4};
        System.out.println(testArray2[2]);
        int[] nums = {1, 2, 3, 4, 7};
        int length = nums.length;
        System.out.println(length);
        System.out.println(nums[nums.length - 1]);

        int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
        System.out.println(nums2[0][1]);

        int[] array ={ 1, 2, 3, 4, 5 };
        for (int i : array){

            System.out.println(i);
        }
    }
}
