package ch.hsr.faith.domain;

import ch.hsr.faith.domain.Facility;

public class FacilityWithDistance extends Facility implements Comparable<FacilityWithDistance>{

	private static final long serialVersionUID = 173716915929277864L;
	
	private int distance;
	
	public FacilityWithDistance() {
		
	}
	
	public FacilityWithDistance(Facility facility, int distance) {
		super(facility);
		this.distance = distance;
	} 

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(FacilityWithDistance other) {
		return getDistance().compareTo(other.getDistance());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + distance;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacilityWithDistance other = (FacilityWithDistance) obj;
		if (distance != other.distance)
			return false;
		return super.equals(obj);
	}
	
	

}
