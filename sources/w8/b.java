package w8;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
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
import java.util.ArrayList;
import m9.i;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: RecentCricketFragment.java */
/* loaded from: classes2.dex */
public class b extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public i f36151s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36152t = false;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f36153u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public d9.b f36154v;

    /* compiled from: RecentCricketFragment.java */
    /* loaded from: classes2.dex */
    public class a extends AsyncTask<String, Void, String> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            b bVar = b.this;
            try {
                Elements select = Jsoup.connect("https://sports.ndtv.com/cricket/results").userAgent("chrome").timeout(10000).get().select("a.sp-scr_lnk.url");
                Log.d("amehry1998", select.html());
                for (int i10 = 0; i10 < select.size(); i10++) {
                    try {
                        Element element = select.get(i10);
                        bVar.f36153u.add(new j9.a(element.select("div.scr_txt-ony").first().text(), "", element.select("div.scr_tm-wrp").first().select("div.scr_flg").select("span.img-gr").select(bd.Code).attr("data-src"), element.select("div.scr_tm-wrp").last().select("div.scr_flg").select("span.img-gr").select(bd.Code).attr("data-src"), element.select("div.scr_tm-wrp").first().select("div.scr_tm-nm").text(), element.select("div.scr_tm-wrp").last().select("div.scr_tm-nm").text(), element.select("div.scr_tm-wrp").first().select("div.scr_tm-scr").text(), element.select("div.scr_tm-wrp").last().select("div.scr_tm-scr").text(), ""));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        bVar.f36152t = true;
                    }
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                bVar.f36152t = true;
                Log.d("Cricket22", "doInBackground: " + e11.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            b bVar = b.this;
            bVar.f36154v = new d9.b(bVar.requireActivity(), bVar.f36153u);
            bVar.f36151s.f33018c.b();
            bVar.f36151s.f33018c.setVisibility(8);
            if (bVar.f36152t) {
                bVar.f36151s.f33016a.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = bVar.f36151s.f33017b;
            bVar.requireActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            bVar.f36151s.f33017b.setAdapter(bVar.f36154v);
            if (bVar.f36154v.getItemCount() == 0) {
                bVar.f36151s.f33016a.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_recent_cricket, viewGroup, false);
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
                    this.f36151s = new i(nestedScrollView, linearLayout, recyclerView, shimmerFrameLayout, 0);
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
            this.f36151s.f33016a.setVisibility(0);
            this.f36151s.f33018c.b();
            this.f36151s.f33018c.setVisibility(8);
        }
    }
}
