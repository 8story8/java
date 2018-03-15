package school;

public class PersonNotFoundException extends Exception
{
	private static final long serialVersionUID = 2058608171294523577L;

	public PersonNotFoundException() 
	{
		super();
	}

	public PersonNotFoundException(String message) 
	{
		super(message);
	}
}