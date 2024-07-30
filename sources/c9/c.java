package c9;

import a4.j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import java.util.ArrayList;

/* compiled from: ChannelsFragment.java */
/* loaded from: classes2.dex */
public class c extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public j f3464s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3465t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public e9.b f3466u;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_channels, viewGroup, false);
        int i10 = R.id.ChannRecyclerView;
        RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.ChannRecyclerView, inflate);
        if (recyclerView != null) {
            i10 = R.id.ChannsShimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.ChannsShimmer, inflate);
            if (shimmerFrameLayout != null) {
                j jVar = new j((NestedScrollView) inflate, recyclerView, shimmerFrameLayout);
                this.f3464s = jVar;
                return (NestedScrollView) jVar.f250s;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(0, "https://hamkho.host/linksstream/footlinks.json", null, new a(this), new b());
        RequestQueue newRequestQueue = Volley.newRequestQueue(requireContext());
        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(5000, 1, 1.0f));
        newRequestQueue.add(jsonObjectRequest);
    }
}
