public class Calculate {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int milt(int a, int b){
        return a*b;
    }

    final int INFINITY =  Integer.MAX_VALUE;
    public returnStruct div(int a, int b){
        if(b == 0) return new returnStruct(false, INFINITY);
        else {
            double res = a;
            res /= b;
            return new returnStruct(true, res);
        }
    }


    public class returnStruct{
        boolean exists;
        double data;
        returnStruct(boolean e, double d){
            exists = e;
            data = d;
        }
    }
}


