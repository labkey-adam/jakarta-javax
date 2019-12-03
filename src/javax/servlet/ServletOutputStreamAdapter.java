package javax.servlet;

import java.io.IOException;

public class ServletOutputStreamAdapter extends ServletOutputStream
{
    private final jakarta.servlet.ServletOutputStream _sos;

    public ServletOutputStreamAdapter(jakarta.servlet.ServletOutputStream sos)
    {
        _sos = sos;
    }

    @Override
    public boolean isReady()
    {
        return _sos.isReady();
    }

    @Override
    public void setWriteListener(javax.servlet.WriteListener listener)
    {
        throw new NotYetImplementedException();
//        _sos.setWriteListener(listener);
    }

    @Override
    public void write(int b) throws IOException
    {
        _sos.write(b);
    }
}
