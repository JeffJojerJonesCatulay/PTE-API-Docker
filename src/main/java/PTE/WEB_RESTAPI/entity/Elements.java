package PTE.WEB_RESTAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * @author Jeff Catulay
 * @category Entity
 * @version 1.0.0
 */
@Entity
public class Elements {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column ( name = "element_name")
	private String elementName;
	@Column ( name = "symbol")
	private String symbol;
	@Column ( name = "atomic_number")
	private Integer atomicNumber;
	@Column ( name = "chemical_group")
	private String chemicalGroup;
	@Column ( name = "state")
	private String state;
	public Elements(Long id, String elementName, String symbol, Integer atomicNumber, String chemicalGroup,
			String state) {
		super();
		this.id = id;
		this.elementName = elementName;
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
		this.chemicalGroup = chemicalGroup;
		this.state = state;
	}
	
	public Elements() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Integer getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(Integer atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public String getChemicalGroup() {
		return chemicalGroup;
	}
	public void setChemicalGroup(String chemicalGroup) {
		this.chemicalGroup = chemicalGroup;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
