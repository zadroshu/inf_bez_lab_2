public class Main {
  public static void main(String[] args) {
    DecryptTrivial decryptTrivial = new DecryptTrivial();
    String decryptedString = "������ �����, ����� ����������! ���������� � �������," + "����� �� ������ ��������� ���� ������ �������� �� ������ �����" + "(����������) � �� ������ ����� (��������). �� ������ ����� ���������� x," + "y, width, height � ����� ������������� �� ������� ������� (�� ���������" + "����� �������� ����� �������, �-�� ����������).";

    decryptTrivial.substitutionDecrypt(decryptedString);
//    ����� = 30
  }
}