fun isSegmentBig(segment: Int): Boolean {
    return segment > 255
}

fun isSegmentSmall(segment: Int): Boolean {
    return segment < 0
}

fun isOverlimitSegmets(size: Int): Boolean {
    return size > 4
}

fun isUnderlimitSegmets(size: Int): Boolean {
    return size < 4
}

fun isValidSegmentFormat(segment: String): Boolean {
    return segment.isNotEmpty() && segment.all { it.isDigit() }
}


fun containsDot(ip: String): Boolean {
    return ip.contains(".")
}

fun isLeadingZero(segment: String): Boolean {
    return segment.length > 1 && segment.startsWith("0")
}


fun isValidIp(ip: String): Boolean {
    if (!containsDot(ip)) return false

    val segments = ip.split(".")

    if (isOverlimitSegmets(segments.size) || isUnderlimitSegmets(segments.size)) return false

    for (segment in segments) {
        if (!isValidSegmentFormat(segment)) return false

        val num = segment.toIntOrNull() ?: return false

        if (isSegmentBig(num) || isSegmentSmall(num)) return false

        if (isLeadingZero(segment)) return false
    }

    return true
}