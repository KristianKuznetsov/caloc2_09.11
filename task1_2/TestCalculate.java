import java.io.FileReader;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {

    @Test
    public void simpleTestCalculateSumm() throws Exception{
        Calculate calc = new Calculate();
        int res = calc.add(2, 3);
        Assert.assertEquals(5, res);
    }

    @Test
    public void fileTestCalculateSumm() throws Exception{
        FileReader fileReader = new FileReader("D:\\Java\\Caloc\\src\\inputSumm");
        Scanner sc = new Scanner(fileReader);
        Calculate calc = new Calculate();
        int a, b, expect, res;

        while (sc.hasNextLine()) {
            a = sc.nextInt();
            b = sc.nextInt();
            expect = sc.nextInt();
            res = calc.add(a, b);
            Assert.assertEquals(expect, res);
        }
    }

    @Test
    public void simpleTestCalculateSub() throws Exception{
        Calculate calc = new Calculate();
        int res = calc.sub(13, 3);
        Assert.assertEquals(10, res);
    }

    @Test
    public void fileTestCalculateSub() throws Exception{
        FileReader fileReader = new FileReader("D:\\Java\\Caloc\\src\\inputSub");
        Scanner sc = new Scanner(fileReader);
        Calculate calc = new Calculate();
        int a, b, expect, res;

        while (sc.hasNextLine()) {
            a = sc.nextInt();
            b = sc.nextInt();
            expect = sc.nextInt();
            res = calc.sub(a, b);
            Assert.assertEquals(expect, res);
        }
    }

    @Test
    public void simpleTestCalculateMul() throws Exception{
        Calculate calc = new Calculate();
        int res = calc.milt(13, 3);
        Assert.assertEquals(39, res);
    }

    @Test
    public void fileTestCalculateMul() throws Exception{
        FileReader fileReader = new FileReader("D:\\Java\\Caloc\\src\\inputMult");
        Scanner sc = new Scanner(fileReader);
        Calculate calc = new Calculate();
        int a, b, expect, res;

        while (sc.hasNextLine()) {
            a = sc.nextInt();
            b = sc.nextInt();
            expect = sc.nextInt();
            res = calc.milt(a, b);
            Assert.assertEquals(expect, res);
        }
    }

    @Test
    public void simpleTestCalculateDiv() throws Exception{
        Calculate calc = new Calculate();
        Calculate.returnStruct res = calc.div(1, 2);
        Assert.assertEquals(0.5, res.data, 0.1);
    }

    @Test
    public void simpleTestCalculateDivByZero() throws Exception{
        Calculate calc = new Calculate();
        Calculate.returnStruct res = calc.div(1, 0);
        Assert.assertEquals(false, res.exists);
    }

    @Test
    public void fileTestCalculatedDiv() throws Exception{
        FileReader fileReader = new FileReader("D:\\Java\\Caloc\\src\\inputDiv");
        Scanner sc = new Scanner(fileReader);
        Calculate calc = new Calculate();
        int a, b, flag;
        double expect;

        while (sc.hasNextLine()) {
            a = sc.nextInt();
            b = sc.nextInt();
            flag = sc.nextInt();
            expect = sc.nextDouble();
            Calculate.returnStruct res = calc.div(a, b);
            if(flag == 0){
                Assert.assertEquals(false, res.exists);
            }else Assert.assertEquals(expect, res.data, 0.1);
        }
    }
}
