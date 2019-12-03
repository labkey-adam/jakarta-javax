package javax.servlet;

import jakarta.servlet.ReadListener;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ServletInputStreamAdapter extends ServletInputStream
{
    private final jakarta.servlet.ServletInputStream _servletInputStream;

    public ServletInputStreamAdapter(jakarta.servlet.ServletInputStream servletInputStream)
    {
        _servletInputStream = servletInputStream;
    }

    @Override
    public int readLine(byte[] b, int off, int len) throws IOException
    {
        return _servletInputStream.readLine(b, off, len);
    }

    @Override
    public boolean isFinished()
    {
        return _servletInputStream.isFinished();
    }

    @Override
    public boolean isReady()
    {
        return _servletInputStream.isReady();
    }

    @Override
    public void setReadListener(ReadListener readListener)
    {
        _servletInputStream.setReadListener(readListener);
    }

    public static InputStream nullInputStream()
    {
        return InputStream.nullInputStream();
    }

    @Override
    public int read() throws IOException
    {
        return _servletInputStream.read();
    }

    @Override
    public int read(byte[] b) throws IOException
    {
        return _servletInputStream.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException
    {
        return _servletInputStream.read(b, off, len);
    }

    @Override
    public byte[] readAllBytes() throws IOException
    {
        return _servletInputStream.readAllBytes();
    }

    @Override
    public byte[] readNBytes(int len) throws IOException
    {
        return _servletInputStream.readNBytes(len);
    }

    @Override
    public int readNBytes(byte[] b, int off, int len) throws IOException
    {
        return _servletInputStream.readNBytes(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException
    {
        return _servletInputStream.skip(n);
    }

    @Override
    public void skipNBytes(long n) throws IOException
    {
        _servletInputStream.skipNBytes(n);
    }

    @Override
    public int available() throws IOException
    {
        return _servletInputStream.available();
    }

    @Override
    public void close() throws IOException
    {
        _servletInputStream.close();
    }

    @Override
    public void mark(int readlimit)
    {
        _servletInputStream.mark(readlimit);
    }

    @Override
    public void reset() throws IOException
    {
        _servletInputStream.reset();
    }

    @Override
    public boolean markSupported()
    {
        return _servletInputStream.markSupported();
    }

    @Override
    public long transferTo(OutputStream out) throws IOException
    {
        return _servletInputStream.transferTo(out);
    }
}
