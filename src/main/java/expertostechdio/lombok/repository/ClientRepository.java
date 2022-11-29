package expertostechdio.lombok.repository;

import expertostechdio.lombok.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
}
