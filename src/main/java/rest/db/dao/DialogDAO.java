package rest.db.dao;

import rest.db.entity.Dialog;

import java.util.List;

public interface DialogDAO {

    void addDialog(Dialog dialog);

    Dialog getDialog(String id);

    void deleteDialog(Dialog dialog);

    void updateDialog(Dialog dialog);

    List<Dialog> getAllDialogs();

    List<Dialog> getDialogsByIds(List<String> ids);
}
