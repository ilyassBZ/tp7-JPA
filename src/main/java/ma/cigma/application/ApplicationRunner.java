package ma.cigma.application;

import ma.cigma.models.Client;
import ma.cigma.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class ApplicationRunner {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("idCtrl");

        ctrl.save(new Client("ilyass bzitar"));
        ctrl.save(new Client("yassine tali"));
        ctrl.save(new Client("ahmed haid"));


        /* Update un Client */
        ctrl.modify(new Client(2, "salim nabil"));

        /* Supprimer un client */
        ctrl.deleteById(2L);

        /* Rechercher un client */
        Client search = ctrl.getById(2L);
        System.out.println(search);

        /* Afficher tous les enregistrements */
        List<Client> clients = ctrl.finAll();
        //for(Client c : clients) System.out.println(c);
        clients.forEach(c -> System.out.println("\n" + c));


    }

}
