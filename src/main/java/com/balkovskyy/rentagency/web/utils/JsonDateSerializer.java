package com.balkovskyy.rentagency.web.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonDateSerializer extends JsonSerializer<Date> {

	public static final String DEFAULT_DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";

	private String dateFormat;

	public JsonDateSerializer() {
		this(DEFAULT_DATE_FORMAT);
	}

	public JsonDateSerializer(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2) throws IOException {
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		String formattedDate = formatter.format(value);

		gen.writeString(formattedDate);
	}
}
