package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softsoldesk.beans.DataBean;

@RestController
public class RestTestController {

	/*
	@GetMapping("/test2")
	public String test2() {
		
		return "test2"; 
		//RestController는 컨트롤러와 다르게, json 데이터 자체를 반환한다. 
		//반환 주소 : http://localhost:9021/RestfulAPI/test2  
		//---cf) Controller는 jsp를 반환한다. 
	}
	*/
	
	
	//response할때, entity(개체)에 붙여 응답을 하되, ArrayList를 붙일것이고, ArrayList의 데이터형은 DataBean
	@GetMapping("/test2")
	public ResponseEntity<ArrayList<DataBean>> test2() {
		
		DataBean bean1=new DataBean("문자열1", 100, 11.11, false);
		DataBean bean2=new DataBean("문자열2", 200, 22.22, false);
		DataBean bean3=new DataBean("문자열3", 300, 33.33, false);
		
		//DataBean 자료형의 ArrayList
		
		ArrayList<DataBean> list=new ArrayList<DataBean>();
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		
		//web에서 JSON으로 변환 ====pom에 api 추가해놨으므로 가능
		//list를 변환할것인데, Http를 통해 변환.
		
		ResponseEntity<ArrayList<DataBean>> entry=new ResponseEntity<ArrayList<DataBean>>(list,HttpStatus.OK);
		
		
		return entry; 
	}
	
	
}
