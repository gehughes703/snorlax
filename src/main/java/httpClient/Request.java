package httpClient;

import org.json.JSONObject;

public class Request {

	private String url;
	private JSONObject params;
	private JSONObject headers;
	private JSONObject body;
	
	public Request(String url) {
		this.url = url;
		params = null;
		headers = null;
		body = null;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setParams(JSONObject params) {
		this.params = params;
	}
	
	
	public void setHeaders(JSONObject headers) {
		this.headers = headers;
	}
	
	public void setBody(JSONObject body) {
		this.body = body;
	}
	
	public String url() {
		return url;
	}

	public JSONObject getParams() {
		return params;
	}
	
	public JSONObject getHeaders() {
		return headers;
	}
	
	public JSONObject getBody() {
		return body;
	}
}
