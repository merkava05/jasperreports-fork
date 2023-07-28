/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2023 Cloud Software Group, Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.components.headertoolbar.actions;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

import net.sf.jasperreports.components.sort.AbstractFieldComparator;
import net.sf.jasperreports.components.sort.FieldComparatorFactory;
import net.sf.jasperreports.components.sort.FilterTypesEnum;
import net.sf.jasperreports.engine.JRConstants;


/**
 * @author Narcis Marcu (narcism@users.sourceforge.net)
 */
public class FormatCondition implements Serializable {

	private static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	private String conditionStart;
	private String conditionEnd;
	private String conditionTypeOperator;

	private String conditionMode;


	/*
	* 	Refactoring:
	* 	move 5 font related variables and getter/setter to a new class FormatCondition.java
	* 	Should also modify HeaderToolbarConditionalStyleProvider.java
	* */
	private FontCondition conditionFont;

	public FontCondition getConditionFont() {
		return conditionFont;
	}

	public void setConditionFont(FontCondition conditionFont) {
		this.conditionFont = conditionFont;
	}

	public FormatCondition() {
	}

	public String getConditionStart() {
		return conditionStart;
	}

	public void setConditionStart(String conditionStart) {
		this.conditionStart = conditionStart;
	}

	public String getConditionEnd() {
		return conditionEnd;
	}

	public void setConditionEnd(String conditionEnd) {
		this.conditionEnd = conditionEnd;
	}

	public String getConditionTypeOperator() {
		return conditionTypeOperator;
	}

	public void setConditionTypeOperator(String conditionTypeOperator) {
		this.conditionTypeOperator = conditionTypeOperator;
	}



	public String getConditionMode() {
		return conditionMode;
	}

	public void setConditionMode(String conditionMode) {
		this.conditionMode = conditionMode;
	}

	public boolean matches(
			Object compareTo,
			String conditionType,
			String conditionPattern,
			String conditionTypeOperator,
			Locale locale,
			TimeZone timeZone
	)
	{
		AbstractFieldComparator<?> fieldComparator =
				FieldComparatorFactory
						.createFieldComparator(
								FilterTypesEnum.getByName(conditionType),
								conditionPattern,
								locale,
								timeZone
						);

		fieldComparator.setValueStart(conditionStart);
		fieldComparator.setValueEnd(conditionEnd);
		fieldComparator.setCompareTo(compareTo);
		fieldComparator.setCompareToClass(compareTo != null ? compareTo.getClass() : Object.class);

		return fieldComparator.compare(conditionTypeOperator);
	}

}
