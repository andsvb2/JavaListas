public class Operacoes {

    public int dobro(int x) {
        x = x * 2;
        return x;
    }

    public void dobro(int v[]) {
        for(int i = 0; i < v.length; i++)
            v[i] = v[i] * 2;
    }

    public String dobro(String s) {
        s = s + s;
        return s;
    }
}
