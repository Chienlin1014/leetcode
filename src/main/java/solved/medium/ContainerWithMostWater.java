package solved.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int length = 0;
        int width = 0;
        int maxArea = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                length = j - i;
                width = Math.min(height[i], height[j]);
                int area = length * width;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    public int maxArea2(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int width = j - i;
            int length = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, width * length);
            if (j > i) {
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }

}
