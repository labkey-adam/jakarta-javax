package javax.servlet;

public class NotYetImplementedException extends IllegalStateException
{
    public NotYetImplementedException()
    {
        super("Not yet implemented");
    }
}
