package com.invengo.train.rfid.tag;

/**
 * 未知标签
 * Created by ziniulian on 2017/10/16.
 */

public class TagUn extends BaseTag {
	private String memo = null;

	public TagUn () {}
	public TagUn (String m) {
		this.memo = m;
	}

	@Override
	protected void parseByCod(String cod) {
	}

	@Override
	public String toJson() {
		StringBuilder s = new StringBuilder();
		s.append("{\n\t\"cod\":\"");
		s.append(getCod());
		s.append("\",\n\t\"pro\":{\"src\":\"?\",\"nam\":\"标签类型不符");
		if (this.memo != null) {
			s.append("\",\"memo\":\"");
			s.append(this.memo);
		}
		s.append("\"}\n}");
		return s.toString();
	}
}
