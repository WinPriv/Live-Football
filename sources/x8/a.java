package x8;

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
import java.util.Arrays;
import m9.g;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: AllLeaguesFragment.java */
/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public g f36500s;

    /* renamed from: u, reason: collision with root package name */
    public f9.a f36502u;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f36501t = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public boolean f36503v = false;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f36504w = new ArrayList(Arrays.asList("Africa", "Asia", "Europe", "Australia and Oceania", "North & Central America", "South America", "Others", "World"));

    /* compiled from: AllLeaguesFragment.java */
    /* renamed from: x8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class AsyncTaskC0509a extends AsyncTask<String, Void, String> {
        public AsyncTaskC0509a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            a aVar = a.this;
            try {
                Elements select = Jsoup.connect("https://azscore.com/football/leagues").userAgent("chrome").timeout(10000).get().select("ul.v-list.sdb-countries").select("li.v-list-item.sdb-countries__item");
                for (int i10 = 0; i10 < select.size(); i10++) {
                    Element element = select.get(i10);
                    try {
                        String text = element.select("div.sdb-countries__name.v-text").text();
                        String attr = element.select(bd.Code).attr("data-src");
                        String attr2 = element.select("a").attr("href");
                        if (!aVar.f36504w.contains(text)) {
                            aVar.f36501t.add(new l9.a(text, attr, attr2));
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        aVar.f36503v = true;
                    }
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                aVar.f36503v = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            a aVar = a.this;
            aVar.f36502u = new f9.a(aVar.requireActivity(), aVar.f36501t);
            aVar.f36500s.f33012d.b();
            aVar.f36500s.f33012d.setVisibility(8);
            if (aVar.f36503v) {
                aVar.f36500s.f33010b.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = aVar.f36500s.f33011c;
            aVar.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            aVar.f36500s.f33011c.setAdapter(aVar.f36502u);
            if (aVar.f36502u.getItemCount() == 0) {
                aVar.f36500s.f33010b.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_all_leagues, viewGroup, false);
        int i10 = R.id.Countries;
        RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.Countries, inflate);
        if (recyclerView != null) {
            i10 = R.id.Empty2;
            LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Empty2, inflate);
            if (linearLayout != null) {
                i10 = R.id.ShimmerCountry;
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.ShimmerCountry, inflate);
                if (shimmerFrameLayout != null) {
                    g gVar = new g((NestedScrollView) inflate, recyclerView, linearLayout, shimmerFrameLayout);
                    this.f36500s = gVar;
                    return gVar.a();
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            new AsyncTaskC0509a().execute(new String[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f36500s.f33010b.setVisibility(0);
            this.f36500s.f33012d.b();
            this.f36500s.f33012d.setVisibility(8);
        }
    }
}
