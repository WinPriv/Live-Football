package y8;

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

/* compiled from: FixturesFragment.java */
/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public g f36852s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f36853t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f36854u = false;

    /* renamed from: v, reason: collision with root package name */
    public String f36855v;

    /* renamed from: w, reason: collision with root package name */
    public String f36856w;

    /* renamed from: x, reason: collision with root package name */
    public String f36857x;
    public h y;

    /* compiled from: FixturesFragment.java */
    /* renamed from: y8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class AsyncTaskC0513a extends AsyncTask<String, Void, String> {
        public AsyncTaskC0513a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            String text;
            String text2;
            String text3;
            String attr;
            String attr2;
            a aVar = a.this;
            try {
                Elements select = Jsoup.connect("https://azscore.com" + aVar.f36857x.replaceAll("\\s+", "") + "/fixtures").userAgent("chrome").timeout(10000).get().select("div.game");
                int i10 = 0;
                int i11 = 0;
                while (i11 < select.size()) {
                    Element element = select.get(i11);
                    try {
                        text = element.select("span.game-info").text();
                        text2 = element.select("div.teams").select("span.team").eq(i10).select("span.team-name").text();
                        text3 = element.select("div.teams").select("span.team").eq(1).select("span.team-name").text();
                        attr = element.select("div.teams").select("span.team").eq(0).select(bd.Code).attr("data-src");
                        attr2 = element.select("div.teams").select("span.team").eq(1).select(bd.Code).attr("data-src");
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        aVar.f36854u = true;
                    }
                    if (!element.select("div.indicators").text().isEmpty() && element.select("div.indicators").text() != null) {
                        aVar.f36856w = element.select("div.indicators").select("span.count").last().text();
                        aVar.f36855v = element.select("div.indicators").select("span.count").first().text();
                        aVar.f36853t.add(new e(text2, text3, aVar.f36855v.replaceAll("\\s+", ""), aVar.f36856w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                        i11++;
                        i10 = 0;
                    }
                    aVar.f36856w = "";
                    aVar.f36855v = "";
                    aVar.f36853t.add(new e(text2, text3, aVar.f36855v.replaceAll("\\s+", ""), aVar.f36856w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                    i11++;
                    i10 = 0;
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                aVar.f36854u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            a aVar = a.this;
            aVar.y = new h(aVar.requireActivity(), aVar.f36853t);
            aVar.f36852s.f33012d.b();
            aVar.f36852s.f33012d.setVisibility(8);
            if (aVar.f36854u) {
                aVar.f36852s.f33010b.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = aVar.f36852s.f33011c;
            aVar.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            aVar.f36852s.f33011c.setAdapter(aVar.y);
            if (aVar.y.getItemCount() == 0) {
                aVar.f36852s.f33010b.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
            a aVar = a.this;
            aVar.f36857x = aVar.requireActivity().getIntent().getStringExtra("llink");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fixtures, viewGroup, false);
        int i10 = R.id.Empty;
        LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
        if (linearLayout != null) {
            i10 = R.id.TomorrowMatches;
            RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.TomorrowMatches, inflate);
            if (recyclerView != null) {
                i10 = R.id.TomorrowShimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.TomorrowShimmer, inflate);
                if (shimmerFrameLayout != null) {
                    g gVar = new g((NestedScrollView) inflate, linearLayout, recyclerView, shimmerFrameLayout, 1);
                    this.f36852s = gVar;
                    return gVar.a();
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            new AsyncTaskC0513a().execute(new String[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f36852s.f33010b.setVisibility(0);
            this.f36852s.f33012d.b();
            this.f36852s.f33012d.setVisibility(8);
        }
    }
}
