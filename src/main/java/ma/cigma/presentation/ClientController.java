package ma.cigma.presentation;

import ma.cigma.models.Client;
import ma.cigma.services.IClientService;

import java.util.List;

public class ClientController {

    IClientService service;

    public ClientController() {
        System.out.println("Client controler");
    }

    public IClientService getService() {
        return service;
    }

    public void setService(IClientService service) {
        this.service = service;
    }

    public void save(Client c) {
        System.out.println("Presentation Layer Level...");
        service.save(c);
    }

    public void modify(Client c) {
        service.modify(c);
    }

    public boolean deleteById(long id) {
        return service.deleteById(id);
    }

    public Client getById(long id) {
        return service.getById(id);
    }

    public List<Client> finAll() {
        return service.findAll();
    }

}
