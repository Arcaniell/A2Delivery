package Sale;


import com.mobox.dao.A2DeliverySessionFact;
import com.mobox.model.Product;
import com.mobox.model.Sale;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestSale {

    public static Sale initSale(){
        Sale sale = new Sale();
        Set<Product> products = new HashSet<>();
        products.add(TestSale.initProduct());

        sale.setShown(true);
        sale.setTitle("Drink's sale");
        sale.setDescription("Sale for all drinks");
        sale.setThumbnail("path to picture");
        sale.setProducts(products);
        return sale;
    }

    /* Not all fields are filled */
    public static Product initProduct(){
        Product product = new Product();
        product.setRating(1);
        product.setName("water");
        product.setDescription("drink");
        product.setWeight(0.5);
        product.setPrice(5);
        product.setSalePrice(4);
        return product;
    }

    @Test
    public void Sale(){
        Session session = A2DeliverySessionFact.openSession();
        Transaction transaction = null;
        try {
             transaction = session.beginTransaction();
             session.save(TestSale.initSale());

             List<Sale> query = session.createSQLQuery("select * from SALE").list();
             for (Sale s : query) {
                assertNotNull(s.getSaleId());
                assertTrue(s.getSaleId() == 1);
                assertNotNull(s.getProducts());
             }
             transaction.commit();
        }catch (HibernateException e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            A2DeliverySessionFact.closeSesFact();
        }
    }
}
