package com.likou.array;

/**
 * 移除元素
 *
 * @author 王冲
 * @date 2021-11-10 16:47
 */
public class RemoveElements {

    public static void main(String[] args) {
        int removeElement = removeElement(new int[]{1, 2, 2, 4}, 2);
        System.out.println(removeElement);
    }

    public static int removeElement(int[] nums, int val) {
        // 快慢指针
        int fastIndex = 0;
        int slowIndex;
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;

    }
}
