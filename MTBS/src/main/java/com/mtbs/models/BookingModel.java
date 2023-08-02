package com.mtbs.models;

import java.util.Set;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class BookingModel {

	private int theaterId;
	
	private int branchId;
	
	private int screenId;
	
    private Set<Integer> seatIds;
 
    private User user;

	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public Set<Integer> getSeatIds() {
		return seatIds;
	}

	public void setSeatIds(Set<Integer> seatIds) {
		this.seatIds = seatIds;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
