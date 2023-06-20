import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "";
        String myStr2 = "";
        int j;
        int k=1;
        double ans;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку с двумя операндами от 1 до 10 включительно и один оператор (+, -, /, *: ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();

        for (int i=0; i<charArray.length; i++) {
            if (Character.isDigit(charArray[i])){
                myStr1 = myStr1+Character.toString(charArray[i]);}
            else {break;}
            k = k+1;};
        for (j=k; j<charArray.length; j++) {
            if (Character.isDigit(charArray[j])) {
                myStr2 = myStr2 + Character.toString(charArray[j]);}
        }
            if ("".equalsIgnoreCase(myStr1)) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда от 1 до 10 включительно и один оператор (+, -, /, *");
            System.exit(0);
        }
        if ("".equalsIgnoreCase(myStr2)) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда от 1 до 10 включительно и один оператор (+, -, /, *");
            System.exit(0);
        }
        if (Double.parseDouble(myStr1)>10){
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда от 1 до 10 включительно и один оператор (+, -, /, *");
            System.exit(0);
        }
        if (Double.parseDouble(myStr2)>10) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда от 1 до 10 включительно и один оператор (+, -, /, *");
            System.exit(0);
        }
            switch(charArray[k-1]) {
            case '+': ans = (int)(Double.parseDouble(myStr1) + Double.parseDouble(myStr2));
                break;
            case '-': ans = (int)(Double.parseDouble(myStr1) - Double.parseDouble(myStr2));
                break;
            case '*': ans = (int)(Double.parseDouble(myStr1) * Double.parseDouble(myStr2));
                break;
            case '/': ans = (int)(Double.parseDouble(myStr1) / Double.parseDouble(myStr2));
                break;
            default:  System.out.printf("строка не является математической операцией");
                return;
        }
        System.out.printf(Double.parseDouble(myStr1) + " " + charArray[k-1] + " " + Double.parseDouble(myStr2) + " = " + ans);
        scanner.close();
    }
}