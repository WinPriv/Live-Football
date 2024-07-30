package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.anythink.expressad.foundation.g.a;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class JsonArrayRequest extends JsonRequest<JSONArray> {
    public JsonArrayRequest(String str, Response.Listener<JSONArray> listener, Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    public Response<JSONArray> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONArray(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, a.bN))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e10) {
            return Response.error(new ParseError(e10));
        } catch (JSONException e11) {
            return Response.error(new ParseError(e11));
        }
    }

    public JsonArrayRequest(int i10, String str, JSONArray jSONArray, Response.Listener<JSONArray> listener, Response.ErrorListener errorListener) {
        super(i10, str, jSONArray != null ? jSONArray.toString() : null, listener, errorListener);
    }
}
