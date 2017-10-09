/**
 * 
 */
package com.almundo.callcenter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

// TODO: Auto-generated Javadoc
/**
 * The Class Operator.
 * Clase Entity para Persistencia de Datos
 * @author Omar
 */

@Entity
@Table(name = "operator")
public class Operator {

	/** The id. */
	@Id
	@Column(name = "id")
	private int id;

	/** The name. */
	@Column(name = "name")
	private String name;

	/** The position. */
	@Column(name = "position")
	private String position;

	/** The available. */
	@Column(name = "available")
	@Type(type="true_false")
	private boolean available;

	/** The last contact. */
	@Column(name = "lastContact")
	private Date lastContact;

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
	
}
