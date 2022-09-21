public class DecryptTrivial {
    public String decryptedString = "блюншж явфвн, бйёпнёж яиэбёйёнляёф! оплизкриоь о еэбэфвж," + "злабэ кэ яштлбв квжнлккэь овпщ блидкэ яшбэяэпщ кв плищзл зиэоо" + "(зиэооёсёзэуёь) ё кв мнлопл фёоил (нванвооёь). кэ яштлбв крдкл ялеянэцэпщ x," + "y, width, height ё зиэоо люкэнрдвкклал кэ зэнпёкзв лючвзпэ (ёиё зллнбёкэпш" + "плфвз злкпрнля ъплал лючвзпэ, э-иь овайвкпэуёь).";

    public void substitutionDecrypt(String decryptedString ) {
        int shift = 0;
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        while (shift <= alphabet.length() - 1) {
            String rez = "";
            for (char c: decryptedString.toCharArray()) {
                if (c != ' ') {
                    if (!alphabet.contains(String.valueOf(c))){
                        rez = rez.concat(String.valueOf(c));
                    } else {
                        int i = alphabet.indexOf(c);
                        i = (i + shift) % alphabet.length();
                        if (i < 0) {
                            i = i + alphabet.length();
                        }
                        rez = rez + alphabet.charAt(i);
                    }
                } else {
                    rez = rez + " ";
                }
            }
            System.out.println(rez);
            shift++;
        }
    }
}
