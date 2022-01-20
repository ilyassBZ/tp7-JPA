package ma.cigma.dao;

import ma.cigma.models.Client;

import java.util.List;

public interface IClientDao {
    boolean save(Client c);

    Client update(Client c);

    boolean deleteById(long idClient);

    Client findById(long idClient);

    List<Client> findAll();
}
