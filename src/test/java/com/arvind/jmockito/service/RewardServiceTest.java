package com.arvind.jmockito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.arvind.jmockito.model.Profile;

class RewardServiceTest {

	@Test
	void testGetReward_valid_inr() {
		RewardService rservice = new RewardService();
		Map<Double, String> res = rservice.getReward("paytm", "inr");
		Map<Double, String> expected = new HashMap<>();
		expected.put(2000.0, "inr");
		assertEquals(expected, res);
	}

	@Test
	void testGetReward_valid_usd() {
		RewardService rservice = new RewardService();
		Map<Double, String> res = rservice.getReward("paytm", "usd");
		Map<Double, String> expected = new HashMap<>();
		expected.put(700.0, "usd");
		assertEquals(expected, res);
	}

	@Test
	void testGetReward_invalid_usd() {
//		RewardService rservice = new RewardService();
		RewardService rservice = spy(RewardService.class);
		Map<String, String> profile = new HashMap<>();
		profile.put("name", "arvind");
		profile.put("points", "0");
		when(rservice.getProfile()).thenReturn(profile);
		Map<Double, String> res = rservice.getReward("paytm", "usd");
		Map<Double,String> expected = new HashMap<>();
		 expected.put(700.0, "usd");
		 assertEquals(expected,res);
	}
	 @Test
	    void testGetRewardWithZeroPoints() {
	        RewardService rewardService = spy(RewardService.class);
	        Map<String, String> userProfile = new HashMap<>();
	        userProfile.put("name", "arvind");
	        userProfile.put("points", "0");
	        when(rewardService.getProfile()).thenReturn(userProfile);

	        // Test getReward method with zero points
	        Map<Double, String> reward = rewardService.getReward("paymentType", "USD");

	        assertNull(reward);
	    }


	@Test
	void testEnterProfileData() {
		Profile pr = new Profile("arvind", "1000");
		RewardService rservice = new RewardService();
		Map enterProfileData = rservice.enterProfileData(pr);
		Map<String, String> expected = new HashMap<>();
		expected.put("arvind", "1000");
		assertEquals(expected, enterProfileData);
	}
//
//	@Test
//	void testGetProfile() {
//		fail("Not yet implemented");
//	}

}
