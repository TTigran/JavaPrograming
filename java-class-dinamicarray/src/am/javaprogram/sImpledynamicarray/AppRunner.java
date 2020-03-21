package am.javaprogram.sImpledynamicarray;

public class AppRunner {
    public static void main(String[] args) {
        DynamicList dynamicList =new DynamicList();
        dynamicList.add(0);
        dynamicList.add(1);
        dynamicList.add(3);
        dynamicList.add(4);
        dynamicList.add(5);
        dynamicList.add(6);
        dynamicList.addById(2,2);
        System.out.println(dynamicList.indexOf(6));

    }
}
