package rest.db.dao;

import rest.db.entity.Route;

import java.util.List;

public interface RouteDAO {

    void addRoute(Route route);

    Route getRoute(String id);

    void deleteRoute(Route route);

    void updateRoute(Route route);

    List<Route> getAllRoutes();

    List<Route> getRoutesByIds(List<String> ids);
}
