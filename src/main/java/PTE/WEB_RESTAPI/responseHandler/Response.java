package PTE.WEB_RESTAPI.responseHandler;

import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import PTE.WEB_RESTAPI.entity.Elements;


/**
 * @author Jeff Catulay
 * @category Response Handler
 * @version 1.1.0
 */
public class Response {
	public static <T> ResponseEntity<Object> generateResponse(String responseMessage, HttpStatus status, List<T> responseObj) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("responseMessage", responseMessage);
        map.put("responseStatus", status.value());
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        map.put("timestamp", String.valueOf(timestamp));
        map.put("data", responseObj);

        return new ResponseEntity<Object>(map,status);
    }
	public static <T> ResponseEntity<Object> generateResponse(String responseMessage, HttpStatus status, Elements responseObj) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("responseMessage", responseMessage);
        map.put("responseStatus", status.value());
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        map.put("timestamp", String.valueOf(timestamp));
        map.put("data", responseObj);

        return new ResponseEntity<Object>(map,status);
    }
}
