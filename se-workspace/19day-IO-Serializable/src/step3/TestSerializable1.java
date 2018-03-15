package step3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
heap memory ������ ����� ��ü�� ����ȭ�Ͽ� �ܺ� ���Ͽ� ����

Node Stream : FileOutputStream
Processing Stream : ObjectOutputStream�� writeObject()

java.io.NotSerializableException: step3.Person
���� ���� Exception�� ����ȭ�Ǿ� ��µ� Person Class��
java.io.Serializable �������̽��� implements ���� �ʾ�,
����ȭ�Ǿ� �ܺη� ���۵� �� ������ �˸��� ����
��, ����ȭ�Ǿ� �ܺη� ���۵Ǳ� ���ؼ��� �ݵ��,
java.io.Serializable �������̽��� implements�ؾ� �Ѵ�.
*/

public class TestSerializable1
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("C:\\java-kosta\\test\\serial\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person("������", "�Ǳ�", "saiden");
			oos.writeObject(p);
			System.out.println("��ü ����ȭ�Ͽ� ���Ͽ� ���");
			oos.close();
		} 
		catch (FileNotFoundException fe) 
		{
			fe.printStackTrace();
		} 
		catch (IOException ie) 
		{
			ie.printStackTrace();
		}
	}
}