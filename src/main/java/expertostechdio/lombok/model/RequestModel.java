package expertostechdio.lombok.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "request")
public class RequestModel {

    @Id
    private String id;

    @ManyToOne (cascade = CascadeType.ALL)
    private ClientModel client;

    @OneToMany (cascade = CascadeType.ALL)
    private List<RequestItmModel> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public List<RequestItmModel> getItems() {
        return items;
    }

    public void setItems(List<RequestItmModel> items) {
        this.items = items;
    }
}
