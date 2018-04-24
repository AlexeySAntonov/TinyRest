package rest.db;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.stereotype.Component;

@Component
public class AppDatabase {

    private Datastore db;

    public AppDatabase() {
        Morphia morphia = new Morphia();
        this.db = morphia.createDatastore(new MongoClient("localhost"), "roadcargo");
        db.ensureIndexes();
    }

    public Datastore getInstance() {
        return db;
    }
}
