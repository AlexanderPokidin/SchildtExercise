package lambdaPackage.lambdaArgumentDemo;

public class LambdaArgumentDemo {
    static String changeString(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;
        System.out.println("Bxoднaя строка: " + inStr);

        StringFunc reverse = string -> {
            String result = "";
            for (int i = string.length() - 1; i >= 0; i--)
                result += string.charAt(i);
            return result;
        };

        outStr = changeString(reverse, inStr);
        System.out.println("Oбpaщeннaя строка: " + outStr);

        outStr = changeString(string -> string.replace(' ', '_'), inStr);
        System.out.println("Cтpoкa с замененными пробелами: " + outStr);

        outStr = changeString(string -> {
            String result = "";
            char ch;

            for (int i = 0;i < string.length(); i++){
                ch = string.charAt(i);
                if (Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        System.out.println("Cтpoкa с обращенным регистром букв: " + outStr);
    }
}
