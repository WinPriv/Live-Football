package com.hamkho.livefoot.Activities;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.applovin.exoplayer2.a.y;
import com.hamkho.livefoot.Activities.SplashActivity;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.HwAds;
import q0.d;
import t8.l;

/* loaded from: classes2.dex */
public class SplashActivity extends AppCompatActivity {

    /* loaded from: classes2.dex */
    public class a implements h9.a {
        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements g9.a {
        public b() {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_splash, (ViewGroup) null, false);
        int i10 = R.id.Lottie;
        if (((LottieAnimationView) a0.a.H0(R.id.Lottie, inflate)) != null) {
            i10 = R.id.textView;
            if (((TextView) a0.a.H0(R.id.textView, inflate)) != null) {
                i10 = R.id.textView2;
                if (((TextView) a0.a.H0(R.id.textView2, inflate)) != null) {
                    setContentView((ConstraintLayout) inflate);
                    HwAds.init(this);
                    if (l.a(this)) {
                        a aVar = new a();
                        RequestQueue newRequestQueue = Volley.newRequestQueue(this);
                        StringRequest stringRequest = new StringRequest("https://hamkho.host/huaweiconsole/ads.json", new y(9, this, aVar), new d(aVar, 14));
                        stringRequest.setShouldRetryConnectionErrors(true);
                        stringRequest.setRetryPolicy(new DefaultRetryPolicy(5000, 3, 1.0f));
                        newRequestQueue.add(stringRequest);
                        return;
                    }
                    final b bVar = new b();
                    final Dialog dialog = new Dialog(this);
                    dialog.setContentView(R.layout.internetdialog);
                    dialog.setCancelable(false);
                    dialog.getWindow().setGravity(17);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    dialog.getWindow().setLayout(-1, -2);
                    ((Button) dialog.findViewById(R.id.Retry)).setOnClickListener(new View.OnClickListener() { // from class: g9.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            boolean a10 = l.a(this.getApplicationContext());
                            Dialog dialog2 = dialog;
                            a aVar2 = bVar;
                            if (a10) {
                                dialog2.dismiss();
                                SplashActivity splashActivity = SplashActivity.this;
                                splashActivity.finish();
                                splashActivity.overridePendingTransition(0, 0);
                                splashActivity.startActivity(splashActivity.getIntent());
                                splashActivity.overridePendingTransition(0, 0);
                                return;
                            }
                            SplashActivity splashActivity2 = SplashActivity.this;
                            splashActivity2.finish();
                            splashActivity2.overridePendingTransition(0, 0);
                            splashActivity2.startActivity(splashActivity2.getIntent());
                            splashActivity2.overridePendingTransition(0, 0);
                            dialog2.dismiss();
                        }
                    });
                    dialog.show();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
