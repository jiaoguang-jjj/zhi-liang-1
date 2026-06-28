/* 正面示例：符合阿里巴巴Java开发手册规范 */
public class Calculator {
    
    private static final int DEFAULT_VALUE = 0;
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = add(a, b);
        System.out.println("Result: " + result);
    }
    
    private static int add(int a, int b) {
        return a + b;
    }
}
