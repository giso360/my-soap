package com.example.soap.endpoint;



import com.example.soap.pojos.GetCourseRequest;
import com.example.soap.pojos.GetCourseResponse;
import com.example.soap.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseEndpoint {

	private static final String NAMESPACE_URI = "http://example.com/soap/pojos/";

	@Autowired
	private CourseService courseService;

	@PayloadRoot(namespace = NAMESPACE_URI,	localPart = "getCourseRequest")
	@ResponsePayload
	public GetCourseResponse getCourseRequest(@RequestPayload GetCourseRequest request) {

		GetCourseResponse response = new GetCourseResponse();

		response.setCourse(courseService.getCourse(request.getId()));

		return response;

	}

}
