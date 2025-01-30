package tacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import tacos.model.TacoOrder;

@Slf4j //Slf4j annotation to create a free SLF4J Logger object at compile time
@Controller
@RequestMapping("/orders")//Specifies any request-handles method in this
// controller will handle requests whose path begins with /order
@SessionAttributes("tacoOrder") //
public class OrderController {

    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }

    @PostMapping()
    public String processOrder(TacoOrder order,
                               SessionStatus sessionStatus){
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete(); //Ensures that the session is cleaned up,
        // and ready for a new order next time the user creates a taco

        return "redirect:/";
    }

}
