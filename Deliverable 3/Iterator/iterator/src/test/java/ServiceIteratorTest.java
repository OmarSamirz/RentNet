import org.junit.Test;

public class ServiceIteratorTest {

    @Test
    public void testAdd() {
        ServiceIterator serviceIterator = new ServiceIterator();
        serviceIterator.addItem(new Service(1));
        serviceIterator.addItem(new Service(2));
        serviceIterator.addItem(new Service(3));

        while (serviceIterator.hasNext()) {
            System.out.println(serviceIterator.getNext().getServiceID());
        }
    }
}
