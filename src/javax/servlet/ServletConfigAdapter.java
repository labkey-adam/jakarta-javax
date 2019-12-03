package javax.servlet;

import java.util.Enumeration;

public class ServletConfigAdapter implements javax.servlet.ServletConfig
{
    private final jakarta.servlet.ServletConfig _servletConfig;

    public ServletConfigAdapter(jakarta.servlet.ServletConfig servletConfig)
    {
        _servletConfig = servletConfig;
    }

    @Override
    public String getServletName()
    {
        return _servletConfig.getServletName();
    }

    @Override
    public ServletContext getServletContext()
    {
        return new ServletContextAdapter(_servletConfig.getServletContext());
    }

    @Override
    public String getInitParameter(String s)
    {
        return _servletConfig.getInitParameter(s);
    }

    @Override
    public Enumeration<String> getInitParameterNames()
    {
        return _servletConfig.getInitParameterNames();
    }
}
