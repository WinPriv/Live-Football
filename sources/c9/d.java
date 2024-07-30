package c9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.facebook.shimmer.ShimmerFrameLayout;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventsFragment.java */
/* loaded from: classes2.dex */
public final class d implements Response.Listener<JSONObject> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f3467s;

    public d(f fVar) {
        this.f3467s = fVar;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        f fVar = this.f3467s;
        try {
            JSONArray jSONArray = jSONObject2.getJSONArray("Events");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String optString = jSONObject3.optString("FirstTeamLogo");
                    String optString2 = jSONObject3.optString("SecondTeamLogo");
                    String optString3 = jSONObject3.optString("FirstTeamName");
                    String optString4 = jSONObject3.optString("SecondTeamName");
                    String optString5 = jSONObject3.optString("EventDescription");
                    String optString6 = jSONObject3.optString("MatchTime");
                    fVar.f3469t.add(new k9.c(jSONObject3.optString("MatchLink"), optString, optString3, optString6, jSONObject3.optString("Play_In"), optString2, optString4, optString5));
                    ((ShimmerFrameLayout) fVar.f3468s.f2570t).b();
                    ((ShimmerFrameLayout) fVar.f3468s.f2570t).setVisibility(8);
                    RecyclerView recyclerView = (RecyclerView) fVar.f3468s.f2571u;
                    fVar.requireContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) fVar.f3468s.f2571u).setAdapter(new e9.d(fVar.requireActivity(), fVar.f3469t));
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }
}
