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
		ResponseEntity<List<WebResponse>> rateResponse =
		        restTemplate.exchange("https://cpm-json-data.herokuapp.com/api/groupByOrderChannel",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<WebResponse>>() {
		            });
		List<WebResponse> rates = rateResponse.getBody();
		
		return new WebhookResponse("Group By Orders Channel and Its Count" +rates, "Group By Orders Channel and Its Count" +rates);
    }
    
        @RequestMapping(value="/getTotalOrders",method=RequestMethod.POST)
        public @ResponseBody WebhookResponse getTotalOrders(@RequestBody String obj){
        System.out.println(obj);
      
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<WebResponse>> rateResponse =
		        restTemplate.exchange("https://cpm-json-data.herokuapp.com/api/groupByOrderChannel",
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<WebResponse>>() {
		            });
		List<WebResponse> rates = rateResponse.getBody();
		
		return new WebhookResponse("Group By Orders and Its Count" +rates, "Group By Orders Channel and Its Count" +rates);
    }

}
