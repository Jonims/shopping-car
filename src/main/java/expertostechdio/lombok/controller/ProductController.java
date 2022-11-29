package expertostechdio.lombok.controller;

import expertostechdio.lombok.model.ClientModel;
import expertostechdio.lombok.model.ProductModel;
import expertostechdio.lombok.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/listAll")
    public ResponseEntity<List<ProductModel>> listAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salve")
    public ResponseEntity<ProductModel> save(@RequestBody ProductModel product){
        return ResponseEntity.ok(repository.save(product));
    }

}
