package step5;

public class TestService 
{
	public static void main(String[] args) 
	{
		StringService service = new StringService();
		service.addFile("���� �̸���.mp4");
		service.addFile("����Ʈ.mp4");
		service.addFile("ù��ó�� �ʿ��� ���ڴ�.mp3");
		service.addFile("��󷣵�.mp4");
		service.addFile("�ູ�� ô.mp3");
	
		String ext = "mp3";
		service.printName(ext);
		
		System.out.println("********************");
		
		ext = "mp4";
		service.printName(ext);
	}
}