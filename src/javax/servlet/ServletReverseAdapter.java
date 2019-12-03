package javax.servlet;

import java.io.IOException;

public class ServletReverseAdapter implements jakarta.servlet.Servlet
{
    private final Servlet _servlet;

    public ServletReverseAdapter(Servlet servlet)
    {
        _servlet = servlet;
    }

    public void init(ServletConfig config) throws ServletException
    {
        _servlet.init(config);
    }

    @Override
    public jakarta.servlet.ServletConfig getServletConfig()
    {
        return _servlet.getServletConfig();
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        _servlet.service(req, res);
    }

    @Override
    public String getServletInfo()
    {
        return _servlet.getServletInfo();
    }

    @Override
    public void destroy()
    {
        _servlet.destroy();
    }

    @Override
    public void init(jakarta.servlet.ServletConfig servletConfig) throws jakarta.servlet.ServletException
    {
        try
        {
            _servlet.init(new ServletConfigAdapter(servletConfig));
        }
        catch (ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    @Override
    public void service(jakarta.servlet.ServletRequest servletRequest, jakarta.servlet.ServletResponse servletResponse) throws jakarta.servlet.ServletException, IOException
    {
        try
        {
            _servlet.service(Adapters.adapt(servletRequest), Adapters.adapt(servletResponse));
        }
        catch (ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }
}
