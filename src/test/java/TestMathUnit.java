import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by huapeng.hhp on 2016/5/26.
 */
public class TestMathUnit {

    @Test
    public void testAdd(){
        int sum = MathUnit.add(1,2);
        Assert.assertEquals(sum,3);
    }
}
