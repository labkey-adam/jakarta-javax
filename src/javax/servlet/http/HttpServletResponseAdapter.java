package javax.servlet.http;

import javax.servlet.ServletOutputStream;
import javax.servlet.ServletOutputStreamAdapter;
import javax.servlet.ServletResponseAdapter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

public class HttpServletResponseAdapter extends ServletResponseAdapter implements javax.servlet.http.HttpServletResponse
{
    private jakarta.servlet.http.HttpServletResponse _httpServletResponse;

    public HttpServletResponseAdapter(jakarta.servlet.http.HttpServletResponse httpServletResponse)
    {
        super(httpServletResponse);
        _httpServletResponse = httpServletResponse;
    }

    public jakarta.servlet.http.HttpServletResponse unwrap()
    {
        return _httpServletResponse;
    }

    @Override
    public void addCookie(Cookie cookie)
    {
        _httpServletResponse.addCookie(new CookieReverseAdapter(cookie));
    }

    @Override
    public boolean containsHeader(String s)
    {
        return _httpServletResponse.containsHeader(s);
    }

    @Override
    public String encodeURL(String s)
    {
        return _httpServletResponse.encodeURL(s);
    }

    @Override
    public String encodeRedirectURL(String s)
    {
        return _httpServletResponse.encodeRedirectURL(s);
    }

    @Override
    @Deprecated
    public String encodeUrl(String s)
    {
        return _httpServletResponse.encodeUrl(s);
    }

    @Override
    @Deprecated
    public String encodeRedirectUrl(String s)
    {
        return _httpServletResponse.encodeRedirectUrl(s);
    }

    @Override
    public void sendError(int i, String s) throws IOException
    {
        _httpServletResponse.sendError(i, s);
    }

    @Override
    public void sendError(int i) throws IOException
    {
        _httpServletResponse.sendError(i);
    }

    @Override
    public void sendRedirect(String s) throws IOException
    {
        _httpServletResponse.sendRedirect(s);
    }

    @Override
    public void setDateHeader(String s, long l)
    {
        _httpServletResponse.setDateHeader(s, l);
    }

    @Override
    public void addDateHeader(String s, long l)
    {
        _httpServletResponse.addDateHeader(s, l);
    }

    @Override
    public void setHeader(String s, String s1)
    {
        _httpServletResponse.setHeader(s, s1);
    }

    @Override
    public void addHeader(String s, String s1)
    {
        _httpServletResponse.addHeader(s, s1);
    }

    @Override
    public void setIntHeader(String s, int i)
    {
        _httpServletResponse.setIntHeader(s, i);
    }

    @Override
    public void addIntHeader(String s, int i)
    {
        _httpServletResponse.addIntHeader(s, i);
    }

    @Override
    public void setStatus(int i)
    {
        _httpServletResponse.setStatus(i);
    }

    @Override
    @Deprecated
    public void setStatus(int i, String s)
    {
        _httpServletResponse.setStatus(i, s);
    }

    @Override
    public int getStatus()
    {
        return _httpServletResponse.getStatus();
    }

    @Override
    public String getHeader(String s)
    {
        return _httpServletResponse.getHeader(s);
    }

    @Override
    public Collection<String> getHeaders(String s)
    {
        return _httpServletResponse.getHeaders(s);
    }

    @Override
    public Collection<String> getHeaderNames()
    {
        return _httpServletResponse.getHeaderNames();
    }

    @Override
    public void setTrailerFields(Supplier<Map<String, String>> supplier)
    {
        _httpServletResponse.setTrailerFields(supplier);
    }

    @Override
    public Supplier<Map<String, String>> getTrailerFields()
    {
        return _httpServletResponse.getTrailerFields();
    }

    @Override
    public String getCharacterEncoding()
    {
        return _httpServletResponse.getCharacterEncoding();
    }

    @Override
    public String getContentType()
    {
        return _httpServletResponse.getContentType();
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException
    {
        return new ServletOutputStreamAdapter(_httpServletResponse.getOutputStream());
    }

    @Override
    public PrintWriter getWriter() throws IOException
    {
        return _httpServletResponse.getWriter();
    }

    @Override
    public void setCharacterEncoding(String s)
    {
        _httpServletResponse.setCharacterEncoding(s);
    }

    @Override
    public void setContentLength(int i)
    {
        _httpServletResponse.setContentLength(i);
    }

    @Override
    public void setContentLengthLong(long l)
    {
        _httpServletResponse.setContentLengthLong(l);
    }

    @Override
    public void setContentType(String s)
    {
        _httpServletResponse.setContentType(s);
    }

    @Override
    public void setBufferSize(int i)
    {
        _httpServletResponse.setBufferSize(i);
    }

    @Override
    public int getBufferSize()
    {
        return _httpServletResponse.getBufferSize();
    }

    @Override
    public void flushBuffer() throws IOException
    {
        _httpServletResponse.flushBuffer();
    }

    @Override
    public void resetBuffer()
    {
        _httpServletResponse.resetBuffer();
    }

    @Override
    public boolean isCommitted()
    {
        return _httpServletResponse.isCommitted();
    }

    @Override
    public void reset()
    {
        _httpServletResponse.reset();
    }

    @Override
    public void setLocale(Locale locale)
    {
        _httpServletResponse.setLocale(locale);
    }

    @Override
    public Locale getLocale()
    {
        return _httpServletResponse.getLocale();
    }
}
