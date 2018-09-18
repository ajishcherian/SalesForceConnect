package org.mycompany;

import java.io.IOException;

import org.apache.camel.salesforce.dto.Account;
import org.apache.camel.salesforce.dto.Cheese__c;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {
	
	private static final ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
//        MAPPER.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    private JsonHelper() {
    }

    public static Account readAccount(String contents) throws IOException {
        return (Account) MAPPER.readValue(contents, Account.class);
    }

    public static Cheese__c readFile(String contents) throws IOException {
        return (Cheese__c) MAPPER.readValue(contents, Cheese__c.class);
    }
}
