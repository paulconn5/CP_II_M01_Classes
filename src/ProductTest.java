import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1;

    @BeforeEach
    void setUp() {
        p1 = new Product("Shampoo", "Cleans hair", "000001", 10.50);
    }

    @Test
    void setName() {
        p1.setName("Conditioner");
        assertEquals("Conditioner", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("Softens hair");
        assertEquals("Softens hair", p1.getDescription());
    }

    @Test
    void setID() {
        p1.setID("000002");
        assertEquals("000002",p1.getID());
    }

    @Test
    void setCost() {
        p1.setCost(9.00);
        assertEquals(9.00,p1.getCost());
    }

    @Test
    void testToString() {
        assertEquals("Product{name='Shampoo', description='Cleans hair', ID='000001', cost='10.5}", p1.toString());
    }

    @Test
    void toCVSRecord() {
        assertEquals("Shampoo,Cleans hair, 000001, 10.5\n", p1.toCVSRecord());
    }
}