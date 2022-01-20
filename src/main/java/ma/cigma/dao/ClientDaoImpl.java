package ma.cigma.dao;

import ma.cigma.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClientDaoImpl implements IClientDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();

    @Override
    public boolean save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Client update(Client c) {
        em.getTransaction().begin();
        Client currentClient =
                em.find(Client.class, c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);
        em.getTransaction().commit();
        return c;
    }

    @Override
    public boolean deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class, idClient);
        if (clientInDataBase != null) em.remove(clientInDataBase);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Client findById(long idClient) {
        return em.find(Client.class, idClient);
    }

    @Override
    public List<Client> findAll() {
        Query query = em.createNamedQuery("Client.findAll");
        List<Client> clients = query.getResultList();
        return clients;
    }
}
