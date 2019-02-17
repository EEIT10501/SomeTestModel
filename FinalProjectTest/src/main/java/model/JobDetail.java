package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JobDetail {
	private Integer jobDetailId;
	private Boolean isCompany;
	private Boolean isLongTerm;
	private String description;
	private String other;
	private Boolean isRemote;
	private String address;
	private String addressSup;
	private String city;
	private String paidDate;
	private Integer rateByHour;
	private String phone;
	private String email;
	private String contact;
	private String industry;
	private Integer positionNum;
	private Job job;

	public JobDetail() {
	}

	public JobDetail(Integer jobDetailId, Boolean isCompany, Boolean isLongTerm, String description, String other,
			Boolean isRemote, String address, String addressSup, String city, String paidDate, Integer rateByHour,
			String phone, String email, String contact, String industry, Integer positionNum, Job job) {
		super();
		this.jobDetailId = jobDetailId;
		this.isCompany = isCompany;
		this.isLongTerm = isLongTerm;
		this.description = description;
		this.other = other;
		this.isRemote = isRemote;
		this.address = address;
		this.addressSup = addressSup;
		this.city = city;
		this.paidDate = paidDate;
		this.rateByHour = rateByHour;
		this.phone = phone;
		this.email = email;
		this.contact = contact;
		this.industry = industry;
		this.positionNum = positionNum;
		this.job = job;
	}

	@Override
	public String toString() {
		return "JobDetail [jobDetailId=" + jobDetailId + ", isCompany=" + isCompany + ", isLongTerm=" + isLongTerm
				+ ", description=" + description + ", other=" + other + ", isRemote=" + isRemote + ", address="
				+ address + ", addressSup=" + addressSup + ", city=" + city + ", paidDate=" + paidDate + ", rateByHour="
				+ rateByHour + ", phone=" + phone + ", email=" + email + ", contact=" + contact + ", industry="
				+ industry + ", positionNum=" + positionNum + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getJobDetailId() {
		return jobDetailId;
	}

	public void setJobDetailId(Integer jobDetailId) {
		this.jobDetailId = jobDetailId;
	}

	public Boolean getIsCompany() {
		return isCompany;
	}

	public void setIsCompany(Boolean isCompany) {
		this.isCompany = isCompany;
	}

	public Boolean getIsLongTerm() {
		return isLongTerm;
	}

	public void setIsLongTerm(Boolean isLongTerm) {
		this.isLongTerm = isLongTerm;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Boolean getIsRemote() {
		return isRemote;
	}

	public void setIsRemote(Boolean isRemote) {
		this.isRemote = isRemote;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressSup() {
		return addressSup;
	}

	public void setAddressSup(String addressSup) {
		this.addressSup = addressSup;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

	public Integer getRateByHour() {
		return rateByHour;
	}

	public void setRateByHour(Integer rateByHour) {
		this.rateByHour = rateByHour;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Integer getPositionNum() {
		return positionNum;
	}

	public void setPositionNum(Integer positionNum) {
		this.positionNum = positionNum;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_Job_Id")
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}
