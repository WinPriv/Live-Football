package a9;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bd;
import f9.h;
import java.io.IOException;
import java.util.ArrayList;
import l9.e;
import m9.g;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: YesterdayFragment.java */
/* loaded from: classes2.dex */
public class c extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public g f384s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f385t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f386u = false;

    /* renamed from: v, reason: collision with root package name */
    public String f387v;

    /* renamed from: w, reason: collision with root package name */
    public String f388w;

    /* renamed from: x, reason: collision with root package name */
    public h f389x;

    /* compiled from: YesterdayFragment.java */
    /* loaded from: classes2.dex */
    public class a extends AsyncTask<String, Void, String> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            String text;
            String text2;
            String text3;
            String attr;
            String attr2;
            c cVar = c.this;
            int i10 = 1;
            try {
                Elements select = Jsoup.connect("https://azscore.com/yesterday").userAgent("chrome").timeout(10000).get().select("div.game");
                int i11 = 0;
                int i12 = 0;
                while (i12 < select.size()) {
                    Element element = select.get(i12);
                    try {
                        text = element.select("span.game-info").text();
                        text2 = element.select("div.teams").select("span.team").eq(i11).select("span.team-name").text();
                        text3 = element.select("div.teams").select("span.team").eq(i10).select("span.team-name").text();
                        attr = element.select("div.teams").select("span.team").eq(i11).select(bd.Code).attr("data-src");
                        attr2 = element.select("div.teams").select("span.team").eq(i10).select(bd.Code).attr("data-src");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        cVar.f386u = true;
                    }
                    if (!element.select("div.indicators").text().isEmpty() && element.select("div.indicators").text() != null) {
                        cVar.f388w = element.select("div.indicators").select("span.count").last().text();
                        cVar.f387v = element.select("div.indicators").select("span.count").first().text();
                        cVar.f385t.add(new e(text2, text3, cVar.f387v.replaceAll("\\s+", ""), cVar.f388w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                        i12++;
                        i10 = 1;
                        i11 = 0;
                    }
                    cVar.f388w = "";
                    cVar.f387v = "";
                    cVar.f385t.add(new e(text2, text3, cVar.f387v.replaceAll("\\s+", ""), cVar.f388w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                    i12++;
                    i10 = 1;
                    i11 = 0;
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                cVar.f386u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            c cVar = c.this;
            cVar.f384s.f33012d.b();
            cVar.f384s.f33012d.setVisibility(8);
            cVar.f389x = new h(cVar.requireActivity(), cVar.f385t);
            if (cVar.f386u) {
                cVar.f384s.f33010b.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = cVar.f384s.f33011c;
            cVar.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            cVar.f384s.f33011c.setAdapter(cVar.f389x);
            if (cVar.f389x.getItemCount() == 0) {
                cVar.f384s.f33010b.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_yesterday, viewGroup, false);
        int i10 = R.id.Empty;
        LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
        if (linearLayout != null) {
            i10 = R.id.YesterdayMatches;
            RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.YesterdayMatches, inflate);
            if (recyclerView != null) {
                i10 = R.id.YesterdayShimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.YesterdayShimmer, inflate);
                if (shimmerFrameLayout != null) {
                    g gVar = new g((NestedScrollView) inflate, linearLayout, recyclerView, shimmerFrameLayout, 3);
                    this.f384s = gVar;
                    return gVar.a();
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        requireActivity();
        try {
            new a().execute(new String[0]);
        } catch (Exception unused) {
            this.f386u = true;
            this.f384s.f33012d.b();
            this.f384s.f33012d.setVisibility(8);
            this.f384s.f33010b.setVisibility(0);
        }
    }
}
