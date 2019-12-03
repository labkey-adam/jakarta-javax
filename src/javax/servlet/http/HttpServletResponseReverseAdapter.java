package javax.servlet.http;

import javax.servlet.ServletResponseReverseAdapter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

public class HttpServletResponseReverseAdapter extends ServletResponseReverseAdapter<HttpServletResponse> implements jakarta.servlet.http.HttpServletResponse
{
    public HttpServletResponseReverseAdapter(HttpServletResponse servletResponse)
    {
        super(servletResponse);
    }

    @Override
    public void addCookie(jakarta.servlet.http.Cookie cookie)
    {
        _servletResponse.addCookie(new CookieAdapter(cookie));
    }

    public boolean containsHeader(String name)
    {
        return _servletResponse.containsHeader(name);
    }

    public String encodeURL(String url)
    {
        return _servletResponse.encodeURL(url);
    }

    public String encodeRedirectURL(String url)
    {
        return _servletResponse.encodeRedirectURL(url);
    }

    @Deprecated
    public String encodeUrl(String url)
    {
        return _servletResponse.encodeUrl(url);
    }

    @Deprecated
    public String encodeRedirectUrl(String url)
    {
        return _servletResponse.encodeRedirectUrl(url);
    }

    public void sendError(int sc, String msg) throws IOException
    {
        _servletResponse.sendError(sc, msg);
    }

    public void sendError(int sc) throws IOException
    {
        _servletResponse.sendError(sc);
    }

    public void sendRedirect(String location) throws IOException
    {
        _servletResponse.sendRedirect(location);
    }

    public void setDateHeader(String name, long date)
    {
        _servletResponse.setDateHeader(name, date);
    }

    public void addDateHeader(String name, long date)
    {
        _servletResponse.addDateHeader(name, date);
    }

    public void setHeader(String name, String value)
    {
        _servletResponse.setHeader(name, value);
    }

    public void addHeader(String name, String value)
    {
        _servletResponse.addHeader(name, value);
    }

    public void setIntHeader(String name, int value)
    {
        _servletResponse.setIntHeader(name, value);
    }

    public void addIntHeader(String name, int value)
    {
        _servletResponse.addIntHeader(name, value);
    }

    public void setStatus(int sc)
    {
        _servletResponse.setStatus(sc);
    }

    @Deprecated
    public void setStatus(int sc, String sm)
    {
        _servletResponse.setStatus(sc, sm);
    }

    public int getStatus()
    {
        return _servletResponse.getStatus();
    }

    public String getHeader(String name)
    {
        return _servletResponse.getHeader(name);
    }

    public Collection<String> getHeaders(String name)
    {
        return _servletResponse.getHeaders(name);
    }

    public Collection<String> getHeaderNames()
    {
        return _servletResponse.getHeaderNames();
    }

    public void setTrailerFields(Supplier<Map<String, String>> supplier)
    {
        _servletResponse.setTrailerFields(supplier);
    }

    public Supplier<Map<String, String>> getTrailerFields()
    {
        return _servletResponse.getTrailerFields();
    }
}
