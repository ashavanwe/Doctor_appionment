package com.example.test.service;

import java.text.ParseException;

import javax.mail.MessagingException;

import com.example.test.model.DoctorsAppointment;
import com.example.test.util.BaseResponse;

public interface DoctorAppointmentInterface {

	public BaseResponse<DoctorsAppointment> saveDetails(DoctorsAppointment doctorsAppointment);
	
	public BaseResponse<DoctorsAppointment> sendMail(String date,String value) throws ParseException, MessagingException;
}
