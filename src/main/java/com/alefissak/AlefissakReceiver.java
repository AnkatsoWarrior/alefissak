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

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nabil
 */
public class AlefissakReceiver extends AlefissakActor {

	private Map<String, String> planningVariables = new HashMap<String, String>();

	/**
	 * Adds a new variable (key / value) to the object
	 * 
	 * @param key key corresponding to the variable
	 * @param value value corresponding to the variable 
	 */
	public void addPlanningVariable(String key, String value) {

		planningVariables.put(key, value);
	}

	/**
	 * Deletes the variable whose key is specified
	 * 
	 * @param key key corresponding to the variable
	 */
	public void removePlanningVariables(String key) {

		planningVariables.remove(key);
	}

	/**
	 * Will display all supported variables
	 */
	public void displayPlanningVariables() {

		for (Map.Entry<String, String> entry : planningVariables.entrySet()) {

			System.out.println(entry.getKey() + " = " + entry.getValue());

		}
	}
	
	
	/**
	 * Will delete all variables supported
	 */
	public void clearPlanningVariables() {
		
		planningVariables.clear();
	}

	
	/**
	 * Indicates whether the variable is defined among the variables taken into account by the object
	 * 
	 * @param key key corresponding to the variable
	 * @return true if exits
	 */
	public boolean hasPlanningVariables(String key) {
		
		return planningVariables.containsKey(key);
	}
}
