package ru.MyTest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roman.speransky on 7/4/16.
 */
public class AttachText {
    JsonParser parser = new JsonParser();

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveAttachText(String attachName, String message) {
        return message;
    }

    public List<String> prettyList(String bodyJson) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = parser.parse(bodyJson);
        String prettyJsonString = gson.toJson(je);
        List<String> prettyJsonList = Arrays.asList(prettyJsonString);
        return prettyJsonList;
    }

    public String pretty(String bodyJson) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = parser.parse(bodyJson);
        String prettyJsonString = gson.toJson(je);
        return prettyJsonString;
    }

    public void saveTextLog(String requestBody, String bodyJson) {
        saveAttachText("request", requestBody);
        saveAttachText("response", pretty(bodyJson));
    }
}


