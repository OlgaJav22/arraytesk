import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "a", "a", "b", "b", "f", "a", "f", "b"};
        System.out.println(deleteDuplicats(str));
    }

    public static String deleteDuplicats(String[] str) {
        for(int i = 0; i < str.length; i++) {
            for(int j = i+1; j < str.length; j++){
                if (str[i] != null && str[i].equals(str[j])) {
                    str[j] = null;

                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str1 : str) {
            if (str1 != null) {
                stringBuilder.append(str1);
            }
        }
        return stringBuilder.toString();
    }

}


