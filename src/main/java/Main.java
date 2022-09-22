public class Main {
  public static void main(String[] args) {
    DecryptTrivial decryptTrivial = new DecryptTrivial();
    String decryptedString = "блюншж явфвн, бйёпнёж яиэбёйёнляёф! оплизкриоь о еэбэфвж," + "злабэ кэ яштлбв квжнлккэь овпщ блидкэ яшбэяэпщ кв плищзл зиэоо" + "(зиэооёсёзэуёь) ё кв мнлопл фёоил (нванвооёь). кэ яштлбв крдкл ялеянэцэпщ x," + "y, width, height ё зиэоо люкэнрдвкклал кэ зэнпёкзв лючвзпэ (ёиё зллнбёкэпш" + "плфвз злкпрнля ъплал лючвзпэ, э-иь овайвкпэуёь).";

    decryptTrivial.substitutionDecrypt(decryptedString);
//    Сдвиг = 30
  }
}