import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //提交
        //修改
        Map map = new HashMap();
        int a = 1;
        int i  = 100*1000*1000;
        long l = System.currentTimeMillis();
        for (int i1 = 0; i1 < i; i1++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
         }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
