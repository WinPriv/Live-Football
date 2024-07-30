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
import m9.i;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: TomorrowFragment.java */
/* loaded from: classes2.dex */
public class b extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public i f377s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f378t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f379u = false;

    /* renamed from: v, reason: collision with root package name */
    public String f380v;

    /* renamed from: w, reason: collision with root package name */
    public String f381w;

    /* renamed from: x, reason: collision with root package name */
    public h f382x;

    /* compiled from: TomorrowFragment.java */
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
            b bVar = b.this;
            int i10 = 1;
            try {
                Elements select = Jsoup.connect("https://azscore.com/tomorrow").userAgent("chrome").timeout(10000).get().select("div.game");
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
                        bVar.f379u = true;
                    }
                    if (!element.select("div.indicators").text().isEmpty() && element.select("div.indicators").text() != null) {
                        bVar.f381w = element.select("div.indicators").select("span.count").last().text();
                        bVar.f380v = element.select("div.indicators").select("span.count").first().text();
                        bVar.f378t.add(new e(text2, text3, bVar.f380v.replaceAll("\\s+", ""), bVar.f381w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                        i12++;
                        i10 = 1;
                        i11 = 0;
                    }
                    bVar.f381w = "";
                    bVar.f380v = "";
                    bVar.f378t.add(new e(text2, text3, bVar.f380v.replaceAll("\\s+", ""), bVar.f381w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                    i12++;
                    i10 = 1;
                    i11 = 0;
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                bVar.f379u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            b bVar = b.this;
            bVar.f377s.f33018c.b();
            bVar.f377s.f33018c.setVisibility(8);
            bVar.f382x = new h(bVar.requireActivity(), bVar.f378t);
            if (bVar.f379u) {
                bVar.f377s.f33016a.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = bVar.f377s.f33017b;
            bVar.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            bVar.f377s.f33017b.setAdapter(bVar.f382x);
            if (bVar.f382x.getItemCount() == 0) {
                bVar.f377s.f33016a.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_tomorrow, viewGroup, false);
        int i10 = R.id.Empty;
        LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
        if (linearLayout != null) {
            i10 = R.id.TomorrowMatches;
            RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.TomorrowMatches, inflate);
            if (recyclerView != null) {
                i10 = R.id.TomorrowShimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.TomorrowShimmer, inflate);
                if (shimmerFrameLayout != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                    this.f377s = new i(nestedScrollView, linearLayout, recyclerView, shimmerFrameLayout, 1);
                    return nestedScrollView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            new a().execute(new String[0]);
        } catch (Exception unused) {
            this.f377s.f33018c.b();
            this.f377s.f33018c.setVisibility(8);
            this.f377s.f33016a.setVisibility(0);
        }
    }
}
