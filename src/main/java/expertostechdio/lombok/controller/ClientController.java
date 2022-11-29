package expertostechdio.lombok.controller;

import expertostechdio.lombok.model.ClientModel;
import expertostechdio.lombok.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ClientModel>> listAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salve")
    public ResponseEntity<ClientModel> save(@RequestBody ClientModel client){
        return ResponseEntity.ok(repository.save(client));
    }

}
