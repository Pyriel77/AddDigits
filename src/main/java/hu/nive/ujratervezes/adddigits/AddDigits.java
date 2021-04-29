package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String str) {

        if (str == null || str.equals("")) {
            return -1;
        }

        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += (ch - '0');
            }
        }
        return sum;
    }
}
