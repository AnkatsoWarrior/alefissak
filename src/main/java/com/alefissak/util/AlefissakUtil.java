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

package com.alefissak.util;

import com.alefissak.AlefissakNotImplementedYetException;
import com.alefissak.TimeInterval;

/**
 * @author Nabil
 */
public final class AlefissakUtil {

	/**
	 * Specifies the cron expression corresponding to the specified time
	 * interval
	 * 
	 * @param timeInterval specified time interval
	 * @return cron expression corresponding to it
	 * @throws AlefissakNotImplementedYetException 
	 */
	public static String getCronExpression(TimeInterval timeInterval) { // throws AlefissakNotImplementedYetException {

		// throw new AlefissakNotImplementedYetException();
		
		switch (timeInterval) {

		case SECONDLY:
			return "";

		case PER_MINUTE:
			return "";

		case HOURLY:
			return "";

		case DAYLY:
			return "";

		case WEEKLY:
			return "";

		case MONTHLY:
			return "";

		case YEARLY:
			return "";

		default:
			return null;

		}
	}
}
