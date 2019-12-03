package javax.servlet;

import java.io.IOException;

public class RequestDispatcherAdapter implements RequestDispatcher
{
    private final jakarta.servlet.RequestDispatcher _requestDispatcher;

    public RequestDispatcherAdapter(jakarta.servlet.RequestDispatcher requestDispatcher)
    {
        _requestDispatcher = requestDispatcher;
    }

    @Override
    public void forward(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        try
        {
            _requestDispatcher.forward(Adapters.adapt(request), Adapters.adapt(response));
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }

    @Override
    public void include(ServletRequest request, ServletResponse response) throws ServletException, IOException
    {
        try
        {
            _requestDispatcher.include(Adapters.adapt(request), Adapters.adapt(response));
        }
        catch (jakarta.servlet.ServletException e)
        {
            throw new ServletException(e);
        }
    }
}
