import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main result = new Main();
        System.out.print("Введите строку с двумя целыми операндами от 1 до 10 включительно и один оператор (+, -, /, *: ");
        String str = input.nextLine();
        String answer = result.calc(str);
        System.out.println("Output:\n" + answer);
        input.close();
    }
    public static String calc(String input) {
        String myStr1 = "";
        String myStr2 = "";
        String outstr = "формат математической операции не удовлетворяет заданию - два целых операнда от 1 до 10 включительно и один оператор (+, -, /, *";
        int j;
        int k = 1;
        double ans;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                myStr1 = myStr1 + Character.toString(charArray[i]);
            } else {
                break;
            }
            k = k + 1;
        }
        for (j = k; j < charArray.length; j++) {
            if (Character.isDigit(charArray[j])) {
                myStr2 = myStr2 + Character.toString(charArray[j]);
            }
        }
        if ("".equalsIgnoreCase(myStr1)) {
            System.out.println(outstr);
            System.exit(0);
        }
        if ("".equalsIgnoreCase(myStr2)) {
            System.out.println(outstr);
            System.exit(0);
        }
        if (Double.parseDouble(myStr1) > 10 || Double.parseDouble(myStr1) < 1) {
            System.out.println(outstr);
            System.exit(0);
        }
        if (Double.parseDouble(myStr2) > 10 || Double.parseDouble(myStr2) < 1) {
            System.out.println(outstr);
            System.exit(0);
        }
        switch (charArray[k - 1]) {
            case '+':
                ans = (int) (Double.parseDouble(myStr1) + Double.parseDouble(myStr2));
                break;
            case '-':
                ans = (int) (Double.parseDouble(myStr1) - Double.parseDouble(myStr2));
                break;
            case '*':
                ans = (int) (Double.parseDouble(myStr1) * Double.parseDouble(myStr2));
                break;
            case '/':
                ans = (int) (Double.parseDouble(myStr1) / Double.parseDouble(myStr2));
                break;
            default:
                return ("строка не является математической операцией");

        }
        return (Double.parseDouble(myStr1) + " " + charArray[k - 1] + " " + Double.parseDouble(myStr2) + " = " + ans);
    }
}
