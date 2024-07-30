package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.expressad.advanced.d.c;

/* loaded from: classes.dex */
public class ATOutNativeAdvancedViewGroup extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private c f6940a;

    public ATOutNativeAdvancedViewGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6940a != null) {
            a(1);
            if (getVisibility() == 0) {
                a(2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f6940a;
        if (cVar != null) {
            cVar.e(1);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            a(2);
            if (getParent() != null) {
                a(1);
                return;
            }
            return;
        }
        c cVar = this.f6940a;
        if (cVar != null) {
            cVar.e(2);
        }
    }

    public void setProvider(c cVar) {
        this.f6940a = cVar;
    }

    public ATOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(final int i10) {
        postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.view.ATOutNativeAdvancedViewGroup.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATOutNativeAdvancedViewGroup.this.f6940a != null) {
                    ATOutNativeAdvancedViewGroup.this.f6940a.d(i10);
                }
            }
        }, 200L);
    }

    public ATOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
