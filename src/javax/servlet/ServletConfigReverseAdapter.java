package javax.servlet;

import jakarta.servlet.ServletContext;

import java.util.Enumeration;

public class ServletConfigReverseAdapter implements jakarta.servlet.ServletConfig
{
    private final javax.servlet.ServletConfig _servletConfig;

    public ServletConfigReverseAdapter(ServletConfig servletConfig)
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
        return new ServletContextReverseAdapter(_servletConfig.getServletContext());
    }

    @Override
    public String getInitParameter(String name)
    {
        return _servletConfig.getInitParameter(name);
    }

    @Override
    public Enumeration<String> getInitParameterNames()
    {
        return _servletConfig.getInitParameterNames();
    }
}
