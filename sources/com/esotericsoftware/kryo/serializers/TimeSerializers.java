package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* loaded from: classes.dex */
public final class TimeSerializers {

    /* loaded from: classes.dex */
    public static class DurationSerializer extends Serializer<Duration> {
        private DurationSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Duration read(Kryo kryo, Input input, Class<Duration> cls) {
            Duration ofSeconds;
            ofSeconds = Duration.ofSeconds(input.readLong(), input.readInt(true));
            return ofSeconds;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Duration duration) {
            long seconds;
            int nano;
            seconds = duration.getSeconds();
            output.writeLong(seconds);
            nano = duration.getNano();
            output.writeInt(nano, true);
        }
    }

    /* loaded from: classes.dex */
    public static class InstantSerializer extends Serializer<Instant> {
        private InstantSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Instant read(Kryo kryo, Input input, Class<Instant> cls) {
            Instant ofEpochSecond;
            ofEpochSecond = Instant.ofEpochSecond(input.readLong(true), input.readInt(true));
            return ofEpochSecond;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Instant instant) {
            long epochSecond;
            int nano;
            epochSecond = instant.getEpochSecond();
            output.writeLong(epochSecond, true);
            nano = instant.getNano();
            output.writeInt(nano, true);
        }
    }

    /* loaded from: classes.dex */
    public static class LocalDateSerializer extends Serializer<LocalDate> {
        private LocalDateSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalDate read(Kryo kryo, Input input, Class<LocalDate> cls) {
            return read(input);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, LocalDate localDate) {
            write(output, localDate);
        }

        public static LocalDate read(Input input) {
            LocalDate of;
            of = LocalDate.of(input.readInt(true), input.readByte(), input.readByte());
            return of;
        }

        public static void write(Output output, LocalDate localDate) {
            int year;
            int monthValue;
            int dayOfMonth;
            year = localDate.getYear();
            output.writeInt(year, true);
            monthValue = localDate.getMonthValue();
            output.writeByte(monthValue);
            dayOfMonth = localDate.getDayOfMonth();
            output.writeByte(dayOfMonth);
        }
    }

