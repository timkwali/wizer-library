package com.wizer.wizerlibrary.payload.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

@Data
@JsonPropertyOrder({
		"success",
		"message"
})
public class ApiResponse implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 7702134516418120340L;

	@JsonProperty("success")
	private Boolean success;

	@JsonProperty("message")
	private String message;

	@JsonIgnore
	private HttpStatus status;

	private List<?> data;

	public ApiResponse(Boolean success, String message) {
		this.success = success;
		this.message = message;
	}
//	public ApiResponse(List<GameCategory> data, String message, HttpStatus status) {
//		this.status = status;
//		this.message = message;
//		this.data = (List<GameCategory>) data;
//	}
//
//	public ApiResponse(List<GameTransactions> data) {
//		this.data = (List<GameTransactions>) data;
//
//	}
//	public ApiResponse(List<Game> data, HttpStatus status) {
//		this.status = status;
//		this.data = (List<Game>) data;
//	}


}
