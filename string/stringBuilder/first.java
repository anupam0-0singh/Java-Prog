package string.stringBuilder;

public class first {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        // charAt(0)
        System.out.println(sb.charAt(0));

        // setCharAt(0, 'p')
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // Insert character
        sb.insert(0, 's');
        System.out.println(sb);

        // Delete character
        sb.delete(1, 3);
        System.out.println(sb);

        // Append character
        StringBuilder ss = new StringBuilder("h");
        ss.append("e");
        ss.append("l");
        ss.append("l");
        ss.append("o");
        System.out.println(ss);

        // print length
        System.out.println(ss.length());
    }
}
