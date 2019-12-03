package javax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public class FilterChainAdapter implements javax.servlet.FilterChain
{
    private final jakarta.servlet.FilterChain _filterChain;

    public FilterChainAdapter(jakarta.servlet.FilterChain filterChain)
    {
        _filterChain = filterChain;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException, ServletException
    {
        _filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void doFilter(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws IOException, ServletException
    {
        _filterChain.doFilter(Adapters.adapt(servletRequest), Adapters.adapt(servletResponse));
    }
}
