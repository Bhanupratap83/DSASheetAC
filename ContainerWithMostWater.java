public class ContainerWithMostWater{
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0; 
        int right = height.length - 1;

        while(left < right){
            int area = 0;
            int breadth = Math.abs(right - left);
            int length = Math.min(height[left], height[right]);

            area = breadth*length;
            max = Math.max(area, max);

            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}