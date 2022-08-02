package com.BL.Exception;

/* @Purpose : Ability to analyser mood and respond either happy or sad
 */
public class MoodAnalyser {
	private String msg;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String msg) {
		this.msg = msg;
	}

	public String analyzeMood() throws MoodAnalysisException {
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
