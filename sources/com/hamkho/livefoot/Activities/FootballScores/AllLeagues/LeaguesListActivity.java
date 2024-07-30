package com.hamkho.livefoot.Activities.FootballScores.AllLeagues;

import android.animation.ValueAnimator;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.basead.ui.e;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bd;
import f9.c;
import java.io.IOException;
import java.util.ArrayList;
import m9.d;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* loaded from: classes2.dex */
public class LeaguesListActivity extends AppCompatActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f21443x = 0;

    /* renamed from: s, reason: collision with root package name */
    public d f21444s;

    /* renamed from: t, reason: collision with root package name */
    public String f21445t;

    /* renamed from: v, reason: collision with root package name */
    public c f21447v;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f21446u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f21448w = false;

    /* loaded from: classes2.dex */
    public class a extends AsyncTask<String, Void, String> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            LeaguesListActivity leaguesListActivity = LeaguesListActivity.this;
            try {
                Elements select = Jsoup.connect("https://azscore.com" + leaguesListActivity.f21445t.replaceAll("\\s+", "")).userAgent("chrome").timeout(10000).get().select("ul.v-list.sdb-countries").select("li.v-list-item.sdb-countries__item");
                for (int i10 = 0; i10 < select.size(); i10++) {
                    Element element = select.get(i10);
                    try {
                        String text = element.select("div.sdb-countries__name.v-text").text();
                        String attr = element.select(bd.Code).attr("data-src");
                        String attr2 = element.select("a").attr("href");
                        Log.d("biyhazanlink22+", attr2);
                        leaguesListActivity.f21446u.add(new l9.c(text, attr, attr2));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        leaguesListActivity.f21448w = true;
                    }
                }
                return null;
            } catch (IOException e11) {
                e11.printStackTrace();
                leaguesListActivity.f21448w = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            LeaguesListActivity leaguesListActivity = LeaguesListActivity.this;
            leaguesListActivity.f21447v = new c(leaguesListActivity, leaguesListActivity.f21446u);
            ((ShimmerFrameLayout) leaguesListActivity.f21444s.f32984c).b();
            ((ShimmerFrameLayout) leaguesListActivity.f21444s.f32984c).setVisibility(8);
            if (leaguesListActivity.f21448w) {
                ((LinearLayout) leaguesListActivity.f21444s.f).setVisibility(0);
                return;
            }
            ((RecyclerView) leaguesListActivity.f21444s.f32987g).setLayoutManager(new LinearLayoutManager(1));
            ((RecyclerView) leaguesListActivity.f21444s.f32987g).setAdapter(leaguesListActivity.f21447v);
            if (leaguesListActivity.f21447v.getItemCount() == 0) {
                ((LinearLayout) leaguesListActivity.f21444s.f).setVisibility(0);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
            LeaguesListActivity leaguesListActivity = LeaguesListActivity.this;
            leaguesListActivity.f21445t = leaguesListActivity.getIntent().getStringExtra("matchLink");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_leagues_list, (ViewGroup) null, false);
        int i10 = R.id.AllLeaguesShimmer;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a0.a.H0(R.id.AllLeaguesShimmer, inflate);
        if (shimmerFrameLayout != null) {
            i10 = R.id.Back;
            ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
            if (imageView != null) {
                i10 = R.id.Banner;
                LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Banner, inflate);
                if (linearLayout != null) {
                    i10 = R.id.Empty;
                    LinearLayout linearLayout2 = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
                    if (linearLayout2 != null) {
                        i10 = R.id.LeagueList;
                        RecyclerView recyclerView = (RecyclerView) a0.a.H0(R.id.LeagueList, inflate);
                        if (recyclerView != null) {
                            i10 = R.id.LeagueName;
                            TextView textView = (TextView) a0.a.H0(R.id.LeagueName, inflate);
                            if (textView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                this.f21444s = new d(relativeLayout, shimmerFrameLayout, imageView, linearLayout, linearLayout2, recyclerView, textView);
                                setContentView(relativeLayout);
                                boolean z10 = true;
                                this.f21444s.f32985d.setOnClickListener(new com.anythink.basead.ui.d(this, 1));
                                t8.a.e(this, this.f21444s.f32986e);
                                String stringExtra = getIntent().getStringExtra("countryName");
                                this.f21444s.f32982a.setText("All " + stringExtra + " Leagues");
                                try {
                                    new a().execute(new String[0]);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    com.facebook.shimmer.b bVar = ((ShimmerFrameLayout) this.f21444s.f32984c).f19876t;
                                    ValueAnimator valueAnimator = bVar.f19901e;
                                    if (valueAnimator != null) {
                                        if (valueAnimator == null || !valueAnimator.isStarted()) {
                                            z10 = false;
                                        }
                                        if (!z10 && bVar.getCallback() != null) {
                                            bVar.f19901e.start();
                                        }
                                    }
                                    ((ShimmerFrameLayout) this.f21444s.f32984c).setVisibility(0);
                                    ((LinearLayout) this.f21444s.f).setVisibility(0);
                                }
                                this.f21444s.f32985d.setOnClickListener(new e(this, 3));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t8.a.a();
    }
}
