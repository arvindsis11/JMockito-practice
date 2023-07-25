package com.arvind.jmockito.service;

import java.util.HashMap;
import java.util.Map;

import com.arvind.jmockito.model.Profile;
import com.arvind.jmockito.validationutil.InputValidation;


public class RewardService {
	
//	InputValidation validate;

	public Map<Double, String> getReward(String paymentType, String currency) {
		int point = 0;
		Map userProfile = getProfile();
		String pointStr = (String) userProfile.get("points");
		point = Integer.parseInt(pointStr);
		if (point <= 0) {
			return null;
		}
		double pointsCurrency = 0;
		if (currency.equalsIgnoreCase("usd")) {
			pointsCurrency = point * 0.7;
		}
		if (currency.equalsIgnoreCase("inr")) {
			pointsCurrency = point * 2;
		}
		Map<Double, String> txn = new HashMap<>();
		txn.put(pointsCurrency, currency);
		return txn;
	}

	public Map getProfile() {
		Map<String, String> profile = new HashMap<>();
		profile.put("name", "arvind");
		profile.put("points", "1000");
		return profile;

	}
	
	public Map enterProfileData(Profile profile) {
		Map<String, String> mp = new HashMap<>();
		mp.put("arvind", "1000");
		return mp;
	}
	

}
