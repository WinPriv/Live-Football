package b9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelsListActivity;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChannelsListActivity.java */
/* loaded from: classes2.dex */
public final class k implements Response.Listener<JSONObject> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ChannelsListActivity f3152s;

    public k(ChannelsListActivity channelsListActivity) {
        this.f3152s = channelsListActivity;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        ChannelsListActivity channelsListActivity = this.f3152s;
        try {
            JSONArray jSONArray = jSONObject2.getJSONArray("Categories").getJSONObject(channelsListActivity.f21480u).getJSONArray("ChannelsList");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string = jSONObject3.getString("ChannelName");
                    String string2 = jSONObject3.getString("ChannelLink");
                    String string3 = jSONObject3.getString("ChannelLogo");
                    String string4 = jSONObject3.getString("ChannelDescription");
                    String string5 = jSONObject3.getString("Play_In");
                    ArrayList arrayList = channelsListActivity.f21479t;
                    arrayList.add(new k9.b(string2, string, string3, string4, string5));
                    ((ShimmerFrameLayout) channelsListActivity.f21478s.f36977x).b();
                    ((ShimmerFrameLayout) channelsListActivity.f21478s.f36977x).setVisibility(8);
                    ((RecyclerView) channelsListActivity.f21478s.f36976w).setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) channelsListActivity.f21478s.f36976w).setAdapter(new e9.c(channelsListActivity, arrayList));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }
}
