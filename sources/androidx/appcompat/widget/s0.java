package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.hamkho.livefoot.R;

/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1266a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1267b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f1268c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f1269d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1270e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1271g;

    public s0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1269d = layoutParams;
        this.f1270e = new Rect();
        this.f = new int[2];
        this.f1271g = new int[2];
        this.f1266a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1267b = inflate;
        this.f1268c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(s0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017159;
        layoutParams.flags = 24;
    }
}
