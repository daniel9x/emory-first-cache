package edu.emory.first.cache.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class JSONPRequestFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if (!(request instanceof HttpServletRequest)) {
			throw new ServletException("This filter can " +
					" only process HttpServletRequest requests");
		}

		HttpServletRequest httpRequest = (HttpServletRequest) request;

		if (isJSONPRequest(httpRequest)) {
			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper((HttpServletResponse) response) {

				@Override
				public ServletOutputStream getOutputStream() throws IOException {
					return new ServletOutputStream() {
						@Override
						public void write(int b) throws IOException {
							baos.write(b);
						}
					};
				}
			};

			responseWrapper.setContentType("text/javascript");
			chain.doFilter(request, responseWrapper);
			response.getOutputStream().write(baos.toByteArray());

			response.setContentType("text/javascript");
		}
		else {
			chain.doFilter(request, response);
		}
	}

	private String getCallbackMethod(HttpServletRequest httpRequest) {
		return httpRequest.getParameter("callback");
	}

	private boolean isJSONPRequest(HttpServletRequest httpRequest) {
		String callbackMethod = getCallbackMethod(httpRequest);
		return (callbackMethod != null && callbackMethod.length() > 0);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
