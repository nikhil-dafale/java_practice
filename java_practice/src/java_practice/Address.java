package java_practice;

public class Address {
		private short door;
		private String building;
		private String landmark;
		private String taluka;
		private String district;
		private String state;
		private short pincode;
		private Boolean Rented;
		
		public short getDoor() {
			return door;
		}
		public void setDoor (int door) {
			this.door=(short) door;
		}

		public String getBuilding() {
			return building;
		}

		public void setBuilding(String building) {
			this.building = building;
		}

		public String getLandmark() {
			return landmark;
		}

		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}

		public String getTaluka() {
			return taluka;
		}

		public void setTaluka(String taluka) {
			this.taluka = taluka;
		}

		public String getDistrict() {
			return district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		public short getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode =(short) pincode;
		}
		public Boolean getRented() {
			return Rented;
		}
		public void setRented(Boolean rented) {
			Rented = rented;
		}
		
}
