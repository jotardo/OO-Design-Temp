package on_tap.cau2.controller;

import on_tap.cau2.model.TemperatureChecker;
import on_tap.cau2.view.View;

public class Controller {
	
	private TemperatureChecker model;
	private View view;
	
	public Controller(TemperatureChecker model) {
		this.model = model;
		this.view = new View(this);
		this.model.addSubscriber(view);
		this.model.notifySubscribersDrawView();
	}
	
	public void lowerFareheitTemp(int amount) {
		this.model.lowerFareheitTemp(amount);
	}
	
	public void raiseFareheitTemp(int amount) {
		this.model.raiseFareheitTemp(amount);
	}
	
	public void lowerCelciusTemp(int amount) {
		this.model.lowerCelciusTemp(amount);
	}
	
	public void raiseCelciusTemp(int amount) {
		this.model.raiseCelciusTemp(amount);
	}
	

}
