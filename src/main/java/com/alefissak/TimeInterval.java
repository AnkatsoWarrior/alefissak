
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
public enum TimeInterval {

	SECONDLY,	// the task will be executed secondly
	
	PER_MINUTE,	// the task will be executed per minute
	
	HOURLY,		// the task will be executed hourly
	
	DAYLY,		// the task will be executed dayly
	
	WEEKLY,		// the task will be executed weekly
	
	MONTHLY,	// the task will be executed monthly
	
	YEARLY, 	// the task will be executed yearly
	
	CUSTOM;		// the task will be executed according to the defined 
				// cron expression
}
