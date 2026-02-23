public final class IntArrayList implements IntList {
    private int[] data = new int[10];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == data.length) {
            int newCap = data.length + (data.length / 2);
            if (newCap == data.length) newCap = data.length + 1;
            int[] newArr = new int[newCap];
            System.arraycopy(data, 0, newArr, 0, data.length);
            data = newArr;
        }
        data[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException("id: " + id + ", size: " + size);
        return data[id];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }
}