package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DateUtil {

	private static final String DATE_PATTERN = "yyyy-MM-dd";

	private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_PATTERN);

	// date to string
	public static String format(Date date) {
		if (date == null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}

	// localdate to string
	public static String formatLoaclDate(LocalDate date) {
		if (date == null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}

	// string to date
	public static Date parse(String dateString) {
		try {
			return DATE_FORMATTER.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	// 判断输入是否符合格式
	public static boolean validDate(String dateString) {
		return DateUtil.parse(dateString) != null;
	}
}
