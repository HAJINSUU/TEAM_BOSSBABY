package com.wheresming.pick;

import lombok.Getter;

@Getter
public class UploadPickListDTO {

	private String mb_id;
	private String fd_name;
	
	public UploadPickListDTO(String mb_id, String fd_name) {
		super();
		this.mb_id = mb_id;
		this.fd_name = fd_name;
	}
	
}
