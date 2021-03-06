/**
 * Project Name:CodeStore
 * File Name:Code.java
 * Package Name:info.zhaijm2014.tools.codestore.things
 * Date:2014年7月7日下午11:24:04
 * Copyright (c) 2014, chenzhou1025@126.com All Rights Reserved.
 *
 */

package info.zhaijm2014.tools.codestore.things;

/**
 * ClassName:Code <br/>
 * Date: 2014年7月7日 下午11:24:04 <br/>
 * 
 * @author zhaijm
 * @version 0
 * @since JDK 1.6
 * @see
 */
public class Code {
	private String text;
	private String textType;
	private String textStyle;

	/**
	 * format:格式化代码 <br/>
	 * 若未指定textStyle，默认按照纯文本格式。<br/>
	 *
	 * @author zhaijm
	 * @since JDK 1.6
	 */
	public void format() {

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextType() {
		return textType;
	}

	public void setTextType(String textType) {
		this.textType = textType;
	}

	public String getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(String textStyle) {
		this.textStyle = textStyle;
	}

}
