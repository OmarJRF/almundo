/**
 * 
 */
package com.almundo.callcenter.model;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class OperatorModel.
 * Clase Model para procesar e integrar datos para el FontEnd
 * @author Omar
 */
public class OperatorModel {

	/** The id. */
	private int id;
	
	/** The name. */
	private String name;
	
	/** The position. */
	private String position;
	
	/** The available. */
	private boolean available;
	
	/** The last contact. */
	private Date lastContact;
	
	/** The num contact. */
	private int numContact;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	
	/**
	 * Sets the position.
	 *
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	/**
	 * Checks if is available.
	 *
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	
	/**
	 * Sets the available.
	 *
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	/**
	 * Gets the last contact.
	 *
	 * @return the lastContact
	 */
	public Date getLastContact() {
		return lastContact;
	}
	
	/**
	 * Sets the last contact.
	 *
	 * @param lastContact the lastContact to set
	 */
	public void setLastContact(Date lastContact) {
		this.lastContact = lastContact;
	}
	
	/**
	 * Gets the num contact.
	 *
	 * @return the numContact
	 */
	public int getNumContact() {
		return numContact;
	}
	
	/**
	 * Sets the num contact.
	 *
	 * @param numContact the numContact to set
	 */
	public void setNumContact(int numContact) {
		this.numContact = numContact;
	}
	
	/**
	 * Instantiates a new operator model.
	 */
	public OperatorModel() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OperatorModel [id=" + id + ", name=" + name + ", position=" + position + ", available=" + available
				+ ", lastContact=" + lastContact + ", numContact=" + numContact + "]";
	}
	
	
	
	
}
