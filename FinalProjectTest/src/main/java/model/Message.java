package model;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message {
	private Integer messageId;
	private Blob transmitterImage;
	private Blob receiverImage;
	private Integer transmitterUserId;
	private Integer receiverUserId;
	private String messageContent;
	private Timestamp time;
	private Application application;

	public Message() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Blob getTransmitterImage() {
		return transmitterImage;
	}

	public void setTransmitterImage(Blob transmitterImage) {
		this.transmitterImage = transmitterImage;
	}

	public Blob getReceiverImage() {
		return receiverImage;
	}

	public void setReceiverImage(Blob receiverImage) {
		this.receiverImage = receiverImage;
	}

	public Integer getTransmitterUserId() {
		return transmitterUserId;
	}

	public void setTransmitterUserId(Integer transmitterUserId) {
		this.transmitterUserId = transmitterUserId;
	}

	public Integer getReceiverUserId() {
		return receiverUserId;
	}

	public void setReceiverUserId(Integer receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_Application_Id")
	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}
