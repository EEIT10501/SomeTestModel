package model;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CompanyDetail {

	private Integer companyDetailId;
	private String siteTitle;
	private String description;
	private String address;
	private Blob coverPic;
	private Blob logo;
	private Company company;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCompanyDetailId() {
		return companyDetailId;
	}

	public void setCompanyDetailId(Integer companyDetailId) {
		this.companyDetailId = companyDetailId;
	}

	public String getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Blob getCoverPic() {
		return coverPic;
	}

	public void setCoverPic(Blob coverPic) {
		this.coverPic = coverPic;
	}

	public Blob getLogo() {
		return logo;
	}

	public void setLogo(Blob logo) {
		this.logo = logo;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_Company_Id")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
