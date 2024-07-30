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
import m9.h;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: UpComingCricketFragment.java */
/* loaded from: classes2.dex */
public class c extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public h f36156s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36157t = false;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f36158u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public d9.b f36159v;

    /* compiled from: UpComingCricketFragment.java */
    /* loaded from: classes2.dex */
    public class a extends AsyncTask<String, Void, String> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            c cVar = c.this;
            try {
                Elements select = Jsoup.connect("https://sports.ndtv.com/cricket/schedules-fixtures").userAgent("chrome").timeout(10000).get().select("a.sp-scr_lnk.url");
                for (int i10 = 0; i10 < select.size(); i10++) {
                    try {
                        Element element = select.get(i10);
                        String text = element.select("div.scr_txt-ony").first().text();
                        String text2 = element.select("div.scr_inf-wrp.scr_ntf-ctr").first().select("div.scr_ntf-ctr-in").select("div.scr_dt-red").text();
                        String text3 = element.select("div.scr_txt-ony").last().text();
                        cVar.f36158u.add(new j9.a(text, text2, element.select("div.scr_tm-wrp").first().select("div.scr_flg").select("span.img-gr").select(bd.Code).attr("data-src"), element.select("div.scr_tm-wrp").last().select("div.scr_flg").select("span.img-gr").select(bd.Code).attr("data-src"), element.select("div.scr_tm-wrp").first().text(), element.select("div.scr_tm-wrp").last().text(), "", "", text3));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        cVar.f36157t = true;
                    }
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                cVar.f36157t = true;
                Log.d("Cricket22", "doInBackground: " + e11.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            c cVar = c.this;
            cVar.f36159v = new d9.b(cVar.requireActivity(), cVar.f36158u);
            cVar.f36156s.f33015c.b();
            cVar.f36156s.f33015c.setVisibility(8);
            if (cVar.f36157t) {
                cVar.f36156s.f33013a.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = cVar.f36156s.f33014b;
            cVar.requireActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            cVar.f36156s.f33014b.setAdapter(cVar.f36159v);
            if (cVar.f36159v.getItemCount() == 0) {
                cVar.f36156s.f33013a.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_up_coming_cricket, viewGroup, false);
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
                    this.f36156s = new h(nestedScrollView, linearLayout, recyclerView, shimmerFrameLayout, 1);
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
            this.f36156s.f33013a.setVisibility(0);
            this.f36156s.f33015c.b();
            this.f36156s.f33015c.setVisibility(8);
        }
    }
}
