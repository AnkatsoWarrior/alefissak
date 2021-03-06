
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
public abstract class AlefissakMessageDecorator extends Message {

	protected Message message; 	// the message to be decorated
	
	
	/**
	 * Constructor of {@link com.alefissak.AlefissakMessageDecorator}
	 *
	 * @param message
	 */
	public AlefissakMessageDecorator(Message message) {
		super();
		this.message = message;
	}


	@Override
	public String getDescription() {
	
		return "Decorator of message object";
	}

	@Override
	public abstract String getContent();
}
