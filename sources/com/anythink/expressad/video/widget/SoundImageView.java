package com.anythink.expressad.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12299a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12299a = true;
    }

    public boolean getStatus() {
        return this.f12299a;
    }

    public void setSoundStatus(boolean z10) {
        this.f12299a = z10;
        if (z10) {
            setImageResource(i.a(getContext(), "anythink_reward_sound_open", i.f10125c));
        } else {
            setImageResource(i.a(getContext(), "anythink_reward_sound_close", i.f10125c));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12299a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f12299a = true;
    }
}
