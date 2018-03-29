package hello;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.coe.cpm.dao.RepositoryImpl;
import com.tcs.coe.cpm.utility.DateParsing;

public class WebController 
{
	public ResponseEntity<?> getTotalOrders() 
	{
				return new ResponseEntity<>(repository.getTotalOrders(), HttpStatus.OK);
	}

}
