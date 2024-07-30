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
import java.io.IOException;
import java.util.ArrayList;
import l9.e;
import m9.h;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: ResulsFragment.java */
/* loaded from: classes2.dex */
public class b extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public h f36859s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f36860t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public boolean f36861u = false;

    /* renamed from: v, reason: collision with root package name */
    public String f36862v;

    /* renamed from: w, reason: collision with root package name */
    public String f36863w;

    /* renamed from: x, reason: collision with root package name */
    public String f36864x;
    public f9.h y;

    /* compiled from: ResulsFragment.java */
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
            try {
                Elements select = Jsoup.connect("https://azscore.com" + bVar.f36864x.replaceAll("\\s+", "") + "/results").userAgent("chrome").timeout(10000).get().select("div.game");
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
                        bVar.f36861u = true;
                    }
                    if (!element.select("div.indicators").text().isEmpty() && element.select("div.indicators").text() != null) {
                        bVar.f36863w = element.select("div.indicators").select("span.count").last().text();
                        bVar.f36862v = element.select("div.indicators").select("span.count").first().text();
                        bVar.f36860t.add(new e(text2, text3, bVar.f36862v.replaceAll("\\s+", ""), bVar.f36863w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                        i11++;
                        i10 = 0;
                    }
                    bVar.f36863w = "";
                    bVar.f36862v = "";
                    bVar.f36860t.add(new e(text2, text3, bVar.f36862v.replaceAll("\\s+", ""), bVar.f36863w.replaceAll("\\s+", ""), attr, attr2, text, element.select("div.teams").attr("href")));
                    i11++;
                    i10 = 0;
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                bVar.f36861u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            b bVar = b.this;
            bVar.f36859s.f33015c.b();
            bVar.f36859s.f33015c.setVisibility(8);
            bVar.y = new f9.h(bVar.requireActivity(), bVar.f36860t);
            if (bVar.f36861u) {
                bVar.f36859s.f33013a.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = bVar.f36859s.f33014b;
            bVar.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            bVar.f36859s.f33014b.setAdapter(bVar.y);
            if (bVar.y.getItemCount() == 0) {
                bVar.f36859s.f33013a.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
            b bVar = b.this;
            bVar.f36864x = bVar.requireActivity().getIntent().getStringExtra("llink");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_resuls, viewGroup, false);
        int i10 = R.id.Empty;
        LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
        if (linearLayout != null) {
            i10 = R.id.YesterdayMatches;
            RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.YesterdayMatches, inflate);
            if (recyclerView != null) {
                i10 = R.id.YesterdayShimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.YesterdayShimmer, inflate);
                if (shimmerFrameLayout != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                    this.f36859s = new h(nestedScrollView, linearLayout, recyclerView, shimmerFrameLayout, 0);
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
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f36859s.f33013a.setVisibility(0);
            this.f36859s.f33015c.b();
            this.f36859s.f33015c.setVisibility(8);
        }
    }
}
