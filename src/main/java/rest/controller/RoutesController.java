package rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import rest.db.entity.Route;
import rest.db.service.RouteService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RoutesController {

    private final AtomicLong counter = new AtomicLong();
    private RouteService routeService;

    public RoutesController(RouteService routeService) {
        this.routeService = routeService;
    }

    @RequestMapping(value = "/routes", method = RequestMethod.GET)
    public List<Route> getRoutes(@RequestParam(value="fromLocation", required=false, defaultValue="Saint-Petersburg") String location) {
        return routeService.getAllRoutes();
    }

    @RequestMapping(value = "/routes", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Route postRoute(
            @RequestBody Route route,
            BindingResult result,
            HttpServletResponse response
    ) throws BindException {
        if (result.hasErrors()) throw new BindException(result);
        routeService.addRoute(route);
        response.setHeader("Location", "/routes/" + route.getId());
        return route;
    }
}
