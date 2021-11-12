package services;

import api.model.TimeEntryResponse;
import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class TimeEntryService extends  BaseService {
    public static Response get(String jsonName) {
        return get(jsonName, TimeEntryResponse[].class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("api-key",API_KEY.get());
        params.put("workspaceId",ID_WORKSPACE.get());
        params.put("userId",USER_ID.get());
        return params;
    }

}
