package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Dz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0852Dz extends XW {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC06294l> A0A = new ArrayList<>();
    public ArrayList<AbstractC06294l> A07 = new ArrayList<>();
    public ArrayList<AnonymousClass41> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass40> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC06294l>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass41>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass40>> A03 = new ArrayList<>();
    public ArrayList<AbstractC06294l> A00 = new ArrayList<>();
    public ArrayList<AbstractC06294l> A04 = new ArrayList<>();
    public ArrayList<AbstractC06294l> A06 = new ArrayList<>();
    public ArrayList<AbstractC06294l> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass41 anonymousClass41 = this.A09.get(size);
            View view = anonymousClass41.A04.A0H;
            view.setTranslationY(gl.Code);
            view.setTranslationX(gl.Code);
            A0O(anonymousClass41.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC06294l abstractC06294l = this.A07.get(size3);
            abstractC06294l.A0H.setAlpha(1.0f);
            A0N(abstractC06294l);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<AnonymousClass41> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    AnonymousClass41 anonymousClass412 = arrayList.get(size6);
                    View view2 = anonymousClass412.A04.A0H;
                    view2.setTranslationY(gl.Code);
                    view2.setTranslationX(gl.Code);
                    A0O(anonymousClass412.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC06294l> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC06294l abstractC06294l2 = arrayList2.get(size8);
                    abstractC06294l2.A0H.setAlpha(1.0f);
                    A0N(abstractC06294l2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<AnonymousClass40> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.XW
    public final boolean A0T(AbstractC06294l abstractC06294l, int i10, int i11, int i12, int i13) {
        View view = abstractC06294l.A0H;
        int translationX = i10 + ((int) abstractC06294l.A0H.getTranslationX());
        int translationY = i11 + ((int) abstractC06294l.A0H.getTranslationY());
        A04(abstractC06294l);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            A0O(abstractC06294l);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.A09.add(new AnonymousClass41(abstractC06294l, translationX, translationY, i12, i13));
        return true;
    }

    private void A01(AnonymousClass40 anonymousClass40) {
        if (anonymousClass40.A05 != null) {
            A07(anonymousClass40, anonymousClass40.A05);
        }
        if (anonymousClass40.A04 != null) {
            A07(anonymousClass40, anonymousClass40.A04);
        }
    }

    private void A03(final AbstractC06294l abstractC06294l) {
        final View view = abstractC06294l.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC06294l);
        ViewPropertyAnimator animation = animate.setDuration(A07());
        animation.alpha(gl.Code).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C0852Dz.this.A0P(abstractC06294l);
                C0852Dz.this.A06.remove(abstractC06294l);
                C0852Dz.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC06294l abstractC06294l) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC06294l.A0H.animate().setInterpolator(A0B);
        A0K(abstractC06294l);
    }

    private final void A05(List<AbstractC06294l> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass40> list, AbstractC06294l abstractC06294l) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass40 changeInfo = list.get(size);
            if (A07(changeInfo, abstractC06294l) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(AnonymousClass40 anonymousClass40, AbstractC06294l abstractC06294l) {
        boolean z10 = false;
        if (anonymousClass40.A04 == abstractC06294l) {
            anonymousClass40.A04 = null;
        } else if (anonymousClass40.A05 == abstractC06294l) {
            anonymousClass40.A05 = null;
            z10 = true;
        } else {
            return false;
        }
        abstractC06294l.A0H.setAlpha(1.0f);
        abstractC06294l.A0H.setTranslationX(gl.Code);
        abstractC06294l.A0H.setTranslationY(gl.Code);
        A0Q(abstractC06294l, z10);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0852Dz.A0J():void");
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0K(AbstractC06294l abstractC06294l) {
        View view = abstractC06294l.A0H;
        view.animate().cancel();
        for (int i10 = this.A09.size() - 1; i10 >= 0; i10--) {
            if (this.A09.get(i10).A04 == abstractC06294l) {
                view.setTranslationY(gl.Code);
                view.setTranslationX(gl.Code);
                A0O(abstractC06294l);
                this.A09.remove(i10);
            }
        }
        A06(this.A08, abstractC06294l);
        if (this.A0A.remove(abstractC06294l)) {
            view.setAlpha(1.0f);
            A0P(abstractC06294l);
        }
        if (this.A07.remove(abstractC06294l)) {
            view.setAlpha(1.0f);
            A0N(abstractC06294l);
        }
        for (int i11 = this.A03.size() - 1; i11 >= 0; i11--) {
            ArrayList<AnonymousClass40> arrayList = this.A03.get(i11);
            A06(arrayList, abstractC06294l);
            if (arrayList.isEmpty()) {
                this.A03.remove(i11);
            }
        }
        for (int j10 = this.A05.size() - 1; j10 >= 0; j10--) {
            ArrayList<AnonymousClass41> arrayList2 = this.A05.get(j10);
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (arrayList2.get(size).A04 == abstractC06294l) {
                    view.setTranslationY(gl.Code);
                    view.setTranslationX(gl.Code);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int i12 = str.charAt(9);
                    if (i12 != str2.charAt(9)) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(abstractC06294l);
                    arrayList2.remove(size);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(j10);
                    }
                } else {
                    size--;
                }
            }
        }
        int size2 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i13 = size2 - 1; i13 >= 0; i13--) {
            ArrayList<AbstractC06294l> arrayList3 = this.A01.get(i13);
            if (arrayList3.remove(abstractC06294l)) {
                view.setAlpha(1.0f);
                A0N(abstractC06294l);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i13);
                }
            }
        }
        this.A06.remove(abstractC06294l);
        this.A00.remove(abstractC06294l);
        this.A02.remove(abstractC06294l);
        this.A04.remove(abstractC06294l);
        A0V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (com.facebook.ads.redexgen.X.C0852Dz.A0C[7].charAt(30) == 'w') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        com.facebook.ads.redexgen.X.C0852Dz.A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r3.isEmpty() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r3 != false) goto L20;
     */
    @Override // com.facebook.ads.redexgen.X.C4P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L() {
        /*
            r4 = this;
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r4.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.41> r0 = r4.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A0A
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A04
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0852Dz.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0852Dz.A0C
            java.lang.String r1 = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A00
            boolean r3 = r0.isEmpty()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0852Dz.A0C
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r2 = r2[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0852Dz.A0C
            java.lang.String r1 = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lb8
        L73:
            java.util.ArrayList<com.facebook.ads.redexgen.X.4l> r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.41>> r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.4l>> r0 = r4.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.X.40>> r3 = r4.A03
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0852Dz.A0C
            r0 = 7
            r1 = r1[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto Lab
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La2:
            if (r3 == 0) goto Lb8
            goto L73
        La5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lab:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0852Dz.A0C
            java.lang.String r1 = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK"
            r0 = 7
            r2[r0] = r1
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lba
        Lb8:
            r0 = 1
        Lb9:
            return r0
        Lba:
            r0 = 0
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0852Dz.A0L():boolean");
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0M(@NonNull AbstractC06294l abstractC06294l, @NonNull List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(abstractC06294l, payloads);
    }

    @Override // com.facebook.ads.redexgen.X.XW
    public final boolean A0R(AbstractC06294l abstractC06294l) {
        A04(abstractC06294l);
        abstractC06294l.A0H.setAlpha(gl.Code);
        this.A07.add(abstractC06294l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XW
    public final boolean A0S(AbstractC06294l abstractC06294l) {
        A04(abstractC06294l);
        this.A0A.add(abstractC06294l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.XW
    public final boolean A0U(AbstractC06294l abstractC06294l, AbstractC06294l abstractC06294l2, int i10, int i11, int i12, int i13) {
        if (abstractC06294l == abstractC06294l2) {
            return A0T(abstractC06294l, i10, i11, i12, i13);
        }
        float translationX = abstractC06294l.A0H.getTranslationX();
        float translationY = abstractC06294l.A0H.getTranslationY();
        float prevTranslationY = abstractC06294l.A0H.getAlpha();
        A04(abstractC06294l);
        float prevTranslationX = i12 - i10;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i13 - i11;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC06294l.A0H.setTranslationX(translationX);
        abstractC06294l.A0H.setTranslationY(translationY);
        abstractC06294l.A0H.setAlpha(prevTranslationY);
        if (abstractC06294l2 != null) {
            A04(abstractC06294l2);
            float prevTranslationX3 = -deltaY;
            abstractC06294l2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC06294l2.A0H.setTranslationY(prevTranslationX4);
            abstractC06294l2.A0H.setAlpha(gl.Code);
        }
        this.A08.add(new AnonymousClass40(abstractC06294l, abstractC06294l2, i10, i11, i12, i13));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass40 anonymousClass40) {
        final View view;
        AbstractC06294l holder = anonymousClass40.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC06294l holder2 = anonymousClass40.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(anonymousClass40.A05);
            oldViewAnim.translationX(anonymousClass40.A02 - anonymousClass40.A00);
            oldViewAnim.translationY(anonymousClass40.A03 - anonymousClass40.A01);
            oldViewAnim.alpha(gl.Code).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(gl.Code);
                    view.setTranslationY(gl.Code);
                    C0852Dz.this.A0Q(anonymousClass40.A05, true);
                    C0852Dz.this.A02.remove(anonymousClass40.A05);
                    C0852Dz.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(anonymousClass40.A04);
            animate.translationX(gl.Code).translationY(gl.Code).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3z
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(gl.Code);
                    view2.setTranslationY(gl.Code);
                    C0852Dz.this.A0Q(anonymousClass40.A04, false);
                    C0852Dz.this.A02.remove(anonymousClass40.A04);
                    C0852Dz.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC06294l abstractC06294l) {
        final View view = abstractC06294l.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC06294l);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C0852Dz.this.A0N(abstractC06294l);
                C0852Dz.this.A00.remove(abstractC06294l);
                C0852Dz.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC06294l abstractC06294l, int i10, int i11, int i12, int i13) {
        final View view = abstractC06294l.A0H;
        final int i14 = i12 - i10;
        final int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(gl.Code);
        }
        if (i15 != 0) {
            view.animate().translationY(gl.Code);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC06294l);
        animate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3x
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i14 != 0) {
                    view.setTranslationX(gl.Code);
                }
                if (i15 != 0) {
                    view.setTranslationY(gl.Code);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C0852Dz.this.A0O(abstractC06294l);
                C0852Dz.this.A04.remove(abstractC06294l);
                C0852Dz.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
