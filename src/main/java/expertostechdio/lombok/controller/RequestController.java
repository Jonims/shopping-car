package expertostechdio.lombok.controller;

import expertostechdio.lombok.model.ProductModel;
import expertostechdio.lombok.model.RequestModel;
import expertostechdio.lombok.repository.RequestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/request")
public class RequestController {

    private final RequestRepository repository;

    public RequestController(RequestRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/listAll")
    public ResponseEntity<List<RequestModel>> listAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salve")
    public ResponseEntity<RequestModel> save(@RequestBody RequestModel request){

        if (request.getId() == null|| request.getId().isEmpty()){
            request.setId(UUID.randomUUID().toString());
        }
        return ResponseEntity.ok(repository.save(request));

    }
}
