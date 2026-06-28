/**
 * 计算器演示类 - 符合阿里巴巴Java开发手册规范
 */
public class CalculatorDemo {
    
    private static final String APP_NAME = "标准计算器";
    
    public static void main(String[] args) {
        CalculatorDemo demo = new CalculatorDemo();
        int result = demo.add(10, 20);
        System.out.println(APP_NAME + " 结果: " + result);
    }
    
    /**
     * 加法运算
     * @param a 被加数
     * @param b 加数
     * @return 两数之和
     */
    int add(int a, int b) {
        return a + b;
    }
}
