package rest.db.service;

import org.mongodb.morphia.Datastore;
import org.springframework.stereotype.Service;
import rest.db.AppDatabase;
import rest.db.dao.LoadDAO;
import rest.db.entity.Load;

import java.util.List;

@Service("loadService")
public class LoadService implements LoadDAO {

    private Datastore datastore;

    public LoadService(AppDatabase database) {
        this.datastore = database.getInstance();
    }

    @Override
    public void addLoad(Load load) {
        datastore.save(load);
    }

    @Override
    public Load getLoad(String id) {
        return datastore.get(Load.class, id);
    }

    @Override
    public void deleteLoad(Load load) {
        datastore.delete(load);
    }

    @Override
    public void updateLoad(Load load) {
        addLoad(load);
    }

    @Override
    public List<Load> getAllLoads() {
        return datastore.createQuery(Load.class)
                .order("id")
                .asList();
    }

    @Override
    public List<Load> getLoadsByIds(List<String> ids) {
        return datastore.createQuery(Load.class)
                .field("id").in(ids)
                .asList();
    }
}
