package rest.db.dao;

import rest.db.entity.Load;

import java.util.List;

public interface LoadDAO {

    void addLoad(Load load);

    Load getLoad(String id);

    void deleteLoad(Load load);

    void updateLoad(Load load);

    List<Load> getAllLoads();

    List<Load> getLoadsByIds(List<String> ids);
}
