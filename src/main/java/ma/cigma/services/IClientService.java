package ma.cigma.services;

import ma.cigma.models.Client;

import java.util.List;

public interface IClientService {

    boolean save(Client c);

    Client modify(Client c);

    boolean deleteById(long id);

    Client getById(long id);

    List<Client> findAll();

}


