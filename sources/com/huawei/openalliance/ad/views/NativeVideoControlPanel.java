package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.ads.nativead.R;

/* loaded from: classes2.dex */
public class NativeVideoControlPanel extends AutoScaleSizeRelativeLayout {

    /* renamed from: c0, reason: collision with root package name */
    public ImageView f23715c0;

    /* renamed from: d0, reason: collision with root package name */
    public View f23716d0;

    /* renamed from: e0, reason: collision with root package name */
    public ImageView f23717e0;

    /* renamed from: f0, reason: collision with root package name */
    public View f23718f0;

    /* renamed from: g0, reason: collision with root package name */
    public View f23719g0;

    /* renamed from: h0, reason: collision with root package name */
    public View f23720h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f23721i0;
    public ImageView y;

    public NativeVideoControlPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.hiad_native_video_control_panel, this);
        this.f23718f0 = findViewById(R.id.hiad_native_video_control_panel);
        ImageView imageView = (ImageView) findViewById(R.id.hiad_cb_sound);
        this.f23715c0 = imageView;
        imageView.setImageResource(R.drawable.hiad_selector_ic_sound_check);
        gb.u.g(this.f23715c0);
        this.f23716d0 = findViewById(R.id.hiad_pb_buffering);
        this.y = (ImageView) findViewById(R.id.hiad_btn_play_or_pause);
        this.f23717e0 = (ImageView) findViewById(R.id.hiad_iv_preview_video);
        this.f23719g0 = findViewById(R.id.hiad_rl_non_wifi_alert);
        this.f23720h0 = findViewById(R.id.hiad_btn_non_wifi_play);
        this.f23721i0 = (TextView) findViewById(R.id.hiad_non_wifi_alert_msg);
    }

    public void setNonWifiAlertMsg(String str) {
        this.f23721i0.setText(str);
    }
}
