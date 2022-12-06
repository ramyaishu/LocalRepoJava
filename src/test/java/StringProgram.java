import org.testng.Assert;
import org.testng.annotations.Test;

public class StringProgram
{
    public int stringClumps(String[] arr)
    {
        int count  =0 ;
        boolean isClumps = false;
        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i].equals(arr[i+1]))
            {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    @Test
    public void testCase1()
    {

        String[] letter = {"aa","aa","bb"};
        int value = stringClumps(letter);
        Assert.assertEquals(value,1);

    }

}
