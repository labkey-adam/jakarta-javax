package javax.servlet.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class PartReverseAdapter implements jakarta.servlet.http.Part
{
    private final Part _part;

    public PartReverseAdapter(Part part)
    {
        _part = part;
    }

    @Override
    public InputStream getInputStream() throws IOException
    {
        return _part.getInputStream();
    }

    @Override
    public String getContentType()
    {
        return _part.getContentType();
    }

    @Override
    public String getName()
    {
        return _part.getName();
    }

    @Override
    public String getSubmittedFileName()
    {
        return _part.getSubmittedFileName();
    }

    @Override
    public long getSize()
    {
        return _part.getSize();
    }

    @Override
    public void write(String s) throws IOException
    {
        _part.write(s);
    }

    @Override
    public void delete() throws IOException
    {
        _part.delete();
    }

    @Override
    public String getHeader(String s)
    {
        return _part.getHeader(s);
    }

    @Override
    public Collection<String> getHeaders(String s)
    {
        return _part.getHeaders(s);
    }

    @Override
    public Collection<String> getHeaderNames()
    {
        return _part.getHeaderNames();
    }
}
