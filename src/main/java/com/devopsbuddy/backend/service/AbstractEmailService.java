package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.to.address}")
	private String defaultToAddress;
	/**
	 * Creates a Simple Mail Message from the Feedback Pojo.
	 * @param feedback
	 * @return
	 */
	protected SimpleMailMessage prepareSimpleMailMessagefromFeedbackPojo(FeedbackPojo feedback) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(defaultToAddress);
		message.setFrom(feedback.getEmail());
		message.setSubject("[DevOps Buddy]: Feedback received from "
				+ feedback.getFirstName() + " "
				+ feedback.getLastName() + "!");
		message.setText(feedback.getFeedBack());
		return message;
	}
	
	@Override
	public void sendFeedbackEmail(FeedbackPojo feedbackPojo) {
		sendGenericEmailMessage(prepareSimpleMailMessagefromFeedbackPojo(feedbackPojo));
	}
	
}
