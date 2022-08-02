package com.BL.Exception;

public class MoodAnalyser2 {
	private String msg;

	public MoodAnalyser2() {
	}

	public MoodAnalyser2(String msg) {
		this.msg = msg;
	}

	public String analyzeMood() {
		try {
			if (msg.contains("Sad")) {
				return "Sad";
			}
			return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}
	}
}
