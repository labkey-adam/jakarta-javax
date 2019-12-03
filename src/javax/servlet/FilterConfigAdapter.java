package javax.servlet;

import java.util.Enumeration;

public class FilterConfigAdapter implements FilterConfig
{
    private final jakarta.servlet.FilterConfig _filterConfig;

    public FilterConfigAdapter(jakarta.servlet.FilterConfig filterConfig)
    {
        _filterConfig = filterConfig;
    }

    @Override
    public String getFilterName()
    {
        return _filterConfig.getFilterName();
    }

    @Override
    public ServletContext getServletContext()
    {
        return new ServletContextAdapter(_filterConfig.getServletContext());
    }

    @Override
    public String getInitParameter(String s)
    {
        return _filterConfig.getInitParameter(s);
    }

    @Override
    public Enumeration<String> getInitParameterNames()
    {
        return _filterConfig.getInitParameterNames();
    }
}
