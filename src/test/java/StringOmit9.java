import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class StringOmit9
{
    public List<Integer> stringOmit9(List<Integer> arr)
    {
        arr.removeIf(n->n%10==9);
        System.out.println(arr);
        return arr;

    }
    @Test
    public void testCase1()
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(-11);
        arr.add(19);
        arr.add(20);
        List<Integer> value = stringOmit9(arr);
        Assert.assertEquals(value,"[1, 20]");
    }
    @Test
    public void test()
    {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        List<Integer> value = stringOmit9(arr);
         Assert.assertEquals(value,"[1, 20]");

    }


}
