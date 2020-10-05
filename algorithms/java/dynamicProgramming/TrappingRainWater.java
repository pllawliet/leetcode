import java.util.*;

class TrappingRainWater {
    public int trap(int[] height) {
        int res = 0; 
        int n = height.length;
        if(n==0)
            return 0;
        int left[] = new int[n]; left[0]=height[0];
        int right[] = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        for(int i = 1; i < n - 1; i++) 
        { 

            res += Math.min(left[i], right[i]) - height[i]; 
        } 
        return res;
    }
}
