package ch.hsr.faith.domain;

import java.util.HashMap;
import java.util.Map;

public class MultilingualString implements BaseEntity {

	private static final long serialVersionUID = 8734009554250887187L;

	private Long id;
	private Map<String, LocalizedString> localizedStringMap = new HashMap<String, LocalizedString>();

	public MultilingualString() {
	}

	public MultilingualString(FAITHLocale locale, String text) {
		addText(locale, text);
	}

	public void addText(FAITHLocale locale, String text) {
		localizedStringMap.put(locale.getCode(), new LocalizedString(locale.getLocale(), text));
	}

	public String getText(FAITHLocale locale) {
		if (localizedStringMap.containsKey(locale.getCode())) {
			return localizedStringMap.get(locale.getCode()).getText();
		}
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<String, LocalizedString> getLocalizedStringMap() {
		return localizedStringMap;
	}

	public void setLocalizedStringMap(Map<String, LocalizedString> map) {
		this.localizedStringMap = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((localizedStringMap == null) ? 0 : localizedStringMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MultilingualString other = (MultilingualString) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localizedStringMap == null) {
			if (other.localizedStringMap != null)
				return false;
		} else if (!localizedStringMap.equals(other.localizedStringMap))
			return false;
		return true;
	}

}
