package Assignment01.Assignment001.service;

import Assignment01.Assignment001.Model.Product;
import Assignment01.Assignment001.Repo.ProductDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDetailsRepo productDetailsRepo;
    @Override
    public Product saveproductdetail(Product product) {

        return productDetailsRepo.save(product);
    }
}
