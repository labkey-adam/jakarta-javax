package javax.servlet;

import java.io.IOException;

public interface Filter extends jakarta.servlet.Filter
{
    @Override
    default void init(jakarta.servlet.FilterConfig filterConfig) throws jakarta.servlet.ServletException
    {
        try
        {
            init(new FilterConfigAdapter(filterConfig));
        }
        catch (ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    default void init(FilterConfig filterConfig) throws javax.servlet.ServletException
    {
    }

    default void doFilter(jakarta.servlet.ServletRequest request, jakarta.servlet.ServletResponse response,
                          jakarta.servlet.FilterChain chain)
            throws IOException, jakarta.servlet.ServletException
    {
        try
        {
            doFilter(Adapters.adapt(request), Adapters.adapt(response), new FilterChainAdapter(chain));
        }
        catch (ServletException e)
        {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    default void doFilter(ServletRequest request, ServletResponse response,
                          FilterChain chain)
            throws IOException, ServletException
    {
    }
}
