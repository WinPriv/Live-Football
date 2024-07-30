package com.huawei.openalliance.ad.ppskit.linked.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.linked.view.b;
import com.huawei.openalliance.ad.ppskit.utils.z1;
import com.huawei.openalliance.ad.ppskit.views.AutoScaleSizeRelativeLayout;
import ka.Cif;
import ka.n7;

/* loaded from: classes2.dex */
public class LinkedNativeViewControlPanel extends AutoScaleSizeRelativeLayout {
    public static final /* synthetic */ int J = 0;
    public SeekBar A;
    public ImageView B;
    public TextView C;
    public TextView D;
    public View E;
    public ImageView F;
    public View G;
    public LinkedWifiAlertPlayButton H;
    public TextView I;

    /* renamed from: x, reason: collision with root package name */
    public ImageView f22678x;
    public ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f22679z;

    public LinkedNativeViewControlPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View findViewById;
        try {
            LayoutInflater.from(context).inflate(R.layout.hiad_linked_native_video_control_panel, this);
            findViewById(R.id.hiad_linked_native_video_control_panel);
            this.y = (ImageView) findViewById(R.id.hiad_linked_cb_sound);
            this.f22679z = (ImageView) findViewById(R.id.hiad_linked_cb_fullcreen);
            this.B = (ImageView) findViewById(R.id.hiad_linked_restart);
            this.C = (TextView) findViewById(R.id.hiad_linked_video_now_time);
            this.D = (TextView) findViewById(R.id.hiad_linked_video_total_time);
            this.y.setImageResource(z1.n(true, false));
            z1.t(this.y);
            this.E = findViewById(R.id.hiad_linked_pb_buffering);
            this.f22678x = (ImageView) findViewById(R.id.hiad_linked_btn_play_or_pause);
            this.F = (ImageView) findViewById(R.id.hiad_linked_preview_video);
            this.G = findViewById(R.id.hiad_linked_non_wifi_alert);
            this.H = (LinkedWifiAlertPlayButton) findViewById(R.id.hiad_linked_btn_non_wifi_play);
            d();
            this.I = (TextView) findViewById(R.id.hiad_linked_non_wifi_alert_msg);
            if (Cif.a(context).g()) {
                findViewById = findViewById(R.id.hiad_linked_native_video_progress_hm);
            } else {
                findViewById = findViewById(R.id.hiad_linked_native_video_progress);
            }
            SeekBar seekBar = (SeekBar) findViewById;
            this.A = seekBar;
            seekBar.setVisibility(0);
        } catch (RuntimeException unused) {
            n7.g("LinkedNativeViewControlPanel", "init RuntimeException");
        } catch (Exception e10) {
            n7.i("LinkedNativeViewControlPanel", "init".concat(e10.getClass().getSimpleName()));
        }
    }

    public final void d() {
        b.a aVar = this.H.getStyle().f22681a;
        this.H.setTextColor(aVar.f22683b);
        this.H.setProgressDrawable(aVar.f22682a);
    }

    public void setNonWifiAlertMsg(int i10) {
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(i10);
        }
    }

    public void setNonWifiAlertMsg(String str) {
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
