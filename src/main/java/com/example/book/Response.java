package com.example.book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Scope(value = "prototype")
@JsonIgnoreProperties(value="true")
public class Response {

	private String status;
	private Object data;
	private String error;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", data=" + data + ", error=" + error + "]";
	}

}
