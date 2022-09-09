public class StepsTo0 {

    // TODO - needs to be impl.
    public int numberOfSteps(int num)
    {
        int steps = 0;
        if (num == 0)
        {
            return 0;
        }
        while (num > 0 )
        {
            if (num % 2 == 0)
            {
                num /= 2;
            }
            else num -= 1;
            steps++;
        }
        return steps;
    }

    public int numberOfStepsRecursive(int num)
    {
        if (num == 0)
            return 0;
        else if (num % 2 == 0)
            return 1 + numberOfStepsRecursive((num / 2));
        else
            return 1 + numberOfStepsRecursive(--num);
    }

}

