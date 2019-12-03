package javax.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class ServletResponseAdapter implements javax.servlet.ServletResponse
{
    private final jakarta.servlet.ServletResponse _servletResponse;

    public ServletResponseAdapter(jakarta.servlet.ServletResponse servletResponse)
    {
        _servletResponse = servletResponse;
    }

    public jakarta.servlet.ServletResponse unwrap()
    {
        return _servletResponse;
    }

    @Override
    public String getCharacterEncoding()
    {
        return _servletResponse.getCharacterEncoding();
    }

    @Override
    public String getContentType()
    {
        return _servletResponse.getContentType();
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException
    {
        return new ServletOutputStreamAdapter(_servletResponse.getOutputStream());
    }

    @Override
    public PrintWriter getWriter() throws IOException
    {
        return _servletResponse.getWriter();
    }

    @Override
    public void setCharacterEncoding(String s)
    {
        _servletResponse.setCharacterEncoding(s);
    }

    @Override
    public void setContentLength(int i)
    {
        _servletResponse.setContentLength(i);
    }

    @Override
    public void setContentLengthLong(long l)
    {
        _servletResponse.setContentLengthLong(l);
    }

    @Override
    public void setContentType(String s)
    {
        _servletResponse.setContentType(s);
    }

    @Override
    public void setBufferSize(int i)
    {
        _servletResponse.setBufferSize(i);
    }

    @Override
    public int getBufferSize()
    {
        return _servletResponse.getBufferSize();
    }

    @Override
    public void flushBuffer() throws IOException
    {
        _servletResponse.flushBuffer();
    }

    @Override
    public void resetBuffer()
    {
        _servletResponse.resetBuffer();
    }

    @Override
    public boolean isCommitted()
    {
        return _servletResponse.isCommitted();
    }

    @Override
    public void reset()
    {
        _servletResponse.reset();
    }

    @Override
    public void setLocale(Locale locale)
    {
        _servletResponse.setLocale(locale);
    }

    @Override
    public Locale getLocale()
    {
        return _servletResponse.getLocale();
    }
}
