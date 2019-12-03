package javax.servlet;

import javax.servlet.http.*;

public class Adapters
{
    public static HttpServletRequest adapt(jakarta.servlet.http.HttpServletRequest request)
    {
        return new HttpServletRequestAdapter(request);
    }

    public static ServletRequest adapt(jakarta.servlet.ServletRequest request)
    {
        if (request instanceof jakarta.servlet.http.HttpServletRequest)
            return new HttpServletRequestAdapter((jakarta.servlet.http.HttpServletRequest)request);
        else
            return new ServletRequestAdapter(request);
    }

    public static HttpServletResponse adapt(jakarta.servlet.http.HttpServletResponse response)
    {
        return new HttpServletResponseAdapter(response);
    }

    public static ServletResponse adapt(jakarta.servlet.ServletResponse response)
    {
        if (response instanceof jakarta.servlet.http.HttpServletResponse)
            return new HttpServletResponseAdapter((jakarta.servlet.http.HttpServletResponse)response);
        else
            return new ServletResponseAdapter(response);
    }

    public static jakarta.servlet.ServletRequest adapt(ServletRequest request)
    {
        if (request instanceof HttpServletRequestAdapter)
            return ((HttpServletRequestAdapter) request).unwrap();

        if (request instanceof ServletRequestAdapter)
            return ((ServletRequestAdapter) request).unwrap();

        if (request instanceof HttpServletRequest)
            return new HttpServletRequestReverseAdapter((HttpServletRequest)request);

        return new ServletRequestReverseAdapter<>(request);
    }

    public static jakarta.servlet.ServletResponse adapt(ServletResponse response)
    {
        if (response instanceof HttpServletResponseAdapter)
            return ((HttpServletResponseAdapter) response).unwrap();

        if (response instanceof ServletResponseAdapter)
            return ((ServletResponseAdapter) response).unwrap();

        if (response instanceof HttpServletResponse)
            return new HttpServletResponseReverseAdapter((HttpServletResponse)response);

        return new ServletResponseReverseAdapter<>(response);
    }

    public static HttpSession adapt(jakarta.servlet.http.HttpSession session)
    {
        if (null == session)
            return null;

        return new HttpSessionAdapter(session);
    }
}
