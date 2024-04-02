package no.nav.helseidnavtest.adapters

import java.time.LocalDate
import java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
import java.time.format.DateTimeParseException

class LocalDateAdapter  {
    companion object {
        @JvmStatic
        @Throws(DateTimeParseException::class)
        fun unmarshal(v: String?) = v?.let { ISO_LOCAL_DATE.parse(it, LocalDate::from) }

        @JvmStatic
        fun marshal(v: LocalDate?) = v?.toString()
    }
 }