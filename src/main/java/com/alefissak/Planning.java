
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

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author Nabil
 */
public class Planning {

	private TimeInterval timeInterval;
	
	private Date startTime;
	
	private Date endTime;
	
	private String cronExpression;
	
	private Message message;
	
	private List<AlefissakReceiver> receivers;
	

	/**
	 * Constructor of {@link com.alefissak.Planning}
	 *
	 */
	public Planning() {
		super();
		receivers = new ArrayList<AlefissakReceiver>();
	}

	
	public void addReceiver(AlefissakReceiver receiver) {
		receivers.add(receiver);
	}
	
	
	public void removeReceiver(AlefissakReceiver receiver) {
		receivers.remove(receiver);
	}
	
	public boolean hasReceiver(AlefissakReceiver receiver) {
		return receivers.contains(receiver);
	}
	
	public void clearReceivers() {
		receivers.clear();
	}
	
	public void displayReceivers() {
		for(Iterator<AlefissakReceiver> iter = receivers.iterator(); iter.hasNext(); ) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * Getter method for the timeInterval attribute
	 * @return the timeInterval
	 */
	public TimeInterval getTimeInterval() {
		return timeInterval;
	}

	/**
	 * Setter method for the timeInterval attribute
	 * @param timeInterval the timeInterval to set
	 */
	public void setTimeInterval(TimeInterval timeInterval) {
		this.timeInterval = timeInterval;
	}

	/**
	 * Getter method for the startTime attribute
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	
	/**
	 * Getter method for the message attribute
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}


	/**
	 * Setter method for the message attribute
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
	}


	/**
	 * Getter method for the receivers attribute
	 * @return the receivers
	 */
	public List<AlefissakReceiver> getReceivers() {
		return receivers;
	}


	/**
	 * Setter method for the startTime attribute
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * Getter method for the endTime attribute
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * Setter method for the endTime attribute
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * Getter method for the cronExpression attribute
	 * @return the cronExpression
	 */
	public String getCronExpression() {
		return cronExpression;
	}

	/**
	 * Setter method for the cronExpression attribute
	 * @param cronExpression the cronExpression to set
	 */
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
	
}
