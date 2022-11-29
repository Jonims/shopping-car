package expertostechdio.lombok.repository;

import expertostechdio.lombok.model.RequestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestModel, String> {
}
