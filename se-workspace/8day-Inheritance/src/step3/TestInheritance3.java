package step3;

import step3.vo.Bank;;

class KostaBank
{
	public void accessTest()
	{
		Bank b = new Bank();
		// �ٸ� ��Ű������ ������ �� �ִ� ���� public�ܿ��� ����.
		// KostaBank2���� �ٽ� Ȯ��
		b.publicTest();
	}
}

class KostaBank2 extends Bank
{
	public void accessTest()
	{
		// KostaBank�ʹ� �ٸ��� Bank�� ��� ���迡 �ִ�.
		// �� ��� protected�� ���� ����
		publicTest();
		protectedTest();
	}
}

public class TestInheritance3 {
	// Access Modifier Test Example

}