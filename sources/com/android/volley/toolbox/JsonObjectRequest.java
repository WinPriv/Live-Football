package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.anythink.expressad.foundation.g.a;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JsonObjectRequest extends JsonRequest<JSONObject> {
    public JsonObjectRequest(String str, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONObject(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, a.bN))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e10) {
            return Response.error(new ParseError(e10));
        } catch (JSONException e11) {
            return Response.error(new ParseError(e11));
        }
    }

    @Deprecated
    public JsonObjectRequest(String str, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(jSONObject == null ? 0 : 1, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }

    public JsonObjectRequest(int i10, String str, JSONObject jSONObject, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(i10, str, jSONObject != null ? jSONObject.toString() : null, listener, errorListener);
    }
}
