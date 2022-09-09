public class RunningSumArray
{
    public int[] runningSum(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public int[] runningSum2(int[] nums)
    {
        int[] arraySum = new int[nums.length];
        arraySum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            arraySum[i] = arraySum[i-1] + nums[i];
        }
        return arraySum;
    }

    public int[] runningSum3(int[] nums)
    {
        int sum;
        int[] arraySum = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            sum = nums[i];
            for (int j = i; j >= 0; j-- )
            {
                if (j > 0)
                {
                    sum += nums[j - 1];
                }
            }
            arraySum[i] = sum;
        }

        return arraySum;
    }

}
