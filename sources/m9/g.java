package m9;

import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* compiled from: FragmentAllLeaguesBinding.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final NestedScrollView f33009a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f33010b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f33011c;

    /* renamed from: d, reason: collision with root package name */
    public final ShimmerFrameLayout f33012d;

    public /* synthetic */ g(NestedScrollView nestedScrollView, LinearLayout linearLayout, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, int i10) {
        this.f33009a = nestedScrollView;
        this.f33010b = linearLayout;
        this.f33011c = recyclerView;
        this.f33012d = shimmerFrameLayout;
    }

    public final NestedScrollView a() {
        return this.f33009a;
    }

    public g(NestedScrollView nestedScrollView, RecyclerView recyclerView, LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout) {
        this.f33009a = nestedScrollView;
        this.f33011c = recyclerView;
        this.f33010b = linearLayout;
        this.f33012d = shimmerFrameLayout;
    }
}
