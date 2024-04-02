package no.nav.helseidnavtest.adapters

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME
import java.time.format.DateTimeParseException


class LocalDateTimeAdapter {

    companion object {
        @JvmStatic
        @Throws(DateTimeParseException::class)
        fun unmarshal(v: String?) =  v?.let {ISO_LOCAL_DATE_TIME.parse(it, LocalDateTime::from) }

        @JvmStatic
        fun marshal(v: LocalDateTime?) = v?.toString()
    }
}