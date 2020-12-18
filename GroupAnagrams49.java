package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams49 {

    public void GroupAnagrams49() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lList = new ArrayList();
        List<String> lArr = new ArrayList(Arrays.asList(strs));
        for (int i = 0; i < lArr.size(); i++) {
            String sTemp = lArr.get(i);
            List<String> lWords = new ArrayList();
            for (int j = 0; j < lArr.size(); j++) {
                if (verifyAnagram(sTemp, lArr.get(j))) {
                    System.out.println(sTemp + " " + lArr.get(j));
                    lWords.add(lArr.get(j));
                    lArr.remove(j);
                    j = j - 1;
                    i = -1;
                }
            }
            lList.add(lWords);
        }
        for (List<String> list : lList) {
            System.out.println(list);
        }
    }

    public boolean verifyAnagram(String sValue, String sValue2) {
        if (sValue.length() != sValue2.length()) {
            return false;
        }
        char cArr[] = sValue.toCharArray();
        char cArr2[] = sValue2.toCharArray();
        Arrays.sort(cArr);
        Arrays.sort(cArr2);
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] != cArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
