package com.hamkho.livefoot.Activities.FootballScores.AllLeagues;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.f;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bd;
import f9.d;
import java.io.IOException;
import m9.c;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/* loaded from: classes2.dex */
public class LeagueDetails extends AppCompatActivity {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f21435z = 0;

    /* renamed from: s, reason: collision with root package name */
    public c f21436s;

    /* renamed from: t, reason: collision with root package name */
    public String f21437t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21438u = false;

    /* renamed from: v, reason: collision with root package name */
    public String f21439v;

    /* renamed from: w, reason: collision with root package name */
    public String f21440w;

    /* renamed from: x, reason: collision with root package name */
    public String f21441x;
    public String y;

    /* loaded from: classes2.dex */
    public class a implements f.b {
        @Override // com.google.android.material.tabs.f.b
        public final void a(TabLayout.f fVar, int i10) {
            if (i10 == 0) {
                fVar.a("Results");
            } else if (i10 == 1) {
                fVar.a("Fixtures");
            } else if (i10 == 2) {
                fVar.a("Teams");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends AsyncTask<String, Void, String> {
        public b() {
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(String[] strArr) {
            LeagueDetails leagueDetails = LeagueDetails.this;
            try {
                Document document = Jsoup.connect("https://azscore.com" + leagueDetails.f21437t.replaceAll("\\s+", "")).userAgent("chrome").timeout(10000).get();
                try {
                    leagueDetails.f21440w = document.select("div.v-card__content").select("div.v-card__avatar").select(bd.Code).attr("data-src");
                    leagueDetails.f21439v = document.select("div.v-card__column").select("h1.v-text").text();
                    if (!document.select("div.v-card__column").select("div.v-line").select(bd.Code).attr("data-src").contains("https://")) {
                        leagueDetails.y = "https://azscore.com" + document.select("div.v-card__column").select("div.v-line").select(bd.Code).attr("data-src");
                    } else {
                        leagueDetails.y = document.select("div.v-card__column").select("div.v-line").select(bd.Code).attr("data-src");
                    }
                    leagueDetails.f21441x = document.select("div.v-card__column").select("div.v-line").select("a").text();
                    return null;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    leagueDetails.f21438u = true;
                    return null;
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                leagueDetails.f21438u = true;
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(String str) {
            super.onPostExecute(str);
            LeagueDetails leagueDetails = LeagueDetails.this;
            leagueDetails.f21436s.f32979i.setVisibility(8);
            if (leagueDetails.f21438u) {
                leagueDetails.f21436s.f32976e.setVisibility(8);
                leagueDetails.f21436s.f.setVisibility(0);
            } else {
                leagueDetails.f21436s.f32978h.setText(leagueDetails.f21439v);
                leagueDetails.f21436s.f32975d.setText(leagueDetails.f21441x);
                com.bumptech.glide.b.c(leagueDetails).d(leagueDetails).k(leagueDetails.f21440w).w(new com.hamkho.livefoot.Activities.FootballScores.AllLeagues.a(this)).u(leagueDetails.f21436s.f32977g);
                com.bumptech.glide.b.c(leagueDetails).d(leagueDetails).k(leagueDetails.y).w(new com.hamkho.livefoot.Activities.FootballScores.AllLeagues.b(this)).u(leagueDetails.f21436s.f32974c);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            super.onPreExecute();
            LeagueDetails leagueDetails = LeagueDetails.this;
            leagueDetails.f21437t = leagueDetails.getIntent().getStringExtra("llink");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = 0;
        View inflate = getLayoutInflater().inflate(R.layout.activity_league_details, (ViewGroup) null, false);
        int i11 = R.id.Back;
        ImageView imageView = (ImageView) a0.a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i11 = R.id.Banner;
            LinearLayout linearLayout = (LinearLayout) a0.a.H0(R.id.Banner, inflate);
            if (linearLayout != null) {
                i11 = R.id.CountryImage;
                ImageView imageView2 = (ImageView) a0.a.H0(R.id.CountryImage, inflate);
                if (imageView2 != null) {
                    i11 = R.id.CountryName;
                    TextView textView = (TextView) a0.a.H0(R.id.CountryName, inflate);
                    if (textView != null) {
                        i11 = R.id.Data;
                        ConstraintLayout constraintLayout = (ConstraintLayout) a0.a.H0(R.id.Data, inflate);
                        if (constraintLayout != null) {
                            i11 = R.id.Empty;
                            LinearLayout linearLayout2 = (LinearLayout) a0.a.H0(R.id.Empty, inflate);
                            if (linearLayout2 != null) {
                                i11 = R.id.LeagueImage;
                                ImageView imageView3 = (ImageView) a0.a.H0(R.id.LeagueImage, inflate);
                                if (imageView3 != null) {
                                    i11 = R.id.LeagueName;
                                    TextView textView2 = (TextView) a0.a.H0(R.id.LeagueName, inflate);
                                    if (textView2 != null) {
                                        i11 = R.id.Progress;
                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a0.a.H0(R.id.Progress, inflate);
                                        if (circularProgressIndicator != null) {
                                            i11 = R.id.Tab;
                                            TabLayout tabLayout = (TabLayout) a0.a.H0(R.id.Tab, inflate);
                                            if (tabLayout != null) {
                                                i11 = R.id.matchCard;
                                                if (((CardView) a0.a.H0(R.id.matchCard, inflate)) != null) {
                                                    i11 = R.id.viewPager;
                                                    ViewPager2 viewPager2 = (ViewPager2) a0.a.H0(R.id.viewPager, inflate);
                                                    if (viewPager2 != null) {
                                                        RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                                        this.f21436s = new c(relativeLayout, imageView, linearLayout, imageView2, textView, constraintLayout, linearLayout2, imageView3, textView2, circularProgressIndicator, tabLayout, viewPager2);
                                                        setContentView(relativeLayout);
                                                        this.f21436s.f32972a.setOnClickListener(new x8.b(this, i10));
                                                        t8.a.e(this, this.f21436s.f32973b);
                                                        this.f21436s.f32981k.setAdapter(new d(this));
                                                        this.f21436s.f32981k.b(0, false);
                                                        c cVar = this.f21436s;
                                                        new f(cVar.f32980j, cVar.f32981k, new a()).a();
                                                        try {
                                                            new b().execute(new String[0]);
                                                            return;
                                                        } catch (Exception e10) {
                                                            e10.printStackTrace();
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t8.a.a();
    }
}
