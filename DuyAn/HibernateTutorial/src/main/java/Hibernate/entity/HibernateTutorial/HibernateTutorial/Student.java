package Hibernate.entity.HibernateTutorial.HibernateTutorial;
// Generated Aug 31, 2017 2:40:18 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "students")
public class Student implements java.io.Serializable {

	private int idStudents;
	private String addressStudents;
	private Date dateStudents;
	private String nametudents;
	private String sex;

	public Student() {
	}

	public Student(int idStudents, String addressStudents, Date dateStudents, String nametudents, String sex) {
		this.idStudents = idStudents;
		this.addressStudents = addressStudents;
		this.dateStudents = dateStudents;
		this.nametudents = nametudents;
		this.sex = sex;
	}

	@Id

	@Column(name = "idStudents", nullable = false)
	public int getIdStudents() {
		return this.idStudents;
	}

	public void setIdStudents(int idStudents) {
		this.idStudents = idStudents;
	}

	@Column(name = "AddressStudents", nullable = false, length = 100)
	public String getAddressStudents() {
		return this.addressStudents;
	}

	public void setAddressStudents(String addressStudents) {
		this.addressStudents = addressStudents;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DateStudents", nullable = false)
	public Date getDateStudents() {
		return this.dateStudents;
	}

	public void setDateStudents(Date dateStudents) {
		this.dateStudents = dateStudents;
	}

	@Column(name = "NameStudents", nullable = false, length = 45)
	public String getNametudents() {
		return this.nametudents;
	}

	public void setNametudents(String nametudents) {
		this.nametudents = nametudents;
	}

	@Column(name = "Sex", nullable = false, length = 7)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
