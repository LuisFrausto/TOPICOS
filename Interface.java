package VISUALES;

public interface Interface {
    
    void setController(Controller c);
    public String getFileName();
    public String getText();
    public void setText(String s);
    
    static final String Open = "Abri";
    static final String Save = "Guardar";
    static final String Encrypt = "Encriptar";
    static final String Decrypt = "Desencriptar";
}
