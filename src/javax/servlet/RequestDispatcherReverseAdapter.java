package javax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class RequestDispatcherReverseAdapter implements jakarta.servlet.RequestDispatcher
{
    private final javax.servlet.RequestDispatcher _requestDispatcher;

    public RequestDispatcherReverseAdapter(javax.servlet.RequestDispatcher requestDispatcher)
    {
        _requestDispatcher = requestDispatcher;
    }

    @Override
    public void forward(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        try
        {
            _requestDispatcher.forward(Adapters.adapt(servletRequest), Adapters.adapt(servletResponse));
        }
        catch (javax.servlet.ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    @Override
    public void include(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        try
        {
            _requestDispatcher.include(Adapters.adapt(servletRequest), Adapters.adapt(servletResponse));
        }
        catch (javax.servlet.ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }
}
