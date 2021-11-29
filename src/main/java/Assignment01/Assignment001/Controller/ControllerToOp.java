package Assignment01.Assignment001.Controller;

import Assignment01.Assignment001.Model.Product;
import Assignment01.Assignment001.Repo.ProductDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerToOp {

	
	@Autowired
	private ProductDetailsRepo prodouctRepo;
	
	


	@PostMapping("/add")
	public ResponseEntity<Product> addproduct(@RequestBody Product product)
	{
		Product savedProduct=prodouctRepo.save(product);
		System.out.println("Product is saved");
		return ResponseEntity.ok(savedProduct);
	}
	
	@GetMapping("/getproducts")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> productList=(List<Product>) prodouctRepo.findAll();
		return ResponseEntity.ok(productList);
		
	}
	@GetMapping("/byname")
	public ResponseEntity<List<Product>> getname(@RequestParam String name)
	{
		List<Product> prod=(List<Product>) prodouctRepo.findByName(name);
		return ResponseEntity.ok(prod);
	}

	@GetMapping("/bycolor")
	public ResponseEntity<List<Product>> getcolor(@RequestParam String color)
	{
		List<Product> prod1=(List<Product>) prodouctRepo.findByColor(color);
		return ResponseEntity.ok(prod1);
	}
//	@GetMapping("/bynameandcolor")
//	public ResponseEntity<List<Product>> getname(@RequestBody String name, @RequestBody String color)
//	{
//		List<Product> prod=(List<Product>) prodouctRepo.findByNameColor(name,color);
//		return ResponseEntity.ok(prod);
//	}
}
