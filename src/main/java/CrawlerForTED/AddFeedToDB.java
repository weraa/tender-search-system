package CrawlerForTED;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddFeedToDB {
    EntityManagerFactory emfactory;
    EntityManager entitymanager;


    private void init(){
     emfactory = Persistence.createEntityManagerFactory( "FeedMSG" );
     entitymanager = emfactory.createEntityManager( );
    }

    public void persist(Feed feed){
        init();
        for (FeedMessage message : feed.getMessages()) {
            entitymanager.getTransaction( ).begin( );
            entitymanager.persist( message);
            entitymanager.getTransaction( ).commit( );

        }

        entitymanager.close( );
        emfactory.close( );
    }

}
