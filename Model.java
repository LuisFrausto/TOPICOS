package VISUALES;

class Model {
    private View v;

    public Model(View v) {
        this.v = v;
    }

    void setFile(String fileName) {
        throw new UnsupportedOperationException("");
    }

    String read() {
        throw new UnsupportedOperationException("");
    }

    void setContenido(String text) {
        throw new UnsupportedOperationException("");
    }

    void encript() {
        v.setText(Model.encriptar(v.getFileName().toCharArray()));
    }

    void decript() {
        v.setText(Model.desencriptar(v.getFileName().toCharArray()));
    }

    void setFileName(String fileName) {
        throw new UnsupportedOperationException("");
    }

    void write() {
        throw new UnsupportedOperationException("");
    }
    
    static String encriptar(char array[]){
        String me = "";
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122)) {
                array[i] += 3;
            }
        }
        array = invertir(array);
        int partido = Math.round(array.length / 2);
        for (int i = partido; i < array.length; i++) {
            if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122)) {
                array[i] -= 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            me = me + "" + array[i];
        }
        return me;
    }
    
    static String desencriptar(char array[]){
        String md = "";
        int partido = Math.round(array.length / 2);
        for (int i = partido; i < array.length; i++) {
            if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122)) {
                array[i] += 1;
            }
        }
        array = invertir(array);
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 65 && array[i] <= 90) || (array[i] >= 97 && array[i] <= 122)) {
                array[i] -= 3;
            }
        }
        for (int i = 0; i < array.length; i++) {
            md = md + "" + array[i];
        }
        return md;
    }
    
    public static char[] invertir(char array[]) {
        char[] invertido = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    char[] chars(String mensaje) {
        char[] temporal = new char[mensaje.length()];
        for (int i = 0; i < mensaje.length(); i++) {
            temporal[i] = mensaje.charAt(i);
        }
        return temporal;
    }
}
