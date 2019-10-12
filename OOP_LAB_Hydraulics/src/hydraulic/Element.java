package hydraulic;
import hydraulic.HSystem;


/**
 * Represents the generic abstract element of an hydraulics system.
 * It is the base class for all elements.
 *
 * Any element can be connect to a downstream element
 * using the method {@link #connect(Element) connect()}.
 */
public class Element {
	private String nameElement;
	/**
	 * Constructor
	 * @param name the name of the element
	 */

	protected Element output;
	protected double outputFlow;
	public final static double NO_FLOW = Double.NaN;
	public Element(String name){
		this.nameElement=name;
	}

	/**
	 * getter method
	 * @return the name of the element
	 */
	public String getName(){
 		return nameElement;
	}
	
	/**
	 * Connects this element to a given element.
	 * The given element will be connected downstream of this element
	 * @param elem the element that will be placed downstream
	 */
	public void connect(Element elem){
 		output=elem;
	}
	
	/**
	 * Retrieves the element connected downstream of this
	 * @return downstream element
	 */
	public Element getOutput(){
 		return output;
	}
	
	public double getOutputFlow() {
		return outputFlow;
	}
	
	public void setOutputFlow(double o) {
		outputFlow=o;
	}
	
	public void calculateFlow(Element output,SimulationObserver observer) {
		
	}
	
	@Override
	public String toString() {
		
		String s= "["+this.getName()+"]"+this.getClass().getSimpleName();
		
		return s;
	}
	
	
}
