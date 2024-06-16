package PTE.WEB_RESTAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PTE.WEB_RESTAPI.entity.Elements;
import PTE.WEB_RESTAPI.responseHandler.Response;
import PTE.WEB_RESTAPI.service.ElementsService;


/**
 * @author Jeff Catulay
 * @category Rest Controller
 * @version 1.1.0
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1.0.0/pte")
public class ElementsController {

	@Autowired
	private ElementsService elementsService;
	
	@GetMapping
	public ResponseEntity<Object> getInitialDataAll(){
		List<Elements> data = elementsService.getAllElements();
		return Response.generateResponse("Success", HttpStatus.OK, data);
	}
	
	@GetMapping("/elementName/{elementName}")
	public ResponseEntity<Object> getByElementName(@PathVariable("elementName") String elementName){
		Elements data = elementsService.getByElementName(elementName);
		if (data == null) {
			return Response.generateResponse("No Data Found",  HttpStatus.NOT_FOUND, data);
		}
		return Response.generateResponse("Success", HttpStatus.OK, data);
	}
	
	@GetMapping("/symbol/{symbol}")
	public ResponseEntity<Object> getBySymbol(@PathVariable("symbol") String symbol){
		Elements data = elementsService.getBySymbol(symbol);
		if (data == null) {
			return Response.generateResponse("No Data Found",  HttpStatus.NOT_FOUND, data);
		}
		return Response.generateResponse("Success", HttpStatus.OK, data);
	}
	@GetMapping("/atomicNumber/{atomicNumber}")
	public ResponseEntity<Object> getBySymbol(@PathVariable("atomicNumber") Integer atomicNumber){
		Elements data = elementsService.getByAtomicNumber(atomicNumber);
		if (data == null) {
			return Response.generateResponse("No Data Found",  HttpStatus.NOT_FOUND, data);
		}
		return Response.generateResponse("Success", HttpStatus.OK, data);
	}
	@GetMapping("/chemicalGroup/{chemicalGroup}")
	public ResponseEntity<Object> getByChemicalGroup(@PathVariable("chemicalGroup") String chemicalGroup){
		List<Elements> data = elementsService.getByChemicalGroup(chemicalGroup);
		if (data.size() == 0) {
			return Response.generateResponse("No Data Found",  HttpStatus.NOT_FOUND, data);
		}
		return Response.generateResponse("Success", HttpStatus.OK, data);
	}
	@GetMapping("/state/{state}")
	public ResponseEntity<Object> getByState(@PathVariable("state") String state){
		List<Elements> data = elementsService.getByState(state);
		if (data.size() == 0) {
			return Response.generateResponse("No Data Found",  HttpStatus.NOT_FOUND, data);
		}
		return Response.generateResponse("Success", HttpStatus.OK, data);
	}
}
