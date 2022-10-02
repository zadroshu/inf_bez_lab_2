import java.util.*;

public class DecryptAdvansed {
  public static String advansedDecrypt(String decryptedText, String givenFreq, String alphabet) {
    List<Character> letters = new ArrayList<>();
    List<Double> frequency = new ArrayList<>();
    String cypher_text_format = decryptedText.replaceAll("[^à-ÿ]", "");
    int numHits;
    int z = 0;
    double tmp = 0f;

    for (char c : alphabet.toCharArray()) {
      numHits = 0;
      for (char x : decryptedText.toCharArray()) {
        if (x == c) {
          numHits++;
        }
      }
      letters.add(c);
      tmp = numHits / (double) cypher_text_format.length();
      if (frequency.contains(tmp)) {
        frequency.add(tmp + (double) 0.00000001);
      } else frequency.add(tmp);

      System.out.println(letters.get(z) + ": " + frequency.get(z));
      z++;
    }

    char[] char_freq_arr = givenFreq.toCharArray();
    HashMap<Character, Character> substitute = new HashMap<>();
    double k;
    Character tmp2;
    for (int j = 0; j < alphabet.length(); j++) {
      k = Collections.max(frequency);
      tmp2 = letters.get(frequency.indexOf(k));
      substitute.put(tmp2, char_freq_arr[j]);
      frequency.remove(k);
      letters.remove(tmp2);
    }

    System.out.println(Arrays.toString(substitute.entrySet().toArray()));

    char[] arr = decryptedText.toCharArray();
    for (int i = 0; i < decryptedText.length(); i++) {
      if (Character.isLetter(arr[i])) {
        arr[i] = substitute.get(arr[i]);
      }
    }
    System.out.println(String.valueOf(arr));

    return String.valueOf(arr);
  }
}
