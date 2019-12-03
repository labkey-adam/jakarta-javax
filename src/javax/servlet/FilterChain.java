package javax.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;

public interface FilterChain extends jakarta.servlet.FilterChain
{
    @Override
    default void doFilter(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException, ServletException
    {
        doFilter(new ServletRequestAdapter(servletRequest), new ServletResponseAdapter(servletResponse));
    }

    default void doFilter(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws IOException, ServletException
    {
    }
}
