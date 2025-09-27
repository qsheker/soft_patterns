package Adapter.target;

import org.json.JSONObject;
import java.io.File;
import java.io.IOException;

public interface Target {
    void toJson(File file) throws IOException;
    void toXml(JSONObject json);
}
