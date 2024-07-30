package com.hamkho.livefoot.Activities.SoccerLive;

import a0.a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import b9.k;
import b9.l;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.anythink.basead.ui.e;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import z3.y;

/* loaded from: classes2.dex */
public class ChannelsListActivity extends AppCompatActivity {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f21477v = 0;

    /* renamed from: s, reason: collision with root package name */
    public y f21478s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f21479t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public int f21480u;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finishAndRemoveTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_channels_list, (ViewGroup) null, false);
        int i10 = R.id.Back;
        ImageView imageView = (ImageView) a.H0(R.id.Back, inflate);
        if (imageView != null) {
            i10 = R.id.Banner;
            LinearLayout linearLayout = (LinearLayout) a.H0(R.id.Banner, inflate);
            if (linearLayout != null) {
                i10 = R.id.ChannelList;
                RecyclerView recyclerView = (RecyclerView) a.H0(R.id.ChannelList, inflate);
                if (recyclerView != null) {
                    i10 = R.id.ShimmerChannels;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) a.H0(R.id.ShimmerChannels, inflate);
                    if (shimmerFrameLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) inflate;
                        this.f21478s = new y(relativeLayout, imageView, linearLayout, recyclerView, shimmerFrameLayout, 2);
                        setContentView(relativeLayout);
                        t8.a.e(this, (LinearLayout) this.f21478s.f36975v);
                        this.f21480u = getIntent().getIntExtra("pos", 0);
                        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(0, "https://hamkho.host/linksstream/footlinks.json", null, new k(this), new l());
                        RequestQueue newRequestQueue = Volley.newRequestQueue(this);
                        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(5000, 1, 1.0f));
                        newRequestQueue.add(jsonObjectRequest);
                        ((ImageView) this.f21478s.f36974u).setOnClickListener(new e(this, 5));
                        return;
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
