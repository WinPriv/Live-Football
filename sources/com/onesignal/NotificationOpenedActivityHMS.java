package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NotificationOpenedActivityHMS extends Activity {
    public final void a() {
        JSONObject a10;
        Intent intent = getIntent();
        e3.y(getApplicationContext());
        if (intent != null) {
            if (!c3.m(intent.getExtras())) {
                a10 = null;
            } else {
                a10 = e0.a(intent.getExtras());
                try {
                    String str = (String) new JSONObject(a10.optString("custom")).remove("actionId");
                    if (str != null) {
                        a10.put("actionId", str);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            if (a10 != null && !c3.o(this, a10)) {
                e3.v(this, new JSONArray().put(a10), c3.g(a10));
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a();
    }
}
