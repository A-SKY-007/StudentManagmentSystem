package Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

 @Entity
public class Student_dto {
	
	
		@Id
		int sid;
		
		@Column(nullable=false)
		String sname;
		
		@Column(nullable=false,unique=true)
		long smob;
		
		@Column(nullable=false,unique=true)
		String seid;

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public long getSmob() {
			return smob;
		}

		public void setSmob(long smob) {
			this.smob = smob;
		}

		public String getSeid() {
			return seid;
		}

		public void setSeid(String seid) {
			this.seid = seid;
		}

		@Override
		public String toString() {
			return "Student_dto [sid=" + sid + ", sname=" + sname + ", smob=" + smob + ", seid=" + seid + "]";
		}
		
		
		
	
}
