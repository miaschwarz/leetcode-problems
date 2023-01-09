public class Prefix {
    public static void main(String[] args) {
//        String[] strs = new String[]{"dog","racecar","car"};
//        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs = new String[]{"a"};
//        String[] strs = new String[]{""};
//        String[] strs = new String[]{"flower", "flower", "flower", "flower"};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
        return prefix;
    }
}
