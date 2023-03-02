/**
 * Class {@link Solution}
 * Method compress() need for compress arrays of chars. It founds groups(sequences) of equal chars
 * and replace them to the name of char and number of members in the group.
 * For example: 'a','a','b','b','b', 'c' --> 'a', '2', 'b', '3', 'c'.
 * Method compress() should return length (n) of an array after compression and
 * replace first n elements of the initial array by elements of new compressed array.
 *
 * @author DmitrySheyko
 */

class Solution {

    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        StringBuilder str = new StringBuilder(String.valueOf(chars[0]));
        int index = 1;
        while (index < chars.length) {
            if (chars[index] == chars[index - 1]) {
                int count = 1;
                while (index < chars.length && chars[index] == chars[index - 1]) {
                    count++;
                    index++;
                }
                str.append(count);
            } else {
                str.append(chars[index]);
                index++;
            }
        }
            for (int j = 0; j < str.length(); j++) {
                chars[j] = str.charAt(j);
            }
            return str.length();
    }

}
