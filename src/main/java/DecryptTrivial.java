public class DecryptTrivial {
  public void substitutionDecrypt(String alphabet, String decryptedString) {
    int shift = 0;
    while (shift <= alphabet.length() - 1) {
      String rez = "";
      for (char c : decryptedString.toCharArray()) {
        if (c != ' ') {
          if (!alphabet.contains(String.valueOf(c))) {
            rez = rez.concat(String.valueOf(c));
          } else {
            int i = alphabet.indexOf(c);
            i = (i - shift) % alphabet.length();
            if (i < 0) {
              i = i + alphabet.length();
            }
            rez += alphabet.charAt(i);
          }
        } else {
          rez = rez + " ";
        }
      }
      System.out.println(shift + " " + rez);
      shift++;
    }
  }
}
