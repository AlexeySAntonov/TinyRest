package rest.db.service;

import org.mongodb.morphia.Datastore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.db.AppDatabase;
import rest.db.dao.RouteDAO;
import rest.db.entity.Route;

import java.util.List;

@Service("routeService")
public class RouteService implements RouteDAO {

    private Datastore datastore;

    @Autowired
    public RouteService(AppDatabase database) {
        this.datastore = database.getInstance();
    }

    @Override
    public void addRoute(Route route) {
        datastore.save(route);
    }

    @Override
    public Route getRoute(String id) {
        return datastore.get(Route.class, id);
    }

    @Override
    public void deleteRoute(Route route) {
        datastore.delete(route);
    }

    @Override
    public void updateRoute(Route route) {
        addRoute(route);
    }

    @Override
    public List<Route> getAllRoutes() {
        return datastore.createQuery(Route.class)
                .order("id")
                .asList();
    }

    @Override
    public List<Route> getRoutesByIds(List<String> ids) {
        return datastore.createQuery(Route.class)
                .field("id").in(ids)
                .asList();
    }
}
