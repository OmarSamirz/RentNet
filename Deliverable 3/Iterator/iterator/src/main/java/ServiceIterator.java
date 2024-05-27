import java.util.Stack;

public class ServiceIterator implements Iterator<Service> {
    private Stack<Service> services;


    public ServiceIterator() {
        services = new Stack<>();
    }

    public void addItem(Service service) {
        services.push(service);
    }

    @Override
    public Service getNext() {
        // Implement
        if (!hasNext()) {
            return null;
        }

        return services.pop();
    }

    @Override
    public boolean hasNext() {
        // Implement
        return !services.isEmpty();
    }

    @Override
    public void reset() {
        // Implement
    }

    @Override
    public void remove() {
        // Implement
    }
}
