package PTE.WEB_RESTAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import PTE.WEB_RESTAPI.entity.Elements;


/**
 * @author Jeff Catulay
 * @category Service
 * @version 1.1.0
 */
@Service
public interface ElementsService {
	List<Elements> getAllElements();
	Elements getByElementName(String elementName);
	Elements getBySymbol(String symbol);
	Elements getByAtomicNumber(Integer atomicNumber);
	List<Elements> getByChemicalGroup(String chemicalGroup);
	List<Elements> getByState(String state);
}
