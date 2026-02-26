// Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
// Machine 1 (sender) has the function:
// string encode(vector<string> strs) {
//     // ... your code
//     return encoded_string;
// }
// Machine 2 (receiver) has the function:
// vector<string> decode(string s) {
//     //... your code
//     return strs;
// }

import java.util.ArrayList;
import java.util.List;

public class encodeDecode {
  public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }   
}
