package androidx.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.firebase.messaging.FirebaseMessaging;
import i8.y;
import j0.i;
import j5.b0;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import k4.o1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f470s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f471t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f470s = i10;
        this.f471t = obj;
    }

    private final void a() {
        b5.f fVar = (b5.f) this.f471t;
        synchronized (fVar.f2919a) {
            if (!fVar.f2929l) {
                long j10 = fVar.f2928k - 1;
                fVar.f2928k = j10;
                if (j10 <= 0) {
                    if (j10 < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (fVar.f2919a) {
                            fVar.f2930m = illegalStateException;
                        }
                        return;
                    }
                    fVar.a();
                }
            }
        }
    }

    private final void b() {
        y yVar = (y) this.f471t;
        synchronized (yVar.f29313d) {
            SharedPreferences.Editor edit = yVar.f29310a.edit();
            String str = yVar.f29311b;
            StringBuilder sb2 = new StringBuilder();
            Iterator<String> it = yVar.f29313d.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(yVar.f29312c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f470s) {
            case 0:
                ((ComponentActivity) this.f471t).invalidateMenu();
                return;
            case 1:
                ((Toolbar) this.f471t).l();
                return;
            case 2:
                ((r0) this.f471t).c(false);
                return;
            case 3:
                l.b bVar = (l.b) this.f471t;
                synchronized (bVar.f1660d) {
                    if (bVar.f1663h != null) {
                        try {
                            k0.m d10 = bVar.d();
                            int i10 = d10.f30278e;
                            if (i10 == 2) {
                                synchronized (bVar.f1660d) {
                                }
                            }
                            if (i10 == 0) {
                                try {
                                    int i11 = j0.i.f29566a;
                                    i.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    l.a aVar = bVar.f1659c;
                                    Context context = bVar.f1657a;
                                    aVar.getClass();
                                    Typeface b10 = f0.e.f27906a.b(context, new k0.m[]{d10}, 0);
                                    MappedByteBuffer e10 = f0.m.e(bVar.f1657a, d10.f30274a);
                                    if (e10 != null && b10 != null) {
                                        try {
                                            i.a.a("EmojiCompat.MetadataRepo.create");
                                            androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(b10, androidx.emoji2.text.m.a(e10));
                                            i.a.b();
                                            i.a.b();
                                            synchronized (bVar.f1660d) {
                                                f.h hVar = bVar.f1663h;
                                                if (hVar != null) {
                                                    hVar.b(nVar);
                                                }
                                            }
                                            bVar.b();
                                            return;
                                        } finally {
                                            int i12 = j0.i.f29566a;
                                            i.a.b();
                                        }
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                        } catch (Throwable th2) {
                            synchronized (bVar.f1660d) {
                                f.h hVar2 = bVar.f1663h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                bVar.b();
                                return;
                            }
                        }
                    }
                    return;
                }
            case 4:
                com.applovin.exoplayer2.a.a.b0((com.applovin.exoplayer2.a.a) this.f471t);
                return;
            case 5:
                com.applovin.exoplayer2.ui.d.a((com.applovin.exoplayer2.ui.d) this.f471t);
                return;
            case 6:
                o1 o1Var = (o1) this.f471t;
                int i13 = o1.b.f30722b;
                o1Var.c();
                return;
            case 7:
                b.d dVar = (b.d) this.f471t;
                if (!dVar.f19968u) {
                    com.google.android.exoplayer2.drm.d dVar2 = dVar.f19967t;
                    if (dVar2 != null) {
                        dVar2.b(dVar.f19966s);
                    }
                    dVar.f19969v.f19954n.remove(dVar);
                    dVar.f19968u = true;
                    return;
                }
                return;
            case 8:
                a();
                return;
            case 9:
                ((b0) this.f471t).X = true;
                return;
            case 10:
                SsMediaSource ssMediaSource = (SsMediaSource) this.f471t;
                int i14 = SsMediaSource.S;
                ssMediaSource.y();
                return;
            case 11:
                ((PlayerControlView) this.f471t).c();
                return;
            case 12:
                SideSheetBehavior.b bVar2 = (SideSheetBehavior.b) this.f471t;
                bVar2.f20981b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                t0.c cVar = sideSheetBehavior.f20967i;
                if (cVar != null && cVar.g()) {
                    bVar2.a(bVar2.f20980a);
                    return;
                } else {
                    if (sideSheetBehavior.f20966h == 2) {
                        sideSheetBehavior.s(bVar2.f20980a);
                        return;
                    }
                    return;
                }
            case 13:
                d8.b bVar3 = (d8.b) this.f471t;
                Object obj = d8.b.f27492m;
                bVar3.b(false);
                return;
            case 14:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f471t;
                com.google.firebase.messaging.a aVar2 = FirebaseMessaging.f21279n;
                FirebaseMessaging.a aVar3 = firebaseMessaging.f21286g;
                synchronized (aVar3) {
                    aVar3.a();
                    Boolean bool = aVar3.f21294c;
                    if (bool != null) {
                        z11 = bool.booleanValue();
                    } else {
                        n7.e eVar = FirebaseMessaging.this.f21281a;
                        eVar.a();
                        h8.a aVar4 = eVar.f33463g.get();
                        synchronized (aVar4) {
                            z10 = aVar4.f28789b;
                        }
                        z11 = z10;
                    }
                }
                if (z11) {
                    firebaseMessaging.d();
                    return;
                }
                return;
            default:
                b();
                return;
        }
    }
}
