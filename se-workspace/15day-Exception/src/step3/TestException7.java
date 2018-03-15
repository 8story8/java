package step3;

import java.util.Scanner;

public class TestException7 
{
	public static void main(String[] args) 
	{
		System.out.println("나이를 입력하세요(숫자로!)");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		try
		{
			int age = Integer.parseInt(str);
			age = age + 1;
			System.out.println("당신의 나이는 곧 " + age + "살입니다.");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("숫자로 넣으라고 했잖아 짜~~~");
		}
		finally
		{
			sc.close();
		}
	}
}
