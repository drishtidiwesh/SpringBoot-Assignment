package Assignment01.Assignment001.Repo;

import Assignment01.Assignment001.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDetailsRepo extends JpaRepository<Product,Integer> {

    //Product findById(int id);

    public List<Product> findByName(String name);
    public List<Product> findByColor(String color);
    //public List<Product> findByNameColor(String name,String color);
}
