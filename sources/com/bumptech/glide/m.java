package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.transition.r;
import androidx.transition.t;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import e3.a;
import e3.b;
import e3.c;
import e3.d;
import e3.e;
import e3.j;
import e3.s;
import e3.t;
import e3.u;
import e3.v;
import e3.w;
import f3.a;
import f3.b;
import f3.c;
import f3.d;
import f3.f;
import h3.v;
import h3.w;
import h3.y;
import h3.z;
import i3.a;
import j3.a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import o3.a;

/* compiled from: RegistryFactory.java */
/* loaded from: classes.dex */
public final class m {
    public static k a(b bVar, List list) {
        y2.i gVar;
        y2.i wVar;
        int i10;
        b3.b bVar2;
        b3.d dVar = bVar.f19717s;
        h hVar = bVar.f19719u;
        Context applicationContext = hVar.getApplicationContext();
        i iVar = hVar.f19730h;
        k kVar = new k();
        h3.k kVar2 = new h3.k();
        t tVar = kVar.f19745g;
        synchronized (tVar) {
            ((List) tVar.f2495s).add(kVar2);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            h3.p pVar = new h3.p();
            t tVar2 = kVar.f19745g;
            synchronized (tVar2) {
                ((List) tVar2.f2495s).add(pVar);
            }
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> d10 = kVar.d();
        b3.b bVar3 = bVar.f19720v;
        l3.a aVar = new l3.a(applicationContext, d10, dVar, bVar3);
        z zVar = new z(dVar, new z.g());
        h3.m mVar = new h3.m(kVar.d(), resources.getDisplayMetrics(), dVar, bVar3);
        if (i11 >= 28 && iVar.f19733a.containsKey(d.class)) {
            wVar = new h3.t();
            gVar = new h3.h();
        } else {
            gVar = new h3.g(mVar, 0);
            wVar = new w(mVar, bVar3);
        }
        if (i11 >= 28) {
            i10 = i11;
            kVar.c(new a.c(new j3.a(d10, bVar3)), InputStream.class, Drawable.class, "Animation");
            kVar.c(new a.b(new j3.a(d10, bVar3)), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i10 = i11;
        }
        j3.e eVar = new j3.e(applicationContext);
        s.c cVar = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        s.b bVar4 = new s.b(resources);
        s.a aVar2 = new s.a(resources);
        h3.c cVar2 = new h3.c(bVar3);
        m3.a aVar3 = new m3.a();
        l3.d dVar3 = new l3.d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        androidx.activity.n nVar = new androidx.activity.n(0);
        o3.a aVar4 = kVar.f19741b;
        synchronized (aVar4) {
            aVar4.f33597a.add(new a.C0447a(ByteBuffer.class, nVar));
        }
        r rVar = new r(bVar3, 2);
        o3.a aVar5 = kVar.f19741b;
        synchronized (aVar5) {
            aVar5.f33597a.add(new a.C0447a(InputStream.class, rVar));
        }
        kVar.c(gVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        kVar.c(wVar, InputStream.class, Bitmap.class, "Bitmap");
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            bVar2 = bVar3;
            kVar.c(new h3.g(mVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        } else {
            bVar2 = bVar3;
        }
        kVar.c(zVar, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        kVar.c(new z(dVar, new z.c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        u.a<?> aVar6 = u.a.f27734a;
        kVar.a(Bitmap.class, Bitmap.class, aVar6);
        kVar.c(new y(), Bitmap.class, Bitmap.class, "Bitmap");
        kVar.b(Bitmap.class, cVar2);
        kVar.c(new h3.a(resources, gVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.c(new h3.a(resources, wVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.c(new h3.a(resources, zVar), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        kVar.b(BitmapDrawable.class, new h3.b(dVar, cVar2));
        b3.b bVar5 = bVar2;
        kVar.c(new l3.j(d10, aVar, bVar5), InputStream.class, l3.c.class, "Animation");
        kVar.c(aVar, ByteBuffer.class, l3.c.class, "Animation");
        kVar.b(l3.c.class, new l3.d());
        kVar.a(x2.a.class, x2.a.class, aVar6);
        kVar.c(new l3.h(dVar), x2.a.class, Bitmap.class, "Bitmap");
        kVar.c(eVar, Uri.class, Drawable.class, "legacy_append");
        kVar.c(new v(eVar, dVar), Uri.class, Bitmap.class, "legacy_append");
        kVar.g(new a.C0397a());
        kVar.a(File.class, ByteBuffer.class, new c.b());
        kVar.a(File.class, InputStream.class, new e.C0369e());
        kVar.c(new k3.a(), File.class, File.class, "legacy_append");
        kVar.a(File.class, ParcelFileDescriptor.class, new e.b());
        kVar.a(File.class, File.class, aVar6);
        kVar.g(new k.a(bVar5));
        if (!"robolectric".equals(str)) {
            kVar.g(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        kVar.a(cls, InputStream.class, cVar);
        kVar.a(cls, ParcelFileDescriptor.class, bVar4);
        kVar.a(Integer.class, InputStream.class, cVar);
        kVar.a(Integer.class, ParcelFileDescriptor.class, bVar4);
        kVar.a(Integer.class, Uri.class, dVar2);
        kVar.a(cls, AssetFileDescriptor.class, aVar2);
        kVar.a(Integer.class, AssetFileDescriptor.class, aVar2);
        kVar.a(cls, Uri.class, dVar2);
        kVar.a(String.class, InputStream.class, new d.c());
        kVar.a(Uri.class, InputStream.class, new d.c());
        kVar.a(String.class, InputStream.class, new t.c());
        kVar.a(String.class, ParcelFileDescriptor.class, new t.b());
        kVar.a(String.class, AssetFileDescriptor.class, new t.a());
        kVar.a(Uri.class, InputStream.class, new a.c(applicationContext.getAssets()));
        kVar.a(Uri.class, AssetFileDescriptor.class, new a.b(applicationContext.getAssets()));
        kVar.a(Uri.class, InputStream.class, new b.a(applicationContext));
        kVar.a(Uri.class, InputStream.class, new c.a(applicationContext));
        if (i10 >= 29) {
            kVar.a(Uri.class, InputStream.class, new d.c(applicationContext));
            kVar.a(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext));
        }
        kVar.a(Uri.class, InputStream.class, new v.d(contentResolver));
        kVar.a(Uri.class, ParcelFileDescriptor.class, new v.b(contentResolver));
        kVar.a(Uri.class, AssetFileDescriptor.class, new v.a(contentResolver));
        kVar.a(Uri.class, InputStream.class, new w.a());
        kVar.a(URL.class, InputStream.class, new f.a());
        kVar.a(Uri.class, File.class, new j.a(applicationContext));
        kVar.a(e3.f.class, InputStream.class, new a.C0375a());
        kVar.a(byte[].class, ByteBuffer.class, new b.a());
        kVar.a(byte[].class, InputStream.class, new b.d());
        kVar.a(Uri.class, Uri.class, aVar6);
        kVar.a(Drawable.class, Drawable.class, aVar6);
        kVar.c(new j3.f(), Drawable.class, Drawable.class, "legacy_append");
        kVar.h(Bitmap.class, BitmapDrawable.class, new androidx.transition.t(resources));
        kVar.h(Bitmap.class, byte[].class, aVar3);
        kVar.h(Drawable.class, byte[].class, new m3.b(dVar, aVar3, dVar3));
        kVar.h(l3.c.class, byte[].class, dVar3);
        z zVar2 = new z(dVar, new z.d());
        kVar.c(zVar2, ByteBuffer.class, Bitmap.class, "legacy_append");
        kVar.c(new h3.a(resources, zVar2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n3.c cVar3 = (n3.c) it.next();
            try {
                cVar3.a();
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar3.getClass().getName()), e10);
            }
        }
        return kVar;
    }
}
