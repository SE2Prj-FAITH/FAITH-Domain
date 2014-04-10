package ch.hsr.faith.domain;

public enum FAITHLocale {

	GERMAN("de", "Deutsch"), ENGLISH("en", "English"), FRENCH("fr", "Français"), ITALIAN("it", "Italiano");

	private String code;
	private String locale;

	private FAITHLocale(String code, String locale) {
		this.code = code;
		this.locale = locale;
	}

	public String getCode() {
		return code;
	}

	public String getLocale() {
		return locale;
	}

	@Override
	public String toString() {
		return code;
	}
}
