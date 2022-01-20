package ma.cigma.services;

import ma.cigma.dao.IClientDao;
import ma.cigma.models.Client;

import java.util.List;

public class ClientServiceImpl implements IClientService {

    IClientDao dao;

    public ClientServiceImpl() {
        System.out.println("Creation ClientServiceImpl");
    }

    public IClientDao getDao() {
        return dao;
    }

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Client c) {
        System.out.println("Service Layer Level");
        return dao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public boolean deleteById(long id) {
        boolean check = dao.deleteById(id);
        return check;
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Client> findAll() {
        return dao.findAll();
    }

}
