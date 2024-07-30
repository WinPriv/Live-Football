package c9;

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

/* compiled from: EventsFragment.java */
/* loaded from: classes2.dex */
public class f extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public androidx.viewpager2.widget.d f3468s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3469t = new ArrayList();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_events, viewGroup, false);
        int i10 = R.id.EventsRecyclerView;
        RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.EventsRecyclerView, inflate);
        if (recyclerView != null) {
            i10 = R.id.EventsShimmer;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.EventsShimmer, inflate);
            if (shimmerFrameLayout != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                this.f3468s = new androidx.viewpager2.widget.d(nestedScrollView, recyclerView, shimmerFrameLayout);
                return nestedScrollView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(0, "https://hamkho.host/linksstream/footlinks.json", null, new d(this), new e());
        RequestQueue newRequestQueue = Volley.newRequestQueue(requireContext());
        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(5000, 1, 1.0f));
        newRequestQueue.add(jsonObjectRequest);
    }
}
