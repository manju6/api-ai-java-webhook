package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(value="/getTotalOrders",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody WebhookResponse getTotalOrders(@RequestBody String obj){

        System.out.println(obj);

        return new WebhookResponse("Total Orders in Past 24 Hours is 4500 " , "Total Orders in Past 24 Hours is 4500");
    }

}
