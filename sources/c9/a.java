package c9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.facebook.shimmer.ShimmerFrameLayout;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChannelsFragment.java */
/* loaded from: classes2.dex */
public final class a implements Response.Listener<JSONObject> {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f3463s;

    public a(c cVar) {
        this.f3463s = cVar;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        c cVar = this.f3463s;
        try {
            JSONArray jSONArray = jSONObject2.getJSONArray("Categories");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    cVar.f3465t.add(new k9.a(jSONArray.getJSONObject(i10).optString("CategoryName")));
                    ((ShimmerFrameLayout) cVar.f3464s.f252u).b();
                    ((ShimmerFrameLayout) cVar.f3464s.f252u).setVisibility(8);
                    cVar.f3466u = new e9.b(cVar.requireActivity(), cVar.f3465t);
                    RecyclerView recyclerView = (RecyclerView) cVar.f3464s.f251t;
                    cVar.requireActivity();
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                    ((RecyclerView) cVar.f3464s.f251t).setAdapter(cVar.f3466u);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }
}
