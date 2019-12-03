package javax.servlet.jsp;

public class JspEngineInfoAdapter extends JspEngineInfo
{
    private final jakarta.servlet.jsp.JspEngineInfo _engineInfo;

    public JspEngineInfoAdapter(jakarta.servlet.jsp.JspEngineInfo engineInfo)
    {
        _engineInfo = engineInfo;
    }

    @Override
    public String getSpecificationVersion()
    {
        return _engineInfo.getSpecificationVersion();
    }
}
