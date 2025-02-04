package com.anythink.expressad.foundation.h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10221a = "SerializeTools";

    private static String a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, "ISO-8859-1");
        } catch (IOException e10) {
            o.b(f10221a, "IOException", e10);
            return "";
        }
    }

    private static Object a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return readObject;
        } catch (Exception e10) {
            o.b(f10221a, "Exception", e10);
            return null;
        }
    }
}
