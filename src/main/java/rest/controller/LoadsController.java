package rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rest.db.entity.Load;
import rest.db.service.LoadService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class LoadsController {

    private LoadService loadService;

    public LoadsController(LoadService loadService) {
        this.loadService = loadService;
    }

    @RequestMapping(value = "/loads", method = RequestMethod.GET)
    public List<Load> getLoads() {
        System.out.println("GET LOADS");
        return loadService.getAllLoads();
    }

    @RequestMapping(value = "/loads", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void postLoad(
            @RequestBody Load load,
            BindingResult result,
            HttpServletResponse response
    ) throws BindException {
        System.out.println("SAVE LOAD");
        if (result.hasErrors()) throw new BindException(result);
        loadService.addLoad(load);
        response.setHeader("Location", "/loads/" + load.getId());
    }
}
