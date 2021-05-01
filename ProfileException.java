
/**
 * Exception that occurs within the profile information
 *
 * @author Jonathan Dufresne
 * @version 4/26/2021
 */
public class ProfileException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Default constructor
     */
    public ProfileException()
    {
        super();
    }
    /**
     * Message constructor
     */
    public ProfileException(String m) {
        super(m);
    }
}
