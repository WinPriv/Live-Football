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
import java.io.IOException;
import java.util.ArrayList;
import l9.e;
import m9.h;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: TodayFragment.java */
/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public h f370s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f371t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f372u = false;

    /* renamed from: v, reason: collision with root package name */
    public String f373v;

    /* renamed from: w, reason: collision with root package name */
    public String f374w;

    /* renamed from: x, reason: collision with root package name */
    public f9.h f375x;

    /* compiled from: TodayFragment.java */
    /* renamed from: a9.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class AsyncTaskC0007a extends AsyncTask<String, Void, String> {
        public AsyncTaskC0007a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            String text;
            String text2;
            String text3;
            String attr;
            String attr2;
            a aVar = a.this;
            int i10 = 1;
            try {
                Elements select = Jsoup.connect("https://azscore.com").userAgent("chrome").timeout(10000).get().select("div.game");
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
                        aVar.f372u = true;
                    }
                    if (!element.select("div.indicators").text().isEmpty() && element.select("div.indicators").text() != null) {
                        aVar.f374w = element.select("div.indicators").select("span.count").last().text();
                        aVar.f373v = element.select("div.indicators").select("span.count").first().text();
                        aVar.f371t.add(new e(text2, text3, aVar.f373v.replaceAll("\\s+", ""), aVar.f374w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                        i12++;
                        i10 = 1;
                        i11 = 0;
                    }
                    aVar.f374w = "";
                    aVar.f373v = "";
                    aVar.f371t.add(new e(text2, text3, aVar.f373v.replaceAll("\\s+", ""), aVar.f374w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                    i12++;
                    i10 = 1;
                    i11 = 0;
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                aVar.f372u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            a aVar = a.this;
            aVar.f370s.f33015c.b();
            aVar.f370s.f33015c.setVisibility(8);
            aVar.f375x = new f9.h(aVar.requireActivity(), aVar.f371t);
            if (aVar.f372u) {
                aVar.f370s.f33013a.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = aVar.f370s.f33014b;
            aVar.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            aVar.f370s.f33014b.setAdapter(aVar.f375x);
            if (aVar.f375x.getItemCount() == 0) {
                aVar.f370s.f33013a.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_today, viewGroup, false);
        int i10 = R.id.Empty;
        LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
        if (linearLayout != null) {
            i10 = R.id.TodaysMatches;
            RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.TodaysMatches, inflate);
            if (recyclerView != null) {
                i10 = R.id.TodaysShimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.TodaysShimmer, inflate);
                if (shimmerFrameLayout != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                    this.f370s = new h(nestedScrollView, linearLayout, recyclerView, shimmerFrameLayout, 1);
                    return nestedScrollView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            new AsyncTaskC0007a().execute(new String[0]);
        } catch (Exception unused) {
            this.f370s.f33015c.b();
            this.f370s.f33015c.setVisibility(8);
            this.f370s.f33013a.setVisibility(0);
        }
    }
}
