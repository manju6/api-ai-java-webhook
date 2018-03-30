package hello;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;



@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    
       @RequestMapping(value="/groupByOrderChannel",method=RequestMethod.POST)
        public @ResponseBody WebhookResponse groupByOrderChannel(@RequestBody String obj){
        System.out.println(obj);
        
        RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity("https://cpm-json-data.herokuapp.com/api/groupByOrderChannel", Object[].class);
		Object[] objects = responseEntity.getBody();
	
		return new WebhookResponse("Group By Orders Channel and Its Count" +objects[0], "Group By Orders Channel and Its Count" +objects[0]);
    }
    
        @RequestMapping(value="/getTotalOrders",method=RequestMethod.POST)
        public @ResponseBody WebhookResponse getTotalOrders(@RequestBody String obj){
        System.out.println(obj);
      
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity("https://cpm-json-data.herokuapp.com/api/getTotalOrders", Object[].class);
		Object[] objects = responseEntity.getBody();
		
		return new WebhookResponse("Group By Orders and Its Count" +objects[0], "Group By Orders Channel and Its Count" +objects[0]);
    }

}
