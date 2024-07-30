package b9;

import android.os.Handler;
import com.android.volley.Response;
import com.hamkho.livefoot.Activities.SoccerLive.WatchActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WatchActivity.java */
/* loaded from: classes2.dex */
public final class a0 implements Response.Listener<JSONObject> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ WatchActivity f3134s;

    public a0(WatchActivity watchActivity) {
        this.f3134s = watchActivity;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        WatchActivity watchActivity = this.f3134s;
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("Cpa");
            watchActivity.f21497x = jSONObject3.getBoolean("UseCpa");
            watchActivity.f21498z = jSONObject3.getString("CpaCode");
            watchActivity.y = jSONObject3.getString("CpaLink");
            watchActivity.A = jSONObject3.getInt("ShowCpaAfter_InSecond");
            try {
                Handler handler = new Handler();
                watchActivity.D = handler;
                z zVar = new z(this);
                watchActivity.getClass();
                handler.postDelayed(zVar, watchActivity.A * 1000);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }
}
