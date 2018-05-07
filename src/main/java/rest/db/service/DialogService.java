package rest.db.service;

import org.mongodb.morphia.Datastore;
import org.springframework.stereotype.Service;
import rest.db.AppDatabase;
import rest.db.dao.DialogDAO;
import rest.db.entity.Dialog;


import java.util.List;

@Service("dialogService")
public class DialogService implements DialogDAO {

    private Datastore datastore;

    public DialogService(AppDatabase database) {
        this.datastore = database.getInstance();
    }

    @Override
    public void addDialog(Dialog dialog) {
        datastore.save(dialog);
    }

    @Override
    public Dialog getDialog(String id) {
        return datastore.get(Dialog.class, id);
    }

    @Override
    public void deleteDialog(Dialog dialog) {
        datastore.delete(dialog);
    }

    @Override
    public void updateDialog(Dialog dialog) {
        addDialog(dialog);
    }

    @Override
    public List<Dialog> getAllDialogs() {
        return datastore.createQuery(Dialog.class)
                .order("id")
                .asList();
    }

    @Override
    public List<Dialog> getDialogsByIds(List<String> ids) {
        return datastore.createQuery(Dialog.class)
                .field("id").in(ids)
                .asList();
    }
}
