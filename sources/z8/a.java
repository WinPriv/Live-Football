package z8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.f;
import com.hamkho.livefoot.R;

/* compiled from: AllScoresFragment.java */
/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public t2.c f37330s;

    /* compiled from: AllScoresFragment.java */
    /* renamed from: z8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0517a implements f.b {
        @Override // com.google.android.material.tabs.f.b
        public final void a(TabLayout.f fVar, int i10) {
            if (i10 == 0) {
                fVar.a("Yesterday");
            } else if (i10 == 1) {
                fVar.a("Today");
            } else if (i10 == 2) {
                fVar.a("Tomorrow");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_all_scores, viewGroup, false);
        int i10 = R.id.Tab;
        TabLayout tabLayout = (TabLayout) a0.a.H0(R.id.Tab, inflate);
        if (tabLayout != null) {
            i10 = R.id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) a0.a.H0(R.id.viewPager, inflate);
            if (viewPager2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                this.f37330s = new t2.c(relativeLayout, tabLayout, viewPager2);
                return relativeLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ((ViewPager2) this.f37330s.f35400u).setAdapter(new f9.e(requireActivity()));
        ((ViewPager2) this.f37330s.f35400u).b(1, false);
        t2.c cVar = this.f37330s;
        new com.google.android.material.tabs.f((TabLayout) cVar.f35399t, (ViewPager2) cVar.f35400u, new C0517a()).a();
    }
}
