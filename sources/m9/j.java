package m9;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.nativead.api.ATNativeImageView;
import com.hamkho.livefoot.R;

/* compiled from: NativeAdItemBinding.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f33019a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f33020b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f33021c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f33022d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f33023e;
    public final ATNativeImageView f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f33024g;

    public j(RelativeLayout relativeLayout, TextView textView, TextView textView2, FrameLayout frameLayout, TextView textView3, ATNativeImageView aTNativeImageView, TextView textView4) {
        this.f33019a = relativeLayout;
        this.f33020b = textView;
        this.f33021c = textView2;
        this.f33022d = frameLayout;
        this.f33023e = textView3;
        this.f = aTNativeImageView;
        this.f33024g = textView4;
    }

    public static j a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.native_ad_desc;
        TextView textView = (TextView) a0.a.H0(R.id.native_ad_desc, view);
        if (textView != null) {
            i10 = R.id.native_ad_from;
            TextView textView2 = (TextView) a0.a.H0(R.id.native_ad_from, view);
            if (textView2 != null) {
                i10 = R.id.native_ad_image;
                FrameLayout frameLayout = (FrameLayout) a0.a.H0(R.id.native_ad_image, view);
                if (frameLayout != null) {
                    i10 = R.id.native_ad_install_btn;
                    TextView textView3 = (TextView) a0.a.H0(R.id.native_ad_install_btn, view);
                    if (textView3 != null) {
                        i10 = R.id.native_ad_logo;
                        ATNativeImageView aTNativeImageView = (ATNativeImageView) a0.a.H0(R.id.native_ad_logo, view);
                        if (aTNativeImageView != null) {
                            i10 = R.id.native_ad_title;
                            TextView textView4 = (TextView) a0.a.H0(R.id.native_ad_title, view);
                            if (textView4 != null) {
                                i10 = R.id.native_self_adlogo;
                                if (((TextView) a0.a.H0(R.id.native_self_adlogo, view)) != null) {
                                    return new j(relativeLayout, textView, textView2, frameLayout, textView3, aTNativeImageView, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
