package io.github.luversof.scdf.sink.data.jpa.convert;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.util.CollectionUtils;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {
    private static final String SPLIT_CHAR = ";";

    @Override
    public String convertToDatabaseColumn(List<String> stringList) {
    	if (CollectionUtils.isEmpty(stringList)) {
    		return null;
    	}
        return String.join(SPLIT_CHAR, stringList);
    }

    @Override
    public List<String> convertToEntityAttribute(String string) {
    	if (string == null) {
    		return Collections.emptyList();
    	}
        return Arrays.asList(string.split(SPLIT_CHAR));
    }
}