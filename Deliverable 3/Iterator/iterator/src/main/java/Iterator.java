public interface Iterator<T> {
    public T getNext();

    public boolean hasNext();

    public void reset();

    public void remove();
}
