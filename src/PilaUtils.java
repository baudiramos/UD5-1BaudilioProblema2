import java.util.Arrays;

public class PilaUtils {

    private int numeros;
    private Object data[];
    private int cantidadValores;

    public PilaUtils(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public Object getElement(int i) {
        return data[i];
    }

    public int length() {
        return cantidadValores;
    }

    public void insert(Object element, int i) {

        if (cantidadValores == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < cantidadValores; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        for (int j = cantidadValores - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }

        data[i] = element;
        cantidadValores++;
    }

    public void add(float element) {
        insert(element, cantidadValores);
    }

    public  int delete (int i) {
        Object aux = data[i];
        for (int j = 0; j < cantidadValores; j++) {
            data[j] = data[j + 1];
        }
        cantidadValores--;
        return (int) aux;
    }

    public void push(Object element) {
        insert(element, 0);
    }

    public int pop() {
        return  delete(0);
    }

    @Override
    public String toString() {
        return "" +
                data[0] + data[1] + data[2] + data[3] + data[4];
    }
}
