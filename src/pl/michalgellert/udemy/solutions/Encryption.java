package pl.michalgellert.udemy.solutions;

public class Encryption {

    public static String encode(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = transformChar(chars[i], 4);
            } else if (i % 3 == 0) {
                chars[i] = transformChar(chars[i], 9);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        String result = mixString(sb.toString());
        return result + result;
    }

    public static String decode(String str) {
        str = str.substring(0, str.length()/2);
        str = fixString(str);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = fixChar(chars[i], -4);
            } else if (i % 3 == 0) {
                chars[i] = fixChar(chars[i], -9);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static char transformChar(char c, int value) {
        for (int i = 0; i <value ; i++) {
            c++;
        }
        return c;
    }

    private static char fixChar(char c, int value) {
        for (int i = 0; i >value ; i--) {
            c--;
        }
        return c;
    }

    private static String mixString(String s) {
        int counter = s.length();
        counter--;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(c);
            sb.append(transformChar(s.charAt(counter), 2));
            counter--;
        }
        return sb.toString();
    }

    private static String fixString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(i%2==0)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
