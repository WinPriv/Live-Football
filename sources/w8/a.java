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

/* compiled from: LiveCricketFragment.java */
/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public h f36146s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36147t = false;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f36148u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public d9.b f36149v;

    /* compiled from: LiveCricketFragment.java */
    /* renamed from: w8.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class AsyncTaskC0499a extends AsyncTask<String, Void, String> {
        public AsyncTaskC0499a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            a aVar = a.this;
            try {
                Elements select = Jsoup.connect("https://sports.ndtv.com/cricket/live-scores").userAgent("chrome").timeout(10000).get().select("a.sp-scr_lnk.url");
                for (int i10 = 0; i10 < select.size(); i10++) {
                    try {
                        Element element = select.get(i10);
                        String text = element.select("div.scr_txt-ony").first().text();
                        String text2 = element.select("div.scr_inf-wrp").first().select("div.scr_dt-red").text();
                        String text3 = element.select("div.scr_txt-ony").last().text();
                        String text4 = element.select("div.scr_chn-wrp").select("div.scr_chn-ttl").text();
                        String text5 = element.select("div.scr_tm-wrp").first().select("div.scr_tm-nm").text();
                        String text6 = element.select("div.scr_tm-wrp").last().select("div.scr_tm-nm").text();
                        String text7 = element.select("div.scr_tm-wrp").first().select("div.scr_tm-scr").text();
                        String text8 = element.select("div.scr_tm-wrp").last().select("div.scr_tm-scr").text();
                        String attr = element.select("div.scr_tm-wrp").first().select("div.scr_flg").select("span.img-gr").select(bd.Code).attr("src");
                        String attr2 = element.select("div.scr_tm-wrp").last().select("div.scr_flg").select("span.img-gr").select(bd.Code).attr("src");
                        if ((text4 != null || !text4.isEmpty() || text4.equals("null") || text4.equals("")) && text4.contains("to win")) {
                            aVar.f36148u.add(new j9.a(text, text2, attr, attr2, text5, text6, text7, text8, text3));
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        aVar.f36147t = true;
                    }
                }
                return null;
            } catch (Exception e11) {
                e11.printStackTrace();
                aVar.f36147t = true;
                Log.d("Cricket22", "doInBackground: " + e11.getMessage());
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            a aVar = a.this;
            aVar.f36149v = new d9.b(aVar.requireActivity(), aVar.f36148u);
            aVar.f36146s.f33015c.b();
            aVar.f36146s.f33015c.setVisibility(8);
            if (aVar.f36147t) {
                aVar.f36146s.f33013a.setVisibility(0);
                return;
            }
            RecyclerView recyclerView = aVar.f36146s.f33014b;
            aVar.requireActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            aVar.f36146s.f33014b.setAdapter(aVar.f36149v);
            if (aVar.f36149v.getItemCount() == 0) {
                aVar.f36146s.f33013a.setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_live_cricket, viewGroup, false);
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
                    this.f36146s = new h(nestedScrollView, linearLayout, recyclerView, shimmerFrameLayout, 0);
                    return nestedScrollView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        try {
            new AsyncTaskC0499a().execute(new String[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f36146s.f33013a.setVisibility(0);
            this.f36146s.f33015c.b();
            this.f36146s.f33015c.setVisibility(8);
        }
    }
}
