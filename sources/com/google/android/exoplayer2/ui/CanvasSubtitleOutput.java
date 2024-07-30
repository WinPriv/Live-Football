package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f20239s;

    /* renamed from: t, reason: collision with root package name */
    public List<r5.a> f20240t;

    /* renamed from: u, reason: collision with root package name */
    public int f20241u;

    /* renamed from: v, reason: collision with root package name */
    public float f20242v;

    /* renamed from: w, reason: collision with root package name */
    public b f20243w;

    /* renamed from: x, reason: collision with root package name */
    public float f20244x;

    public CanvasSubtitleOutput() {
        throw null;
    }

    public CanvasSubtitleOutput(Context context) {
        super(context, null);
        this.f20239s = new ArrayList();
        this.f20240t = Collections.emptyList();
        this.f20241u = 0;
        this.f20242v = 0.0533f;
        this.f20243w = b.f20336g;
        this.f20244x = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List<r5.a> list, b bVar, float f, int i10, float f10) {
        this.f20240t = list;
        this.f20243w = bVar;
        this.f20242v = f;
        this.f20241u = i10;
        this.f20244x = f10;
        while (true) {
            ArrayList arrayList = this.f20239s;
            if (arrayList.size() < list.size()) {
                arrayList.add(new f(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x043b, code lost:
    
        if (r6 < r3) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }
}
