
/**
 * Copyright 2014 - Nabil Andriantomanga.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

/**
 * @author Nabil
 */
public abstract class Message {

	protected String object;	// Object of the message
	
	protected String content;	// Content of the message to send 

	
	/**
	 * The description of the style of the message
	 * 
	 * @return the style of the message
	 */
	public abstract String getDescription();
	
	
	public static class MessageStyle {
		
		// Using a default style
		public static final String SIMPLE_MESSAGE 	= "Simple message";
		
		
		// Using a style featuring blue content of the message sent
		public static final String BLUE_MESSAGE 	= "Blue message";
	}
	
	
	/**
	 * Getter method for the object attribute
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	
	/**
	 * Setter method for the object attribute
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	
	/**
	 * Getter method for the content attribute
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	
	/**
	 * Setter method for the content attribute
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
}
