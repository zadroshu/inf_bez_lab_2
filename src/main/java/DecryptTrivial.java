public class DecryptTrivial {
  public void substitutionDecrypt(String decryptedString) {
    int shift = 0;
    String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    while (shift <= alphabet.length() - 1) {
      String rez = "";
      for (char c : decryptedString.toCharArray()) {
        if (c != ' ') {
          if (!alphabet.contains(String.valueOf(c))) {
            rez = rez.concat(String.valueOf(c));
          } else {
            int i = alphabet.indexOf(c);
            i = (i - shift + alphabet.length()) % alphabet.length();
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
