package rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rest.db.entity.Dialog;
import rest.db.service.DialogService;


import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class DialogsController {

    private DialogService dialogService;

    public DialogsController(DialogService dialogService) {
        this.dialogService = dialogService;
    }

    @RequestMapping(value = "/dialogs", method = RequestMethod.GET)
    public List<Dialog> getDialogs() {
        System.out.println("GET DIALOGS");
        return dialogService.getAllDialogs();
    }

    @RequestMapping(value = "/dialogs", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void postDialog(
            @RequestBody Dialog dialog,
            BindingResult result,
            HttpServletResponse response
    ) throws BindException {
        System.out.println("SAVE DIALOG");
        if (result.hasErrors()) throw new BindException(result);
        dialogService.addDialog(dialog);
        response.setHeader("Location", "/dialogs/" + dialog.getId());
    }
}
