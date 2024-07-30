package y8;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bd;
import f9.f;
import java.io.IOException;
import java.util.ArrayList;
import m9.g;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: TeamsFragment.java */
/* loaded from: classes2.dex */
public class d extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public g f36866s;

    /* renamed from: u, reason: collision with root package name */
    public f f36868u;

    /* renamed from: w, reason: collision with root package name */
    public String f36870w;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f36867t = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public boolean f36869v = false;

    /* compiled from: TeamsFragment.java */
    /* loaded from: classes2.dex */
    public class a extends AsyncTask<String, Void, String> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            d dVar = d.this;
            try {
                Elements select = Jsoup.connect("https://azscore.com" + dVar.f36870w.replaceAll("\\s+", "") + "/teams").userAgent("chrome").timeout(10000).get().select("table.teams-tb").select("tbody").select("tr.teams-tb__tr");
                for (int i10 = 0; i10 < select.size(); i10++) {
                    Element element = select.get(i10);
                    try {
                        dVar.f36867t.add(new l9.d(element.select("td.teams-tb__td").attr("title"), element.select("td.teams-tb__td").select(bd.Code).attr("data-src").replace("/resized/40/40/", "/resized/100/100/")));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        dVar.f36869v = true;
                    }
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                dVar.f36869v = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            d dVar = d.this;
            dVar.f36868u = new f(dVar.requireActivity(), dVar.f36867t);
            dVar.f36866s.f33012d.b();
            dVar.f36866s.f33012d.setVisibility(8);
            if (dVar.f36869v) {
                dVar.f36866s.f33010b.setVisibility(0);
                return;
            }
            dVar.requireContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager();
            gridLayoutManager.K = new c();
            dVar.f36866s.f33011c.setLayoutManager(gridLayoutManager);
            dVar.f36866s.f33011c.setAdapter(dVar.f36868u);
            if (dVar.f36868u.getItemCount() == 0) {
                dVar.f36866s.f33010b.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
            d dVar = d.this;
            dVar.f36870w = dVar.requireActivity().getIntent().getStringExtra("llink");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_teams, viewGroup, false);
        int i10 = R.id.Empty;
        LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
        if (linearLayout != null) {
            i10 = R.id.TomorrowMatches;
            RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.TomorrowMatches, inflate);
            if (recyclerView != null) {
                i10 = R.id.TomorrowShimmer;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.TomorrowShimmer, inflate);
                if (shimmerFrameLayout != null) {
                    g gVar = new g((NestedScrollView) inflate, linearLayout, recyclerView, shimmerFrameLayout, 2);
                    this.f36866s = gVar;
                    return gVar.a();
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
            this.f36866s.f33010b.setVisibility(0);
            this.f36866s.f33012d.b();
            this.f36866s.f33012d.setVisibility(8);
        }
    }
}
