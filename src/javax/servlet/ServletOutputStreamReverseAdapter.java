package javax.servlet;

import java.io.IOException;
import java.io.OutputStream;

public class ServletOutputStreamReverseAdapter extends jakarta.servlet.ServletOutputStream
{
    private final ServletOutputStream _servletOutputStream;

    public ServletOutputStreamReverseAdapter(ServletOutputStream servletOutputStream)
    {
        _servletOutputStream = servletOutputStream;
    }

    @Override
    public void print(String s) throws IOException
    {
        _servletOutputStream.print(s);
    }

    @Override
    public void print(boolean b) throws IOException
    {
        _servletOutputStream.print(b);
    }

    @Override
    public void print(char c) throws IOException
    {
        _servletOutputStream.print(c);
    }

    @Override
    public void print(int i) throws IOException
    {
        _servletOutputStream.print(i);
    }

    @Override
    public void print(long l) throws IOException
    {
        _servletOutputStream.print(l);
    }

    @Override
    public void print(float f) throws IOException
    {
        _servletOutputStream.print(f);
    }

    @Override
    public void print(double d) throws IOException
    {
        _servletOutputStream.print(d);
    }

    @Override
    public void println() throws IOException
    {
        _servletOutputStream.println();
    }

    @Override
    public void println(String s) throws IOException
    {
        _servletOutputStream.println(s);
    }

    @Override
    public void println(boolean b) throws IOException
    {
        _servletOutputStream.println(b);
    }

    @Override
    public void println(char c) throws IOException
    {
        _servletOutputStream.println(c);
    }

    @Override
    public void println(int i) throws IOException
    {
        _servletOutputStream.println(i);
    }

    @Override
    public void println(long l) throws IOException
    {
        _servletOutputStream.println(l);
    }

    @Override
    public void println(float f) throws IOException
    {
        _servletOutputStream.println(f);
    }

    @Override
    public void println(double d) throws IOException
    {
        _servletOutputStream.println(d);
    }

    @Override
    public boolean isReady()
    {
        return _servletOutputStream.isReady();
    }

    @Override
    public void setWriteListener(jakarta.servlet.WriteListener writeListener)
    {
        throw new NotYetImplementedException();
//        _servletOutputStream.setWriteListener(writeListener);
    }

    public void setWriteListener(WriteListener listener)
    {
        _servletOutputStream.setWriteListener(listener);
    }

    public static OutputStream nullOutputStream()
    {
        return OutputStream.nullOutputStream();
    }

    @Override
    public void write(int b) throws IOException
    {
        _servletOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException
    {
        _servletOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException
    {
        _servletOutputStream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException
    {
        _servletOutputStream.flush();
    }

    @Override
    public void close() throws IOException
    {
        _servletOutputStream.close();
    }
}
