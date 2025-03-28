package edu.poly.duanjava6.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.duanjava6.service.SessionService;
import jakarta.servlet.http.HttpSession;

@Service
public class SessionServiceImpl implements SessionService {
	@Autowired
	HttpSession session;

	@Override
	public <T> T get(String name) {
		// TODO Auto-generated method stub
		return (T) session.getAttribute(name);
	}

	@Override
	public <T> T getValue(String name, T defaultValue) {
		T value = this.get(name);
		return value != null ? value : defaultValue;
	}

	@Override
	public void set(String name, Object value) {
		// TODO Auto-generated method stub
		session.setAttribute(name, value);
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		session.removeAttribute(name);
	}

}
