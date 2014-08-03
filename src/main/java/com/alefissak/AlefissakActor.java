
/**
 * Copyright 2014 - Nabil Andriantomanga.
 *
 * Licensed under the Apache License, 
 * Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alefissak;

public abstract class AlefissakActor {

	protected long id;		// Identification of the actor
	
	protected String name;	// Name of the actor
	
	protected String mail;	// Mail of the actor 

	
	/**
	 * Constructor of {@link com.alefissak.AlefissakActor}
	 *
	 * @param name
	 * @param mail
	 */
	public AlefissakActor(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}


	/**
	 * Constructor of {@link com.alefissak.AlefissakActor}
	 *
	 */
	public AlefissakActor() {
		super();
	}


	/**
	 * Getter method for the id attribute
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter method for the id attribute
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter method for the name attribute
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for the name attribute
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for the mail attribute
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Setter method for the mail attribute
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlefissakActor other = (AlefissakActor) obj;
		if (id != other.id)
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