    /* loaded from: classes.dex */
    public static class LocalDateTimeSerializer extends Serializer<LocalDateTime> {
        private LocalDateTimeSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalDateTime read(Kryo kryo, Input input, Class<LocalDateTime> cls) {
            LocalDateTime of;
            of = LocalDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input));
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, LocalDateTime localDateTime) {
            LocalDate localDate;
            LocalTime localTime;
            localDate = localDateTime.toLocalDate();
            LocalDateSerializer.write(output, localDate);
            localTime = localDateTime.toLocalTime();
            LocalTimeSerializer.write(output, localTime);
        }
    }

    /* loaded from: classes.dex */
    public static class LocalTimeSerializer extends Serializer<LocalTime> {
        private LocalTimeSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalTime read(Kryo kryo, Input input, Class<LocalTime> cls) {
            return read(input);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, LocalTime localTime) {
            write(output, localTime);
        }

        public static LocalTime read(Input input) {
            int i10;
            int i11;
            LocalTime of;
            int readByte = input.readByte();
            int i12 = 0;
            if (readByte < 0) {
                readByte = ~readByte;
                i10 = 0;
                i11 = 0;
            } else {
                byte readByte2 = input.readByte();
                if (readByte2 < 0) {
                    int i13 = ~readByte2;
                    i11 = 0;
                    i12 = i13;
                    i10 = 0;
                } else {
                    byte readByte3 = input.readByte();
                    if (readByte3 < 0) {
                        i10 = ~readByte3;
                    } else {
                        i12 = input.readInt(true);
                        i10 = readByte3;
                    }
                    i11 = i12;
                    i12 = readByte2;
                }
            }
            of = LocalTime.of(readByte, i12, i10, i11);
            return of;
        }

        public static void write(Output output, LocalTime localTime) {
            int nano;
            int hour;
            int minute;
            int second;
            int nano2;
            int second2;
            int hour2;
            int minute2;
            int second3;
            int minute3;
            int hour3;
            int minute4;
            int hour4;
            nano = localTime.getNano();
            if (nano == 0) {
                second2 = localTime.getSecond();
                if (second2 == 0) {
                    minute3 = localTime.getMinute();
                    if (minute3 == 0) {
                        hour4 = localTime.getHour();
                        output.writeByte(~hour4);
                        return;
                    } else {
                        hour3 = localTime.getHour();
                        output.writeByte(hour3);
                        minute4 = localTime.getMinute();
                        output.writeByte(~minute4);
                        return;
                    }
                }
                hour2 = localTime.getHour();
                output.writeByte(hour2);
                minute2 = localTime.getMinute();
                output.writeByte(minute2);
                second3 = localTime.getSecond();
                output.writeByte(~second3);
                return;
            }
            hour = localTime.getHour();
            output.writeByte(hour);
            minute = localTime.getMinute();
            output.writeByte(minute);
            second = localTime.getSecond();
            output.writeByte(second);
            nano2 = localTime.getNano();
            output.writeInt(nano2, true);
        }
    }

    /* loaded from: classes.dex */
    public static class MonthDaySerializer extends Serializer<MonthDay> {
        private MonthDaySerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public MonthDay read(Kryo kryo, Input input, Class<MonthDay> cls) {
            MonthDay of;
            of = MonthDay.of(input.readByte(), input.readByte());
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, MonthDay monthDay) {
            int monthValue;
            int dayOfMonth;
            monthValue = monthDay.getMonthValue();
            output.writeByte(monthValue);
            dayOfMonth = monthDay.getDayOfMonth();
            output.writeByte(dayOfMonth);
        }
    }

    /* loaded from: classes.dex */
    public static class OffsetDateTimeSerializer extends Serializer<OffsetDateTime> {
        private OffsetDateTimeSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OffsetDateTime read(Kryo kryo, Input input, Class<OffsetDateTime> cls) {
            OffsetDateTime of;
            of = OffsetDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OffsetDateTime offsetDateTime) {
            LocalDate localDate;
            LocalTime localTime;
            ZoneOffset offset;
            localDate = offsetDateTime.toLocalDate();
            LocalDateSerializer.write(output, localDate);
            localTime = offsetDateTime.toLocalTime();
            LocalTimeSerializer.write(output, localTime);
            offset = offsetDateTime.getOffset();
            ZoneOffsetSerializer.write(output, offset);
        }
    }

    /* loaded from: classes.dex */
    public static class OffsetTimeSerializer extends Serializer<OffsetTime> {
        private OffsetTimeSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OffsetTime read(Kryo kryo, Input input, Class<OffsetTime> cls) {
            OffsetTime of;
            of = OffsetTime.of(LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OffsetTime offsetTime) {
            LocalTime localTime;
            ZoneOffset offset;
            localTime = offsetTime.toLocalTime();
            LocalTimeSerializer.write(output, localTime);
            offset = offsetTime.getOffset();
            ZoneOffsetSerializer.write(output, offset);
        }
    }

    /* loaded from: classes.dex */
    public static class PeriodSerializer extends Serializer<Period> {
        private PeriodSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Period read(Kryo kryo, Input input, Class<Period> cls) {
            Period of;
            of = Period.of(input.readInt(true), input.readInt(true), input.readInt(true));
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Period period) {
            int years;
            int months;
            int days;
            years = period.getYears();
            output.writeInt(years, true);
            months = period.getMonths();
            output.writeInt(months, true);
            days = period.getDays();
            output.writeInt(days, true);
        }
    }

    /* loaded from: classes.dex */
    public static class YearMonthSerializer extends Serializer<YearMonth> {
        private YearMonthSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public YearMonth read(Kryo kryo, Input input, Class<YearMonth> cls) {
            YearMonth of;
            of = YearMonth.of(input.readInt(true), input.readByte());
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, YearMonth yearMonth) {
            int year;
            int monthValue;
            year = yearMonth.getYear();
            output.writeInt(year, true);
            monthValue = yearMonth.getMonthValue();
            output.writeByte(monthValue);
        }
    }

    /* loaded from: classes.dex */
    public static class YearSerializer extends Serializer<Year> {
        private YearSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Year read(Kryo kryo, Input input, Class<Year> cls) {
            Year of;
            of = Year.of(input.readInt(true));
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Year year) {
            int value;
            value = year.getValue();
            output.writeInt(value, true);
        }
    }

    /* loaded from: classes.dex */
    public static class ZoneIdSerializer extends Serializer<ZoneId> {
        private ZoneIdSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZoneId read(Kryo kryo, Input input, Class<ZoneId> cls) {
            return read(input);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, ZoneId zoneId) {
            write(output, zoneId);
        }

        public static ZoneId read(Input input) {
            ZoneId of;
            of = ZoneId.of(input.readString());
            return of;
        }

        public static void write(Output output, ZoneId zoneId) {
            String id2;
            id2 = zoneId.getId();
            output.writeString(id2);
        }
    }

    /* loaded from: classes.dex */
    public static class ZoneOffsetSerializer extends Serializer<ZoneOffset> {
        private ZoneOffsetSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZoneOffset read(Kryo kryo, Input input, Class<ZoneOffset> cls) {
            return read(input);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, ZoneOffset zoneOffset) {
            write(output, zoneOffset);
        }

        public static ZoneOffset read(Input input) {
            ZoneOffset ofTotalSeconds;
            ZoneOffset ofTotalSeconds2;
            byte readByte = input.readByte();
            if (readByte == Byte.MAX_VALUE) {
                ofTotalSeconds2 = ZoneOffset.ofTotalSeconds(input.readInt());
                return ofTotalSeconds2;
            }
            ofTotalSeconds = ZoneOffset.ofTotalSeconds(readByte * 900);
            return ofTotalSeconds;
        }

        public static void write(Output output, ZoneOffset zoneOffset) {
            int totalSeconds;
            totalSeconds = zoneOffset.getTotalSeconds();
            int i10 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
            output.writeByte(i10);
            if (i10 == 127) {
                output.writeInt(totalSeconds);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ZonedDateTimeSerializer extends Serializer<ZonedDateTime> {
        private ZonedDateTimeSerializer() {
            setImmutable(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZonedDateTime read(Kryo kryo, Input input, Class<ZonedDateTime> cls) {
            ZonedDateTime of;
            of = ZonedDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneIdSerializer.read(input));
            return of;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, ZonedDateTime zonedDateTime) {
            LocalDate localDate;
            LocalTime localTime;
            ZoneId zone;
            localDate = zonedDateTime.toLocalDate();
            LocalDateSerializer.write(output, localDate);
            localTime = zonedDateTime.toLocalTime();
            LocalTimeSerializer.write(output, localTime);
            zone = zonedDateTime.getZone();
            ZoneIdSerializer.write(output, zone);
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.time.Duration")) {
            kryo.addDefaultSerializer(Duration.class, new DurationSerializer());
        }
        if (Util.isClassAvailable("java.time.Instant")) {
            kryo.addDefaultSerializer(Instant.class, new InstantSerializer());
        }
        if (Util.isClassAvailable("java.time.LocalDate")) {
            kryo.addDefaultSerializer(LocalDate.class, new LocalDateSerializer());
        }
        if (Util.isClassAvailable("java.time.LocalTime")) {
            kryo.addDefaultSerializer(LocalTime.class, new LocalTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.LocalDateTime")) {
            kryo.addDefaultSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.ZoneOffset")) {
            kryo.addDefaultSerializer(ZoneOffset.class, new ZoneOffsetSerializer());
        }
        if (Util.isClassAvailable("java.time.ZoneId")) {
            kryo.addDefaultSerializer(ZoneId.class, new ZoneIdSerializer());
        }
        if (Util.isClassAvailable("java.time.OffsetTime")) {
            kryo.addDefaultSerializer(OffsetTime.class, new OffsetTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.OffsetDateTime")) {
            kryo.addDefaultSerializer(OffsetDateTime.class, new OffsetDateTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.ZonedDateTime")) {
            kryo.addDefaultSerializer(ZonedDateTime.class, new ZonedDateTimeSerializer());
        }
        if (Util.isClassAvailable("java.time.Year")) {
            kryo.addDefaultSerializer(Year.class, new YearSerializer());
        }
        if (Util.isClassAvailable("java.time.YearMonth")) {
            kryo.addDefaultSerializer(YearMonth.class, new YearMonthSerializer());
        }
        if (Util.isClassAvailable("java.time.MonthDay")) {
            kryo.addDefaultSerializer(MonthDay.class, new MonthDaySerializer());
        }
        if (Util.isClassAvailable("java.time.Period")) {
            kryo.addDefaultSerializer(Period.class, new PeriodSerializer());
        }
    }
}
