import org.example.Service;
import org.example.ServiceFactory;
import org.example.ServiceType;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceFactoryTest {
    @Test
    public void TestInstance(){
        ServiceFactory serviceFactory = new ServiceFactory();

        String category1 = "SportField";
        String category2 = "GamingCenter";

        // test a new ServiceType is created for a new category
        ServiceType serviceType1 = serviceFactory.getServiceType(category1);
        assertNotNull(serviceType1);
        assertEquals(category1, serviceType1.getCategory());

        // test the same ServiceType is returned for the same category
        ServiceType serviceType1Again = serviceFactory.getServiceType(category1);
        assertSame(serviceType1, serviceType1Again);

        // test a new ServiceType is created for a different category
        ServiceType serviceType2 = serviceFactory.getServiceType(category2);
        assertNotNull(serviceType2);
        assertEquals(category2, serviceType2.getCategory());
        assertNotSame(serviceType1, serviceType2);

    }
}
